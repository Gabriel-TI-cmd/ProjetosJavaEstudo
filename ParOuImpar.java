import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        int n = t.nextInt();
        System.out.print("O número é: " + n + "\n");
        if(n%2==0){
            System.out.print("O número é PAR!");
        }
        else{
            System.out.print("O número é ÍMPAR!");
        }
    }
}
