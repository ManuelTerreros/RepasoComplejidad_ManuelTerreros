package co.edu.unbosque.view;

import java.util.Date;
import java.util.Scanner;

import javax.swing.JFrame;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Vista extends JFrame{
	
	private Scanner sc;

	
	public Vista () {
		//setResizable(false);
		// TODO Auto-generated constructor stub
	    sc = new Scanner(System.in);
	    setTitle("Lista de Personas");
	    setResizable(false);
	    setVisible(true);
	    setLocationRelativeTo(null);
	    
	    inicarComponentes();
	}
	
	public void inicarComponentes() {
		
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("New button");
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		panel.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("Lista de Personas");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		getContentPane().add(lblNewLabel, BorderLayout.NORTH);
		
	}
	public void message(String msg) {
		System.out.println(msg);
	}
	public String insertarString() {
		String s = sc.nextLine();
		return s;
	}
	
	public int  insertarInt() {
		int n = sc.nextInt();
		return n;
	}
	
	public int insertarDate(Date fecha) {
		int fe = sc.nextInt();
		return fe;
	}
	
	public double insertarDouble() {
		double num = sc.nextDouble();
		return num;
	}
}
