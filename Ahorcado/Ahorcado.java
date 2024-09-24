import java.util.Random;

public class Ahorcado {
    
    public static void main(String[] args) {

        // Creamos array con lista de palabras
        String[] lista_palabras={"perro", "gato", "canario", "cobaya"};
        int long_array = lista_palabras.length;

        Random random = new Random();
        int random_posicion = random.nextInt(long_array);

        String palabra_elegida = lista_palabras[random_posicion];

        System.out.println(palabra_elegida);
    }
}
