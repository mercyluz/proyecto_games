import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ahorcado {
    
    public static void main(String[] args) {
        
        
        String[] lista_palabras={"perro", "gato", "canario", "cobaya", "conejo", "tigre", "serpiente"}; // Creamos array con lista de palabras.
        String palabra_elegida = "";    // Variable que guarda la palabra aleatoriamente elegida por el programa para se adivinada por el jugador.
        int random_posicion;    // Es la posición numérica de la lista de palabras que define a la palabra elegida.
        int intentosMaximos = 8;    // Variable que define el número de intentos máximos que tendrá el jugador para adivinar la palabra.
        int countIntentos = 0;  // Se inicia la variable que contabiliza el número de intentos utilizados por el jugador.
        ArrayList<Character> palabra_oculta = new ArrayList<Character>(); // Array donde se guardará la palabra oculta al jugador.
        boolean salir = false;
        // El programa selecciona una palabra de la lista al azar.
        // Esta palabra corresponde con una posición del array "lista_palabras"
        Random random = new Random();
        random_posicion = random.nextInt(lista_palabras.length);

        palabra_elegida = lista_palabras[random_posicion];
        
        
        ArrayList<Character> palabra_elegida_array = new ArrayList<Character>();
        for(int i=0; i<palabra_elegida.length(); i++){
            palabra_elegida_array.add(palabra_elegida.charAt(i));
        }

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("");
        System.out.println("La palabra que estoy pensando es un animal y tiene " + palabra_elegida.length() + " letras");
        
        for (int i = 0; i < palabra_elegida.length(); i++){
            palabra_oculta.add('_');
            System.out.print("_ ");
        }

        
        while (countIntentos < intentosMaximos && salir == false) {

            System.out.println("\r\n");
            System.out.println("Dime una letra:");
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
                countIntentos = countIntentos +1;
                System.out.println("Letra erronea. Te quedan "+ (intentosMaximos-countIntentos)+ " intentos.");
            }

            System.out.println();

            if ( palabra_oculta.equals(palabra_elegida_array)){
                salir= true;
                System.out.println(palabra_oculta);
                System.out.println("");
                System.out.println(palabra_elegida);
                System.out.println("ENHORABUENA; HAS ADIVINADO LA PALABRA!");
            }
            
            else {
                
                System.out.println(palabra_oculta);
                switch(Integer. toString(countIntentos)) {
                    case "1": System.out.println("Poste");
                    break;
                    case "2": System.out.println("Cuerda");
                    break;
                    case "3": System.out.println("Cabeza");
                    break;
                    case "4": System.out.println("Tronco");
                    break;
                    case "5": System.out.println("Brazo derecho");
                    break;
                    case "6": System.out.println("Brazo izquierdo");
                    break;
                    case "7": System.out.println("Pierna izquierda");
                    break;
                    case "8": System.out.println("Pierna derecha" + "\r\nAhorcado!");
                    break;
                }
            }

        }

        if (countIntentos == intentosMaximos){
            System.out.println("\r\n-- GAME OVER --");

        }

        scanner.close();
            
        }
        
    }


