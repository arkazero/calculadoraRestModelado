# <h2>calculadoraRestModelado</h2>
Calculadora que expone las operaciones suma, resta, division y multiplicacion <br>
Estas operaciones son expuestas mediante un servicio rest que responde a la siguiente estructura
http://localhost:7593/api/v1/calculator/add/operador1/operador2/.../operadorn <br>
http://localhost:7593/api/v1/calculator/subs/operador1/operador2/.../operadorn <br>
http://localhost:7593/api/v1/calculator/mult/operador1/operador2/.../operadorn <br>
http://localhost:7593/api/v1/calculator/div/operador1/operador2/.../operadorn <br>

Se crea una imagen docker com tomcat como servidor de aplicaciones

 docker run -it -p 7593:8080 docker pull arkazero/calculadorarestmodelado
