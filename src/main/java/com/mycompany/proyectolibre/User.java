package com.mycompany.proyectolibre;

/**
 *
 * @author adrian
 */
public class User {

    Methods method = new Methods();

    //User Data
    private String userName;
    private String userAdress;
    private short userCode;

    public User(String userName, String userAdress, short userCode) {
        this.userName = userName;
        this.userAdress = userAdress;
        this.userCode = method.generaCodigo();
    }

    public Methods getMethod() {
        return method;
    }

    public void setMethod(Methods method) {
        this.method = method;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAdress() {
        return userAdress;
    }

    public void setUserAdress(String userAdress) {
        this.userAdress = userAdress;
    }

    public short getUserCode() {
        return userCode;
    }

    public void setUserCode(short userCode) {
        this.userCode = userCode;
    }

}
