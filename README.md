# devOpsAppQuiz

[5%] Realizar un fork del proyecto, y agregar miembros del team aca en el encabezado

- https://docs.github.com/en/get-started/writing-on-github/getting-started-with-writing-and-formatting-on-github/basic-writing-and-formatting-syntax
- https://github.com/othneildrew/Best-README-Template

[15%] Hacer un code Review encontrado las razones por las cuales el codigo en el repo es un APIRest o no y justificar, y escribir el resultado del code review dentro de este readme, utilizar las syntaxis propuesta en:

- https://docs.github.com/en/get-started/writing-on-github/getting-started-with-writing-and-formatting-on-github/basic-writing-and-formatting-syntax
- https://github.com/othneildrew/Best-README-Template
- Hallazgos a partir del code review:
  - _RestBarriosController_ no retorna un objeto HTTP, los métodos HTTP de una solicitud HTTP de la API de RESTful son importantes ya que contienen información de identificación importante con respecto a los metadatos, la autorización, el identificador uniforme de recursos (URI), el almacenamiento en caché, las cookies y otros elementos de la solicitud.
  - Falta añadir comportamiento de **@RestController**, La clase _RestBarriosController_ no posee la datanotation necesaria para ser usada como controller.  
  - Falta la lógica del negocio para cada uno de los métodos _createPerson_ y _updatePerson_ en el controlador _RestBarriosController_. Adicionalmente ninguno de los anteriores métodos retornaba los datos necesarios
  - Falta el manejo de persistencia de los objetos barrio, tanto como un Service asociado.
  - Utilizar bien la responsabilidad de la clase, es decir, los nombres de los métodos no corresponden a lo que realmente hacen en la clase  _RestBarriosController_.
  - Las clases  _EmpleoDto_ y _PaisDto_ no tienen una definición de métodos o propiedades; aun que esto en sí no es un problema para que sea un API REST.
  - Hacen falta las pruebas unitarios para los servicios y otros metodos importantes; aun que esto en sí no es un problema para que sea un API REST.
  - La interfaz _ManejoUsuarioServiceInt_ no contiene los metodos _saveUsuarios_, _editUsuario_, _deleteUsuario_, estos metodos son parte del modelo CRUD y deberian estar para poder ser usados en el controlador.

[50%] Completar la implementacion usando: hacer commit en el master branch

- https://mockapi.io/ Crear llamados a APis para ganerar datos aleatorios y completar las estructuras si es necesario
- https://www.baeldung.com/spring-boot-json
- https://www.baeldung.com/spring-resttemplate-post-json
- Postman

[30%] Implementar GitFlow Startegy en el proyecto
