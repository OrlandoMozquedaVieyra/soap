package com.mycompany.servicio;

public class Usuario {
    private String nombre,usuario,pass,email;
    
    public Usuario(){
    
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getPass() {
        return pass;
    }

    public String getEmail() {
        return email;
    }
    
    public String getRespuesta(){
        String respuesta = "NOMBRE:"+nombre;
        respuesta += ", Usuario:"+usuario;
        respuesta += ", Password:"+pass;
        respuesta += ", Correo:"+email;
        
        return respuesta;
    }
    
}
