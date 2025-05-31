# EB Reading CRUD Application

This is a **CRUD (Create, Read, Update, Delete)** application designed for managing electronic books (eBooks) in a hospital setting.

---

## Features

- **Create** new eBook entries with details like title, author, and description
- **Read** and view all eBook entries in a list
- **Update** existing eBook information
- **Delete** eBooks when no longer needed
- User-friendly and responsive **React.js frontend**
- Robust backend API using **Spring Boot** with **MySQL** database
- Data validation and error handling for reliable operation

---

## Technology Stack

| Layer    | Technology        |
| -------- | ----------------- |
| Frontend | React.js          |
| Backend  | Spring Boot (Java)|
| Database | MySQL             |

---

## Project Structure

EB/
├── Backend/ # Spring Boot backend code
│ ├── src/
│ ├── pom.xml
│ └── ...
├── forntend/ # React.js frontend code
│ ├── public/
│ ├── src/
│ └── package.json
├── README.md # Project documentation
└── .gitignore



## Setup Instructions

### Prerequisites

- Java JDK 11 or higher
- Maven
- Node.js and npm
- MySQL Server

### Steps

1. **Clone the repository:**
   ```bash
   git clone https://github.com/Althafmhd/EB.git
   cd EB
Backend Setup:

Navigate to Backend folder

Configure your MySQL database connection in application.properties

Build and run the Spring Boot application:


mvn clean install
mvn spring-boot:run

Frontend Setup:

Navigate to forntend folder

Install dependencies:


npm install
Start React app:


npm start
Open your browser and go to http://localhost:3000 to access the frontend.

API Endpoints
Method	Endpoint	Description
GET	/api/ebooks	Get list of all eBooks
POST	/api/ebooks	Create a new eBook
PUT	/api/ebooks/{id}	Update an existing eBook
DELETE	/api/ebooks/{id}	Delete an eBook

