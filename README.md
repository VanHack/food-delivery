# Food Delivery

[![Build Status](https://img.shields.io/travis/selzlein/food-delivery.svg?style=flat-square)](https://travis-ci.org/selzlein/food-delivery)

Backend project (API) for a food delivery application.

## Model entities

`Customer` - user that place orders

`Item` - the actual items that can be ordered by customers

`Restaurant` - receives orders and maintain a list of available items to be ordered by customers

`Order` - set of items ordered by a customer from a restaurant

## Setup & Run

- `clone`
- `mvn spring-boot:run`
- go to `http://localhost:8080/swagger-ui.html#/` to see the available endpoints

## API Docs

Available at: `http://localhost:8080/swagger-ui.html#/`

This project's web services documentation was generated using Spring and [Swagger](https://swagger.io/) integration, the SpringFox project.

If you want to learn more about SpringFox project check [here](https://springfox.github.io/springfox/docs/current/).

## Test endpoints with Postman

Test this application endpoints with Postman:

- [Download it](https://www.getpostman.com/)
- Start it and import `food-delivery.postman_collection.json` which is a collection of example requests.

## Persistence layer

For this project I used embedded [H2 Database](http://www.h2database.com/html/main.html). Since I am also using an ORM solution (Hibernate) it could be switched to another database solution with no major issues.

[Flyway](https://flywaydb.org/) is the database version control tool used here too.
