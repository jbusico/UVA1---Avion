package Aviones;

public class Avion {
    private String marca;
    private String modelo;
    private MotorDeAvion motorIzquierdo;
    private MotorDeAvion motorDerecho;
    private SistemaDeControlDeVuelo sistemaDeControlDeVuelo;
    private Ala alaIzquierda;
    private Ala alaDerecha;
    private int numeroDeAsientos;
    private boolean sistDeEntretenimiento;

    public Avion(String marca, String modelo, MotorDeAvion motorDerecho, MotorDeAvion motorIzquierdo,
            SistemaDeControlDeVuelo sistemaDeControlDeVuelo,
            Ala alaIzquierda, Ala alaDerecha, Integer numeroDeAsientos, boolean sistDeEntretenimiento) {
        this.marca = marca;
        this.modelo = modelo;
        this.motorIzquierdo = motorIzquierdo;
        this.motorDerecho = motorDerecho;
        this.sistemaDeControlDeVuelo = sistemaDeControlDeVuelo;
        this.alaIzquierda = alaIzquierda;
        this.alaDerecha = alaDerecha;
        this.numeroDeAsientos = numeroDeAsientos;
        this.sistDeEntretenimiento = sistDeEntretenimiento;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public MotorDeAvion motorIzquierdo() {
        return motorIzquierdo;
    }

    public MotorDeAvion motorDerecho() {
        return motorDerecho;
    }

    public SistemaDeControlDeVuelo getSistemaDeControlDeVuelo() {
        return sistemaDeControlDeVuelo;
    }

    public void setSistemaDeControlDeVuelo(SistemaDeControlDeVuelo sistemaDeControlDeVuelo) {
        this.sistemaDeControlDeVuelo = sistemaDeControlDeVuelo;
    }

    public Ala getAlaIzquierda() {
        return alaIzquierda;
    }

    public void setAlaIzquierda(Ala alaIzquierda) {
        this.alaIzquierda = alaIzquierda;
    }

    public Ala getAlaDerecha() {
        return alaDerecha;
    }

    public void setAlaDerecha(Ala alaDerecha) {
        this.alaDerecha = alaDerecha;
    }

    public int getNumeroDeAsientos() {
        return numeroDeAsientos;
    }

    public void setNumeroDeAsientos(int numeroDeAsientos) {
        this.numeroDeAsientos = numeroDeAsientos;
    }

    public boolean isSistDeEntretenimiento() {
        return sistDeEntretenimiento;
    }

    public String descripcionEntretenimiento() {
        if (sistDeEntretenimiento) {
            return "Tiene Sistema de Entretenimiento";
        } else {
            return "No tiene Sistema de Entretenimiento";
        }
    }

    public void setSistDeEntretenimiento(boolean sistDeEntretenimiento) {
        this.sistDeEntretenimiento = sistDeEntretenimiento;
    }
}
