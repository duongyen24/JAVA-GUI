import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Jframe {

	public static void main(String[] args) {

		JFrame frame = new JFrame();
		frame.setTitle("demo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setSize(420,420);
		frame.setVisible(true);
		
		ImageIcon icon = new ImageIcon("a.jpg");
		frame.setIconImage(icon.getImage());

		
		

		
	}

}
