import Aviones.*;

public class App {
    public static void main(String[] args) throws Exception {
        Ala ala1 = new Ala(11, "Rojo", "Titanio");
        Ala ala2 = new Ala(11, "Azul", "Acero");

        ala1.flap();
        ala2.flap();

        SistemaDeControlDeVuelo sistema1 = new SistemaDeControlDeVuelo("Boeing", "Manual", 3, "Tipo 1");
        System.out.println("Sistema inicial: " + sistema1.getModoActual());
        sistema1.cambioDeModo("Automatico");
        System.out.println("Nuevo modo: " + sistema1.getModoActual());

        MotorDeAvion motor1 = new MotorDeAvion("Rolls-Royce", 1000, 5000);
        System.out.println(
                "Marca: " + motor1.getMarca() + " - HP: " + motor1.getHp() + " - Empuje: " + motor1.getEmpuje());
        motor1.arrancar();
        motor1.detener();
    }
}
