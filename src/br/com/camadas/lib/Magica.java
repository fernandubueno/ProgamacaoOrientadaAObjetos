package br.com.camadas.lib;

import javax.swing.JOptionPane;

public class Magica {
	
	//metodo para simplificar o JOptionPane
	public static String s(String msg) {
		return JOptionPane.showInputDialog(msg).toUpperCase();
	}
	
	//metodo para simplificar o JOptionPane inteiro
	public static int i(String msg) {
		return Integer.parseInt(s(msg));
	}
	
	public static float f(String msg) {
		return Float.parseFloat(s(msg));
	}

}
