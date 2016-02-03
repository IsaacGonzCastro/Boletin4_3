
package boletin4_3;

import javax.swing.JOptionPane;

/**
 *
 * @author Isaac
 */
public class Boletin4_3 {

    public static void main(String[] args) {
    int mes = Integer.parseInt(JOptionPane.showInputDialog("introduce o mes : "));

        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                JOptionPane.showMessageDialog(null, "tiene 31 días");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "tiene 28 días");
                break;
            default:
                JOptionPane.showMessageDialog(null, "tiene 30 días");

        }
    }
    
}
