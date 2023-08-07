package co.edu.unbosque.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Prueba extends JFrame {

	private JPanel contentPane;
	private JTextField nombreArea;
	private JTextField nacimientoArea;



	/**
	 * Create the frame.
	 */
	public Prueba() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Listado");
		setResizable(false);
		setLocationRelativeTo(null);
		setBounds(100, 100, 598, 391);
		crearComponentes();
	}
	public void crearComponentes() {
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton botnAgregar = new JButton("Agregar");
		botnAgregar.setBounds(448, 273, 89, 23);
		contentPane.add(botnAgregar);
		
		JButton ordenarLista = new JButton("Ordenar por Fecha");
		ordenarLista.setBounds(402, 239, 135, 23);
		contentPane.add(ordenarLista);
		
		JButton salir = new JButton("Salir");
		salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		salir.setBounds(448, 307, 89, 23);
		contentPane.add(salir);
		
		JLabel titulo = new JLabel("Lista de Personas");
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 30));
		titulo.setBounds(90, 11, 363, 50);
		contentPane.add(titulo);
		
		JTextArea ListaAux = new JTextArea();
		ListaAux.setBounds(307, 72, 230, 156);
		contentPane.add(ListaAux);
		
		JTextArea ListaNormal = new JTextArea();
		ListaNormal.setBounds(53, 72, 230, 156);
		contentPane.add(ListaNormal);
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel.setBounds(53, 255, 126, 23);
		contentPane.add(lblNewLabel);
		
		JLabel fecha = new JLabel("Fecha Nacimiento:");
		fecha.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD | Font.ITALIC, 18));
		fecha.setBounds(53, 307, 157, 23);
		contentPane.add(fecha);
		
		nombreArea = new JTextField();
		nombreArea.setBounds(220, 260, 151, 20);
		contentPane.add(nombreArea);
		nombreArea.setColumns(10);
		
		nacimientoArea = new JTextField();
		nacimientoArea.setColumns(10);
		nacimientoArea.setBounds(220, 312, 151, 20);
		contentPane.add(nacimientoArea);
	}
	
	public void mostrarMsj(int opc) {
		JOptionPane.showInputDialog(opc);
	}
}
