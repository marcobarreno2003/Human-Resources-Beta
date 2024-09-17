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
public class Prestamos {
//encapsulamiento
    public int monto;
    public int No_de_Pagos;
    int pagoPorMes;

    public int getmonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public int getNo_de_Pagos() {
        return No_de_Pagos;
    }

    public void setNo_de_Pagos(int No_de_pagos) {
        this.No_de_Pagos = No_de_pagos;
    }

    public Prestamos(int No_de_pagos, int monto) {

        this.No_de_Pagos = No_de_pagos;
        this.monto = monto;
    }

    public int pagoPorMes() {

        pagoPorMes= monto/No_de_Pagos;
        return pagoPorMes;
    }
}