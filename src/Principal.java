
import arvorebalanceada.ArvoreAVL;
import arvorebalanceada.No;



/**
 *
 * @author leandro.costa@ifba.edu.br
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArvoreAVL arvore = new ArvoreAVL(new No(50,"Leandro"));
        arvore.inserir(new No(10,"Leandro"));
        arvore.inserir(new No(100,"Leandro"));
        arvore.inserir(new No(30,"Leandro"));
        arvore.inserir(new No(60,"Leandro"));
        arvore.inserir(new No(55,"Leandro"));
        System.out.print(arvore);
    }
    
}
