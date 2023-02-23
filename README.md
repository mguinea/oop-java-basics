## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).


## Resumen OOP

### Qué es una clase

Las clases en Java son un tipo de dato estructurado (tipo objeto), se denominan así, porque pueden contener múltiples valores de tipos de datos más simples (int, boolean, double, float, etc.). Una clase es un molde que utilizaremos para crear distintos objetos, con características comunes entre sí.

### Qué es un objeto

Los objetos en Java tienen tres características primarias: identidad, estado y comportamiento. Con estas propiedades se pueden construir bloques de objetos. Veamos cómo trabajan en conjunto estas características:

1. Identidad: la identidad de un objeto es un identificador único, tal como la dirección de almacenamiento, el ID del usuario o incluso un nombre.
2. Estado: el estado controla aspectos específicos del objeto. Por ejemplo, si queremos describir un ventilador, podemos tener los estados «encendido», «apagado» o «alta potencia». 
3. Comportamiento: se relaciona con los estados en cuanto que estos modifican el comportamiento del objeto. Sirve para describir lo que hacen los objetos referidos.

https://blog.hubspot.es/website/que-es-objeto-java

### this

This hace referencia al objeto actual de la clase, es decir, a una instancia concreta de la clase y nos sirve para usar los métodos y atributos de esa clase desde alguno de sus métodos, para llamar a otro de sus constructores o simplemente para pasarle el objeto completo a algún otro método u objeto.

https://programandoointentandolo.com/2018/10/this-y-super-java.html#:~:text=This%20en%20java,alg%C3%BAn%20otro%20m%C3%A9todo%20u%20objeto.

### Herencia

Una clase puede ser heredada, con lo que se crea una nueva clase hija que tendrá los métodos y atributos de la clase padre.

### Encapsulamiento

#### Public vs Private vs Protected

Aplicable a métodos y atributos

- Public: accesible desde fuera de la clase
- Private: solo accesible desde dentro de la propia clase
- Protected: solo accesible desde dentro de la clase y clases hija

### Clase abstracta

Una clase abstracta no se puede instanciar (crear un objeto). Nos sirve para definir una plantilla con atributos / métodos ya hechos y algunos por hacer (Ejemplo: Animal)

### Método abstracto

Un método abstracto debe ser implementado en la clase hija

### Interfaces

Es un contrato que define lo que la clase que lo implementa lo que tiene que implementar (métodos). Puede contener clases static con su implementación.

### Polimorfismo

https://ifgeekthen.nttdata.com/es/polimorfismo-en-java-programaci%C3%B3n-orientada-objetos

### Método estático

Un método que se puede llamar sin instanciar la clase, ejemplo: Math.pi()