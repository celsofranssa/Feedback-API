# Feedback API

![Feedback_API_DER](https://github.com/celsofranssa/Feedback-API/raw/master/resources/feedback_api_der.png)

### Endpoints

#### 1. Find highest priority description

* endpoint: `base_url/descriptions/high-priority?judgeId=<id>`
* method: `GET`
* example:`base_url/descriptions/high-priority?judgeId=7`

```json
{
    "id": 8700,
    "content": "leite fermentado integral paulista com 6 unidades, 540g"
}
```

* ResponseStatus: `200 OK.`

#### 2. Find products by description id

* endpoint: `base_url/descriptions/<descriptionId>/products`
* method: `GET`
* example:`base_url/descriptions/8700/products`

```json
[
  {
    "id": 16688,
    "descriptionId": 8700,
    "name": "iogurte integral danone vitamina de frutas 135kg",
    "placeName": "carrefour (norte shopping)",
    "placeUrl": "https://www.carrefour.com.br",
    "productUrl": "https://mercado.carrefour.com.br/iogurte-integral-danone-vitamina-de-frutas-1-35kg-9560572/p",
    "productImgUrl": "https://carrefourbr.vtexassets.com/arquivos/ids/14233244-160-160?width=160&height=160&aspect=true",
    "price": "R$11,45"
  },
     ...
  {
    "id": 30695,
    "descriptionId": 8700,
    "name": "polpa de acerola congelada de marchi 100 g",
    "placeName": "carrefour (norte shopping)",
    "placeUrl": "https://www.carrefour.com.br",
    "productUrl": "https://mercado.carrefour.com.br/polpa-de-acerola-congelada-de-marchi-100-g-7123914/p",
    "productImgUrl": "https://carrefourbr.vtexassets.com/arquivos/ids/13691455-160-160?width=160&height=160&aspect=true",
    "price": "R$3,29"
  }
]
```

* ResponseStatus: `200 OK.`

#### 3. Create new feedbacks resource

* endpoint: `base_url/feedbacks`
* method: `POST`
* body:

```json
[
    {
        "productId": 304,
        "descriptionId": 173,
        "judgeId":1,
        "rating": 5,
        "comment": "just one comment."
    },

    ...

    {
        "productId": 173,
        "descriptionId": 33,
        "judgeId":1,
        "rating": 4,
        "comment": "just another comment."
    }
]
```

* ResponseStatus: `201 Created.`

#### 4. List all judges

* endpoint: `base_url/judges`
* method: `GET`
* example:`base_url/judges`

```json
[
  {
    "id": 1,
    "name": "Rodrygo Santos"
  },
  {
    "id": 2,
    "name": "Marcos Goncalves"
  },
  {
    "id": 3,
    "name": "Wagner Meira"
  },
  {
    "id": 4,
    "name": "Rennan Cordeiro"
  },
  {
    "id": 5,
    "name": "Matheus Barbos"
  },
  {
    "id": 6,
    "name": "Breno"
  },
  {
    "id": 7,
    "name": "Celso França"
  }
]
```

* ResponseStatus: `200 OK.`

#### 5. Create new judge resource

* endpoint: `base_url/judge`
* method: `POST`
* body:

```json
{
  "id":8,
  "name": "Test Judge"
}
```

* ResponseStatus: `201 Created.`