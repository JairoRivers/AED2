package br.edu.uni7.aed2.AEDRevisão;

import java.util.LinkedList;
import java.util.List;

public class ListaAdjacente {
    private static final int quantidade = 4;
    private char[] lista = new char [quantidade];

    public ListaAdjacente (){
        lista [0] = 'A';
        lista [1] = 'B';
        lista [2] = 'C';
        lista [3] = 'D';
    }

    // Contruindo a lista de adjacências
    private List<List<Character>> construindoListaAdj (){
        List<List<Character>> listaAdj = new LinkedList<>();

        List<Character> listaAdjA = new LinkedList<>();
        listaAdjA.add('B');
        listaAdjA.add('D');

        List<Character> listaAdjB = new LinkedList<>();
        listaAdjB.add('A');
        listaAdjB.add('C');
        listaAdjB.add('D');

        List<Character> listaAdjC = new LinkedList<>();
        listaAdjC.add('B');

        List<Character> listaAdjD = new LinkedList<>();
        listaAdjD.add('A');
        listaAdjD.add('B');

        listaAdj.add(listaAdjA);
        listaAdj.add(listaAdjB);
        listaAdj.add(listaAdjC);
        listaAdj.add(listaAdjD);

        return listaAdj;
    }

    //Imprime todas as adjacências
    private void exibirListaAdjacente(List<List<Character>> adjacencyList){
        for(int i=0; i<adjacencyList.size(); i++){
            System.out.println(lista[i] + "->" + adjacencyList.get(i));		//Imprime as arestas
        }
    }

    public static void main(String[] args) {
        ListaAdjacente adjList = new ListaAdjacente();
        List<List<Character>> list = adjList.construindoListaAdj();
        adjList.exibirListaAdjacente(list);
    }
}