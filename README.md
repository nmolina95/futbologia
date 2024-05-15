# futbologia
- API Rest que permite manejar una base de datos de equipos de fútbol, con sus respectivas ligas y países.

# Instalaciones necesarias
- JDK 17
- Docker Desktop
- Git
- Postman

# Configuración del entorno develop
- Elegir una carpeta para el proyecto y ejecutar
  ```console
  git clone https://github.com/nmolina95/futbologia.git
  ```
- Abrir terminal en la raiz del proyecto
- Construir el compose
    ```console
    # agregar flag -d (detach) para levantar el compose separado y mantener la terminal utilizable
    docker compose up -d 
    ```

# Información al respecto
- Se realiza una inyección de scripts a través del archivo import.sql, permitiendo iniciar el proyecto con países, ligas, equipos y un usuario cargados en sus respectivas tablas.
- El usuario por defecto es: "username": "admin" y "password": "12345"
- El servidor corre sobre localhost:8080
- Para probar los distintos endpoints se debe usar Postman, realizando la petición inicial a localhost:8080/auth/login con las credenciales antes mencionadas, siendo enviadas a través del body usando el formato JSON.
- Para usar el resto de los servicios, se debe copiar el token que brina la response del login, configurándolo en la sección Authorization de las nuevas request, usando el tipo "Bearer Token".
- Se agrega el archivo "Futbologia.postman_collection.json" que incluye la colección de requests disponibles para probar desde Postman 