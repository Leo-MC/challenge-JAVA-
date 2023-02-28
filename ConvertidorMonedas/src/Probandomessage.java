import javax.swing.JOptionPane;

public class Probandomessage {
	public static boolean validarNumeros(String datos) {
		return datos.matches("[0-9]*");
	}
	public static void main(String[] args) {
		String dinero1 = JOptionPane.showInputDialog("Ingrese la cantidad de dinero");
		JOptionPane.showMessageDialog(null, dinero1);
		if (!validarNumeros(dinero1)) {
			JOptionPane.showMessageDialog(null, "Ingrese solo numeros");
		}else {
			
		}
	}
}
