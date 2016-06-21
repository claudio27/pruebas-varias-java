package generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.faces.model.SelectItem;

public class Generics {
	public List<SelectItem> lista2 = new ArrayList<SelectItem>();
	/**
	 * @param args
	 */
	public static void init() {

		List<SelectItem> lista = new ArrayList<SelectItem>();
		
		lista.add(new SelectItem("1","descripcion1"));
		lista.add(new SelectItem("2","descripcion2"));
		lista.add(new SelectItem("3","descripcion3"));
		System.out.println(lista.size());
		
		SelectItem[] selects = lista.toArray(new SelectItem[lista.size()]);
		
		String store = "";
		for(int k = 0; k < selects.length; k++){
			store += selects[k].getLabel() + ",";
		}
		
		System.err.println(store);
		System.err.println(lista.contains(new SelectItem("1","asdfadf")));
		
		System.out.println("**** ***** array ");
		// imprimiendo un array
		for(SelectItem var : selects){
			System.out.println(var.getValue() + ", " + var.getLabel());
		}
		
		//imprimiendo una lista
		System.out.println("**** ***** lista");
		for (Iterator<SelectItem> iterator = lista.iterator(); iterator.hasNext();) {
			SelectItem selectItem = (SelectItem) iterator.next();
			
			System.out.println(selectItem.getValue() +", "+ selectItem.getLabel());
			
		}
		
		System.out.println("**** ***** ******** test");
		String[] test = {"10","45","3","4","0","2"};
		Generics obj = new Generics();
		obj.creaValores();
		System.out.println(obj.getValoresFiltro(test));
		
		
		
	}
	
	public void creaValores(){
		
		lista2.add(new SelectItem("0","desc1"));
		lista2.add(new SelectItem("1","desc2"));
		lista2.add(new SelectItem("2","desc3"));
		
		System.err.println(lista2.size());
	}
	
	
	public String getValoresFiltro(String[] a){
		
		String resultado = "";
			
		for (int i = 0; i < lista2.size(); i++) {
			for (int j = 0; j < a.length; j++) {
				if(a[j].equals(lista2.get(i).getValue())) // filtro para sacar los datos que corresponden
					resultado += lista2.get(i).getLabel() + ", ";
			}
			
		}
	return resultado;
	
	}
	

}
