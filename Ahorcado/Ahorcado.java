import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ahorcado {
    
    public static void main(String[] args) {

        
        String[] lista_palabras={"perro", "gato", "canario", "cobaya"}; // Creamos array con lista de palabras.
        String palabra_elegida = "";    // Variable que guarda la palabra aleatoriamente elegida por el programa para se adivinada por el jugador.
        int random_posicion;    // Es la posición numérica de la lista de palabras que define a la palabra elegida.
        int intentosMaximos = 6;    // Variable que define el número de intentos máximos que tendrá el jugador para adivinar la palabra.
        int countIntentos = 0;  // Se inicia la variable que contabiliza el número de intentos utilizados por el jugador.
        ArrayList<Character> palabra_oculta = new ArrayList<Character>(); // Array donde se guardará la palabra oculta al jugador.

        // El programa selecciona una palabra de la lista al azar.
        // Esta palabra corresponde con una posición del array "lista_palabras"
        Random random = new Random();
        random_posicion = random.nextInt(lista_palabras.length);

        palabra_elegida = lista_palabras[random_posicion];

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("La palabra que estoy pensando tiene " + palabra_elegida.length() + " letras");
        
        for (int i = 0; i < palabra_elegida.length(); i++){
            palabra_oculta.add('_');
            System.out.print("__ ");
        }

        
        
        while (countIntentos < intentosMaximos) {

            System.out.println("\r\n");
            System.out.println("Dime una letra");
            String letra = scanner.nextLine();
            String letra_low = letra.toLowerCase();
            boolean letracorrecta = false;
            
            for (int i = 0; i < palabra_elegida.length(); i++){
                //para comparar string se utiliza equals
                if(letra_low.equals(Character.toString(palabra_elegida.charAt(i)))){
                
                    palabra_oculta.set(i,letra_low.charAt(0));
                    letracorrecta = true;
                }
                
            }
            if (!letracorrecta){
                countIntentos ++;
                System.out.println("Letra erronea. Te quedan "+ (intentosMaximos-countIntentos)+ " intentos");
            }
            System.out.println(palabra_oculta);
        }
        
        scanner.close();
            
        }
        
    }

