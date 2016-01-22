import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

public class MostraRestaurantes {
	public void ImprimeListaRestaurantes(List restaurante){
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		Calendar cal = Calendar.getInstance();
		
		System.out.println("*** SEGUE LISTA DE RESTAURANTES DO DIA " + cal.getTime() + " ***");
		System.out.println(restaurante);
	}

}
