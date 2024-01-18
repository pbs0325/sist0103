package 실험실;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class A_001 extends JFrame {
    public A_001() {
        setTitle("JPanel with Button Example");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);

        add(panel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new A_001();
    }
}