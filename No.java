package listaduplaEncadeada;

public class No {
	private Integer elemento;
	private No proximo, anterior;
	
	public No(Integer elemento, No anterior, No proximo) {
		this.elemento = elemento;
		this.anterior = anterior;
		this.proximo = proximo;
	}

	public Integer getElemento() {
		return elemento;
	}

	public void setElemento(Integer elemento) {
		this.elemento = elemento;
	}

	public No getProximo() {
		return proximo;
	}

	public void setProximo(No proximo) {
		this.proximo = proximo;
	}

	public No getAnterior() {
		return anterior;
	}

	public void setAnterior(No anterior) {
		this.anterior = anterior;
	}
	
	
}
