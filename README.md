# Delivery API

Delivery API is a RESTful backend service built with **Spring Boot** designed to handle food order management. The application is fully containerized using **Docker Compose** and integrates seamlessly with a serverless **PostgreSQL (Neon.tech)** cloud database. The underlying data structure and initial dataset are sourced from a public dataset on **Kaggle**.

## Key Features

- **Versioned API Endpoints**: Follows clean API architecture standards using the `/api/v1/orders` routing path.
- **Business Analytics Insights**: Provides aggregated business metrics such as total revenue grouped by menu categories (`/analytics/revenue-by-category`).
- **Data Ingestion**: Powered by a curated public food delivery dataset obtained from Kaggle.
- **Database Automigration**: Utilizes Hibernate JPA to seamlessly synchronize database schemas upon startup.
- **Containerized Environment**: Production-ready and easy to spin up on any local environment using Docker.

## Tech Stack

- **Backend:** Java 17+, Spring Boot 3.x (Spring Web, Spring Data JPA)
- **Database:** PostgreSQL (Cloud instance via Neon.tech)
- **Dataset Source:** Kaggle Public Data
- **Containerization:** Docker & Docker Compose
- **Database Driver & Pool:** HikariCP & PostgreSQL Driver

## Getting Started

### Prerequisites

- **Docker Engine** and the **Docker Compose plugin** installed and running natively.
- _Note for Windows Users:_ Docker Desktop with the WSL 2 backend enabled is required to execute these commands.

### Installation & Setup Steps

1. Clone this repository to your local machine:

   ```bash
   git clone [https://github.com/USERNAME/delivery-api.git](https://github.com/USERNAME/delivery-api.git)
   cd delivery-api

   ```

2. Create a .env file in the root directory of the project and supply your Neon DB cloud credentials:

   ```Code snippet
   DB_URL=jdbc:postgresql://<your_neon_host>/neondb?sslmode=require
   DB_USERNAME=<your_neon_username>
   DB_PASSWORD=<your_neon_password>

   ```

3. Spin up the application using Docker Compose:

   ```Bash
   docker compose up --build -d

   ```

4. The application will compile, run database migrations, and map to port `8080`. It is now ready to receive requests at `http://localhost:8080`.

## API Endpoints (Postman Testing)

- GET `http://localhost:8080/api/v1/orders` - Fetches all order records.
- GET `http://localhost:8080/api/v1/orders/analytics/revenue-by-category` - Fetches total revenue aggregated by menu category.
