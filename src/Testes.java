import java.util.List;

public class Testes {
	
	/*
	 *  MÉTODO DE TESTE QUE VERIFICA SE A LISTA ESTÁ VÁZIA
	 */
	
	public Boolean TestaListaVazia(List restaurante){
		
		if (restaurante.size() > 0 ){
			return true;
		} else {
			return false;
		}
		
	}
	
	/*
	 *  MÉTODO TESTA VALORES REPETIDOS
	 */
	
	public Boolean TestaValoresRepetidos(List restaurante){
		
		Boolean duplicates=false;
		//System.out.println(restaurante);
		if (restaurante.size() > 0 ){
			for (int j=0;j<restaurante.size();j++){
				
			  //System.out.println("J - " + restaurante.get(j).toString());
			  for (int k=j+1;k<restaurante.size();k++){	
				  //System.out.println("K - " + restaurante.get(k).toString());	
				  
			      //System.out.println("J" + restaurante.get(j).toString());	
				  //if (k!=j && restaurante.get(k) == restaurante.get(j)){
				  if (restaurante.get(j).equals(restaurante.get(k))){
						  duplicates=true;
						  //return true;
						  System.out.println("O Restaurante " + restaurante.get(j).toString()  + " está repetido!");
				    }
			  }
			}  
			if (duplicates == true){
				return true;           //VALORES REPETIRAM
			}else {
				return false;		    //VALORES NÃO REPETIRAM		
			}
		} else { 
			System.out.println("Arquivo com problema!");
			return null;
		}
	}


}
