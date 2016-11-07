import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

 public class Teclado extends KeyAdapter{
 	
 		public void keyPressed(KeyEvent e){
 		    switch(e.getKeyCode()){
		    	case 39:	// -> Right 
		    				//if it's not the opposite direction
		    				if(TController.directionSnake!=2) 
		    					TController.directionSnake=1;
		    			  	break;
		    	case 38:	// -> Top
							if(TController.directionSnake!=4) 
								TController.directionSnake=3;
		    				break;
		    				
		    	case 37: 	// -> Left 
							if(TController.directionSnake!=1)
								TController.directionSnake=2;
		    				break;
		    				
		    	case 40:	// -> Bottom
							if(TController.directionSnake!=3)
								TController.directionSnake=4;
		    				break;
		    	
		    	default: 	break;
 		    }
 		}
 	
 }
