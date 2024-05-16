package day0131;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;



	public class SA implements ActionListener {
	    public void actionPerformed(ActionEvent e) {
	        // 버튼 클릭 이벤트 처리
	        System.out.println("Button clicked!");
	    }

	    public static void main(String[] args) {
	        JFrame frame = new JFrame("Button Example");
	        JButton button = new JButton("Click Me");
	        button.addActionListener(new SA());
	        frame.add(button);
	        frame.setSize(200, 200);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setVisible(true);
	    }
	}

