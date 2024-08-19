package Ejercicio1;


import javax.swing.*;

public class Main {



    public static void main(String[] args) {


        Persona persona = new Persona("Mbappe","1094898817","Plaza sesamo");

        Cliente cliente = new Cliente("Mbappe","1094898817","Plaza sesamo","10 millones al mes"," CARRO DE 80 MILLONES");

        SolicitudCredito solicitudCredito = new SolicitudCredito(cliente,"Personal",1000000,"3 meses",0.015);

        Propiedad propiedad = new Propiedad("180 Millones","Plaza sesamo");

        CreditoHipotecario creditoHipotecario = new CreditoHipotecario("Aprobado",solicitudCredito,propiedad);

        Credito credito = new Credito("Pendiente",solicitudCredito);

    JOptionPane.showMessageDialog(null,"Bienvenido a banco Peluchinhos, Tu banco de confianza");

    String opcion1 = JOptionPane.showInputDialog(null,"Dijite su identificacion ");

    if (opcion1.equals(persona.obtenerIdentificacion())){

        JOptionPane.showMessageDialog(null,"Bienvenido: " + persona.obtenerNombre());

        String opccion2 = JOptionPane.showInputDialog(null,"Que tipo de credito desea hacer: Personal, Hipotecario ");


    int pago4meses = solicitudCredito.getMonto() + 15000 + 15225;

    if (opccion2.equals("personal")){

        JOptionPane.showMessageDialog(null,"señor " + cliente.obtenerNombre() + " de cedula " + cliente.obtenerIdentificacion() + " que vive en: " + cliente.obtenerDireccion() + " con un ingreso al mes de: " + cliente.getIngresos() + " con un historial crediticio de: " + cliente.getHistorialCrediticio());

        JOptionPane.showMessageDialog(null,"su solicitud de credito personal por un monto de  " + solicitudCredito.getMonto() + " se vencera en un plazo de " + solicitudCredito.getPlazo() + " a una tasa de interes de " + solicitudCredito.getTasaInteres());


        JOptionPane.showMessageDialog(null, " si no paga la deuda en 3 meses la deuda crecera al siguiente mes en: " + pago4meses);

        JOptionPane.showMessageDialog(null,"su solicitud de credito esta: " + credito.getEstado());

    } else if (opccion2.equals("hipotecario")) {

        JOptionPane.showMessageDialog(null,"señor " + cliente.obtenerNombre() + " de cedula " + cliente.obtenerIdentificacion() + " que vive en: " + cliente.obtenerDireccion() + " con un ingreso al mes de: " + cliente.getIngresos() + " con un historial crediticio de: " + cliente.getHistorialCrediticio());

       JOptionPane.showMessageDialog(null,"sin ningun antecedente en datacredito");

       JOptionPane.showMessageDialog(null," no pago el prestamo de  " + solicitudCredito.getMonto() + " de una casa en un plazo de 3 meses y ademas no tiene dinero para pagarlo");

JOptionPane.showMessageDialog(null," la casa con un valor de " + propiedad.obtenerValor() +" que esta hubicada en " + propiedad.obtenerDireccion() + " sera propiedad de el banco" );

JOptionPane.showMessageDialog(null," el tramite para esto esta " + creditoHipotecario.getEstado() );

    }

}else {
        JOptionPane.showMessageDialog(null,"error");
    }
    



    }



}
