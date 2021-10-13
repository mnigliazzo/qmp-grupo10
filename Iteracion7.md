## Resolucion

https://macowins-server.herokuapp.com/prendas
 
- Como usuarie de QueMePongo quiero ver todas las prendas que tengo en mi guardarropas desde el navegador para poder administrarlas

   - Rutas Rest: `curl -XGET https://macowins-server.herokuapp.com/prendas`

   - Body:

   - Codigo Respuesta: 200

   - Body Respuesta: 

   ```JSON
   [
                      {
                        "id": 1,
                        "tipo": "pantalon",
                        "talle": 35
                      },
                      {
                        "id": 2,
                        "tipo": "pantalon",
                        "talle": 36
                      },
                      {
                        "id": 3,
                        "tipo": "pantalon",
                        "talle": 37
                      },
                      {
                        "id"...
   ```

- Como usuario de QueMePongo, quiero crear una prenda desde el navegador

   - Rutas Rest: `curl -XPOST 'https://macowins-server.herokuapp.com/prendas/' --data '{ "tipo": "chomba", "talle": "XS" }' -H 'Content-Type: application/json'`

   - Body:

   ```JSON
   {
      "tipo": "chomba",
      "talle": "XS" 
   }
   ```

   - Codigo Respuesta: 201

   - Body Respuesta: 

   ```JSON
      {
      "tipo": "chomba",
      "talle": "XS",
      "id": 30
      }
   ```

- Como usuarie de QueMePongo quiero ver una prenda en particular que tengo en mi guardarropas para poder editarla

   - Rutas Rest: `curl -XGET https://macowins-server.herokuapp.com/prendas?id=1`

   - Body:

   - Codigo Respuesta: 200

   - Body Respuesta: 

   ```JSON
   [
      {
         "id": 1,
         "tipo": "pantalon",
         "talle": 35
      }
   ]
   ```

- Como usuarie de QueMePongo, quiero poder eliminar una prenda de mi guardarropas

   - Rutas Rest: `curl -XDELETE https://macowins-server.herokuapp.com/prendas/1`

   - Body:

   - Codigo Respuesta: 200

   - Body Respuesta: 

   ```JSON
      {
         
      }
   ```

- Como usuarie de QueMePongo, quiero poder ver mis eventos para administrarlos

   - Rutas Rest: `curl -XGET https://macowins-server.herokuapp.com/eventos`

   - Body:

   - Codigo Respuesta: 200

   - Body Respuesta: 

   ```JSON
   [
                      {
                        "id": 1,
                        "evento": "bla"
                      },
                      {
                        "id": 2,
                        "evento": "bla2"
                      },
                      {
                        "id"...
   ```

- Como usuarie de QueMePongo, quiero poder abrir las sugerencias de prendas para un evento en mi navegador


   - Rutas Rest: `curl -XGET https://macowins-server.herokuapp.com/sugerencias?id_evento=2`

   - Body:

   - Codigo Respuesta: 200

   - Body Respuesta: 

   ```JSON
   [
                      {
                        "id": 1,
                        "id_evento": 2,
                        "id_prenda": 3                      },
                      {
                        "id": 2,
                        "id_evento": 2                        ,
                        "id_prenda": 4
                      },
                      {
                        "id"...
   ```
