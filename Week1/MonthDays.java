import javax.swing.JOptionPane;

class MonthYear{
	public int month;
	public int year;
	
	public MonthYear(int month, int year) {
		this.month=month;
		this.year=year;
	}
	
	public boolean isLeapYear() {
		return ((year%4==0 && year%100!=0) || (year%400==0));
	}
	
	public int getDays() {
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12: return 31;
		case 4: case 6: case 9: case 11: return 30;
		case 2:
			return isLeapYear()? 29:28;
		default: return 0;
		}
	}
}

public class MonthDays {
	public static void main(String[] args) {
		String year = JOptionPane.showInputDialog(null, "Nhap nam: ");
		int y = Integer.parseInt(year);
		
		String month = JOptionPane.showInputDialog(null, "Nhap thang: ");
		int m = convertMonth(month);
		
		if (m == 0 || y<0) {
			JOptionPane.showMessageDialog(null, "Nam hoac thang khong hop le");			
		} else {
			MonthYear monthyear = new MonthYear(m, y);
			int days = monthyear.getDays();
			JOptionPane.showMessageDialog(null, "Thang "+month+" cua nam "+year+" co "+days+" ngay.");
			}
		System.exit(0);
		}	
	public static int convertMonth(String month) {
		switch(month) {
		case "1": case "Jan": case "Jan.": case "January": return 1;
		case "2": case "Feb": case "Feb.": case "February": return 2;
		case "3": case "Mar": case "Mar.": case "March": return 3;
		case "4": case "Apr": case "Apr.": case "April": return 4;
		case "5": case "May": return 5;
		case "6": case "Jun": case "June": return 6;
		case "7": case "Jul": case "July": return 7;
		case "8": case "Aug": case "Aug.": case "August": return 8;
		case "9": case "Sep": case "Sept.": case "September": return 9;
		case "10": case "Oct": case "Oct.": case "October": return 10;
		case "11": case "Nov": case "Nov.": case "November": return 11;
		case "12": case "Dec": case "Dec.": case "December": return 12;
		default: return 0;
		}
	}
}
