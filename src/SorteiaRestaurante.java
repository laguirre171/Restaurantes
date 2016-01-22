import java.util.List;
import java.util.Random;

public class SorteiaRestaurante {
	
	public String selectRestaurante(List restaurante){
		
		Random rand = new Random();
	    
	    int indice = rand.nextInt(restaurante.size()); //SELECIONA RANDOMICAMENTE UM DOS RESTAURANTES LISTADOS
	    return restaurante.get(indice).toString();   
		
	}

}
