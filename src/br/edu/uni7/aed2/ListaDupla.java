package br.edu.uni7.aed2;

public class ListaDupla {

    No inicio;
    No fim;

    public void inserir (int valor){
        No no = new No ();
        no.valor = valor;

        if (inicio == null){
            inicio = no;
        }else{
            no.anterior = fim;
            no.proximo = null;
            fim.proximo = no;
        }
        fim = no;
    }

    public void exibir (){
        No aux = inicio;
        if (aux == null){
            System.out.printf("Lista vazia");

        }else{
            while (aux != null) {
                System.out.printf("%d\n", aux.valor);
                aux = aux.proximo;
            }
        }
    }
}
