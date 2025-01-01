# Art Institute of Chicago Search Engine

This project is a simple search engine for exploring the collection of the Art Institute of Chicago. It consists of a **Spring Boot** backend and an **Angular** frontend. You can find the whole data of the collections in this [link](https://github.com/art-institute-of-chicago/api-data)

## Features

- Search for artworks in the Art Institute of Chicago's collection
- Download/view artworks

---

## Tech Stack

- **Backend**: Spring Boot
- **Frontend**: Angular

---

## Getting Started

### Prerequisites

Ensure you have the following installed on your system:

- [Java 21](https://www.oracle.com/java/technologies/javase/jdk21-archive-downloads.html)
- [Node.js](https://nodejs.org/) and [npm](https://www.npmjs.com/)
- [Angular CLI](https://angular.dev/cli)
- [Maven](https://maven.apache.org/install.html)

---

### Backend Setup (Spring Boot)

1.**Navigate to the server directory**

```bash
  cd server
```

2.**Build and run the Spring Boot application**

```bash
mvn clean install
mvn spring-boot:run
```

3.The backend should now be running at `http://localhost:8080`.

---

### Frontend Setup (Angular)

1.**Navigate to the frontend directory**

```bash
cd client
```

2.**Install dependencies**

```bash
npm install
```

3.**Create a `.env` file**

- Create a new file named `.env` in the same directory.
- Copy the content of `.env.example` into `.env` and update the `API_URL` value (By default `API_URL` is `http://localhost:8080/api/v1` but you can modify it by changing the port in the `application.properties` file in Springboot project)

  4.**Run the Angular application**

```bash
ng serve
```

5.The frontend should now be running at `http://localhost:4200`.

---

## Deployment

To deploy both the Frontend and Backend applications we need to utilize certain tools:

- **Github Actions** to handle the CI/CD of our apps, we can create jobs to help us the deployments of the apps.
- **Vercel** as a deployment platform for our Angular app, we can also create jobs to test, build and deploy the Angular app and make it live and accessible.
- **Docker** to handle the containerization of our Spring boot server
- **AWS or DigitalOcean** to run a small Virtual Machine and to use **Docker** to run our Springboot server.
- We can also create jobs in our CI/CD pipeline to handle the process to deploy the server.

---

## License

This project is licensed under the [MIT License](LICENSE).

---

## Acknowledgments

- [Art Institute of Chicago API](https://api.artic.edu/docs/) for providing the data
