import javax.swing.JFrame;
import javax.swing.JLabel;

public class JLabel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JLabel label = new JLabel();
		label.setText("Do you even code");
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setVisible(true);
		frame.add(label);
	}

}
