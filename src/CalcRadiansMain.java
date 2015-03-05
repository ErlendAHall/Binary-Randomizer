import javax.swing.*;

public class CalcRadiansMain {

	public static void main(String[] args) {

		// Prompt for degree in angles
		int a = 0;
		a = Integer.parseInt(JOptionPane
				.showInputDialog("Skriv inn vinkel i grader"));



		// Calculate radians
		CalcRadians degree = new CalcRadians(a);
		double radian = degree.radians(a);
		System.out.println(radian);
		double sin = degree.sin(radian);
		System.out.println(sin);

	}

}
