import javax.swing.JOptionPane;
class Matrix {
	public double[][] data;
	public int r, c;
	
	public Matrix(int r, int c) {
		this.r = r;
		this.c = c;
		this.data = new double[r][c];
	}
	
	public void inputMatrix() {
		for (int i=0; i<r; i++) {
			for (int j=0; j<c; j++) {
				data[i][j] = Double.parseDouble(JOptionPane.showInputDialog(null, "Nhap hang "+i+" , cot "+j));
			}
		}
	}
}

public class AddTwoMatrices {
	public static void main(String[] args) {
		int choice = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Tu nhap 2 ma tran\n2. Dung 2 ma tran co san"));
		switch (choice) {
		case 1: {
			int r = Integer.parseInt(JOptionPane.showInputDialog(null, "Nhap so hang cua 2 ma tran: "));
			int c = Integer.parseInt(JOptionPane.showInputDialog(null, "Nhap so cot cua 2 ma tran: "));
			
			Matrix m1 = new Matrix(r, c);
			Matrix m2 = new Matrix(r, c);
			
			m1.inputMatrix();
			m2.inputMatrix();
			
			Matrix result = new Matrix(r, c);
			for (int i=0; i<r; i++) {
				for (int j=0; j<c; j++) {
					result.data[i][j] = m1.data[i][j] + m2.data[i][j];
					}
				}
			
			String output = "Ma tran ket qua:\n";
			for (int i=0; i<result.r; i++) {
				for (int j=0; j<result.c; j++) {
					output += result.data[i][j] + " ";
					}
				output += "\n";
				}
			JOptionPane.showMessageDialog(null, output);
			break;
		}
		case 2:
			JOptionPane.showMessageDialog(null, "Underconstrucion...");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Lua chon khong hop le!");
		}
		
		System.exit(0);
	}
}