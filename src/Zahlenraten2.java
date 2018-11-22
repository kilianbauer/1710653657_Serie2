import javax.swing.*;
import java.util.Random;

public class Zahlenraten2 {

    public static void main(String[]args){

        int min = 1;
        int max = 10;

        Random rnd = new Random();
        int zufallszahl = rnd.nextInt(max - min + 1) + min;

        if (zufallszahl %2==0 ){

            JOptionPane.showMessageDialog(null,"Zahl ist gerade");
        }

        else {

            JOptionPane.showMessageDialog(null,"Zahl ist ungerade");
        }

        for (int i=0;i<3; ++i){

            String eingabe = JOptionPane.showInputDialog("Ganzzahl zwischen 1 und 10 eingeben");

            int number;
            number = Integer.parseInt(eingabe);

            if (zufallszahl == number) {

                JOptionPane.showMessageDialog(null, "Sie haben die Zahl erraten!");
                break;
            } else {

                JOptionPane.showMessageDialog(null, "Falsch geraten ;)");
            }

            if (number - zufallszahl < 2) {

                JOptionPane.showMessageDialog(null, "Nah dran!");
            }
        }


    }
}
