
public class Figura {
    String nombre;
    String color;

    public Figura(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    public void mostrarInfo() {
        System.out.println("Figura: " + nombre);
        System.out.println("Color: " + color);
    }
}
