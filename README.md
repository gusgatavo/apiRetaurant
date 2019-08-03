# apiRetaurant
## Métodos expuestos

### Login
Para poder ejecutar el login se tiene que ejecuta la URL localhost:8080/login, como método POST, el cuerpo de esta llamada tiene el siguiente JSON, como datos de entrada.

#### JSON ####
{
	"userUsuario":"user",
	"pwsUsuario":"1234"
}

#### Respuesta ####
{
    "idUsuairo": 0,
    "nameUsuario": "user",
    "userUsuario": "user",
    "pwsUsuario": "",
    "perfilUsuario": 0,
    "token": "Bearer eyJhbGciOiJIUzUxMiJ9.eyJqdGkiOiJzb2Z0dGVrSldUIiwic3ViIjoiMTIzNCIsImF1dGhvcml0aWVzIjpbIlJPTEVfVVNFUiJdLCJpYXQiOjE1NjQ4NTI3MTUsImV4cCI6MTU2NDg1MzMxNX0.DkwT6N_Q-BKGKQZuCZLikDEOyyjY3floIAVqhFaKFVq_x-Si3WDb0mn9mB7l7zIe7RWyt4PPyAksCWm4gcCNNA"
}

### getVentasActivas
Servicio que muestra las ventas que se encuentran activas. La url es localhost:8080/getVentasActivas

### Parametros Header ###
Authorization		{token} (Dato que se rescata del login)

### Respuesta ###
[
    {
        "idVenta": 1,
        "boleta": 0,
        "fechaVenta": "2019-08-03T17:28:28.163+0000",
        "idMesa": 1,
        "detalleVenta": [
            {
                "idDetalleVenta": 1,
                "idProducto": 1,
                "cantidad": 1,
                "valorUnitario": 9000,
                "total": 9000
            },
            {
                "idDetalleVenta": 2,
                "idProducto": 2,
                "cantidad": 1,
                "valorUnitario": 1000,
                "total": 1000
            }
        ],
        "totalDescuento": 0,
        "propina": 0,
        "totalVenta": 10000
    },
    {
        "idVenta": 2,
        "boleta": 0,
        "fechaVenta": "2019-08-03T17:28:28.163+0000",
        "idMesa": 1,
        "detalleVenta": [
            {
                "idDetalleVenta": 1,
                "idProducto": 1,
                "cantidad": 1,
                "valorUnitario": 9000,
                "total": 9000
            },
            {
                "idDetalleVenta": 2,
                "idProducto": 2,
                "cantidad": 1,
                "valorUnitario": 1000,
                "total": 1000
            }
        ],
        "totalDescuento": 0,
        "propina": 0,
        "totalVenta": 10000
    }
]

### getVenta
Este metodo sirve para rescatar los datos de una venta en especifico. La url es localhost:8080/getVenta/{idVenta}

### Parametros Header ###
Authorization		{token} (Dato que se rescata del login)

### Respuesta ###
{
    "idVenta": 1,
    "boleta": 0,
    "fechaVenta": "2019-08-03T17:31:30.486+0000",
    "idMesa": 1,
    "detalleVenta": [
        {
            "idDetalleVenta": 1,
            "idProducto": 1,
            "cantidad": 1,
            "valorUnitario": 9000,
            "total": 9000
        },
        {
            "idDetalleVenta": 2,
            "idProducto": 2,
            "cantidad": 1,
            "valorUnitario": 1000,
            "total": 1000
        }
    ],
    "totalDescuento": 0,
    "propina": 0,
    "totalVenta": 10000
}


### getVentasDia
Este servicio permite rescatar las ventas del día. La URL es localhost:8080/getVentasDia

### Parametros Header ###
Authorization		{token} (Dato que se rescata del login)

### JOSN ###
{
	"fechaVenta":"2019-08-03"
}

### Respuesta ###
[
    {
        "idVenta": 1,
        "boleta": 0,
        "fechaVenta": "2019-08-03T17:11:06.375+0000",
        "idMesa": 1,
        "detalleVenta": [
            {
                "idDetalleVenta": 1,
                "idProducto": 1,
                "cantidad": 1,
                "valorUnitario": 9000,
                "total": 9000
            },
            {
                "idDetalleVenta": 2,
                "idProducto": 2,
                "cantidad": 1,
                "valorUnitario": 1000,
                "total": 1000
            }
        ],
        "totalDescuento": 0,
        "propina": 0,
        "totalVenta": 10000
    },
    {
        "idVenta": 2,
        "boleta": 0,
        "fechaVenta": "2019-08-03T17:11:06.375+0000",
        "idMesa": 1,
        "detalleVenta": [
            {
                "idDetalleVenta": 1,
                "idProducto": 1,
                "cantidad": 1,
                "valorUnitario": 9000,
                "total": 9000
            },
            {
                "idDetalleVenta": 2,
                "idProducto": 2,
                "cantidad": 1,
                "valorUnitario": 1000,
                "total": 1000
            }
        ],
        "totalDescuento": 0,
        "propina": 0,
        "totalVenta": 10000
    }
]

### doVenta
Este servicio nos permite agregar una venta. la URL es localhost:8080/doVenta


### Parametros Header ###
Authorization		{token} (Dato que se rescata del login)

### JOSN ###
{
	"idVenta":0,
	"boleta":0,
	"fechaVenta":"2019-08-03T17:12:33.601+0000",
	"idMesa":1,
	"detalleVenta":[{
			"idDetalleVenta":0,
			"idProducto":1,
			"cantidad":1,
			"valorUnitario":10,
			"total":10
		}],
		"totalDescuento":0,
		"propina":0,
		"totalVenta":10
}

### Respuesta ###
{
    "codido": 200,
    "descricion": "Venta registrada Correctamente"
}
