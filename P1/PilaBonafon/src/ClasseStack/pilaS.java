/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasseStack;

import java.util.Scanner;
import java.util.Stack;
import javax.swing.JOptionPane;

/**
 *
 * @author allem
 */
public class pilaS {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		
		Stack<String> pila = new Stack<>();

		int a = Integer.parseInt(JOptionPane.showInputDialog("Introduce tamaño de la pilar"));

		String nom;
		String var;
		boolean b = true;
		JOptionPane.showMessageDialog(null, "La pila tiene un tamaño inicial de " + a);

		for (int i = 0; i < a; i++) {

			nom = JOptionPane.showInputDialog("Introduce caracter " + (i + 1) + ": ");
			pila.push(nom);
		}
		JOptionPane.showMessageDialog(null, pila);
		
		while (b==true)  {
			var = JOptionPane.showInputDialog("¿Que decea hacer?\n" + "1.- Agregarl\n"
					+ "2.- Borrar\n" + "3.- Motasr\n"+"4.-Salir");
			int var1 = Integer.parseInt(var);
			switch (var1) {
				case 1:
					nom = JOptionPane.showInputDialog("Introduce caracter ");
					pila.push(nom);
					JOptionPane.showMessageDialog(null, pila);
					break;
				case 2:
					JOptionPane.showMessageDialog(null, "Elimina elemento de la pila\n " + pila);
					pila.pop();
					JOptionPane.showMessageDialog(null,"Ultimo valor eliminado" +pila);
					break;
				case 3:
					JOptionPane.showMessageDialog(null, "Los elementos de la pila son\n" + pila);
					break;
				case 4:
					JOptionPane.showMessageDialog(null, "Salir");
					b=false;
					break;
						
			}
		} 
		
		
		
	}
}
