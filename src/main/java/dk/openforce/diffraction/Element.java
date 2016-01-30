package dk.openforce.diffraction;

public enum Element {
	H ("H", 0.489918, 0.262003, 0.196767, 0.049879,	20.6593, 7.74039, 49.5519, 2.20159,	0.001305);

	private final String symbol;
	private final double[] a;
	private final double[] b;
	private final double c;
	
	private Element(String symbol, double a1, double a2, double a3, double a4, double b1, double b2, double b3, double b4, double c) {
		this.symbol = symbol;
		this.a = new double[4];
		a[0] = a1;
		a[1] = a2;
		a[2] = a3;
		a[3] = a4;
		this.b = new double[4];
		b[0] = b1;
		b[1] = b2;
		b[2] = b3;
		b[3] = b4;
		this.c = c;
	}
	
	public double[] getA() {
		return a;
	}

	public double[] getB() {
		return b;
	}

	public double getC() {
		return c;
	}
	
	public String getSymbol() {
		return symbol;
	}
}
