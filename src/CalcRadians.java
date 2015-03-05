public class CalcRadians {

	private double degree;
	private double radian;
	private double inputDeg;

	// public oppgave3Calc (double degree) {
	// this.degree = degree;
	// }

	public double getDegree() {
		return this.degree;
	}

	public CalcRadians(double inputDeg) {
		this.inputDeg = inputDeg;
	}

	public double radians(int a) {
		double radian = (this.inputDeg * Math.PI) / 180;
		return radian;

	}

	public int factorial(int x) {
		int factorial = 1;
		for (int f = 1; f <= x; f++) {
			factorial *= f;
		}

		return factorial;
	}

	public double sin(double radians) {
		double r = radians;
		for (int x = 3; x <= 7; x += 2) {

			for (int i = 1; i <= x; i++) {
				radians *= radians;
			}
			byte count = 0;
			int factorial = factorial(x);
			if (count % 2 == 0) {
				radians += radians / (double)factorial;
				r+= radians;
			} else if (count % 2 != 0) {
				radians -= radians / (double)factorial;
				r -= radians;
			}
		}
		radians = r;
		return radians;

	}

	public double getRadians() {
		return this.radian;
	}

	public String toString() {
		return radian + "";

	}

}
