import java.util.Random;

import javax.swing.JOptionPane;

public class Adivina_numero {
    public static void main(String[] args) {

        String opcion_jugar = "1";
        // mientras que la variable jugar es 1 se ejecutar el programa
        while (opcion_jugar.equals("1")) {
           // el programa calcula el numero secreto
            Random random = new Random();
            int random_number = random.nextInt(100)+1;

            int counter = 0;    // inicializando el contador de intentos
            
            // envio de mensaje 
            String num = JOptionPane.showInputDialog("Estoy pensando un número entre el 1 y el 100. \r\n" + "Intenta adivinarlo!!");
            int user_number = Integer.parseInt(num); // el string del mensaje se convierte en int para poder compararlo
            
            if (user_number >100 || user_number < 1){   //ponemos la condicion de validar numeros entre 0 y 100
                JOptionPane.showMessageDialog(null,"El numero que has introducido esta fuera del rango de 1 y 100. \r\n" + "Intente denuevo");
            }
            else {
                while (random_number != user_number) {  //mientras que el número introducido sea diferente a la condición se ejecuta el código siguiente
                    counter = counter+1;    //El contador aumenta en una unidad

                    if(user_number < random_number){    //Si el número introducido es menor que el valor aleatorio generado, se muestra mensaje
                        String num01 = JOptionPane.showInputDialog("El número que estoy pensando es mayor.");
                        user_number = Integer.parseInt(num01);
                    }

                    else {    //Si el número introducido es mayor que el valor aleatorio generado, se muestra mensaje
                        String num02 = JOptionPane.showInputDialog("El número que estoy pensando es menor.");
                        user_number = Integer.parseInt(num02);
                    }
                }

                JOptionPane.showMessageDialog(null, random_number + " -- Enhorabuena!! Lo has adivinado en " + counter + " intentos."); //Cuando se acierta el número, se muestra un mensaje de enhorabuena con el número de intentos empleados.
                
                // Se da la opción de jugar de nuevo.
                opcion_jugar = JOptionPane.showInputDialog("Quieres jugar de nuevo? \r\n" + "Sí -- Escribe: 1\r\n" + "No -- Pulsa OK\r\n" );
                    
            }
        }
    }
}