package Aviones;
public class SistemaDeControlDeVuelo {
    private String fabricante;
    private int numeroDeModos;
    private String modoActual;
    private String tipoDeSistema;

    public SistemaDeControlDeVuelo(String fabricante, String modoActual,int numeroDeModos, String tipoDeSistema) {
        this.fabricante = fabricante;
        this.modoActual = modoActual;
        this.numeroDeModos = numeroDeModos;
        this.tipoDeSistema = tipoDeSistema;
    }

    public void cambioDeModo(String modoActual) {
        this.modoActual = modoActual;
    }

    public String getFabricante() {
        return fabricante;
    }

    public int getNumeroDeModos() {
        return numeroDeModos;
    }

    public String getModoActual() {
        return modoActual;
    }

    public String getTipoDeSistema() {
        return tipoDeSistema;
    }
}
