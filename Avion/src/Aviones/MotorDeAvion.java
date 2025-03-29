package Aviones;
public class MotorDeAvion {
    private String marca;
    private int hp;
    private int empuje;
    private boolean encendido;

    public MotorDeAvion(String marca, int hp, int empuje) {
        this.marca = marca;
        this.hp = hp;
        this.empuje = empuje;
        this.encendido = false;
    }
    
    public void arrancar() {
        if (!encendido) {
            encendido = true;
            System.out.println("Motor arrancado");
        } else {
            System.out.println("El motor esta encendido");
        }
    }
    
    public void detener() {
        if (encendido) {
            encendido = false;
            System.out.println("Motor detenido");
        } else {
            System.out.println("El motor ya esta apagado");
        }
    }
    
    public String getMarca() {
        return marca;
    }
    
    public int getHp() {
        return hp;
    }
    
    public int getEmpuje() {
        return empuje;
    }
}

