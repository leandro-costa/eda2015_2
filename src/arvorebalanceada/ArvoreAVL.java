
package arvorebalanceada;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author leandro.costa@ifba.edu.br
 * @param <T>
 */
public class  ArvoreAVL<T extends Comparable<T>> {
    private  No<T> raiz = null;

    public ArvoreAVL(No<T> raiz) {
        this.raiz = raiz;
    }

    public No<T> getRaiz() {
        return raiz;
    }

    public void setRaiz(No<T> raiz) {
        this.raiz = raiz;
    }   
    
    public void inserir(No<T> no){
        if (raiz == null){
            raiz = no;
        }else{
            No<T> atual = raiz;
            No<T> pai;
            while (atual != null){
                pai = atual;
                if (no.compareTo(atual) < 0){
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

    /* 
     * Código adaptado de http://stackoverflow.com/questions/4965335/how-to-print-binary-tree-diagram
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {      
    	StringBuffer stringBuffer = new StringBuffer();
    
            List<List<String>> lines = new ArrayList<List<String>>();

            List<No> level = new ArrayList<No>();
            List<No> next = new ArrayList<No>();

            level.add(raiz);
            int nn = 1;

            int widest = 0;

            while (nn != 0) {
                List<String> line = new ArrayList<String>();

                nn = 0;

                for (No n : level) {
                    if (n == null) {
                        line.add(null);

                        next.add(null);
                        next.add(null);
                    } else {
                        String aa = n.toString();
                        line.add(aa);
                        if (aa.length() > widest) widest = aa.length();

                        next.add(n.getNoEsquerda());
                        next.add(n.getNoDireita());

                        if (n.getNoEsquerda() != null) nn++;
                        if (n.getNoDireita() != null) nn++;
                    }
                }

                if (widest % 2 == 1) widest++;

                lines.add(line);

                List<No> tmp = level;
                level = next;
                next = tmp;
                next.clear();
            }

            int perpiece = lines.get(lines.size() - 1).size() * (widest + 4);
            for (int i = 0; i < lines.size(); i++) {
                List<String> line = lines.get(i);
                int hpw = (int) Math.floor(perpiece / 2f) - 1;

                if (i > 0) {
                    for (int j = 0; j < line.size(); j++) {

                        // split node
                        char c = ' ';
                        if (j % 2 == 1) {
                            if (line.get(j - 1) != null) {
                                c = (line.get(j) != null) ? '^' : '|';
                            } else {
                                if (j < line.size() && line.get(j) != null) c = '|';
                            }
                        }
                        stringBuffer.append(c);

                        // lines and spaces
                        if (line.get(j) == null) {
                            for (int k = 0; k < perpiece - 1; k++) {
                            	stringBuffer.append(" ");
                            }
                        } else {

                            for (int k = 0; k < hpw; k++) {
                            	stringBuffer.append(j % 2 == 0 ? " " : "-");
                            }
                            stringBuffer.append(j % 2 == 0 ? "|" : "|");
                            for (int k = 0; k < hpw; k++) {
                            	stringBuffer.append(j % 2 == 0 ? "-" : " ");
                            }
                        }
                    }
                    stringBuffer.append("\n");
                }

                // print line of numbers
                for (int j = 0; j < line.size(); j++) {

                    String f = line.get(j);
                    if (f == null) f = "";
                    int gap1 = (int) Math.ceil(perpiece / 2f - f.length() / 2f);
                    int gap2 = (int) Math.floor(perpiece / 2f - f.length() / 2f);

                    // a number
                    for (int k = 0; k < gap1; k++) {
                    	stringBuffer.append(" ");
                    }
                    stringBuffer.append(f);
                    for (int k = 0; k < gap2; k++) {
                    	stringBuffer.append(" ");
                    }
                }
                stringBuffer.append("\n");

                perpiece /= 2;
            }
        
    	
        return stringBuffer.toString();
    }
}
