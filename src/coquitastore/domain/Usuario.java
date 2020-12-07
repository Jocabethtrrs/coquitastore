/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coquitastore.domain;

/**
 *
 * @author Toshiba
 */
public class Usuario {

    private String idUsuario;
    private String password;
    private String tipoUsuario;

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public Usuario (String idUsuario, String password, String tipoUsuario){
        this.idUsuario=idUsuario; 
        this.password=password;
        this.tipoUsuario=tipoUsuario; 
    }
    
        public Usuario (String idUsuario){
        this.idUsuario=idUsuario; 
    }
    
    
    @Override
    public String toString() {
        return "Usuario{" + "idUsuario=" + idUsuario + ", password=" + password + ", tipoUsuario=" + tipoUsuario + '}';
    }
}
