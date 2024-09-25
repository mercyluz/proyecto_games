
# Procedimiento de juego del ahorcado

<li>El programa selecciona al azar una palabra dentro de un listado.</li>

<li>EL jugador tiene que adivina la palabra elegida (animal).</li>
<li>Se tiene 8 intentos para acertar.</li>
<li>Si aciertas va apareciendo la palabra elegida dentro del formato</li>
_ _ _ _ o _ 

Dime una letra:
3.- Mientras no aciertes se va dibujando un poco a poco un dibujo hasta llegar
Letra erronea. Te quedan 0 intentos.

4.- Si pierdes aparece la palabra elegida.
5.- Termina el juego

## algunos comandos utilizados para elegir la palabra aleatoria dentro de la lista

    Random random = new Random();
        random_posicion = random.nextInt(lista_palabras.length);



