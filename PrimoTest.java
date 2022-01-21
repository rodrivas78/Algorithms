import java.util.Scanner;

class PrimoTest {

    public static void main(String[] args) {
        int numero;
        int i=0;

        Scanner enterNumber = new Scanner(System.in);
        System.out.println("Entre numero: ");
        numero = enterNumber.nextInt();

        if(numero>0){

            while(i!=numero){
                i++;
                if(numero!=1 && i!=1 && i<numero && numero%i==0) {
                    System.out.println("Nao eh primo");
                    break;
                } else if(i==numero && numero%i==0) {
                    System.out.println("Eh primo");
                }
            }
        }
    }
}
