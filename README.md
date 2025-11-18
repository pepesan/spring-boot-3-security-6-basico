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
- Usuario: `user`
- Contraseña: Debes revisar la consola donde se ejecuta la aplicación para ver la contraseña generada automáticamente.

## Redirección
Después de iniciar sesión correctamente, serás redirigido a la página principal de la aplicación.


   