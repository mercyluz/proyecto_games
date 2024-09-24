import java.util.Random;
import java.util.Scanner;
public class Ahorcado {
    
    public static void main(String[] args) {

        // Creamos array con lista de palabras
        String[] lista_palabras={"perro", "gato", "canario", "cobaya"};
        int long_array = lista_palabras.length;
        int intentosMaximos = 6;
        int countIntentos =0;
        Random random = new Random();
        int random_posicion = random.nextInt(long_array);

        String palabra_elegida = lista_palabras[random_posicion];
            Scanner scanner = new Scanner(System.in);
            System.out.println("dime una letra" );
            String letra = scanner.nextLine();

       for (int i= 0; i < palabra_elegida.length(); i++);
            if (letra = String palabra_elegida.chartAt(i)){

            }

}
