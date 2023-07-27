package com.Conversor.conversor;


import javax.swing.JOptionPane;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConversorApplication {

	public static void main(String[] args) {
	
	
	String tipe=(String)JOptionPane.showInputDialog(null,"Seleccione la Funcion","Tipo",JOptionPane.QUESTION_MESSAGE,
				null,new Object[] {"Sleccione","1:conertir soles a Dolares","2: conertir soles a Euros","3: conertir soles a Libras Esterlinas"
						,"4 : conertir soles a Yen Japones","5 : conertir soles a Won sur.coreano","6 : conertir de Dolares a Sol","7 : conertir de Euros a Sol","8 : conertir de Libras Esterlinas a Sol"
						,"9 : conertir de Yen Japones a Sol","10 : conertir de Won sur.coreano a Sol"},"seleccione");
		System.out.println("este es el tipo " +tipe);
		double Value =Double.parseDouble(JOptionPane.showInputDialog("ingrese el primer valor : "));
		
		
		
	}
	 private double converter(double value,String tipe) {
		 
		 return  value;
	 }
}
