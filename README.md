# Feedback API

![Feedback_API_DER](https://github.com/celsofranssa/Feedback-API/raw/master/resources/feedback_api_der.png)

### Endpoints

#### 1. Find highest priority description

`endpoint`: https://ibge-feedback-api.herokuapp.com/descriptions/high-priority

`method`: GET

`result`:

```
{
    "id": 3,
    "content": "description 03"
}
```

`status`: 200 OK.

#### 2. Find products by description id

`endpoint`: https://ibge-feedback-api.herokuapp.com/descriptions/1/products

`method`: GET

`result`:

```
[
    {
        "id": 1,
        "descriptionId": 1,
        "name": "Arroz Branco Longo-fino Tipo 1 Camil 5 Kg",
        "placeName": "Carrefour",
        "price": "R$ 25,00",
        "placeUrl": "https://mercado.carrefour.com.br/",
        "productUrl": "https://mercado.carrefour.com.br/arroz-branco-longo-fino-tipo-1-camil-todo-dia-5kg-115789",
        "productImgUrl": "https://carrefourbr.vtexassets.com/arquivos/ids/193474-1600-auto?width=1600&height=auto&aspect=true",
        "lastUpdated": "18/02/2021",
        "metadata": "Grupo Camil, Pacote, Arroz, Branco, Polido, Long-fino"
    },
    {
        "id": 2,
        "descriptionId": 1,
        "name": "Arroz Branco Longo-fino Tipo 1 Camil 5 Kg",
        "placeName": "Carrefour",
        "price": "R$ 25,00",
        "placeUrl": "https://mercado.carrefour.com.br/",
        "productUrl": "https://mercado.carrefour.com.br/arroz-branco-longo-fino-tipo-1-camil-todo-dia-5kg-115789",
        "productImgUrl": "https://carrefourbr.vtexassets.com/arquivos/ids/193474-1600-auto?width=1600&height=auto&aspect=true",
        "lastUpdated": "18/02/2021",
        "metadata": "Grupo Camil, Pacote, Arroz, Branco, Polido, Long-fino"
    }
]
```

`status`: 200 OK.

#### 3. Save feedbacks

`endpoint`: https://ibge-feedback-api.herokuapp.com/feedbacks

`method`: POST

`body`:

```
[
    {
        "productId": 1,
        "descriptionId": 1,
        "rating": 5
    },
    {
        "productId": 2,
        "descriptionId": 1,
        "rating": 5
    }
]
```

`status`: 201 Created.