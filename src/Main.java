public class Main {
    public static void main(String[] args) {
        int numberOfEm =0;
        int StartValue;
        int EndValue = 20;
        for( StartValue =5; StartValue<EndValue; StartValue++){

                if(StartValue%3 ==0){
                 numberOfEm = numberOfEm +1;
            }

        }
        System.out.println(numberOfEm);

    }
}