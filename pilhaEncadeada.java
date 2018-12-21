package pilhaEncadeada;

public class pilhaEncadeada {
	
	private No topo;
	private int tamanho;
	
	public pilhaEncadeada() {
		topo = null;
		tamanho = 0;
	}
	
	public void insereTopo(Integer valor) {
		
		if(topo == null) {
			No novoNo = new No(valor, null);
			topo = novoNo;
			tamanho++;
		}
		
		else {
			No novoNo = new No(valor, null);
			
			novoNo.setProximo(topo);
			topo = novoNo;
			tamanho++;
		}
	}
	
	public Integer removeTopo() {
		if(tamanho == 0) {
			System.out.println("Nao ha elemento para remocao!");
			return null;
		}
		
		No noRemovido = topo;
		topo = topo.getProximo();
		noRemovido.setProximo(null);
		tamanho--;
		
		return noRemovido.getElemento();
	}
	
	public void imprimiPilha() {
		No aux = topo;
		
		if(aux == null) {
			System.out.println("Fila vazia");
			return;
		}
		
		while(aux != null) {
			System.out.print(aux.getElemento() +"\t");
			aux = aux.getProximo();
		}
		System.out.println();
	}

}
