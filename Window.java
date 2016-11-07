import java.awt.GridLayout;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JFrame;


class Window extends JFrame{
	private static final long serialVersionUID = -2542001418764869760L;
	public static ArrayList<ArrayList<Datos>> Grid;
	public static int width = 20;
	public static int height = 20;
	public Window(){
		
		
		Grid = new ArrayList<ArrayList<Datos>>();
		ArrayList<Datos> data;
		
		for(int i=0;i<width;i++){
			data= new ArrayList<Datos>();
			for(int j=0;j<height;j++){
				Datos c = new Datos(2);
				data.add(c);
			}
			Grid.add(data);
		}
		
		getContentPane().setLayout(new GridLayout(20,20,0,0));
		
		for(int i=0;i<width;i++){
			for(int j=0;j<height;j++){
				getContentPane().add(Grid.get(i).get(j).square);
			}
		}
		
		Tuple position = new Tuple(10,10);
		TController c = new TController(position);
		c.start();

		this.addKeyListener((KeyListener) new Teclado());

		
		
	}
}
