package hust.soict.hedspi.swing;

import javax.swing.*; // Thư viện Swing
import java.awt.*;
import java.awt.event.*;

public class SwingAccumulator extends JFrame {
    private JTextField tfInput;
    private JTextField tfOutput;
    private int sum = 0; // Accumulated sum, init to 0

    // Constructor to setup the GUI components and event handlers
    public SwingAccumulator() {
        // Lấy lớp nền (content-pane) của JFrame để đặt các thành phần lên
        Container cp = getContentPane();
        cp.setLayout(new GridLayout(2, 2));

        cp.add(new JLabel("Enter an Integer: "));

        tfInput = new JTextField(10);
        cp.add(tfInput);
        tfInput.addActionListener(new TFInputListener());

        cp.add(new JLabel("The Accumulated Sum is: "));

        tfOutput = new JTextField(10);
        tfOutput.setEditable(false); // Không cho phép sửa ô kết quả
        cp.add(tfOutput);

        // TỰ ĐỘNG THOÁT khi nhấn nút "X" (Chỉ Swing mới có dòng này tiện thế này)
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setTitle("Swing Accumulator");
        setSize(350, 120);
        setVisible(true);
    }

    public static void main(String[] args) {
        // Chạy chương trình
        new SwingAccumulator();
    }

    // Lớp nội vi xử lý sự kiện
    private class TFInputListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent evt) {
            // Lấy text từ tfInput, chuyển sang số và cộng dồn
            int numberIn = Integer.parseInt(tfInput.getText());
            sum += numberIn;
            tfInput.setText(""); // Xóa ô nhập
            tfOutput.setText(sum + ""); // Cập nhật ô tổng
        }
    }
}