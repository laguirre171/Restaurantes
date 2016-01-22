import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AbreListaRestaurante {
	
	public List GetListRestaurantes() throws FileNotFoundException{
		
		List restaurante = new ArrayList();	
		File file = new File("c:\\arquivo.txt"); //CAMINHO NOME ARQUIVO RESTAURANTES
		try {
			Scanner sc = new Scanner(file);	//ABRE ARQUIVO COM NOME DOS RESTAURANTES
			
			int qtddLinhas = 1; //CONTA QUANTIDADE DE LINHAS  
				
			while (sc.hasNextLine()) {
				restaurante.add(sc.nextLine()); // ADICIONA OS VALORES 
				//System.out.println(sc.nextLine());
				//qtddLinhas++;  //INCREMENTA CONTADOR DE RESTAURANTES		
			}
			return restaurante;	
		} catch(IOException ioe) {
			System.out.println("Arquivo não encontrado!");
            return null;
            }          
	}

}
