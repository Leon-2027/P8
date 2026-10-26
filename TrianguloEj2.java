package p8;

public class Triangulo extends Figura{
	private double b;
	private double h;
	public Triangulo(double h, double b) {
		this.b=b;
		this.h=h;
	}
	@Override
	public double CA() {
		return (b*h)/2;
	}
}
