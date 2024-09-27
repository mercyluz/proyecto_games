# proyecto_games

# Instrucciones para compilar y ejecutar el programa desde la consola y/o Windows PowerShell:

1. Insertar la ruta del directorio en el que está contenido el archivo ".java" a ejecutar. Mediante las instrucciones "cd NombreDeDirectorio" y "cd.." Puede ir seleccionando la ruta deseada.

2. Compilar el archivo mediante la instrucción "javac NombreDelArchivo.java"

3. Ejecutar el archivo mediante la instrucción "java NombreDelArchivo.java"


# Juego del ahorcado

# Descripción
<li>El programa selecciona al azar una palabra dentro de un listado.</li>
<li>EL jugador tiene que adivina la palabra elegida (animal).</li>
<li>Se tiene 8 intentos para acertar.</li>
<li>Si aciertas va apareciendo la palabra elegida dentro del formato</li>
<li>Ejemplo:</li>
_ _ _ _ o _ 

Dime una letra:

<li>Mientras no aciertes se va dibujando un poco a poco un dibujo hasta llegar


<p align="center">
	  <img src="https://github.com/mercyluz/mercyluz/blob/imagen/ahorcados.png" />
</p>
    
Letra erronea. Te quedan 0 intentos.

<li>Si pierdes aparece la palabra elegida.</li>
<li> Termina el juego

## Algunos comandos utilizados para elegir la palabra aleatoria dentro de la lista

    Random random = new Random();
        random_posicion = random.nextInt(lista_palabras.length);

### Enlaces de interes

`<link>` : <(https://jmjinformatico.es/juego-del-ahorcado-en-java/#:~:text=En%20este%20art%C3%ADculo%20vamos%20a%20sumergirnos)><br>

`<link>` : <(https://github.com/nandirey/java-juego-ahorcado/blob/master/README.md)>

# Juego Adivina el número

# Descripción
<li>Ejecutar el archivo "Adivina_numero" desde la consola o el PowerShell de Windows (ver archivo Readme.md en el Directorio principal).</li>
<li>Al comenzar el juego aparece un mensaje donde se puede leer: Estoy pensando un número entre el 1 y el 100. Intenta adivinarlo!!
	<p align="center">
	  <img src="https://github.com/mercyluz/proyecto_games/blob/feature/Adivina_numero/Adivina_numero/img_Adivina_numero_001.png" />
	</p>
</li>
<li>El jugador debe introducir un número en el cuadro de texto y presionar el botón "ok" para continuar jugando.<br>
  Se han de tener en cuenta los siguientes puntos:<br>
	. Los números 1 y 100 están incluidos.<br>
	. Los números han de ser introducidos en cifra, y NO en texto.<br>
	. Si se introduce un número menor que el 1 o mayor que el 100, aparecerá un mensaje de error. Pulsando "ok", se puede continuar jugando.<br>
	. El programa sólo admite números enteros. En caso de introducir un número con decimales, se interrumpirá la ejecución del programa.<br>
</li>
<li>Tras la insercción de un número por parte del jugador, el programa mostrará un mensaje parar indicar si el número a adivinar, es mayor o menor que el introducido.
     Pulsando el botón "ok", el juego permite introducir un nuevo número al jugador.
  <p align="center">
	<img src="https://github.com/mercyluz/proyecto_games/blob/feature/Adivina_numero/Adivina_numero/img_Adivina_numero_002.png" />
	  <img src="https://github.com/mercyluz/proyecto_games/blob/feature/Adivina_numero/Adivina_numero/img_Adivina_numero_003.png" />
	</p>
</li>
<li> Una vez que el jugador adivina el número secreto, se muestra un mensaje de enhorabuena donde también se indican los intentos que han sido necesarios.
	<p align="center">
	  <img src="https://github.com/mercyluz/proyecto_games/blob/feature/Adivina_numero/Adivina_numero/img_Adivina_numero_004.png" />
	</p>
</li>
<li>Finalmente, se muestra un mensaje preguntando al jugador si desea reiniciar el juego.
     En caso de que se desee reiniciar el juego, se debe introducir el valor 1 en el cuadro de texto y pulsar el botón "ok".
     En caso de que se desee salir del juego, se puede pulsar el botón "ok" sin introducir ningún valor en el cuadro de texto.
	<p align="center">
	  <img src="https://github.com/mercyluz/proyecto_games/blob/feature/Adivina_numero/Adivina_numero/img_Adivina_numero_005.png" />
	</p>
</li>
<li>El juego se puede interrumpir en cualquier momento pulsando el botón "Cancel".</li>

