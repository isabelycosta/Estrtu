package filaencadeada;

public class filaEncadeada {
	
	private No cabeca;
	private int tamanho;
	
	public filaEncadeada() {
		cabeca = null;
		tamanho = 0;
	}
	
	public Integer removeInicio() {
		if (cabeca == null) {
			System.out.println("Nao ha elemento para remocao");
			return null;
		}
		
		No aux = cabeca;
		
		cabeca = cabeca.getProximo(); //set o novo cabeca
		aux.setProximo(null); //apontar pra nada o aux/cabeca
		tamanho--;
		
		
		return aux.getElemento();
	}
	
	public Integer insereFinal(Integer valor) {
		if(cabeca == null) {
			cabeca = new No(valor, null);
			tamanho++;
			return valor;
		}
		
		getCauda().setProximo(new No(valor, null)); //pegar o ultimo valor e apontar para o null e setar
		tamanho++;
		
		return valor;
	}
	
	public No getCauda() {
		
		No aux = cabeca;
		
		if(aux ==null) {
			return null;
		}
		
		while(aux.getProximo() != null) {
			aux = aux.getProximo(); //aponta para o proximo da fila 
		}
		return aux;
	}
	
	public void imprimiFila() {
		
		No aux = cabeca;
		
		if(aux == null) {
			System.out.println("Fila vazia");
			return;
		}
		while(aux != null) {
			System.out.print(aux.getElemento() + "\t");
			aux = aux.getProximo();
		}
	}

}
