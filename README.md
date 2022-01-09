# Reactive-Rest-CRUD-APIs-Using-Spring-Boot-WebFlux-and-MongoDB
Reactive Rest CRUD APIs Using Spring Boot, WebFlux, and MongoDB

[FR] Les API réactives ne sont pas bloquantes et ont tendance à être plus efficaces car elles ne bloquent pas le traitement en attendant que des choses se produisent. Les systèmes réactifs adoptent des E/S asynchrones. Les applications réactives nous permettent de mieux évoluer si nous traitons beaucoup de données en streaming.
Si nous voulons créer une application réactive, nous avons besoin qu'elle soit réactive jusqu'à votre base de données.
Utilisez un pilote JDBC bloquant avec Spring WebFlux, et nous serons insatisfaits de ses performances.
Utilisez une base de données NoSQL réactive comme MongoDB - et nous serons satisfaits de ses performances.
Spring WebFlux utilise une bibliothèque appelée Reactor pour son support réactif.
Le réacteur est une implémentation de la spécification Reactive Streams. Le réacteur fournit deux types principaux appelés Flux et Mono.
Ces deux types implémentent l'interface Publisher fournie par Reactive Streams.
Flux est utilisé pour représenter un flux de 0..N éléments et Mono est utilisé pour représenter un flux de 0..1 élément.

[EN] Reactive APIs are non-blocking and tend to be more efficient because they’re not tying up processing while waiting for stuff to happen.
Reactive systems adopt asynchronous I/O. Reactive apps allow us to scale better if we are dealing with lots of streaming data. 
If we are going to build a reactive app, we need it to be reactive all the way down to your database.
Use a blocking JDBC driver with Spring WebFlux, and we will be displeased with its performance.
Use a reactive NoSQL database like MongoDB – and we will be satisfied with its performance.
Spring WebFlux uses a library called Reactor for its reactive support. The Reactor is an implementation of the Reactive Streams specification.
The Reactor Provides two main types called Flux and Mono. Both of these types implement the Publisher interface provided by Reactive Streams.
Flux is used to represent a stream of 0..N elements and Mono is used to represent a stream of 0..1 element.
