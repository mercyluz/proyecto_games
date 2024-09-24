import java.util.Random;

import javax.swing.JOptionPane;

public class Adivina_numero {
    public static void main(String[] args) {

        String opcion_jugar = "1";

        while (opcion_jugar.equals("1")) {
            Random random = new Random();
            int random_number = random.nextInt(100)+1;

            int counter = 0;

            String num = JOptionPane.showInputDialog("Estoy pensando un número entre el 1 y el 100. \r\n" + "Intenta adivinarlo!!");
            int user_number = Integer.parseInt(num);
            if (user_number >100 || user_number < 1){
                JOptionPane.showMessageDialog(null,"El numero que has introducido esta fuera del rango de 1 y 100. \r\n" + "Intente denuevo");
            }
            else {
            while (random_number != user_number) {
                counter = counter+1;

                if(user_number < random_number){
                    String num01 = JOptionPane.showInputDialog("El número que estoy pensando es mayor.");
                    user_number = Integer.parseInt(num01);
                }

                else {
                    String num02 = JOptionPane.showInputDialog("El número que estoy pensando es menor.");
                    user_number = Integer.parseInt(num02);
                }
            }

            JOptionPane.showMessageDialog(null, random_number + " -- Enhorabuena!! Lo has adivinado en " + counter + " intentos.");

            opcion_jugar = JOptionPane.showInputDialog("Quieres jugar de nuevo? \r\n" + "Sí -- Escribe: 1\r\n" + "No -- Pulsa OK\r\n" );
                
        }
    }
    }
}