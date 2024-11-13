# MVC
## Explicação:
Uma demonstração do Design Pattern: MVC

O código instancia varias classes para demonstrar os design patterns
Observer, Composite e Strategy, todos juntos no padrão MVC.

O método main inicializa um Controller, e utiliza dele para adicionar instancias
de livros e seções a "Library". depois, ele se utiliza do View para retornar todas
as instancias de livros por seção, que estão guardadas usando o Composite.
Depois disso, são adicionados alguns membros, que são logo em seguida inscritos nos
livros criados anteriormente, utilizando do pattern Observer para mandar uma notificação
para estes membros quando os livros são atualizados.
por ultimo, são realizadas duas pesquisas de livro, a primeira por titulo, e a segunda 
por autor, demonstrando o pattern Strategy.

No console, irá aparecer o resultado de cada uma dessas operações, separada por pattern demonstrado.

* Bonus: para a criação da "library" foi utilizado um design pattern extra: Singleton.