package Ejercicio1;


import javax.swing.*;

public class Main {



    public static void main(String[] args) {


        Persona persona = new Persona("","","");
        Cliente cliente = new Cliente("Mbappe","1092782210","Calle 24 norte #507","10 millones de pesos","compro una nevera de 3 millones de pesos");
        SolicitudCredito solicitudCredito = new SolicitudCredito(cliente,"personal",10000000,"3 meses",0.3);
        Propiedad propiedad = new Propiedad("200 millones","plaza sesamo");
        CreditoHipotecario creditoHipotecario = new CreditoHipotecario("pendiente",solicitudCredito,propiedad);
        Credito credito = new Credito("pendiente",solicitudCredito);

    JOptionPane.showMessageDialog(null,"Bienvenido a banco Peluchinhos, Tu banco de confianza");
String opcion1 = JOptionPane.showInputDialog(null,"¿Es tu primera vez aca no?, Creemos un usuario. 1/SI,2/NO ");

    



    }



}
