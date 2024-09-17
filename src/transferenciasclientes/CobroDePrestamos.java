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
public class CobroDePrestamos {
    int monto;
    int abono;
    int resta;
    public void cobro (int monto, int abono){
        this.monto = monto;
        this.abono= abono;
    }
    public int resta (){
        resta = monto-abono;
        return resta;
    }
}
