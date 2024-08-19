package Ejercicio1;

public class SolicitudCredito {

    //: cliente, tipoCredito, monto, plazo, tasaInteres.


  private Cliente cliente;
    private String tipoCredito = "Personal";
    private int monto;
    private String plazo ;
    private double tasaInteres  ;

    public SolicitudCredito(Cliente cliente, String tipoCredito, int monto, String plazo, double tasaInteres) {
        this.cliente = cliente;
        this.tipoCredito = tipoCredito;
        this.monto = monto;
        this.plazo = plazo;
        this.tasaInteres = tasaInteres;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getTipoCredito() {
        return tipoCredito;
    }

    public void setTipoCredito(String tipoCredito) {
        this.tipoCredito = tipoCredito;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public double getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    public String getPlazo() {
        return plazo;
    }

    public void setPlazo(String plazo) {
        this.plazo = plazo;
    }
}
