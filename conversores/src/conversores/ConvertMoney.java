package conversores;

import javax.swing.JOptionPane;

public class ConvertMoney {
	public static void main(String[] args) {
		
	
int salida = 0;
Double pesos;
Double conversion;
Double resultado;
Double temperatura;
Double redondeo;

do {
	String conversiones = (JOptionPane.showInputDialog(null, "Seleccione una opcion de conversion :","Conversiones de Convert Money",
			JOptionPane.PLAIN_MESSAGE,null,new Object[] {"MONEDAS", "TEMPERATURA"},
			"Selecciona")).toString();		

	if ("MONEDAS".equals(conversiones)) {
		pesos = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad que desea convertir :"));
		String numero = (JOptionPane.showInputDialog(null,"A que moneda deseas convertirlo :","Moneda",
				JOptionPane.PLAIN_MESSAGE,null,new Object[] {"De Pesos a Dolar", "De Pesos a Euros", "De Pesos a Libras Esterlinas", "De Pesos a Yen Japones", "De Pesos a Won Surcoreano",
															 "De Dolar a Pesos", "De Euros a Pesos", "De Libras Esterlinas a Pesos", "De Yen Japones a Pesos", "De Won Surcoreano a Pesos"},
															 "Selecciona")).toString();
	
		if ("De Pesos a Dolar".equals(numero)) {
			conversion = 16.76;
			resultado = pesos/conversion;
			JOptionPane.showMessageDialog(null,"Tienes $"+String.format("%.2f", resultado) +" Dolares");
		}
		if ("De Pesos a Euros".equals(numero)) {
			conversion = 18.84;
			resultado = pesos/conversion;
			JOptionPane.showMessageDialog(null,"Tienes $"+String.format("%.2f", resultado) +" Euros");
		}
		if ("De Pesos a Libras Esterlinas".equals(numero)) {
			conversion = 21.92;
			resultado = pesos/conversion;
			JOptionPane.showMessageDialog(null,"Tienes $"+String.format("%.2f", resultado) +" Libras Esterlinas");
		}
		if ("De Pesos a Yen Japones".equals(numero)) {
			conversion = 8.28;
			resultado = pesos*conversion;
			JOptionPane.showMessageDialog(null,"Tienes $"+String.format("%.2f", resultado) +" Yenes");
		}
		if ("De Pesos a Won Surcoreano".equals(numero)) {
			conversion = 75.48;
			resultado = pesos*conversion;
			JOptionPane.showMessageDialog(null,"Tienes $"+String.format("%.2f", resultado) +" Wones");
		}
		if ("De Dolar a Pesos".equals(numero)) {
			conversion = 16.76;
			resultado = pesos*conversion;
			JOptionPane.showMessageDialog(null,"Tienes $"+String.format("%.2f", resultado) +" Pesos");
		}
		if ("De Euros a Pesos".equals(numero)) {
			conversion = 18.84;
			resultado = pesos*conversion;
			JOptionPane.showMessageDialog(null,"Tienes $"+String.format("%.2f", resultado) +" Pesos");
		}
		if ("De Libras Esterlinas a Pesos".equals(numero)) {
			conversion =21.92;
			resultado = pesos*conversion;
			JOptionPane.showMessageDialog(null,"Tienes $"+String.format("%.2f", resultado) +" Pesos");
		}
		if ("De Yen Japones a Pesos".equals(numero)) {
			conversion =.12;
			resultado = pesos*conversion;
			JOptionPane.showMessageDialog(null,"Tienes $"+String.format("%.2f", resultado) +" Pesos");
		}
		if ("De Won Surcoreano a Pesos".equals(numero)) {
			conversion =.013;
			resultado = pesos*conversion;
			JOptionPane.showMessageDialog(null,"Tienes $"+String.format("%.2f", resultado) +" Pesos");
		}else {
			salida =JOptionPane.showConfirmDialog(null," Alguna otra operacion ?");	
			switch(salida) {
			
				case 1:
				JOptionPane.showMessageDialog(null,"Programa Finalizado ");
				break;
			    case 2:
				JOptionPane.showMessageDialog(null,"Programa Finalizado ");
				break;
				
			}			
			
		}
		
		
	}	//monedas
	
	
	
}while(salida <1);


		

		
		
		
		
}
}
