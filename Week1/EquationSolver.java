import javax.swing.JOptionPane;
class LinearEquation {
	double a, b;
	
	void inputCoefficients() {
		a = Double.parseDouble(JOptionPane.showInputDialog(null, "Nhap a: "));
		b = Double.parseDouble(JOptionPane.showInputDialog(null, "Nhap b: "));
	}
	
	void solve() {
		if (a==0) {
			if (b==0) {
				JOptionPane.showMessageDialog(null, "Vo so nghiem.");
			} else {
				JOptionPane.showMessageDialog(null, "Vo nghiem.");
			}
		} else {
			double x = -b/a;
			JOptionPane.showMessageDialog(null, "Nghiem: x= " + x);
		}
	}
}

class LinearSystem {
	double a11, a12, b1, a21, a22, b2;
	
	void inputCoefficients() {
		a11 = Double.parseDouble(JOptionPane.showInputDialog(null, "Nhap a11: "));
		a12 = Double.parseDouble(JOptionPane.showInputDialog(null, "Nhap a12: "));
		b1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Nhap b1: "));
		a21 = Double.parseDouble(JOptionPane.showInputDialog(null, "Nhap a21: "));
		a22 = Double.parseDouble(JOptionPane.showInputDialog(null, "Nhap a22: "));
		b2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Nhap b2: "));
	}
	
	void solve() {
		double D  = a11*a22 - a12*a21;
		double Dx = b1*a22 - b2*a12;
		double Dy = a11*b2 - a21*b1;
		
		if (D !=0 ) {
			double x = Dx/D;
			double y = Dy/D;
			JOptionPane.showMessageDialog(null, "Nghiem duy nhat: x=" + x + ", y=" + y);
		} else if (Dx==0 && Dy==0) {
			JOptionPane.showMessageDialog(null, "Vo so nghiem");
		} else {
			JOptionPane.showMessageDialog(null, "Vo nghiem");
		}
	}	
}

class QuadaricEquation {
	double a, b, c;
	
	void inputCoefficient() {
		a = Double.parseDouble(JOptionPane.showInputDialog(null, "Nhap a: "));
		b = Double.parseDouble(JOptionPane.showInputDialog(null, "Nhap b: "));
		c = Double.parseDouble(JOptionPane.showInputDialog(null, "Nhap c: "));
	}
	
	void solve() {
		if (a==0) {
			if (b==0) {
				if (c==0) {
					JOptionPane.showMessageDialog(null, "Vo so nghiem");
				} else {
					JOptionPane.showMessageDialog(null, "Vo nghiem");
				}
			} else {
				double x=-c/b;
				JOptionPane.showMessageDialog(null, "Nghiem: x=" + x);
			}
		} else {
			double delta = b*b - 4*a*c;
			if (delta>0) {
				double x1 = (-b + Math.sqrt(delta)) / (2*a);
				double x2 = (-b - Math.sqrt(delta)) / (2*a);
				JOptionPane.showMessageDialog(null, "2 nghiem: x1=" + x1 + ", x2=" + x2);
			} else if (delta==0) {
				double x = -b / (2*a);
				JOptionPane.showMessageDialog(null, "Nghiem kep: x=" + x);
			} else {
				JOptionPane.showMessageDialog(null, "Vo nghiem");
			}
		}
	}
}

class EquationSolver {
	public static void main(String[] args) {
		double choice=0;
		do {
			choice = Double.parseDouble(JOptionPane.showInputDialog(null, "Nhap loai phuong trinh muon giai.\n1. Phuong trinh bac nhat mot an\n2. He phuong trinh bac nhat hai an\n3. Phuong trinh bac hai mot an\n4. Thoat chuong trinh"));
			if (choice==1) {
				LinearEquation le = new LinearEquation();
				le.inputCoefficients();
				le.solve();
			} else if (choice==2) {
				LinearSystem ls = new LinearSystem();
				ls.inputCoefficients();;
				ls.solve();
			} else if (choice==3) {
				QuadaricEquation qe = new QuadaricEquation();
				qe.inputCoefficient();
				qe.solve();
			} else if (choice!=4){
				JOptionPane.showMessageDialog(null, "Khong co lua chon nay");
			}
		} while (choice != 4);
		System.exit(0);
}


