
public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nodo a = new Nodo("casa");
		Nodo b = new Nodo("derp");
		Nodo c = new Nodo("pupa");
		Nodo d = new Nodo("casca");
		
		
		DLinkedListCir lista1 = new DLinkedListCir();
		lista1.insertarNodo(a);
		lista1.insertarNodo(b);
		lista1.insertarNodo(c);
		lista1.insertarNodo(d);
		
		System.out.println(lista1);

		
		
		System.out.println(lista1.BuscarNodo("pupa"));
		
		lista1.eliminarNodo("derp");
		
		
		
		
		System.out.println(lista1);

	}

}
