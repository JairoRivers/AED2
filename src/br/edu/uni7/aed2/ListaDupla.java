package br.edu.uni7.aed2;

public class ListaDupla {

    No inicio;
    No fim;
    int tamanho;

    public void inserir(int valor) {
        No no = new No();
        no.valor = valor;

        if (inicio == null) {
            inicio = no;
        } else {
            no.anterior = fim;
            no.proximo = null;
            fim.proximo = no;
        }
        fim = no;
        tamanho++;
    }

    public void exibir() {
        No aux = inicio;
        if (aux == null) {
            System.out.printf("Lista vazia");
        } else {
            while (aux != null) {
                System.out.printf("%d\n", aux.valor);
                aux = aux.proximo;
            }
        }
    }

    public int busca(int valor) {
        No aux = inicio;
        if (aux == null) {
            System.out.println("Lista vazia para busca");
            return 0;
        } else {
            while (aux != null) {
                if (aux.valor == valor) {
                    System.out.println("Valor: " + valor + " encontrado na lista");
                    return aux.valor;
                } else {
                    aux = aux.proximo;
                }
                if (aux == null){
                    System.out.println("Valor: " + valor + "  não encontrado na lista");
                    return 0;
                }
            }
        }
        return 0;
    }

    public void remover (int valor) {
        No aux = inicio;
        if (aux == null) {
            System.out.println("Lista vazia");
        } else {
            if (inicio.valor == valor) {
                inicio = inicio.proximo;
                inicio.anterior = null;
            } else {
                if (fim.valor == valor) {
                    fim = fim.anterior;
                    fim.proximo = null;
                } else {
                    while (aux != null) {
                        if (aux.valor == valor) {
                            No antes = aux.anterior;
                            No depois = aux.proximo;
                            antes.proximo = depois;
                            depois.anterior = antes;
                            break;
                        } else {
                            aux = aux.proximo;
                        }
                    }
                }
            }
        }
    }

    public int valorNaPosicao (int posicao){
        No aux = inicio;
        while (aux != null){
            if (posicao == 0){
                return aux.valor;
            }
            posicao--;
            aux = aux.proximo;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public void valorNaPosicao(int posicao, int valor) {
        No noAtual = inicio;
        while (noAtual != null) {
            if (posicao == 0) {
                noAtual.valor = valor;
                break;
            }
            posicao--;
            noAtual = noAtual.proximo;
        }
    }

    public void reverter (){
//        int[] array = new int[tamanho];
//
//        int j = 0;
//        for (int i = tamanho - 1; i >= 0; i--) {
//            array[j] = valorNaPosicao(i);
//            j++;
//        }

        for (int i = 0; i < tamanho / 2; i++) {
            int valorNoFinal = valorNaPosicao(tamanho - 1 - i);
            int valorNoInicio = valorNaPosicao(i);

            valorNaPosicao(i, valorNoFinal);
            valorNaPosicao(tamanho - 1 - i, valorNoInicio);
        }
    }
}