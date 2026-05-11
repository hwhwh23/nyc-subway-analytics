from sqlalchemy import create_engine

import pandas as pd

# CSV 읽기
df = pd.read_csv(
    "data/raw/mta_ridership.csv",
    low_memory=False
)

# 컬럼 확인
print(df.columns)

# 필요한 컬럼만 선택
cleaned = df[[
    "transit_timestamp",
    "station_complex",
    "borough",
    "ridership",
    "transfers"
]]

# 컬럼 이름 변경
cleaned.columns = [
    "timestamp",
    "station",
    "borough",
    "ridership",
    "transfers"
]

# timestamp datetime 변환
cleaned["timestamp"] = pd.to_datetime(cleaned["timestamp"])

cleaned["ridership"] = cleaned["ridership"].astype(str).str.replace(",", "").astype(int)
cleaned["transfers"] = cleaned["transfers"].astype(str).str.replace(",", "").astype(int)

# hour 컬럼 추가
cleaned["hour"] = cleaned["timestamp"].dt.hour

# 저장
cleaned.to_csv(
    "data/processed/cleaned_ridership.csv",
    index=False
)

print(cleaned.head())
print("ETL completed.")


# PostgreSQL 연결
engine = create_engine(
    "postgresql://postgres:postgres123@localhost:5432/subway_analytics"
)

# DB 저장
cleaned.to_sql(
    "ridership",
    engine,
    if_exists="replace",
    index=False
)

print("Data loaded into PostgreSQL.")