
public class Nodo {
	private String dato;
	private Nodo siguiente;
	private Nodo anterior;
	
	public Nodo(String d){
		dato=d;
		siguiente= null;
		anterior= null;
		
	}
	
	public Nodo(String c, Nodo a, Nodo b){
		dato=c;
		siguiente=a;
		anterior=b;
	}

	public String getDato() {
		return dato;
	}

	public void setDato(String dato) {
		this.dato = dato;
	}

	public Nodo getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}

	public Nodo getAnterior() {
		return anterior;
	}

	public void setAnterior(Nodo anterior) {
		this.anterior = anterior;
	}

	@Override
	public String toString() {
		return "Nodo [dato=" + dato + "]";
	}
}
