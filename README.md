<html>
  <body style="background-color: beige">
    <h1 style="text-align: center">Entrega QMP 7</h1>
    <br />
    <l1>
      <ul>
        <h3>
          Como usuarie de QueMePongo quiero ver todas las prendas que tengo en
          mi guardarropas desde el navegador para poder administrarlas
        </h3>
        <l1>
          Rutas REST
          <ul>
            GET /prendas
          </ul>
        </l1>
        <l1>
          Request Body
          <ul>
            Vacio
          </ul>
        </l1>
        <l1>
          Response Codes
          <ul>
            200 OK
          </ul>
          <ul>
            500 Se cayo el servidor o La DB esta muerta :)
          </ul>
        </l1>
        <l1>
          Response Bodies
          <ul>
            { prendas: [ { id, color, talle }, { id, color, talle } ] }
          </ul>
        </l1>
      </ul>
      <hr />
      <ul>
        <h3>
          Como usuario de QueMePongo, quiero crear una prenda desde el navegador
        </h3>
        <l1>
          Rutas REST
          <ul>
            POST /prenda
          </ul>
        </l1>
        <l1>
          Request Body
          <ul>
            { prenda: { id, color, talle } }
          </ul>
        </l1>
        <l1>
          Response Codes
          <ul>
            200 OK
          </ul>
          <ul>
            403 BAD REQUEST Si la prenda estuviera creada
          </ul>
          <ul>
            500 Se cayo el servidor o La DB esta muerta :)
          </ul>
        </l1>
        <l1>
          Response Bodies
          <ul>
            No volveria Body salvo que haya un error en ese caso se devolveria
            un objeto con la informacion del error.
          </ul>
        </l1>
      </ul>
      <hr />
      <ul>
        <h3>
          Como usuarie de QueMePongo quiero ver una prenda en particular que
          tengo en mi guardarropas para poder editarla
        </h3>
        <l1>
          Rutas REST
          <ul>
            GET /prenda/id
          </ul>
        </l1>
        <l1>
          Request Body
          <ul>
            Vacio
          </ul>
        </l1>
        <l1>
          Response Codes
          <ul>
            200 OK Si esta la prenda y se devuelve
          </ul>
          <ul>
            404 Si no existe la prenda que busco
          </ul>
          <ul>
            500 Se cayo el servidor o La DB esta muerta :)
          </ul>
        </l1>
        <l1>
          Response Bodies
          <ul>
            { prenda: { id, color, talle } }
          </ul>
        </l1>
      </ul>
      <hr />
      <ul>
        <h3>
          Como usuarie de QueMePongo, quiero poder eliminar una prenda de mi
          guardarropas
        </h3>
        <l1>
          Rutas REST
          <ul>
            DELETE /prenda/id
          </ul>
        </l1>
        <l1>
          Request Body
          <ul>
            Vacio
          </ul>
        </l1>
        <l1>
          Response Codes
          <ul>
            200 OK Si se elimina la prenda
          </ul>
          <ul>
            404 Si no existe la prenda que quiero eliminar
          </ul>
          <ul>
            500 Se cayo el servidor o La DB esta muerta :)
          </ul>
        </l1>
        <l1>
          Response Bodies
          <ul>
            Vacio
          </ul>
        </l1>
      </ul>
      <hr />
      <ul>
        <h3>
          Como usuarie de QueMePongo, quiero poder ver mis eventos para
          administrarlos
        </h3>
        <l1>
          Rutas REST
          <ul>
            GET /eventos
          </ul>
        </l1>
        <l1>
          Request Body
          <ul>
            Vacio
          </ul>
        </l1>
        <l1>
          Response Codes
          <ul>
            200 OK Si se hay eventos y los devuelve
          </ul>
          <ul>
            500 Se cayo el servidor o La DB esta muerta :)
          </ul>
        </l1>
        <l1>
          Response Bodies
          <ul>
            { eventos: [ { id, nombreEvento, horarioEvento }] }
          </ul>
        </l1>
      </ul>
      <hr />
      <ul>
        <h3>
          Como usuarie de QueMePongo, quiero poder abrir las sugerencias de
          prendas para un evento en mi navegador
        </h3>
        <l1>
          Rutas REST
          <ul>
            GET /sugerencias/idEvento
          </ul>
        </l1>
        <l1>
          Request Body
          <ul>
            Vacio
          </ul>
        </l1>
        <l1>
          Response Codes
          <ul>
            200 OK Devuelve sugerencias
          </ul>
          <ul>
            404 No existen sugerencias para ese evento
          </ul>
          <ul>
            500 Se cayo el servidor o La DB esta muerta :)
          </ul>
        </l1>
        <l1>
          Response Bodies
          <ul>
            { sugerencias: [ { id, atuendo: [ prenda ] }] }
          </ul>
        </l1>
      </ul>
    </l1>
  </body>
</html>
