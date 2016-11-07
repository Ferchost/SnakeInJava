import java.awt.Color;
import javax.swing.JPanel;

public class Cuadrado extends JPanel{
	
	private static final long serialVersionUID = 1L;

	public Cuadrado(Color d){
		this.setBackground(d);
	}
	
	public void ChangeColor(Color d){
		this.setBackground(d);
		this.repaint();
	}
	
}

