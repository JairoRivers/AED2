package br.edu.uni7.aed2.AEDRevisão;

public class MatrizAdjacente {

    private static final int quantidade = 4;
    private char[] lista = new char [quantidade];

    public MatrizAdjacente (){
        lista [0] = 'A';
        lista [1] = 'B';
        lista [2] = 'C';
        lista [3] = 'D';
    }

    private int [][] construindoMatrizAdj (){
        int[][] matrixAdj = new int [quantidade][quantidade];
        this.iniciandoMatrizAdj(matrixAdj);

        matrixAdj[0][1] = 1;										//AB
        matrixAdj[0][3] = 1;										//AD

        matrixAdj[1][0] = 1;										//BA
        matrixAdj[1][2] = 1;										//BC
        matrixAdj[1][3] = 1;										//BD

        matrixAdj[2][1] = 1;										//CB

        matrixAdj[3][0] = 1;										//DA
        matrixAdj[3][1] = 1;

        return matrixAdj;
    }

    private void iniciandoMatrizAdj(int[][] adjacencyMatrix){
        for(int i=0; i<adjacencyMatrix.length; i++){
            for(int j=0; j<adjacencyMatrix[i].length; j++){
                adjacencyMatrix[i][j] = 0;								//Inicialização da matriz
            }
        }
    }

    private void exibirMatrizAdj (int[][] matrixAdj){
        for(int i=0; i<matrixAdj.length; i++){					  //itero as linhas
            for(int j=0; j<matrixAdj[i].length; j++){				//itero as colunas
                if(matrixAdj[i][j] != 0){							          //quero imprimir somente as ligações
                    System.out.println(lista[i] + "->" + lista[j]);		  //Imprime as arestas
                }
            }
        }
    }

    public static void main(String[] args) {
        MatrizAdjacente adjMatrix = new MatrizAdjacente();
        int[][] adjacencyMatrix = adjMatrix.construindoMatrizAdj();
        adjMatrix.exibirMatrizAdj(adjacencyMatrix);
    }
}
