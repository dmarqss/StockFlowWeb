
# Stock Flow Web

This project is an Stock manager made using  **Java, Java Spring, My SQL with database, thymeleaf for server-side Java template, html, css and boostrap for front-end**.




## Installation

- Clone the repository

- Install dependences with maven

- Install mysql server

- Run aplication



## EndPoints

#### Home page

```http
  GET localhost:8080/home
```

| Parameter | Return     | Description                |
| :-------- | :------- | :------------------------- |
| `` | `html page` | show home page|

#### View stock

```http
  GET localhost:8080/stock
```

| Parameter | Return     | Description                       |
| :-------- | :------- | :-------------------------------- |
| ``      | `List<product>` |show all Products on database |

#### Add product

```http
  POST localhost:8080/stock
```

| Parameter | Return     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `Product`      | `` |add Product on database |

#### Edit product

```http
  GET localhost:8080/stock/edit
```

| Parameter | Return     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `Long ean`      | `` |load edit page and get product informations |

```http
  POST localhost:8080/stock/edit
```

| Parameter | Return     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `Product`      | `` |Update product on database by ean |

```http
  POST localhost:8080/stock/edit/delete
```

| Parameter | Return     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `Long ean`      | `` |delete product by ean|

```http
  GET localhost:8080/error
```

| Parameter | Return     | Description                       |
| :-------- | :------- | :-------------------------------- |
| ``      | `` |show this page for all erros |



## Authors

- [@dmarqss](https://github.com/dmarqss)

