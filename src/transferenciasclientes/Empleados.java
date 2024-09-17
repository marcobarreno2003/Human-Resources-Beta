/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transferenciasclientes;

import java.sql.Date;

/**
 *
 * @author marco
 */
public class Empleados {

    String descripcion;
    String Cuenta;
    String Departamento;
    int periodo;
    String FechadeRegistro;
    double Transaccion = 0.00;
    int id;
    int sueldobase = 15;
    int periodo1;

    public Empleados(int id, String Departamento, String descripcion) {//
        this.Departamento = Departamento;
        this.descripcion = descripcion;
        this.id = id;
    }
//polimorfismo
    public double sueldo() {
        return 15.00;
    }

    public double sueldo(int periodo) {
        this.periodo = periodo;
        return periodo;

    }

    public double sueldo(int horas, String departamento, int periodo1) {

        periodo = horas;

        periodo1 = sueldobase * periodo;
        this.periodo1 = periodo1;
        switch (departamento) {
            case "Administrativo":
                Transaccion = 800.00;
                break;
            case "Ventas":
                Transaccion = 600.00;
                break;
            case "Tecnico":
                Transaccion = 800.00;
                break;
            default:
                Transaccion = 600.00;
                break;
        }

        return Transaccion + periodo1;
    }
}
