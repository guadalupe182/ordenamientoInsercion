/*
   ****Library System*****
 */
package com.mycompany.proyectolibre;

/**
 * 31/mayo/21
 *
 * @author Guadalupe Adrian Rosas Hinojosa Version : 1.0.0
 */
public class Model {

    Methods method = new Methods();

    private String nameBook;
    private String publishingHouse;
    private short codeBook;

    public Model(String nameBook, String publishingHouse, short codeBook) {
        this.nameBook = nameBook;
        this.publishingHouse = publishingHouse;
        this.codeBook = method.generaCodigo();
    }

    public Methods getMethod() {
        return method;
    }

    public void setMethod(Methods me) {
        this.method = method;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public short getCodeBook() {
        return codeBook;
    }

    public void setCodeBook(short codeBook) {
        this.codeBook = codeBook;
    }

}
