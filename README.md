
# Gatway (Proxy) de endereçamento para microservice
Utilizado para que faça o redirecionamento das requisições para seus respectivos microservices. Este projeto está correlacionado com o projeto que está no repositório https://github.com/Dalenson/CRUD-ProdutosAPI.
A ideia é para que na requisição quando for enviado para um endereço: http://localhost:8085/api/produtos ao chegar neste projeto a requisição a mesma irá rotacionar para o endereço http://localhost:8081/api/produtos onde estaria o back-end da aplicação de produtos, podendo ser aplicado para diversos outros microservices. Aqui utilizamos o Spring Cloud substituindo a zuul.
## Stack utilizada

**Back-end:** Spring Cloud, MySql, Heroku, Eureka.

