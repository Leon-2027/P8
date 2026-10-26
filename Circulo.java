public class Circulo extends Figura {
    double radio;

    public Circulo(String nombre, String color, double radio) {
        super(nombre, color);
        this.radio = radio;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    public void mostrarCirculo() {
        mostrarInfo();
        System.out.println("Radio: " + radio);
        System.out.println("Área: " + calcularArea());
    }
}
