package br.edu.uni7.aed2.AED2Complexidade;
import java.util.Random;


public class Main2 {

    public void geradorDeLista (int num) {
        Random random = new Random();
        int array []  = new int [num];
        for (int i = 0; i <= array.length; i++){
            array [i] = random.nextInt();
        }

        busca (array,10);

    }

    public void busca (int array [],int numB){
        for (int i = 0; i < numB; i++){
            if (array [i] == numB){
                System.out.println(array[i]);
            }
        }
    }



    public static void main (String [] args){
    }
}
