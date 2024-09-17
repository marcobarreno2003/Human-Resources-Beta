/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transferenciasclientes;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author marco
 */
public class RolDePagos extends javax.swing.JFrame {

    /**
     * Creates new form RolDePagos
     */
    public RolDePagos() {
        initComponents();
    }

    Connection connection;
    PreparedStatement preparedStatement;
    ResultSet resultSet;
    public String Departamento;
    public String tipoDeCedula;
    public String DepartamentoExtra;
    public static String NombreEmpleado;
    public static String ApellidosEmpleado;
    public static String MesEmpleado;
    public static String DepartamentoRol;
    public static String PrestamosRol;
    public static int Sueldo;
    public static String Prestamos;
    public static int HorasExtras;
    public static int SueldoFinal;
    public static int Egresos;
    public static int EgresosFinal;
    public static int IngresosFinal;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        label1 = new java.awt.Label();
        jInternalFrameEmplados = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jTxtCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTxtApellidos = new javax.swing.JTextField();
        jComboBoxDepartamento = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jTxtNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTxtDireccion = new javax.swing.JTextField();
        jTxtFechaNacimiento = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jComboboxIdentificacion = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jTxtNidentificacion = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jtxtTelefono = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jtxtEstadoCivil = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jtxtCargo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jInternalFrameHorasExtras = new javax.swing.JInternalFrame();
        jLabel12 = new javax.swing.JLabel();
        jtxtCodigoHorasExtras = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTxtDescripcionHorasExtras = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jtxtTransaccion = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jComboBoxDepartamentoHorasExtras = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jtxtPerido = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jInternalFrameIngresoDePrestamos = new javax.swing.JInternalFrame();
        jLabel26 = new javax.swing.JLabel();
        jTxtNumeroPrestamos = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jtxtFechaPrestamos = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jTxtCodigoPrestamo = new javax.swing.JTextField();
        jTxtNombrePrestamo = new javax.swing.JTextField();
        jTxtApellidoPrestamo = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jTxtMonto = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jTxtNumeroDePagos = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jTxtPlazo = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jTxtObservaciones = new javax.swing.JTextField();
        jBtnGuardarPrestamos = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        jtxtPagoPorMesPrestamo = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jInternalFrameHorasExtras1 = new javax.swing.JInternalFrame();
        jLabel19 = new javax.swing.JLabel();
        jtxtCodigoHorasExtras1 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTxtDescripcionHorasExtras1 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jtxtTransaccion1 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        jComboBoxDepartamentoHorasExtras1 = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        jtxtPerido1 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jInternalFrameCobroP = new javax.swing.JInternalFrame();
        jLabel35 = new javax.swing.JLabel();
        jTxtNumeroCobroP = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jTxtFechaCobroP = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jComboBoxDepartamentoCobroP = new javax.swing.JComboBox<>();
        jLabel38 = new javax.swing.JLabel();
        jtxtCodigoCobroP = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jTxtNombreCobroPrestamos = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jtxtConceptoCobroP = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jTxtValorCobro = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jLabel43 = new javax.swing.JLabel();
        jTxtMontoCobroP = new javax.swing.JTextField();
        jBtnGuardarCobroP = new javax.swing.JButton();
        jtxtApellidoCobroP = new javax.swing.JTextField();
        jbtnActualizarCobroP = new javax.swing.JButton();
        jLabelIcono = new javax.swing.JLabel();
        jInternalFrameRolDePagos = new javax.swing.JInternalFrame();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jTxtMesDelRol = new javax.swing.JTextField();
        jTxtNumeroDeEmpleadoRol = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jTxtNumeroPrestamoRol = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenu2.setText("File");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar1.add(jMenu3);

        jMenuItem5.setText("jMenuItem5");

        label1.setText("label1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 0, 0));
        setResizable(false);

        jInternalFrameEmplados.setClosable(true);
        jInternalFrameEmplados.setMaximizable(true);
        try {
            jInternalFrameEmplados.setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        jInternalFrameEmplados.setVisible(false);
        jInternalFrameEmplados.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Codigo");
        jInternalFrameEmplados.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 18, 57, 24));
        jInternalFrameEmplados.getContentPane().add(jTxtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 18, 316, -1));

        jLabel2.setText("Departamento");
        jInternalFrameEmplados.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 65, -1, -1));

        jLabel3.setText("Apellidos");
        jInternalFrameEmplados.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 116, -1, -1));
        jInternalFrameEmplados.getContentPane().add(jTxtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 112, 316, -1));

        jComboBoxDepartamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrativo", "Ventas", "Tecnico", " " }));
        jComboBoxDepartamento.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jComboBoxDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDepartamentoActionPerformed(evt);
            }
        });
        jInternalFrameEmplados.getContentPane().add(jComboBoxDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 60, 316, -1));

        jLabel4.setText("Nombres");
        jInternalFrameEmplados.getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 158, -1, -1));
        jInternalFrameEmplados.getContentPane().add(jTxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 154, 316, -1));

        jLabel5.setText("Direccion");
        jInternalFrameEmplados.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 204, -1, -1));

        jLabel6.setText("Fecha de nacimiento");
        jInternalFrameEmplados.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 246, -1, -1));
        jInternalFrameEmplados.getContentPane().add(jTxtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 200, 316, -1));
        jInternalFrameEmplados.getContentPane().add(jTxtFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 242, 318, -1));

        jLabel7.setText("Tipo de identificacion");
        jInternalFrameEmplados.getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 283, -1, -1));

        jComboboxIdentificacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CEDULA", "IDENTIFICACION TRIBUTARIA", "PASAPORTE" }));
        jInternalFrameEmplados.getContentPane().add(jComboboxIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 278, 315, -1));

        jLabel8.setText("N de identificacion");
        jInternalFrameEmplados.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 320, -1, -1));
        jInternalFrameEmplados.getContentPane().add(jTxtNidentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 316, 319, -1));

        jLabel9.setText("Telefono");
        jInternalFrameEmplados.getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 356, -1, -1));
        jInternalFrameEmplados.getContentPane().add(jtxtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 352, 319, -1));

        jLabel10.setText("Estado civil");
        jInternalFrameEmplados.getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 392, -1, -1));
        jInternalFrameEmplados.getContentPane().add(jtxtEstadoCivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 388, 319, -1));

        jLabel11.setText("Cargo");
        jInternalFrameEmplados.getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 428, -1, -1));
        jInternalFrameEmplados.getContentPane().add(jtxtCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 424, 319, -1));

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jInternalFrameEmplados.getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, 100, 70));

        jButton3.setText("Buscar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jInternalFrameEmplados.getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, -1, 60));

        jInternalFrameHorasExtras.setClosable(true);
        jInternalFrameHorasExtras.setMaximizable(true);
        try {
            jInternalFrameHorasExtras.setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        jInternalFrameHorasExtras.setVisible(false);
        jInternalFrameHorasExtras.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setText("Codigo");
        jInternalFrameHorasExtras.getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));
        jInternalFrameHorasExtras.getContentPane().add(jtxtCodigoHorasExtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 350, -1));

        jLabel13.setText("Descripcion");
        jInternalFrameHorasExtras.getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));
        jInternalFrameHorasExtras.getContentPane().add(jTxtDescripcionHorasExtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 350, -1));

        jLabel14.setText("Transaccion");
        jInternalFrameHorasExtras.getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));
        jInternalFrameHorasExtras.getContentPane().add(jtxtTransaccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 110, -1));

        jLabel15.setText("Cuenta");
        jInternalFrameHorasExtras.getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 146, -1, 20));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Corriente", "Ahorros" }));
        jInternalFrameHorasExtras.getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 130, -1));

        jLabel16.setText("Departamento");
        jInternalFrameHorasExtras.getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        jComboBoxDepartamentoHorasExtras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrativo", "Ventas", "Tecnico" }));
        jInternalFrameHorasExtras.getContentPane().add(jComboBoxDepartamentoHorasExtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 340, -1));

        jLabel17.setText("Periodo");
        jInternalFrameHorasExtras.getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));
        jInternalFrameHorasExtras.getContentPane().add(jtxtPerido, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 80, -1));

        jLabel18.setText("Fecha de registro");
        jInternalFrameHorasExtras.getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, -1, -1));
        jInternalFrameHorasExtras.getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 90, -1));

        jButton2.setText("Guardar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jInternalFrameHorasExtras.getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 350, 90, 40));

        jInternalFrameIngresoDePrestamos.setClosable(true);
        jInternalFrameIngresoDePrestamos.setMaximizable(true);
        jInternalFrameIngresoDePrestamos.setVisible(false);
        jInternalFrameIngresoDePrestamos.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setText("Numero");
        jInternalFrameIngresoDePrestamos.getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jTxtNumeroPrestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtNumeroPrestamosActionPerformed(evt);
            }
        });
        jInternalFrameIngresoDePrestamos.getContentPane().add(jTxtNumeroPrestamos, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 127, -1));

        jLabel27.setText("Tipo");
        jInternalFrameIngresoDePrestamos.getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 31, -1, -1));

        jTextField4.setEditable(false);
        jTextField4.setText("Cuentas por Cobrar Empleado");
        jInternalFrameIngresoDePrestamos.getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 27, 187, -1));

        jLabel28.setText("Fecha");
        jInternalFrameIngresoDePrestamos.getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 67, 63, -1));

        jtxtFechaPrestamos.setText("aaaa-mm-dd");
        jInternalFrameIngresoDePrestamos.getContentPane().add(jtxtFechaPrestamos, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 63, 127, -1));

        jLabel29.setText("Codigo");
        jInternalFrameIngresoDePrestamos.getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 111, -1, -1));
        jInternalFrameIngresoDePrestamos.getContentPane().add(jTxtCodigoPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 111, 31, -1));
        jInternalFrameIngresoDePrestamos.getContentPane().add(jTxtNombrePrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 111, 120, -1));
        jInternalFrameIngresoDePrestamos.getContentPane().add(jTxtApellidoPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 111, 149, -1));

        jLabel30.setText("Monto");
        jInternalFrameIngresoDePrestamos.getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 163, -1, -1));
        jInternalFrameIngresoDePrestamos.getContentPane().add(jTxtMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 159, 70, -1));

        jLabel31.setText("No de Pagos");
        jInternalFrameIngresoDePrestamos.getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 163, -1, -1));
        jInternalFrameIngresoDePrestamos.getContentPane().add(jTxtNumeroDePagos, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 159, 36, -1));

        jLabel32.setText("Plazo");
        jInternalFrameIngresoDePrestamos.getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 163, -1, -1));
        jInternalFrameIngresoDePrestamos.getContentPane().add(jTxtPlazo, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 159, 38, -1));

        jLabel33.setText("Observacion");
        jInternalFrameIngresoDePrestamos.getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 212, -1, -1));
        jInternalFrameIngresoDePrestamos.getContentPane().add(jTxtObservaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 208, 253, -1));

        jBtnGuardarPrestamos.setText("Guardar");
        jBtnGuardarPrestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnGuardarPrestamosActionPerformed(evt);
            }
        });
        jInternalFrameIngresoDePrestamos.getContentPane().add(jBtnGuardarPrestamos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 108, 51));

        jLabel34.setText("Pago por mes");
        jInternalFrameIngresoDePrestamos.getContentPane().add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 264, -1, -1));
        jInternalFrameIngresoDePrestamos.getContentPane().add(jtxtPagoPorMesPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 260, 252, -1));

        jButton5.setText("Guardar SQL");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jInternalFrameIngresoDePrestamos.getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, 130, 60));

        jInternalFrameHorasExtras1.setClosable(true);
        jInternalFrameHorasExtras1.setMaximizable(true);
        try {
            jInternalFrameHorasExtras1.setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        jInternalFrameHorasExtras1.setVisible(false);
        jInternalFrameHorasExtras1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setText("Codigo");
        jInternalFrameHorasExtras1.getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));
        jInternalFrameHorasExtras1.getContentPane().add(jtxtCodigoHorasExtras1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 350, -1));

        jLabel20.setText("Descripcion");
        jInternalFrameHorasExtras1.getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));
        jInternalFrameHorasExtras1.getContentPane().add(jTxtDescripcionHorasExtras1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 350, -1));

        jLabel21.setText("Transaccion");
        jInternalFrameHorasExtras1.getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));
        jInternalFrameHorasExtras1.getContentPane().add(jtxtTransaccion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 110, -1));

        jLabel22.setText("Cuenta");
        jInternalFrameHorasExtras1.getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 146, -1, 20));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Corriente", "Ahorros" }));
        jInternalFrameHorasExtras1.getContentPane().add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 130, -1));

        jLabel23.setText("Departamento");
        jInternalFrameHorasExtras1.getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        jComboBoxDepartamentoHorasExtras1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrativo", "Ventas", "Tecnico" }));
        jInternalFrameHorasExtras1.getContentPane().add(jComboBoxDepartamentoHorasExtras1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 340, -1));

        jLabel24.setText("Periodo");
        jInternalFrameHorasExtras1.getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));
        jInternalFrameHorasExtras1.getContentPane().add(jtxtPerido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 80, -1));

        jLabel25.setText("Fecha de registro");
        jInternalFrameHorasExtras1.getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, -1, -1));
        jInternalFrameHorasExtras1.getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 90, -1));

        jButton4.setText("Guardar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jInternalFrameHorasExtras1.getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 350, 90, 40));

        jInternalFrameCobroP.setClosable(true);
        jInternalFrameCobroP.setMaximizable(true);
        jInternalFrameCobroP.setVisible(false);
        jInternalFrameCobroP.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel35.setText("Numero");
        jInternalFrameCobroP.getContentPane().add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 39, -1, -1));
        jInternalFrameCobroP.getContentPane().add(jTxtNumeroCobroP, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 35, 122, -1));

        jLabel36.setText("Fecha");
        jInternalFrameCobroP.getContentPane().add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 77, -1, -1));
        jInternalFrameCobroP.getContentPane().add(jTxtFechaCobroP, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 78, 122, -1));

        jLabel37.setText("Departamento");
        jInternalFrameCobroP.getContentPane().add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 82, -1, -1));

        jComboBoxDepartamentoCobroP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrativo", "Ventas", "Tecnico" }));
        jInternalFrameCobroP.getContentPane().add(jComboBoxDepartamentoCobroP, new org.netbeans.lib.awtextra.AbsoluteConstraints(429, 77, 119, -1));

        jLabel38.setText("N de empleado");
        jInternalFrameCobroP.getContentPane().add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 124, -1, -1));
        jInternalFrameCobroP.getContentPane().add(jtxtCodigoCobroP, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 120, 222, -1));

        jLabel39.setText("Nombre");
        jInternalFrameCobroP.getContentPane().add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 166, -1, -1));
        jInternalFrameCobroP.getContentPane().add(jTxtNombreCobroPrestamos, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 162, 222, -1));

        jLabel40.setText("Tipo");
        jInternalFrameCobroP.getContentPane().add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 202, -1, -1));

        jTextField8.setEditable(false);
        jTextField8.setText("ABONO");
        jInternalFrameCobroP.getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 198, 222, -1));

        jLabel41.setText("Concepto");
        jInternalFrameCobroP.getContentPane().add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 251, -1, -1));
        jInternalFrameCobroP.getContentPane().add(jtxtConceptoCobroP, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 247, 222, -1));

        jLabel42.setText("Valor del cobro");
        jInternalFrameCobroP.getContentPane().add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 283, -1, -1));
        jInternalFrameCobroP.getContentPane().add(jTxtValorCobro, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 283, 222, -1));

        jButton6.setText("Buscar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jInternalFrameCobroP.getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 103, 44));

        jLabel43.setText("Monto");
        jInternalFrameCobroP.getContentPane().add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 325, -1, -1));
        jInternalFrameCobroP.getContentPane().add(jTxtMontoCobroP, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 325, 222, -1));

        jBtnGuardarCobroP.setText("Guardar");
        jBtnGuardarCobroP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnGuardarCobroPActionPerformed(evt);
            }
        });
        jInternalFrameCobroP.getContentPane().add(jBtnGuardarCobroP, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, 110, 40));
        jInternalFrameCobroP.getContentPane().add(jtxtApellidoCobroP, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 210, -1));

        jbtnActualizarCobroP.setText("Actualizar");
        jbtnActualizarCobroP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnActualizarCobroPActionPerformed(evt);
            }
        });
        jInternalFrameCobroP.getContentPane().add(jbtnActualizarCobroP, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, -1, -1));

        jLabelIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/transferenciasclientes/cherry.jpg"))); // NOI18N

        jInternalFrameRolDePagos.setClosable(true);
        jInternalFrameRolDePagos.setMaximizable(true);
        jInternalFrameRolDePagos.setVisible(false);
        jInternalFrameRolDePagos.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel44.setText("Numero de empleado");
        jInternalFrameRolDePagos.getContentPane().add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 25, -1, -1));

        jLabel45.setText("Mes del rol");
        jInternalFrameRolDePagos.getContentPane().add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 67, -1, -1));
        jInternalFrameRolDePagos.getContentPane().add(jTxtMesDelRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 63, 217, -1));
        jInternalFrameRolDePagos.getContentPane().add(jTxtNumeroDeEmpleadoRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 21, 218, -1));

        jLabel46.setText("Numero de prestamo");
        jInternalFrameRolDePagos.getContentPane().add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 115, -1, -1));
        jInternalFrameRolDePagos.getContentPane().add(jTxtNumeroPrestamoRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 111, 219, -1));

        jButton7.setText("Generar rol");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jInternalFrameRolDePagos.getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 203, 158, 69));

        jMenu4.setText("Opciones");

        jMenuItem3.setText("Regresar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem3);

        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem1);

        jMenuBar2.add(jMenu4);

        jMenu5.setText("Registro de datos");

        jMenuItem2.setText("Empleados");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem2);

        jMenu8.setText("Prestamo de empleados");

        jMenuItem4.setText("Ingreso Prestamos");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem4);

        jMenuItem10.setText("Cobro Prestamos");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem10);

        jMenu5.add(jMenu8);

        jMenu7.setText("Registro Transacciones");

        jMenuItem8.setText("Horas extra");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem8);

        jMenu5.add(jMenu7);

        jMenuBar2.add(jMenu5);

        jMenu6.setText("Procesamiento");

        jMenuItem6.setText("Creacion de rol");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem6);

        jMenuBar2.add(jMenu6);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jInternalFrameRolDePagos, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jInternalFrameHorasExtras, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jInternalFrameIngresoDePrestamos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jInternalFrameCobroP, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jInternalFrameEmplados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jInternalFrameHorasExtras1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(jLabelIcono)))
                .addContainerGap(361, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jInternalFrameRolDePagos, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jInternalFrameEmplados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jInternalFrameCobroP, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jInternalFrameHorasExtras, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jInternalFrameIngresoDePrestamos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jInternalFrameHorasExtras1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(253, 253, 253)
                .addComponent(jLabelIcono, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(309, Short.MAX_VALUE))
        );

        try {
            jInternalFrameEmplados.setMaximum(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        try {
            jInternalFrameHorasExtras.setMaximum(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        try {
            jInternalFrameIngresoDePrestamos.setMaximum(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        try {
            jInternalFrameCobroP.setMaximum(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDepartamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxDepartamentoActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        jInternalFrameEmplados.show();
        jInternalFrameHorasExtras.hide();
        jInternalFrameIngresoDePrestamos.hide();
        jLabelIcono.hide();
        jInternalFrameRolDePagos.hide();


    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        if (jInternalFrameEmplados.isShowing() & !jInternalFrameHorasExtras1.isShowing() & !jInternalFrameIngresoDePrestamos.isShowing()) {
            JOptionPane.showMessageDialog(this, "Cierra las ventanas para salir");
        } else {
            System.exit(WIDTH);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        jInternalFrameHorasExtras.show();
        jInternalFrameEmplados.hide();
        jInternalFrameIngresoDePrestamos.hide();
        jLabelIcono.hide();

        jInternalFrameRolDePagos.hide();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (jComboBoxDepartamento.getSelectedItem().equals("Administrativo")) {
            Departamento = "Administrativo";
        }
        if (jComboBoxDepartamento.getSelectedItem().equals("Ventas")) {
            Departamento = "Ventas";
        }
        if (jComboBoxDepartamento.getSelectedItem().equals("Tecnico")) {
            Departamento = "Tecnico";
        }
        if (jComboboxIdentificacion.getSelectedItem().equals("IDENTIFICACION TRIBUTARIA")) {
            tipoDeCedula = "IDENTIFICACION TRIBUTARIA";
        }
        if (jComboboxIdentificacion.getSelectedItem().equals("CEDULA")) {
            tipoDeCedula = "CEDULA";
        }
        if (jComboBoxDepartamento.getSelectedItem().equals("PASAPORTE")) {
            tipoDeCedula = "PASAPORTE";
        }
        try {
            connection = Conexion.getConnection();
            preparedStatement = connection.prepareStatement("INSERT INTO persona (Departamento, Apellidos, Nombres, Direccion, Fecha_de_nacimiento, Tipo_de_identificacion, N_de_identificacion, Telefono, Estado_Civil, Cargo) VALUES (?,?,?,?,?,?,?,?,?,?)");
            preparedStatement.setString(1, Departamento);
            preparedStatement.setString(2, jTxtApellidos.getText());
            preparedStatement.setString(3, jTxtNombre.getText());
            preparedStatement.setString(4, (jTxtDireccion.getText()));
            preparedStatement.setDate(5, Date.valueOf(jTxtFechaNacimiento.getText()));
            preparedStatement.setString(6, tipoDeCedula);
            preparedStatement.setString(7, (jTxtNidentificacion.getText()));
            preparedStatement.setString(8, jtxtTelefono.getText());
            preparedStatement.setString(9, (jtxtEstadoCivil.getText()));
            preparedStatement.setString(10, jtxtCargo.getText());

            int res = preparedStatement.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Persona almacenada correctamente");

            } else {
                JOptionPane.showMessageDialog(null, "Error al guardar el registro");

            }

            connection.close();

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            connection = Conexion.getConnection();
            preparedStatement = connection.prepareStatement("SELECT Departamento, Apellidos, Nombres, Direccion, Fecha_de_nacimiento, Tipo_de_identificacion, N_de_identificacion, Telefono, Estado_Civil, Cargo FROM persona WHERE id=?");
            preparedStatement.setString(1, jTxtCodigo.getText());
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                jComboBoxDepartamento.setSelectedItem(resultSet.getString("Departamento"));
                jTxtApellidos.setText(resultSet.getString("Apellidos"));
                jTxtNombre.setText(resultSet.getString("Nombres"));
                jTxtDireccion.setText(resultSet.getString("Direccion"));
                jTxtFechaNacimiento.setText(resultSet.getString("Fecha_de_nacimiento"));
                jComboboxIdentificacion.setSelectedItem(resultSet.getString("Tipo_de_identificacion"));
                jTxtNidentificacion.setText(resultSet.getString("N_de_identificacion"));
                jtxtTelefono.setText(resultSet.getString("Telefono"));
                jtxtEstadoCivil.setText(resultSet.getString("Estado_Civil"));
                jtxtCargo.setText(resultSet.getString("Cargo"));

            } else {
                JOptionPane.showMessageDialog(null, "No existe un personal con esta clave");
                jTxtCodigo.setEditable(true);
            }

            connection.close();

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (jComboBoxDepartamentoHorasExtras.getSelectedItem().equals("Administrativo")) {
            DepartamentoExtra = "Administrativo";
        }
        if (jComboBoxDepartamentoHorasExtras.getSelectedItem().equals("Ventas")) {
            DepartamentoExtra = "Ventas";
        }
        if (jComboBoxDepartamentoHorasExtras.getSelectedItem().equals("Tecnico")) {
            DepartamentoExtra = "Tecnico";
        }

        Empleados e1 = new Empleados(Integer.parseInt(jtxtCodigoHorasExtras.getText()), DepartamentoExtra, Departamento);
        e1.sueldo(Integer.parseInt(jtxtPerido.getText()));
        jtxtTransaccion.setText(Integer.toString((int) e1.sueldo(Integer.parseInt(jtxtPerido.getText()), DepartamentoExtra, Integer.parseInt(jtxtPerido.getText()))));
        HorasExtras = e1.periodo1;

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        jInternalFrameIngresoDePrestamos.show();
        jInternalFrameHorasExtras.hide();
        jInternalFrameEmplados.hide();
        jLabelIcono.hide();
        jInternalFrameCobroP.hide();
        jInternalFrameRolDePagos.hide();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jBtnGuardarPrestamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnGuardarPrestamosActionPerformed
        Prestamos p1 = new Prestamos(Integer.parseInt(jTxtNumeroDePagos.getText()), Integer.parseInt(jTxtMonto.getText()));

        try {
            connection = Conexion.getConnection();
            preparedStatement = connection.prepareStatement("SELECT  Nombres, Apellidos FROM persona WHERE id=?");
            preparedStatement.setString(1, jTxtCodigoPrestamo.getText());
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                jTxtNombrePrestamo.setText(resultSet.getString("Nombres"));
                jTxtApellidoPrestamo.setText(resultSet.getString("Apellidos"));

            } else {
                JOptionPane.showMessageDialog(null, "No existe un personal con esta clave");
                jTxtCodigo.setEditable(true);
            }

            connection.close();

        } catch (Exception ex) {
            System.out.println(ex);
        }

        p1.setMonto(Integer.parseInt(jTxtMonto.getText()));
        p1.setNo_de_Pagos(Integer.parseInt(jTxtNumeroDePagos.getText()));
        p1.getmonto();
        p1.getNo_de_Pagos();
        jtxtPagoPorMesPrestamo.setText(Integer.toString(p1.pagoPorMes()));
    }//GEN-LAST:event_jBtnGuardarPrestamosActionPerformed

    private void jTxtNumeroPrestamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtNumeroPrestamosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtNumeroPrestamosActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            connection = Conexion.getConnection();
            preparedStatement = connection.prepareStatement("INSERT INTO prestamos (Numero, Fecha, Codigo, Monto, No_de_pagos, Plazo, Observaciones, Pago_por_mes) VALUES (?,?,?,?,?,?,?,?)");
            preparedStatement.setString(1, jTxtNumeroPrestamos.getText());
            preparedStatement.setString(2, jtxtFechaPrestamos.getText());
            preparedStatement.setString(3, jTxtCodigoPrestamo.getText());
            preparedStatement.setString(4, (jTxtMonto.getText()));
            preparedStatement.setString(5, (jTxtNumeroDePagos.getText()));
            preparedStatement.setString(6, (jTxtPlazo.getText()));
            preparedStatement.setString(7, jTxtObservaciones.getText());
            preparedStatement.setString(8, (jtxtPagoPorMesPrestamo.getText()));

            int res = preparedStatement.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Persona almacenada correctamente");

            } else {
                JOptionPane.showMessageDialog(null, "Error al guardar el registro");

            }

            connection.close();

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {
            connection = Conexion.getConnection();
            preparedStatement = connection.prepareStatement("SELECT  Monto FROM prestamos WHERE Numero=?");
            preparedStatement.setString(1, jTxtNumeroCobroP.getText());
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                jTxtMontoCobroP.setText(resultSet.getString("Monto"));

            } else {
                JOptionPane.showMessageDialog(null, "No existe ese prestamo");
                jTxtCodigo.setEditable(true);
            }

            connection.close();

        } catch (Exception ex) {
            System.out.println(ex);
        }
        try {
            connection = Conexion.getConnection();
            preparedStatement = connection.prepareStatement("SELECT  Nombres, Apellidos, Tipo_de_identificacion FROM persona WHERE id=?");
            preparedStatement.setString(1, jtxtCodigoCobroP.getText());
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                jTxtNombreCobroPrestamos.setText(resultSet.getString("Nombres"));
                jtxtApellidoCobroP.setText(resultSet.getString("Apellidos"));
                jComboBoxDepartamentoCobroP.setSelectedItem(resultSet.getString("Tipo_de_identificacion"));

            } else {
                JOptionPane.showMessageDialog(null, "No existe ese prestamo");
                jTxtCodigo.setEditable(true);
            }

            connection.close();

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        jInternalFrameCobroP.show();
        jInternalFrameHorasExtras.hide();
        jInternalFrameEmplados.hide();
        jLabelIcono.hide();
        jInternalFrameIngresoDePrestamos.hide();
        jInternalFrameRolDePagos.hide();
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jBtnGuardarCobroPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnGuardarCobroPActionPerformed

        try {
            // Funciona para conexion y una sentencia SQL para actualizar los datos
            connection = Conexion.getConnection();
            preparedStatement = connection.prepareStatement("UPDATE prestamos SET Monto=? WHERE Numero=?");
            preparedStatement.setString(1, jTxtMontoCobroP.getText());
            preparedStatement.setString(2, jTxtNumeroCobroP.getText());

            int res = preparedStatement.executeUpdate();
            //Funciona para comparar el SQL con las cajas de texto
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Monto actualizado");
                ;
            } else {

                JOptionPane.showMessageDialog(null, "Monto actualizado");

            }
            //Funciona para cerrar la conexión
            connection.close();
            //Funciona para retornar la conexion y dar un error predefinido
        } catch (Exception ex) {

            System.out.println(ex);

        }

    }//GEN-LAST:event_jBtnGuardarCobroPActionPerformed

    private void jbtnActualizarCobroPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnActualizarCobroPActionPerformed
        CobroDePrestamos c1 = new CobroDePrestamos();
        c1.cobro(Integer.parseInt(jTxtMontoCobroP.getText()), Integer.parseInt(jTxtValorCobro.getText()));
        jTxtMontoCobroP.setText(Integer.toString(c1.resta()));

    }//GEN-LAST:event_jbtnActualizarCobroPActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        jInternalFrameRolDePagos.show();
        jInternalFrameHorasExtras.hide();
        jInternalFrameEmplados.hide();
        jLabelIcono.hide();
        jInternalFrameIngresoDePrestamos.hide();
        jInternalFrameCobroP.hide();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        MesEmpleado = jTxtMesDelRol.getText();
        try {
            connection = Conexion.getConnection();
            preparedStatement = connection.prepareStatement("SELECT  Nombres, Apellidos, Departamento FROM persona WHERE id=?");
            preparedStatement.setString(1, jTxtNumeroDeEmpleadoRol.getText());
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                NombreEmpleado = (resultSet.getString("Nombres"));
                ApellidosEmpleado = (resultSet.getString("Apellidos"));
                DepartamentoRol = (resultSet.getString("Departamento"));

            } else {
                JOptionPane.showMessageDialog(null, "No existe ese prestamo");

            }

            connection.close();

        } catch (Exception ex) {
            System.out.println(ex);

        }
        new RolDePagosHoja().show();
        this.hide();
        try {
            connection = Conexion.getConnection();
            preparedStatement = connection.prepareStatement("SELECT  Monto FROM prestamos WHERE Numero=?");
            preparedStatement.setString(1, jTxtNumeroPrestamoRol.getText());
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                Prestamos = (resultSet.getString("Monto"));

            } else {
                JOptionPane.showMessageDialog(null, "No existe ese prestamo");

            }

            connection.close();

        } catch (Exception ex) {
            System.out.println(ex);
        }
        if (DepartamentoRol.equals("Administrativo")) {
            Sueldo = 800;
        }
        if (DepartamentoRol.equals("Ventas")) {
            Sueldo = 600;
        }
        if (DepartamentoRol.equals("Tecnico")) {
            Sueldo = 800;
        }

        Egresos = (int) ((Sueldo * 9.45) / 100);

        EgresosFinal = Egresos + Integer.parseInt(Prestamos);

        IngresosFinal = HorasExtras + Sueldo;
        SueldoFinal = IngresosFinal - EgresosFinal;
        new RolDePagosHoja().show();
        this.hide();

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        new MenuPrincipal().show();
        this.hide();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RolDePagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RolDePagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RolDePagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RolDePagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RolDePagos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnGuardarCobroP;
    private javax.swing.JButton jBtnGuardarPrestamos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBoxDepartamento;
    private javax.swing.JComboBox<String> jComboBoxDepartamentoCobroP;
    private javax.swing.JComboBox<String> jComboBoxDepartamentoHorasExtras;
    private javax.swing.JComboBox<String> jComboBoxDepartamentoHorasExtras1;
    private javax.swing.JComboBox<String> jComboboxIdentificacion;
    private javax.swing.JInternalFrame jInternalFrameCobroP;
    private javax.swing.JInternalFrame jInternalFrameEmplados;
    private javax.swing.JInternalFrame jInternalFrameHorasExtras;
    private javax.swing.JInternalFrame jInternalFrameHorasExtras1;
    private javax.swing.JInternalFrame jInternalFrameIngresoDePrestamos;
    private javax.swing.JInternalFrame jInternalFrameRolDePagos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelIcono;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTxtApellidoPrestamo;
    private javax.swing.JTextField jTxtApellidos;
    private javax.swing.JTextField jTxtCodigo;
    private javax.swing.JTextField jTxtCodigoPrestamo;
    private javax.swing.JTextField jTxtDescripcionHorasExtras;
    private javax.swing.JTextField jTxtDescripcionHorasExtras1;
    private javax.swing.JTextField jTxtDireccion;
    private javax.swing.JTextField jTxtFechaCobroP;
    private javax.swing.JTextField jTxtFechaNacimiento;
    private javax.swing.JTextField jTxtMesDelRol;
    private javax.swing.JTextField jTxtMonto;
    private javax.swing.JTextField jTxtMontoCobroP;
    private javax.swing.JTextField jTxtNidentificacion;
    private javax.swing.JTextField jTxtNombre;
    private javax.swing.JTextField jTxtNombreCobroPrestamos;
    private javax.swing.JTextField jTxtNombrePrestamo;
    private javax.swing.JTextField jTxtNumeroCobroP;
    private javax.swing.JTextField jTxtNumeroDeEmpleadoRol;
    private javax.swing.JTextField jTxtNumeroDePagos;
    private javax.swing.JTextField jTxtNumeroPrestamoRol;
    private javax.swing.JTextField jTxtNumeroPrestamos;
    private javax.swing.JTextField jTxtObservaciones;
    private javax.swing.JTextField jTxtPlazo;
    private javax.swing.JTextField jTxtValorCobro;
    private javax.swing.JButton jbtnActualizarCobroP;
    private javax.swing.JTextField jtxtApellidoCobroP;
    private javax.swing.JTextField jtxtCargo;
    private javax.swing.JTextField jtxtCodigoCobroP;
    private javax.swing.JTextField jtxtCodigoHorasExtras;
    private javax.swing.JTextField jtxtCodigoHorasExtras1;
    private javax.swing.JTextField jtxtConceptoCobroP;
    private javax.swing.JTextField jtxtEstadoCivil;
    private javax.swing.JTextField jtxtFechaPrestamos;
    private javax.swing.JTextField jtxtPagoPorMesPrestamo;
    private javax.swing.JTextField jtxtPerido;
    private javax.swing.JTextField jtxtPerido1;
    private javax.swing.JTextField jtxtTelefono;
    private javax.swing.JTextField jtxtTransaccion;
    private javax.swing.JTextField jtxtTransaccion1;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables
}
