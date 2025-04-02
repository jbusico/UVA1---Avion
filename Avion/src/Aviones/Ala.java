package Aviones;
public class Ala {
    private int envergadura;
    private String color;
    private String material;

    public Ala(int envergadura, String color, String material) {
        this.envergadura = envergadura;
        this.color = color;
        this.material = material;
    }

    public int getEnvergadura() {
        return envergadura;
    }



    public String getColor() {
        return color;
    }



    public String getMaterial() {
        return material;
    }



    public void flap() {
        System.out.println("El ala de color " + color + " ,material " + material + " y de envergadura " + envergadura + " metros, esta aleteando");
    }
}
