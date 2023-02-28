import javax.swing.JOptionPane;

public class JOptionDialog {
	public static boolean validarNumeros(String datos) {
		return datos.matches("[0-9]*");
	}
	public static void main(String[] args) {	
		String opcion1 = (JOptionPane.showInputDialog(null, "Seleccione una opcion de conversion", "Conversor", JOptionPane.PLAIN_MESSAGE, null, new Object [] {"Conversor de Temperatura", "Conversor de Monedas"}, "selecciona")).toString();
		if (opcion1 == "Conversor de Monedas") {
			while (true) {
				String dinero1 = JOptionPane.showInputDialog("Ingrese la cantidad de dinero");
				if (!validarNumeros(dinero1)) {
					JOptionPane.showMessageDialog(null, "Ingrese solo numeros");
					continue;
				}else {
					double dinero = Double.parseDouble(dinero1);
					String opcion3 = (JOptionPane.showInputDialog(null, "Elije la moneda a la que deseas convertir tu dinero", "Monedas", JOptionPane.PLAIN_MESSAGE, null, new Object [] {"de soles a dolares", "de soles a euros", "de soles a pesos mexicanos","de soles a pesos colombianos"}, "selecciona")).toString();
					String moneda = null;
					switch (opcion3) {
					case "de soles a dolares":
						dinero = dinero*0.26;
						moneda = "dolares";
						break;
					case "de soles a euros":
						dinero = dinero*0.25;
						moneda = "euros";
						break;
					case "de soles a pesos mexicanos":
						dinero = dinero*4.84;
						moneda = "pesos mexicanos";
						break;
					case "de soles a pesos colombianos":
						dinero = dinero*1277.52;
						moneda = "pesos colombianos";
						break;
					}
					JOptionPane.showMessageDialog(null, "Tienes " + dinero + " " + moneda);
					break;
				}	
			}
		}else if(opcion1 == "Conversor de Temperatura"){
			while (true) {
				String temperatura1 = JOptionPane.showInputDialog("Ingrese la temperatura que deseas convertir");
				if (!validarNumeros(temperatura1)) {
					JOptionPane.showMessageDialog(null, "Ingrese solo numeros");
					continue;
				}else {
					String opcion2 = (JOptionPane.showInputDialog(null, "Elije la Unidad de temperatura que tienes", "Conversor", JOptionPane.PLAIN_MESSAGE, null, new Object [] {"Kelvin", "Celsius", "Rankine", "Fahrenheit"}, "selecciona")).toString();
					double temperatura = Double.parseDouble(temperatura1);
					switch (opcion2) {
					case "Kelvin":
						String opcion4 = (JOptionPane.showInputDialog(null, "Elije la Unidad de temperatura a la que deseas convertir", "Conversor", JOptionPane.PLAIN_MESSAGE, null, new Object [] {"Celsius", "Rankine", "Fahrenheit"}, "selecciona")).toString();
						switch (opcion4) {
						case "Celsius":
							temperatura = temperatura-273.15;
							break;
						case "Rankine":
							temperatura = temperatura*1.8;
							break;
						case "Fahrenheit":
							temperatura = (temperatura - 273.15)*9/5 + 32;
							break;
						default:
							System.out.println("opcion incorrecta");
							break;
						}
						break;
					case "Celsius":
						opcion4 = (JOptionPane.showInputDialog(null, "Elije la Unidad de temperatura a la que deseas convertir", "Conversor", JOptionPane.PLAIN_MESSAGE, null, new Object [] {"Kelvin", "Rankine", "Fahrenheit"}, "selecciona")).toString();
						switch (opcion4) {
						case "Kelvin":
							temperatura = temperatura + 273.15;
							break;
						case "Rankine":
							temperatura = temperatura*9/5 + 491.67;
							break;
						case "Fahrenheit":
							temperatura = temperatura*9/5 + 32;
							break;
						default:
							System.out.println("opcion incorrecta");
							break;
						}
						break;
					case "Rankine":
						opcion4 = (JOptionPane.showInputDialog(null, "Elije la Unidad de temperatura a la que deseas convertir", "Conversor", JOptionPane.PLAIN_MESSAGE, null, new Object [] {"Kelvin", "Celsius", "Fahrenheit"}, "selecciona")).toString();
						switch (opcion4) {
						case "Kelvin":
							temperatura = temperatura*5/9;
							break;
						case "celsius":
							temperatura = (temperatura-491.67)*5/9;
							break;
						case "Fahrenheit":
							temperatura = temperatura -459.67;
							break;
						default:
							System.out.println("opcion incorrecta");
							break;
						}
						break;
					case "Fahrenheit":
						opcion4 = (JOptionPane.showInputDialog(null, "Elije la Unidad de temperatura a la que deseas convertir", "Conversor", JOptionPane.PLAIN_MESSAGE, null, new Object [] {"Kelvin", "Celsius", "Rankine"}, "selecciona")).toString();
						switch (opcion4) {
						case "Kelvin":
							temperatura = (temperatura-32)*5/9 + 273.15;
							break;
						case "celsius":
							temperatura = (temperatura-32)*5/9;
							break;
						case "Rankine":
							temperatura = temperatura + 459.67;
							break;
						default:
							System.out.println("opcion incorrecta");
							break;
						}
						break;
					default:
						System.out.println("opcion incorrecta");
						break;
					}			
					JOptionPane.showMessageDialog(null,"La temperatura es " + temperatura);	
					break;
				}
			}
		}	
	}
}
