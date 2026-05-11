# NYC Subway Traffic Analytics Dashboard

## Overview
A full-stack analytics platform that processes NYC subway ridership data through a Python ETL pipeline, stores transformed records in PostgreSQL, exposes analytics through Java Spring Boot REST APIs, and visualizes congestion trends using Power BI.

---

## Architecture

MTA Open Data  
→ Python ETL  
→ PostgreSQL  
→ Spring Boot API  
→ Power BI Dashboard

---

## Technologies

- Java Spring Boot
- Python
- PostgreSQL
- SQLAlchemy
- Pandas
- Power BI
- Maven
- REST API

---

## Features

- ETL pipeline for subway ridership data
- PostgreSQL data storage and analytics
- REST APIs for ridership statistics
- Station congestion analysis
- Hourly traffic trend visualization
- Borough-level ridership reporting
- Interactive dashboard reporting

---

## ETL Workflow

### Extract
Reads NYC subway ridership CSV data from MTA Open Data.

### Transform
Processes and cleans transit records using Python and Pandas:
- Removes invalid values
- Converts timestamps
- Formats ridership metrics
- Extracts hourly traffic information

### Load
Loads transformed records into PostgreSQL for analytics and reporting.

---

## API Endpoints

### Get busiest stations

```http
GET /stations/busiest
```

Returns the top 10 busiest subway stations.

### Get hourly traffic

```http
GET /traffic/hourly
```

Returns hourly ridership trends.

### Get all stations

```http
GET /stations
```

Returns all subway stations.