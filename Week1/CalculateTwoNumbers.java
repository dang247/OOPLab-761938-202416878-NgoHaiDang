import javax.swing.JOptionPane;

class Calculator {
	private double a;
	private double b;
	
	public Calculator(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	public double getSum() {
		return a + b;
	}
	
	public double getDifference() {
		return Math.abs(a - b);		
	}
	
	public double getProduct() {
		return a * b;
	}
	public String getQuotient() {
		if (b == 0) {
			return "Khong the chia cho 0.";
		} else {
			return String.valueOf(a / b);
		}
	}
}
public class CalculateTwoNumbers {
	public static void main(String[] args) {
		String str1 = JOptionPane.showInputDialog(null, "Nhap so thu nhat: ");
		String str2 = JOptionPane.showInputDialog(null, "Nhap so thu hai: ");
		
		double a = Double.parseDouble(str1);
		double b = Double.parseDouble(str2);
		
		Calculator calc = new Calculator(a, b);
		
		String result = "Sum: "+calc.getSum()+"\nDifference: "+calc.getDifference()+"\nProduct: "+calc.getProduct()+"\nQuotient: "+calc.getQuotient();
		
		JOptionPane.showMessageDialog(null, result);
	}
}
