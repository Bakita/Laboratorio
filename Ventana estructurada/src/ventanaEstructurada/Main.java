package ventanaEstructurada;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class Main {

	public static void main(String[] args) {
		JFrame frame = new JFrame ();
		JLabel label = new JLabel();
		JButton button = new JButton();
		button.setText("Usseless Button");
		button.setSize(40, 50);
		label.setText("Hidden Text");
		frame.setTitle("this is a stupid window");
		frame.add(label);
		frame.add(button);
		button.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "Boooo!!!");

			}});
		frame.setSize(800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		

	}

}
