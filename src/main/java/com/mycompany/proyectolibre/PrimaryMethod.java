package com.mycompany.proyectolibre;

import javax.swing.JOptionPane;

/**
 * 31/mayo/21
 *
 * @author Guadalupe Adrian Rosas Hinojosa Version : 1.0.0
 */
public class PrimaryMethod {

    public static void main(String[] args) {
        Methods book = new Methods();
        byte menu;

        do {
            menu = Byte.parseByte(JOptionPane.showInputDialog("Select an option : \n "
                    + "1) Data Capture\n"
                    + "2) General list of books \n"
                    + "3) User Register \n"
                    + "4) System output"));
            A:
            switch (menu) {
                case 1:
                    //Data Capture
                    book.dataCapture();
                    break;
                case 2:
                    //General List of books
                    book.generalBookList();
                    break;
                case 3:
                    //User Register
                    book.userRegister();
                    break;
                case 4:
                    //System output
                    JOptionPane.showMessageDialog(null, "Successful exit");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Option not found");
            }
        } while (menu != 4);
    }
    
     


}
