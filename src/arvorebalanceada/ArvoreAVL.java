/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvorebalanceada;

/**
 *
 * @author Aluno
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
