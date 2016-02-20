
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
        
        if (raiz == null){
            raiz = no;
        }else{
            No atual = raiz;
            No pai;
            while (atual != null){
                pai = atual;
                if (no.getId() < atual.getId()){
                    atual = atual.getNoEsquerda();
                    if (atual == null){
                        pai.setNoEsquerda(no);
                    }
                }else{
                    atual = atual.getNoDireita();
                    if (atual == null){
                        pai.setNoDireita(no);
                    }
                }  
            }
        }

    }

    @Override
    public String toString() {        
        return "ArvoreAVL{" + imprimeArvoreEmOrdem(raiz) + "}";
    }
    
    private String imprimeArvoreEmOrdem(No raiz){
        StringBuffer sb = new  StringBuffer("");
        if(raiz != null){
            sb.append(imprimeArvoreEmOrdem(raiz.getNoEsquerda()));
            sb.append("{no: " + raiz.getId() + "}");
            sb.append(imprimeArvoreEmOrdem(raiz.getNoDireita()));
        }
        return sb.toString();
    }
    
}
