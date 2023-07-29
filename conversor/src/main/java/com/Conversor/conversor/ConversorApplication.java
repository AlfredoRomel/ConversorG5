package com.Conversor.conversor;


import java.text.DecimalFormat;

import javax.swing.JOptionPane;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConversorApplication {

	public static void main(String[] args) {
	
		Iniciar();
		
	}
	
	private static void Iniciar() {
		String selectOperator =(String) JOptionPane.showInputDialog(null,"Seleccione","tipo",JOptionPane.QUESTION_MESSAGE,
				null,new Object[] {"Seleccione el Operador","1.-Coneversor de Temperatura",
							"2.-Conversor de Moneda"},"Seleccione");
		
		OperadorSeleccionado(Integer.parseInt(selectOperator.substring(0,1)));
	}

	public static double PedirValor(){	
		Double Value =Double.parseDouble(JOptionPane.showInputDialog("ingrese el primer valor : "));
		return Value;
	}
		
	
	 private static void OperadorSeleccionado(Integer selectOperator) {
		 switch (selectOperator) {
		case 1: {
			SelectorTemperatura();
			
		}
		case 2:{
			SelectorMoneda();
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + selectOperator);
		}
		
	}
	private static void SelectorMoneda() {
		String tipeMoneda=(String)JOptionPane.showInputDialog(null,"Seleccione la Funcion","Tipo",JOptionPane.QUESTION_MESSAGE,
				null,new Object[] {"Seleccione","1:conertir soles a Dolares","2: conertir soles a Euros","3: conertir soles a Libras Esterlinas"
						,"4 : conertir soles a Yen Japones","5 : conertir soles a Won sur.coreano","6 : conertir de Dolares a Sol","7 : conertir de Euros a Sol","8 : conertir de Libras Esterlinas a Sol"
						,"9 : conertir de Yen Japones a Sol","10 : conertir de Won sur.coreano a Sol"},"seleccione");
		double resultado= OperadorMoneda(Integer.parseInt(tipeMoneda.substring(0,1)));
		MostarResultado(resultado);
	}

	

	private static void SelectorTemperatura() {
		String  tipeTemperatura=(String)JOptionPane.showInputDialog(null,"Selecciona la Funcion","Tipo",JOptionPane.QUESTION_MESSAGE,
				null,new Object[] {"Seleccione","1: Celcius a farenheit","2: celcius a Kelvin","3: farenheit a celcius","4:kelvin a celcius"
						,"5: farenheit a kelvin","6:kelvin a farenheit"},"seleccione");
		double resultado =OperadorTemperatura(Integer.parseInt(tipeTemperatura.substring(0,1)));
		MostarResultado(resultado);
	}
	
	
	
	private static void MostarResultado(double resultado) {
		DecimalFormat formato = new DecimalFormat("#.000");
		JOptionPane.showMessageDialog(null,"El resultado es:"+formato.format(resultado));
		Iniciar();		
	}

	private static double OperadorTemperatura(int tp) {
		
		double valor = PedirValor();
		double resultado=0;
		
		switch (tp) {
		case 1: {
			return resultado= (valor*1.8)+32;
		}
		case 2:{
			return resultado = valor+273;
		}
		case 3: {
			
			return resultado = (valor-32)/1.8;
		}
		case 4:{
			return resultado = valor-273;
			
		}
		case 5: {			
			return resultado = ((valor*1.8)+32)+273;
			
		}
		case 6:{
			return resultado = ((valor-273)-32/1.8);
		}
		default:
			throw new IllegalArgumentException("Unexpected value: "+resultado);
		}
		
	}
	private static double OperadorMoneda(int tm) {
		double valor = PedirValor();
		double resultado=0;
		
		switch (tm) {
		case 1: {
			return resultado= valor/3.5;
		}
		case 2:{
			return resultado = valor/3.96;
		}
		case 3: {
			
			return resultado = valor/4.61;
		}
		case 4:{
			return resultado = valor*39.39;
			
		}
		case 5: {			
			return resultado = valor*355.33;
			
		}
		case 6: {
			return resultado= valor*3.5;
		}
		case 7:{
			return resultado = valor*3.96;
		}
		case 8: {
			
			return resultado = valor*4.61;
		}
		case 9:{
			return resultado = valor/39.39;
			
		}
		case 10: {			
			return resultado = valor/355.33;
			
		}
		default:
			throw new IllegalArgumentException("Unexpected value: "+resultado);
		}
	}
	
}
