package br.edu.uni7.aed2;

public class Main {
        public static void main (String [] args){
            ListaDupla listaDupla = new ListaDupla();
            listaDupla.inserir(98);
            listaDupla.inserir(99);
            listaDupla.inserir(100);
            listaDupla.inserir(200);

            System.out.println("Estado dos dados inicialmente");
            listaDupla.exibir();


            listaDupla.remover(99);

            System.out.println("Estado dos dados pós remoção do 99");
            listaDupla.exibir();

            listaDupla.busca(300);

        }
}
