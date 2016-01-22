import java.io.IOException;
import java.util.List;
import java.util.Random;

public class EscolheRestaurante {
	
	
	
	public static void main(String[] args) throws IOException{
		
		AbreListaRestaurante lista = new AbreListaRestaurante();
		MostraRestaurantes natela = new MostraRestaurantes();
		Testes testes = new Testes();
		SorteiaRestaurante nomeRestaurante = new SorteiaRestaurante();
		
		if (testes.TestaListaVazia(lista.GetListRestaurantes())== true){
			if( testes.TestaValoresRepetidos(lista.GetListRestaurantes()) == false ){
				natela.ImprimeListaRestaurantes(lista.GetListRestaurantes());
				System.out.println("Restaurante escolhido: " + nomeRestaurante.selectRestaurante(lista.GetListRestaurantes()));
			}else{
				System.out.println("Os valores repetiram. Edit o arquivo!");
			} 
		} else {
				System.out.println("A lista está vázia");
			}		
	}	

}
