
public class Raices {
	 int a;
	 int b;
	 int c;
	
	double disc;
	double x;
	double x2;
	
	public Raices(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	
	public  void obtenerRaiz() {
		if (tieneRaiz()) {
			if (getDiscriminante() >= 0) {
				if (getDiscriminante() == 0) {
					x = -b / (2*a);
					System.out.printf("La raíz real x es %.3f%n", x);
				}else {
					x = (-b + Math.sqrt(disc)) / (2*a);
					x2 = (-b - Math.sqrt(disc)) / (2*a);
					System.out.printf("La raíz real x1 es %.3f%n", x);
	                System.out.printf("La raíz real x2 es %.3f%n", x2);
				}
			}
		} else {
			System.out.println("No tiene raices");
		}
	}
	
	public double getDiscriminante() {
		disc = Math.pow(b, 2) - 4 * a * c;
		return disc;
	}
	
	public boolean tieneRaiz() {
		boolean raiz = false;
		if (getDiscriminante() >= 0) {
			if (getDiscriminante() == 0) {
				x = -b / (2*a);
				raiz =  true;
			}else {
				raiz = true;
			}
		}
		
		return raiz;
	}

}
