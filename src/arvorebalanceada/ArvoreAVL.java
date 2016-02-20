
package arvorebalanceada;

/**
 *
 * @author leandro.costa@ifba.edu.br
 */
public class ArvoreAVL {
    private No raiz = null;

    public ArvoreAVL(No raiz) {
        this.raiz = raiz;
    }

    public No getRaiz() {
        return raiz;
    }

    public void setRaiz(No raiz) {
        this.raiz = raiz;
    }   
    
    public void inserir(No no){
        if (raiz == null){
            raiz = no;
        }
    }
}
