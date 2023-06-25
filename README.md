# Sistema de Gestión de Roles, Productos y Compras para Restaurante

Este repositorio contiene un sistema en Java para gestionar los roles, productos y compras de un restaurante. El sistema está diseñado para ayudar a automatizar las tareas relacionadas con la administración y el seguimiento de los roles del personal, el inventario de productos y las compras realizadas.

## Características

- Gestión de roles del personal: El sistema permite crear, editar y eliminar roles del personal, como chef, camarero, gerente, etc. Cada rol puede tener diferentes permisos y responsabilidades asociadas.
- Gestión de productos: Se pueden agregar, editar y eliminar productos del inventario del restaurante. Cada producto tiene información como nombre, descripción, precio, cantidad disponible, etc.
- Realización de compras: Los usuarios pueden realizar compras de productos a proveedores externos utilizando el sistema. Se registra la información de la compra, incluyendo los productos adquiridos, la cantidad y el costo.
- Seguimiento de inventario: El sistema realiza un seguimiento automático de la cantidad disponible de cada producto en el inventario. Cuando se realiza una compra, la cantidad se actualiza en consecuencia. También se proporcionan informes y notificaciones para mantener un control eficiente del inventario.

## Requisitos del sistema

- Java JDK 8 o superior.
- Maven para la gestión de dependencias.

## Instalación y configuración

1. Clona este repositorio en tu máquina local utilizando el siguiente comando:
   
    git clone https://github.com/tu_usuario/restaurante-gestion.git

2. Navega al directorio del proyecto:

    cd restaurante-gestion

3. Compila el proyecto utilizando Maven:

    mvn compile


## Uso del sistema

Una vez que el sistema esté en funcionamiento, podrás acceder a él a través de una interfaz de línea de comandos (CLI) o una interfaz gráfica de usuario (GUI), dependiendo de la implementación proporcionada.

La interfaz de usuario te guiará a través de las diferentes funciones disponibles, como la gestión de roles, productos y compras. Sigue las instrucciones proporcionadas en la interfaz para interactuar con el sistema de manera efectiva.
