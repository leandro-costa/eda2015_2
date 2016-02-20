
package arvorebalanceada;

/**
 *
 * @author leandro.costa@ifba.edu.br
 */
public class No {
    private Integer id;
    private String valor;
    private No noEsquerda;
    private No noDireita;

    public No(Integer id, String valor) {
        this.id = id;
        this.valor = valor;
    }

    public No(Integer id, String valor, No noEsquerda, No noDireita) {
        this.id = id;
        this.valor = valor;
        this.noEsquerda = noEsquerda;
        this.noDireita = noDireita;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
    
    
    
    
    
}
