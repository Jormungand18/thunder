/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author FREDY
 */
public class Administrador {
    private String login;
    private String password;

    

    

    @Override
    public String toString() {
        return "Administrador{" + "login=" + login + ", password=" + password + '}';
    }

    
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
    
}
