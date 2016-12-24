package beans;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author USUARIO
 */
@ManagedBean(name = "usuario")
@RequestScoped
public class UsuarioBean {

    private String nombre;

    private String password;

    /**
     * Get the value of password
     *
     * @return the value of password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Set the value of password
     *
     * @param password new value of password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Get the value of nombre
     *
     * @return the value of nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Set the value of nombre
     *
     * @param nombre new value of nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

  
    public UsuarioBean() {
        
    }
    
    public String conocerUsuario(){
        if (nombre.equals("Mireia")){
            return "uno";
        } return "dos";
    }
    
    public String cambiarPassword(){
        this.password= password;
        return "tres";
    }
}
