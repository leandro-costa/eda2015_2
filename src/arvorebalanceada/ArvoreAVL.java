
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
        return "ArvoreAVL{" + imprimeArvoreEmOrdem(raiz) + "\n}";
    }
    
    private String imprimeArvoreEmOrdem(No no){
        StringBuffer sb = new  StringBuffer("");
        if(no != null){
            sb.append(imprimeArvoreEmOrdem(no.getNoEsquerda()));
            sb.append("\n{no: " + no.getId() + ", HE: " + no.getAlturaEsquerda()+ ", HD: " + no.getAlturaDireita()+ " }");
            sb.append(imprimeArvoreEmOrdem(no.getNoDireita()));
        }
        return sb.toString();
    }
    
}
