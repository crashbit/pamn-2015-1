// Maneja un actionListener en el layout para un boton

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Layout extends JFrame implements ActionListener{
	// Creamos un boton y una caja de texto
	JButton boton = new JButton("Da un click");
	JTextField texto = new JTextField(20);
	int totalClicks = 0;
	
	public Layout(){
		setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));
		// Agregamos los componentes a la ventana
		add(boton);
		add(texto);

		// Ponemos al boton a escuchar clicks
		boton.addActionListener(this);
	}

	// Cuando haya un click en el boton
	public void actionPerformed(ActionEvent e){
		totalClicks = totalClicks + 1;
		texto.setText("Se presiono el boton: " + totalClicks + " veces"); 
	}

	public static void main(String args[]){
		Layout test = new Layout();
		test.setTitle("Titulo 2");
		test.setSize(400, 200);
		test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		test.setVisible(true);
	}
}