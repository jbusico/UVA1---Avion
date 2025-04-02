package Aviones;

public class OtroAvion {
    public static void main(String[] args) throws Exception {

        Ala alaIzquierda = new Ala(11, "Rojo", "Titanio");
        Ala alaDerecha = new Ala(11, "Verde", "Acero");

        Ala[] alas = new Ala[2];
        alas[0] = alaIzquierda;
        alas[1] = alaDerecha;

        MotorDeAvion motorIzquierdo = new MotorDeAvion("Rolls-Royce", 1000, 5000);
        MotorDeAvion motorDerecho = new MotorDeAvion("Rolls-Royce", 1000, 5000);

        SistemaDeControlDeVuelo sistema = new SistemaDeControlDeVuelo("Boeing", "Manual", 3, "Tipo 1");

        Avion boeing737 = new Avion("Boeing", "737", motorDerecho, motorIzquierdo, sistema, alas, 200, false);

        /**
         * motorDerecho.arrancar();
         * motorIzquierdo.arrancar();
         * 
         * alaDerecha.flap();
         * alaIzquierda.flap();
         * 
         * sistema.cambioDeModo("Automático");
         * 
         * motorDerecho.detener();
         * motorIzquierdo.detener();
         **/

        /** System.out.println(boeing737); **/

        System.out.println("Marca: " + boeing737.getMarca());
        System.out.println("Modelo: " + boeing737.getModelo());
        System.out.println("Motor izquierdo: " + boeing737.motorIzquierdo().getMarca());
        System.out.println("Motor derecho: " + boeing737.motorDerecho().getMarca());
        System.out.println("Ala 1: material " + boeing737.getAlas()[0].getMaterial() + ", color " + boeing737.getAlas()[0].getColor());
        System.out.println("Ala 2: material " + boeing737.getAlas()[1].getMaterial() + ", color " + boeing737.getAlas()[1].getColor());
        System.out.println("Cantidad de asientos: " + boeing737.getNumeroDeAsientos());
        System.out.println("Entretenimiento a bordo: " + boeing737.descripcionEntretenimiento());
        System.out.println("Modo del sistema de control de vuelo: " + boeing737.getSistemaDeControlDeVuelo().getModoActual());
    }
}
