import javax.swing.*;
import java.util.Random;

public class Zahlenraten {

    public static void main(String[]args){

        int min = 1;
        int max = 10;

        /*Lösen Sie die Fehler indem Sie den Cursor in das rot unterstrichene Wort setzen, Alt+Enter
          drücken und dieKlasse durch einenKlick auf java.util.Random importieren.*/

        /*Generierung einer Zufallszahl die zwischen min und max liegt*/

        Random rnd = new Random();
        int zufallszahl = rnd.nextInt(max - min + 1) + min;

        // Prüfen ob die Variable zufallszahl eine gerade Zahl beinhaltet mit Ausgabe falls ja

        if (zufallszahl %2==0 ){

            JOptionPane.showMessageDialog(null,"Zahl ist gerade");
        }

        //Ausgabe für ungerade Zahlen

        else {

            JOptionPane.showMessageDialog(null,"Zahl ist ungerade");
        }
    }
}
