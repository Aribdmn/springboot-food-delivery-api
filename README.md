# Delivery API

Delivery API is a RESTful backend service built with **Spring Boot** designed to handle food order management. The application is fully containerized using **Docker Compose** and integrates seamlessly with a serverless **PostgreSQL (Neon.tech)** cloud database. The underlying data structure and initial dataset are sourced from a public dataset on **Kaggle**.

## 🚀 Key Features

- **Versioned API Endpoints**: Follows clean API architecture standards using the `/api/v1/orders` routing path.
- **Order Filtering**: Enables specific order lookups based on status query parameters (`/status?status=PENDING`).
- **Data Ingestion**: Powered by a curated public food delivery dataset obtained from Kaggle.
- **Database Automigration**: Utilizes Hibernate JPA to seamlessly synchronize database schemas upon startup.
- **Containerized Environment**: Production-ready and easy to spin up on any local environment using Docker.

## 🛠️ Tech Stack

- **Backend:** Java 17+, Spring Boot 3.x (Spring Web, Spring Data JPA)
- **Database:** PostgreSQL (Cloud instance via Neon.tech)
- **Dataset Source:** Kaggle Public Data
- **Containerization:** Docker & Docker Compose
- **Database Driver & Pool:** HikariCP & PostgreSQL Driver

## 📦 Getting Started

### Prerequisites

- Docker Desktop installed and running.
- WSL 2 enabled (if you are running on Windows).

### Installation & Setup Steps

1. Clone this repository to your local machine:
   ```bash
   git clone [https://github.com/USERNAME/food-delivery.git](https://github.com/USERNAME/food-delivery.git)
   cd food-delivery
   ```
