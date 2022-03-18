import javax.swing.JOptionPane;

public class ResultadoAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	

		
		double media = Double.parseDouble(JOptionPane.showInputDialog(null, "Médiah:"));
		
		if( media >6.0 ) {
			JOptionPane.showMessageDialog(null,
					"aprovadohh!" );
		} else if ( media < 6.0 ) {
			JOptionPane.showMessageDialog(null,
					"reprovadoh");
		} else {
			JOptionPane.showMessageDialog(null,
					"sla mano");
		}
		
		

	}

}
