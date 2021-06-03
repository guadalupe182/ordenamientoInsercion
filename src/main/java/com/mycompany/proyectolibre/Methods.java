package com.mycompany.proyectolibre;

import javax.swing.JOptionPane;

/**
 * 31/mayo/21
 *
 * @author Guadalupe Adrian Rosas Hinojosa Version : 1.0.0
 */
public class Methods {

    int size = 2;
    byte position, position1 = 0;
    Model[] books = new Model[size];
    User[] users = new User[size];
    String nameBook;
    String publishingHouse;
    short codeBook;
    String userName;
    String userAdress;
    short userCode;

    /**
     * Capture method with memory control
     */
    public void dataCapture() {
        if (position < size) {
            nameBook = JOptionPane.showInputDialog("Enter book name");
            publishingHouse = JOptionPane.showInputDialog("Enter publisher name");
            books[position] = new Model(nameBook, publishingHouse, codeBook); //declaring array of objects
            JOptionPane.showMessageDialog(null, "Successful data capture");
            position++;
        } else {
            JOptionPane.showMessageDialog(null, "Insufficient memory");
        }
    }
    
    /**
     * metodo de captura de datos con control de memoria 
     */
    public void userRegister() {
        if (position1 < size) {
            userName = JOptionPane.showInputDialog("Enter user name");
            userAdress = JOptionPane.showInputDialog("Enter user adress");
            users[position1] = new User(userName, userAdress, userCode);
            position1++;
        } else {
            JOptionPane.showMessageDialog(null, "Insufficient memory");
        }
    }

    /**
     * Genera un numero aleatorio de 3 cifras comprendidas entre 999 y 100 
     * @return tipo de dato short 
     */
    public short generaCodigo() {
        //tipo dato/nombre de variable/funcion random/limiteSuperior/limiteInferior/+1/+limiteInferior
        short code = (short) ((short) (Math.random() * 999 - 100 + 1) + 100);
        return code;
    }// Fin del metodo que genera el codigo de seguridad

    
    /**
     * Ordenamiento por insercion: el numero menor del arreglo siempre sera enviado a la izquierda
     * usando el metodo compareto evalua el nombre del libro si hacen match entonces recorre el indice
     * haciendo un refresh de memoria.
     * @param array recibe un arreglo de tipo objeto 
     * @return arreglo de tipo objeto orneado en forma ascendente 
     */
    public Model[] sortingByInsertion(Model[] array) {
        Model aux;
        for (int i = 1; i < position; i++) {
            aux = array[i];
            // Using CompareTo
            for (int j = i - 1; j >= 0 && array[j].getNameBook().compareTo(aux.getNameBook()) > 0; j--) {
                array[j + 1] = array[j];
                array[j] = aux; //refresh
            }
        }
        return array;
    }

    
    /**
     * Imprime un listado general de los libros y los usuarios con codigo de 
     * libro y de usuario.
     */
    public void generalBookList() {
        Methods list = new Methods();
        list.sortingByInsertion(books);
        for (int i = 0; i < position; i++) {
            JOptionPane.showMessageDialog(null, "**** Developer Music ****\n"
                    + "The data are: "
                    + "\n Book name: " + books[i].getNameBook()
                    + "\n Code Book: " + books[i].getCodeBook()
                    + "\n Publisher's name: " + books[i].getPublishingHouse()
                    + "\n user name: " + users[i].getUserName()
                    + "\n user adress: " + users[i].getUserAdress()
                    + "\n user adress: " + users[i].getUserCode()
            );
        }
    }

}
