#Spring boot API Project


##Description

Simple RESTful API project for managing product

##Features

- Create new products
- Retrieve a list of products
- Filter products by category
- GET product details by ID

##Technologies used

- Spring boot
- Spring Data JPA 
- H2 database 
- Postman

##API Endpoints 

### Create 

**URL**: http://localhost:8080/products
**Method**: POST
**Body**
**Json**
{
	"name": "apple",
	"description": "food to eat",
	"price": 1,
	"category": "fruit"
}

### GET

**URL** http://localhost:8080/products

### GET-by-category

**URL** http://localhost:8080/products?category={category}

### GET-by-id

**URL** http://localhost:8080/products/{id}







