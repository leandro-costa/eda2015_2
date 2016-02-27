
package arvorebalanceada;

/**
 *
 * @author leandro.costa@ifba.edu.br
 */
public class No<T extends Comparable<T>> implements Comparable<No<T>> {
    private T id ;
    private String valor;
    private No noEsquerda;
    private No noDireita;
    

    public No(T id, String valor) {
        this.id = id;
        this.valor = valor;
    }

    public No(T id, String valor, No noEsquerda, No noDireita) {
        this.id = id;
        this.valor = valor;
        this.noEsquerda = noEsquerda;
        this.noDireita = noDireita;
    }
    
    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public No getNoEsquerda() {
        return noEsquerda;
    }

    public void setNoEsquerda(No noEsquerda) {
        this.noEsquerda = noEsquerda;
    }

    public No getNoDireita() {
        return noDireita;
    }

    public void setNoDireita(No noDireita) {
        this.noDireita = noDireita;
    }
    
    
    @Override
	public String toString() {
		return "No [id=" + id + ",HE=" + getAlturaEsquerda() + ",HD=" + getAlturaDireita() + "]";
	}

	public Integer getAlturaEsquerda() {
        Integer alturaFilhoEsquerda = 0;
        if(getNoEsquerda() != null){
            alturaFilhoEsquerda = 1 + getNoEsquerda().getAltura();
        }
        return alturaFilhoEsquerda;
    }

    public Integer getAlturaDireita() {
        Integer alturaFilhoDireita = 0;
        if(getNoDireita() != null){
            alturaFilhoDireita = 1 + getNoDireita().getAltura();
        }
        return alturaFilhoDireita;
    }

    public Integer getAltura() {
        return Math.max(getAlturaDireita(), getAlturaEsquerda());
    }

	@Override
	public int compareTo(No<T> o) {
		// TODO Auto-generated method stub
		return getId().compareTo(o.getId());
	}

    
    
}
