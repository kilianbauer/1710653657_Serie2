import javax.swing.*;

public class Aufgabe1 {

    public static void main (String[]args){

        // LesenSie eine Variable mitder Bezeichnung name vom Typ String ein

        String name = JOptionPane.showInputDialog("Name eingeben");

        /*Lesen Sie eine Variable mit der Bezeichnung alter vom Typ Integer ein. Nutzen Sie hierfür
          ebenfalls die Komponente JOptionPane.showInputDialog().
          Hinweis: showInputDialog()lieferteinenStringalsreturnWert.Integer.parseInt(STRING)
          konvertiert einenString in einen Integer Wert.*/

        int alter = Integer.parseInt(JOptionPane.showInputDialog("Alter eingeben"));

        // Altersprüfung mit IF-Bedingung

        if (alter > 18){

            // Bei JOptionPane.showMessageDialog als erstes immer null eingeben
            JOptionPane.showMessageDialog(null,"Sie sind Volljährig");
        }
        else{

            JOptionPane.showMessageDialog(null,"Sie sind nicht Volljährig");
        }


    }
}
