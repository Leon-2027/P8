package p8;

public class Pentagono extends Figura {
	private double a;
	private double P;
	
	public Pentagono(double a, double P){
		this.a=a;
		this.P=P;
	}
	@Override
	public double CA() {
		return (P*a)/2;
	}
}
