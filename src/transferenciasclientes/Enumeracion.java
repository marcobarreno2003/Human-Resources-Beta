/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transferenciasclientes;

/**
 *
 * @author marco
 */
public class Enumeracion {

    int AgenciaN = 0;
    String usuario;
    String Contraseña;

//Programacion de herencia con parametros para la enumeracion
    public void Enumeracion(int AgenciaN) {
        
        this.AgenciaN = AgenciaN;

    }
//Programacion de herencia con parametros para el usuario

    public void usuario(String usuario) {
        
        this.usuario = usuario;
    }
//Programacion de herencia con parametros para la contraseña

    public void contraseña(String contraseña) {
        
        this.Contraseña = contraseña;
    }
//Programacion de herencia sin parametros que retorna enumeracion

    public int EnumeracionFinal() {
        
        return AgenciaN;
    }
//Programacion de herencia sin parametros que retorna usuario
    public String usuarioFinal() {
       
        return usuario;
    }
//Programacion de herencia sin parametros que retorna contraseña
    public String contraseñaFinal() {
        
        return Contraseña;    
    }
}
