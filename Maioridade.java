import java.util.Scanner;

public class Maioridade {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Digite o ano de seu nascimento:");
        int nasc = t.nextInt();
        int i = 2024 - nasc;
        System.out.print("Sua idade é: " + i + " anos.\n");
        if (i>=18){
            System.out.println("Maior de idade!");
        }
        else{
            System.out.println("Menor de idade!");
        }
    }
}
