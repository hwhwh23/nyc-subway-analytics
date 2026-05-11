# NYC Subway Traffic Analytics Dashboard

## Overview
A full-stack analytics platform that processes NYC subway ridership data through a Python ETL pipeline, stores transformed records in PostgreSQL, exposes analytics through Java Spring Boot REST APIs, and visualizes congestion trends using Power BI.

## Architecture
MTA Open Data
→ Python ETL
→ PostgreSQL
→ Spring Boot API
→ Power BI Dashboard

## Technologies
- Java Spring Boot
- Python
- PostgreSQL
- Power BI
- SQLAlchemy
- Pandas

## Features
- ETL pipeline for subway ridership data
- PostgreSQL data storage
- REST APIs for analytics
- Ridership trend visualization
- Station congestion analysis

## API Endpoints
- /stations
- /stations/busiest
- /traffic/hourly