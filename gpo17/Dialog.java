import javax.swing.*;

public class Dialog{

	public static void main(String args[]){

		JFrame jFrame;

		jFrame = new JFrame("Ventana 1");
		jFrame.setSize(400,300);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton okButton = new JButton("Ok");
		jFrame.add(okButton);

		jFrame.setVisible(true);
	}
}