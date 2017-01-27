
public class DLinkedListCir {
	
	protected Nodo acces;
	protected long size;
	
	public DLinkedListCir(){
		acces=null;
		size=0;		
	}
	
	public boolean EstaVacio(){
		return (acces==null && size==0);
	}
	
	public void insertarNodo(Nodo a){
        if(EstaVacio()){
        		acces=a;
        		size=1;
        }
        else if(size==1) {   
        	a.setSiguiente(acces);
        	acces.setAnterior(a);
        	
        	acces.setSiguiente(a);
        	a.setAnterior(acces);
        	size++;
        }
        else{
        	a.setSiguiente(acces);
        	a.setAnterior(acces.getAnterior());
        	
        	acces.getAnterior().setSiguiente(a);
        	acces.setAnterior(a);
        	
        	size ++;
        } 
      }
	
	public Nodo BuscarNodo(String clave){
        if (!EstaVacio()){
        	if(size==1){
        		if (clave.equalsIgnoreCase(acces.getDato()))
                    return acces;
					else
						return null;
        	}
        	else{
                   Nodo aux = acces;
                   while (aux.getSiguiente() != acces){
                               if (clave.equalsIgnoreCase(aux.getDato())){
                                           return aux;
                                           }else{
                                                       aux = aux.getSiguiente();
                                           }
                               }
                   }
        	return null;
        }
        else
        	return null;
        }
	
		
		public int BuscarIndice(String clave){
			int indice=1;
	        if (!EstaVacio()){
	        	if(size==1){
	        		if (clave.equalsIgnoreCase(acces.getDato()))
	                    return 1;
						else
							return 0;
	        	}
	        	else{
	                   Nodo aux = acces;
	                   while (aux.getSiguiente() != acces){   			
	                               if (clave.equalsIgnoreCase(aux.getDato())){
	                                           return indice;
	                                           }else{
	                                                       aux = aux.getSiguiente();
	                                                       indice++;
	                                           }
	                               }
	                   }
	        return 0;
	        }
	        else
	        	return 0;
	        }
		
		public void eliminarNodo(String clave){
	        if (!EstaVacio()){
	                   Nodo aux = acces;
	                   Nodo ant = null;
	                   while (aux.getSiguiente() != acces){
	                               if (clave.equalsIgnoreCase(aux.getDato())){
	                                           if (ant == null){
	                                        	   acces = acces.getSiguiente();
	                                                       aux.setSiguiente(null);
	                                                       aux= acces;
	                                           }else {
	                                                       ant.setSiguiente(aux.getSiguiente());
	                                                       aux.setSiguiente(null);
	                                                       aux = ant.getSiguiente();
	                                           }   
	                                           size--;
	                                           }else{
	                                                       ant = aux;
	                                                       aux = aux.getSiguiente();
	                                           }
	                               }
	                   }
	        }
		
		public void RecorrerAcces(int n){
			for(int i=0; i<n; i++)
				acces= acces.getSiguiente();
		}
	
	
	@Override
	public String toString() {
		String lista="";
		Nodo aux=acces;
		lista+=aux.getDato()+"\n";
		while(aux.getSiguiente()!=acces){
			lista+=aux.getSiguiente().getDato()+"\n";
			aux=aux.getSiguiente();
		}	
		lista+="Tamanio de Lista: "+size;
		return lista;
	}

}
