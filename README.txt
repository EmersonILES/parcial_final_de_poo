
Aquí tienes la explicación del código incluyendo cómo se utiliza la herencia y el polimorfismo:

Explicación del Código
Este programa en Java está diseñado para cargar datos de aeropuertos y vuelos, y luego mostrar la lista de vuelos de salida y llegada para cada aeropuerto. El programa utiliza conceptos básicos de programación orientada a objetos, operaciones sencillas como bucles for y condicionales if, así como herencia y polimorfismo.

Estructura del Programa
Clase Aeropuerto:

Atributos:
codigo: Código único del aeropuerto.
nombre: Nombre del aeropuerto.
poblacion: Ciudad donde se ubica el aeropuerto.
pais: País donde se ubica el aeropuerto.
gmt: Desfase horario en relación a UTC.
Métodos:
getCodigo(): Devuelve el código del aeropuerto.
getNombre(): Devuelve el nombre del aeropuerto.
Clase Vuelo:

Atributos:
origen: Aeropuerto de origen.
destino: Aeropuerto de destino.
duracion: Duración del vuelo.
aerolinea: Nombre de la aerolínea.
avion: Modelo del avión.
plazas: Número de plazas en el vuelo.
horario: Horario del vuelo.
Métodos:
getOrigen(): Devuelve el aeropuerto de origen.
getDestino(): Devuelve el aeropuerto de destino.
toString(): Devuelve una representación en cadena del vuelo.
Clase Compania:

Atributos:
nombre: Nombre de la compañía.
Métodos:
getNombre(): Devuelve el nombre de la compañía.
Clase Principal (Main):

Métodos:
main(): Método principal que ejecuta el programa.
cargarAeropuertos(): Carga una lista de aeropuertos.
cargarVuelos(): Carga una lista de vuelos.
mostrarVuelosSalida(): Muestra los vuelos de salida desde cada aeropuerto.
mostrarVuelosLlegada(): Muestra los vuelos de llegada a cada aeropuerto.
Uso de Herencia y Polimorfismo
Herencia:

Aunque el ejemplo actual no muestra una relación de herencia explícita entre clases, se puede extender fácilmente añadiendo subclases de Vuelo para diferentes tipos de vuelos, como VueloRegular y VueloCharter, lo que permite reutilizar código común y añadir comportamientos específicos.
Polimorfismo:

Se utiliza polimorfismo en el método toString() de la clase Vuelo para mostrar información detallada del vuelo. Al sobrescribir toString(), cualquier subclase de Vuelo puede proporcionar su propia implementación de cómo se debe mostrar la información del vuelo.
Detalle del Proceso
Carga de Datos:

Se crean listas de objetos Aeropuerto y Vuelo.
Los aeropuertos y vuelos se añaden a estas listas utilizando los métodos cargarAeropuertos() y cargarVuelos().
Mostrar Vuelos de Salida:

El método mostrarVuelosSalida() recorre la lista de aeropuertos.
Para cada aeropuerto, se recorre la lista de vuelos.
Si el código del aeropuerto de origen del vuelo coincide con el código del aeropuerto actual, se imprime el vuelo.
Mostrar Vuelos de Llegada:

El método mostrarVuelosLlegada() recorre la lista de aeropuertos.
Para cada aeropuerto, se recorre la lista de vuelos.
Si el código del aeropuerto de destino del vuelo coincide con el código del aeropuerto actual, se imprime el vuelo. en