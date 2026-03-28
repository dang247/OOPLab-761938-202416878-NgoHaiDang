import java.util.Arrays;
import javax.swing.JOptionPane;

class NumericArray {
	public double[] data;
	
	public NumericArray(int size) {
		this.data = new double[size];
	}
	
	public void inputArray() {
		for (int i=0; i<data.length; i++) {
			int j=i+1;
			String input = JOptionPane.showInputDialog(null, "Nhap phan tu thu "+j+": ");
			data[i] = Double.parseDouble(input);
		}
	}
	
	public void processArray() {
		Arrays.sort(data);
		
		double sum=0;
		for (int i=0; i<data.length; i++) {
			sum = sum + data[i];
		}
		double avg = sum/data.length;
		
		JOptionPane.showMessageDialog(null, "Mang sau khi sap xep: "+Arrays.toString(data)+"\nTong: "+sum+"\nTrung binh cong: "+avg);
	}
}

public class ArrayProcessor {
	public static void main(String[] args) {
		int choice = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Tu nhap mang\n2. Dung mang co san (3, 6, 1, 8, 6, 5)"));
		switch (choice) {
		case 1: {
			int s = Integer.parseInt(JOptionPane.showInputDialog(null, "Nhap so phan tu: "));
			NumericArray arr = new NumericArray(s);
			arr.inputArray();
			arr.processArray();
			break;
		}
		case 2: {
			double[] s = {1, 3, 5, 6, 6, 8};
			JOptionPane.showMessageDialog(null, "Mang sau khi sap xep: "+Arrays.toString(s));
			break;
		}
		default:
			JOptionPane.showMessageDialog(null, "Lua chon khong hop le!");
	}
		System.exit(0);
	}
}