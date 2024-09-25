import java.util.Random;
import java.util.Scanner;
<<<<<<< HEAD

=======
>>>>>>> 910d0d6b8bd58cb412e0e9a53a01eacc6498787f
public class Ahorcado {
    
    public static void main(String[] args) {

        
        String[] lista_palabras={"perro", "gato", "canario", "cobaya"}; // Creamos array con lista de palabras.
        String palabra_elegida = "";    // Variable que guarda la palabra aleatoriamente elegida por el programa para se adivinada por el jugador.
        int random_posicion;    // Es la posición numérica de la lista de palabras que define a la palabra elegida.
        int intentosMaximos = 6;    // Variable que define el número de intentos máximos que tendrá el jugador para adivinar la palabra.
        int countIntentos = 0;  // Se inicia la variable que contabiliza el número de intentos utilizados por el jugador.
        

        // El programa selecciona una palabra de la lista al azar.
        // Esta palabra corresponde con una posición del array "lista_palabras"
        Random random = new Random();
        random_posicion = random.nextInt(lista_palabras.length);

        palabra_elegida = lista_palabras[random_posicion];

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Dime una letra");
        String letra = scanner.nextLine();


        // letra = Character.toString();
        // char letra = Character.toLowerCase(scanner.next().carAt(0));

        for (int i = 0; i < palabra_elegida.length(); i++){

            if(letra == Character.toString(palabra_elegida.charAt(i))){

            }
        }
            

        
        scanner.close();
    }
}
