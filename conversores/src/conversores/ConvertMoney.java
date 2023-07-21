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
			
		
	}	//monedas
	
	
	
}while(salida <1);


		

		
		
		
		
}
}
