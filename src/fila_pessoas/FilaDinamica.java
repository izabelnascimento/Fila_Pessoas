package fila_pessoas;

public class FilaDinamica <T>{

    private int tamanho = 0;
    private No fim, inicio;

    
    public boolean isVazia() {
    	return tamanho == 0;
    }
    
    public int getTamanho(){
        return tamanho;
    }
    
    public void inserir(T t) {
        No no = new No();
        no.t = t;
        no.proximo = null;
        if(isVazia()){
            inicio = no;
            fim = no;
        }else{
            fim.proximo = no;
            fim = no;
        }
        tamanho++;
    }
    
    public boolean remover() {
        if(isVazia()) {
            return false;
        }
        if(tamanho == 1){
            fim = null;
            inicio = null;
        }else{
            inicio = inicio.proximo;
        }
        tamanho--;
        return true;
    }
    
    public T get() {
	if(isVazia()){
            return null;
        }
        return inicio.t;
    }
    
    private class No{
        No proximo;
        T t;
    }
    
}