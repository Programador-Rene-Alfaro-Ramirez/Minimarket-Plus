# Minimarket Plus - Sistema de Autenticación y Pruebas Unitarias (Semana 6)

## 👥 Integrantes - Grupo 4
* René Alfaro
* Miguel Garrido
* Jean Santoni

## 📝 Descripción del Proyecto
Este proyecto corresponde al desarrollo y aseguramiento de calidad del backend de **Minimarket Plus**. En esta sexta semana, se ha implementado un mecanismo perimetral de autenticación y control de acceso robusto basado en roles (`CLIENTE`, `CAJERO`, `ADMINISTRADOR`) para restringir operaciones críticas del sistema. 

Para validar la correcta ejecución de estas reglas de seguridad y la integridad de la lógica de negocio, se diseñó e implementó una suite completa de pruebas unitarias automatizadas.

## 🛠️ Tecnologías y Dependencias Utilizadas
* **Java 17**
* **Spring Boot Framework** (Security, Web, JPA)
* **Apache Maven** (Gestor de dependencias y construcción)
* **JUnit 5** (Framework estructural para la ejecución de pruebas unitarias)
* **Mockito** (Herramienta para el aislamiento de dependencias y simulación de repositorios)
* **JaCoCo Plugin (0.8.11)** (Motor de auditoría para la medición y reporte de cobertura de código)

## 🏗️ Estructura del Proyecto
Cumpliendo con los estándares requeridos por la actividad sumativa, el código fuente se organiza bajo la siguiente estructura limpia de directorios:
* `src/main/java/`: Contiene la lógica de negocio, controladores, servicios y las reglas del framework de seguridad.
* `src/test/java/`: Aloja exclusivamente las clases de pruebas unitarias enfocadas en las entidades clave (`Usuario`, `Producto`, `Inventario` y `Venta`).

## 🚀 Instrucciones de Ejecución
Para compilar el proyecto, levantar el ciclo de vida y ejecutar de forma automatizada la suite de pruebas unitarias junto con la generación de reportes de cobertura de JaCoCo, ejecute el siguiente comando en la terminal de su IDE:

```bash
mvn clean test