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

        int ganzzahl = Integer.parseInt(JOptionPane.showInputDialog("Ganzzahl zwischen 1 und 10 eingeben"));

        /*Versuch, Zufallszahl und Ganzzahl auf Übereinstimmung zu Prüfen.
          Geht nicht, da das eine ein String ist und das andere int.
          Ergänzen des Codes um fehlende Operationen*/

        if (zufallszahl == ganzzahl){

            JOptionPane.showMessageDialog(null,"Sie haben die Zahl erraten!");
        }
        else {

            JOptionPane.showMessageDialog(null,"Falsch geraten ;)");
        }

        // Ausgabe falls Ganzzahl (Eingabe) nahe an der Zufallszahl liegt
        if (ganzzahl-zufallszahl <2 ){

            JOptionPane.showMessageDialog(null,"Nah dran!");
        }
    }
}
