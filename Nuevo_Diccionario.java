import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class Nuevo_Diccionario {
	Map<String, Integer> mp = new HashMap<>();
	public Map diccionario(String ciudad){
		
		if(ciudad.toLowerCase().equals("quito")) {
			int totalConsumo = 0;
			int [] consumos = {400, 432, 400, 432, 420, 432, 460, 432, 400, 432, 300 , 213};
			for (int i = 0; i < consumos.length; i++) {
				totalConsumo += consumos[i];
			}
			mp.put("Coca Codo Sinclair", totalConsumo);
			int totalconsumo = 0;
			int [] consumos1 = {400, 432, 587, 400, 432, 587, 400, 432, 587, 400, 432, 587};
			for (int i = 0; i < consumos1.length; i++) {
				totalconsumo += consumos1[i];
			}
			mp.put("Sopladora", totalconsumo);			
			return mp;
		}
		

		if(ciudad.toLowerCase().equals("guayaquil")) {
			int totalConsumo = 0;
			int [] consumos = {120, 55, 32, 120, 75, 32, 150, 55, 32, 120, 97, 32};
			for (int i = 0; i < consumos.length; i++) {
				totalConsumo += consumos[i];
			}
			mp.put("Coca Codo Sinclair", totalConsumo);
			int totalconsumo = 0;
			int [] consumos1 = {310, 220, 321, 310, 220, 321, 310, 220, 321, 310, 220, 321};
			for (int i = 0; i < consumos1.length; i++) {
				totalconsumo += consumos1[i];
			}
	
			mp.put("Sopladora", totalconsumo);
			return mp;
		}
		
		if(ciudad.toLowerCase().equals("loja")) {
			int totalConsumo = 0;
			int [] consumos = {50, 32, 32, 50, 32, 32, 50, 32, 32, 50, 32, 32};
			for (int i = 0; i < consumos.length; i++) {
				totalConsumo += consumos[i];
			}
			
			mp.put("Sopladora", totalConsumo);
			return mp;
		}
		
		else {
			mp.put("No existe una planta de energia para esta cuidad", 0);
		}
		return mp;
		
	}
	@Override
	public String toString() {
		Iterator iter = mp.entrySet().iterator();
		while (iter.hasNext()) {
		    Map.Entry entry = (Map.Entry) iter.next();
		    return "Key : " + entry.getKey() + "Value : " + entry.getValue();
		}
		return "";
	}
}
