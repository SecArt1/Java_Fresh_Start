// Creating a 2D array and filling it with random numbers then  printing it's content.

public class Array2D {

    public static void main (String[] args){

        int[][] m = new int[3][3];

        for (int i =0; i <3; i++){

            for (int j =0; j <3; j++){
               m[i][j]= (int) (Math.random() *10);
            }

        }
        for (int i =0; i <3; i++){

            for (int j =0; j <3; j++){
                System.out.println(m[i][j] + " ");
            }

        }


    }
}
