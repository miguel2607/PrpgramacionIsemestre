package Ejercicio1;

public class Credito {

    //  Atributos: solicitudCredito, estado ("aprobado", "rechazado", "pendiente").


    private String estado = "pendiente";
    private SolicitudCredito solicitudCredit;

    public Credito(String estado, SolicitudCredito solicitudCredit) {
        this.estado = estado;
        this.solicitudCredit = solicitudCredit;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public SolicitudCredito getSolicitudCredit() {
        return solicitudCredit;
    }

    public void setSolicitudCredit(SolicitudCredito solicitudCredit) {
        this.solicitudCredit = solicitudCredit;
    }
}
