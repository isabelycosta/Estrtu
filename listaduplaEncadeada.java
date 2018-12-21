package listaduplaEncadeada;

public class listaduplaEncadeada {
	private No header;
	private No trailer;
	
	private int tamanho;
	
	public listaduplaEncadeada(){
		header = new No (null,null,null);
		trailer = new No (null,header,null);
		header.setProximo(trailer);
		
		tamanho = 0;
	}
	
	public void insereInicio(No novoNo) {
		
		No primeiroNoAntesInsercao = header.getProximo();
		
		novoNo.setAnterior(header);
		header.setProximo(novoNo);
		
		novoNo.setProximo(primeiroNoAntesInsercao);
		
		primeiroNoAntesInsercao.setAnterior(novoNo);
		
		tamanho++;
		
	}
	
	public void insereFinal(No novoNo) {
		
		trailer.getAnterior().setProximo(novoNo);
		
		novoNo.setAnterior(trailer.getAnterior());
		novoNo.setProximo(trailer);
		
		trailer.setAnterior(novoNo);
		
		tamanho++;
	}
	
	public Integer removeInicio() {
		
		if (tamanho==0) {
			System.out.println("Nao ha elementos para remocao");
			return null;
		}
		
		No noRemovido = header.getProximo();
		header.setProximo(noRemovido.getProximo());
		noRemovido.getProximo().setAnterior(header);
		
		noRemovido.setProximo(null);
		noRemovido.setAnterior(null);
		
		tamanho--;
		
		return noRemovido.getElemento();
		
	}
	
	public Integer removeFim() {
		
		if (tamanho==0) {
			System.out.println("Nao ha elementos para remocao");
			return null;
		}
		
		No noRemovido = trailer.getAnterior();
		
		trailer.setAnterior(noRemovido.getAnterior());
		noRemovido.getAnterior().setProximo(trailer);
		
		
		noRemovido.setProximo(null);
		noRemovido.setAnterior(null);
		
		tamanho--;
		
		return noRemovido.getElemento();
	}
	
	public void imprimiLista() {
		
		if (tamanho==0) {
			System.out.println("Nao ha elementos para impressao");
			return;
		}
		
		No aux = header;
		
		while (aux != null) {
			System.out.print(aux.getElemento() + "<=>");
			aux = aux.getProximo();
		}
		
		System.out.println();
	}

}

	