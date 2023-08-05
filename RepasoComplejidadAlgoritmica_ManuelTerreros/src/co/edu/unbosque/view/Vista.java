package co.edu.unbosque.view;

import java.util.Date;
import java.util.Scanner;

public class Vista {
	
	private Scanner sc;
	
	public Vista() {
		// TODO Auto-generated constructor stub
	    sc = new Scanner(System.in);
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
