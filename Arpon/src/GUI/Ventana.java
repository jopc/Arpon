/*
 * Autor:   Jesus Omar Perez Camargo
 * Clase:   Ventana
 * Detalle: Esta clase contiene la estructura de la ventana
 * 			asi como los disparadores de esta. 
 */
package GUI;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JToolBar;


public class Ventana extends JFrame implements ActionListener
{
	private static final long serialVersionUID = 1L;
	private JToolBar Barra;
	private JButton Capturar;
	private JButton Ejecutar;
	private JButton Manual;
	private JButton Acerca;
	private JLabel Etiqueta;
	private ImageIcon ImagenCapturar;
	private ImageIcon ImagenEjecutar;
	private ImageIcon ImagenManual;
	private ImageIcon ImagenAcerca;
	private Image Icono;
	
	
	public Ventana()
	{
		setTitle("Arpon");
		setSize(300,300);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Icono = new ImageIcon(getClass().getResource("Icono.jpg")).getImage();
		setIconImage(Icono);
		contenido();
		setResizable(false);
		setVisible(true);		
	}
	private void contenido()
	{   
		barraHerramientas();
		centro();
	}
	private void barraHerramientas()
	{
		Barra = new JToolBar("Barra");
		Capturar = new JButton();
		ImagenCapturar = new ImageIcon("imagenes/Capturar.png");
		Capturar.setIcon(ImagenCapturar);
		Capturar.addActionListener(this);
		Ejecutar = new JButton();
		ImagenEjecutar = new ImageIcon("imagenes/Ejecutar.png");
		Ejecutar.setIcon(ImagenEjecutar);
		Ejecutar.addActionListener(this);
		Manual = new JButton();
		ImagenManual = new ImageIcon("imagenes/Manual.png");
		Manual.setIcon(ImagenManual);
		Manual.addActionListener(this);
		Acerca = new JButton();
		ImagenAcerca = new ImageIcon("imagenes/Acerca.png");
		Acerca.setIcon(ImagenAcerca);
		Acerca.addActionListener(this);
		Barra.add(Capturar);
		Barra.add(Ejecutar);
		Barra.add(Manual);
		Barra.add(Acerca);
		Barra.addSeparator(new Dimension(44, 30));
		Barra.setFloatable(false);
		getContentPane().add(Barra);
	}
	private void centro()
	{
		Etiqueta = new JLabel("<html><center><br/>Bienvenido<br/>a<br/>Arpon</center></html>");
		Etiqueta.setFont(new Font("Monospace",Font.BOLD,30));
		add(Etiqueta);		
	}
	public static void main(String args[])
	{
		new Ventana();
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()== Capturar)
		{
			JOptionPane.showMessageDialog(null, "Capturar", "Acerca",JOptionPane.INFORMATION_MESSAGE);
		}
		if(e.getSource()== Ejecutar)
		{
			JOptionPane.showMessageDialog(null, "Ejecutar", "Acerca",JOptionPane.INFORMATION_MESSAGE);
		}
		if(e.getSource()== Manual)
		{
			JOptionPane.showMessageDialog(null, "Manual", "Acerca",JOptionPane.INFORMATION_MESSAGE);
		}
		if(e.getSource()== Acerca)
		{
			Etiqueta.setText("<html><center><br/>Desarrollado por<br/>Backbone</center></html>");
			Etiqueta.setFont(new Font("Monospace",Font.BOLD,20));
		}
	}
}
