# Repositorio de ejemplo de Uso de Spring Boot con Maven y Seguridad básica

Este repositorio contiene un proyecto de ejemplo que demuestra cómo configurar una aplicación Spring Boot utilizando Maven como herramienta de construcción y gestión de dependencias, junto con la implementación de seguridad básica.

## Arranque Rápido
Para ejecutar este proyecto localmente, sigue estos pasos:
1. Clona el repositorio:
   ```bash
   git clone   https://github.com/pepesan/spring-boot-3-security-6-basico.git
   ```
2. Navega al directorio del proyecto:
3. ```bash
   cd spring-boot-3-security-6-basico
   ```
4. Construye el proyecto utilizando Maven:
   ```bash
   mvn clean install
   ```
5. Ejecuta la aplicación:
6. ```bash
   mvn spring-boot:run
   ```
7. Abre tu navegador web y accede a `http://localhost:8080` para ver la aplicación en funcionamiento.

## Login
La aplicación utiliza seguridad básica proporcionada por Spring Security. Puedes iniciar sesión con las siguientes credenciales predeterminadas:
- Usuario: `admin`, Contraseña: `admin`
- Usuario: `pepesan`, Contraseña: `password`

## Redirección
Después de iniciar sesión correctamente, serás redirigido a la página principal de la aplicación.

## Acceso a la BBDD via consola web


La aplicación incluye una consola web para acceder a la base de datos H2. Puedes acceder a ella en `http://localhost:8080/h2-console`. Utiliza las siguientes configuraciones para conectarte:
- JDBC URL: `jdbc:h2:mem:mydb`
- Usuario: `sa`
- Contraseña: (deja este campo vacío)
- Driver Class: `org.h2.Driver`


## Acceso a BBDD via Security

Hemos creamos unas entidades de ejemplo y un repositorio para acceder a ellas.
User y Role y sus respectivos repositorios.

Para configurar el acceso a la base de datos, hemos creado un servicio que implementa UserDetailsService de Spring Security.
Este servicio carga los detalles del usuario desde la base de datos para la autenticación y autorización.
Puedes personalizar este servicio para adaptarlo a tus necesidades específicas de seguridad y gestión de usuarios.

## Usuarios por defecto
Al iniciar la aplicación, se crean automáticamente dos usuarios por defecto en la base de datos:
- Usuario: `admin`, Contraseña: `admin`, Rol: `ROLE_ADMIN`\
- Usuario: `pepesan`, Contraseña: `password`, Rol: `ROLE_USER`

Estos usuarios pueden ser utilizados para probar la funcionalidad de seguridad de la aplicación.
Y están definidos en el fichero data.sql de resources.

## Definición de Seguridad
Hemos configurado la seguridad de la aplicación utilizando Spring Security.
La configuración incluye la definición de URLS públicas y protegidas, así como los roles necesarios para
acceder a las diferentes partes de la aplicación.

Todo esto está definido en la clase SecurityConfig.java.


## URLS públicas
Hemos definido las siguientes URLS como públicas en la aplicación:
- `/h2-console/**`: Acceso permitido para todos los usuarios, sin necesidad de autenticación.
- `/login`: Acceso permitido para todos los usuarios, sin necesidad de autenticación.
- `/logout`: Acceso permitido para todos los usuarios, sin necesidad de autenticación.

## URLS protegidas
Hemos protegido las siguientes URLS en la aplicación:
- `/admin/**`: Acceso restringido solo para usuarios con el rol `ROLE_ADMIN`.
- `/user/**`: Acceso restringido solo para usuarios con el rol `ROLE_USER`.

   