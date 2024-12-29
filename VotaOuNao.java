import java.util.Scanner;

public class VotaOuNao {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Qual é o nome da pessoa?");
        String nome = t.nextLine();
        System.out.println("Qual é o ano de nascimento?");
        int ano = t.nextInt();
        int idade = 2024 - ano;
        System.out.printf("A idade do senhor(a) %s é ", nome);
        System.out.println(idade + " anos.");
        if(idade < 16){
            System.out.printf("O senhor(a) %s não vota!", nome);
        }
        else if((idade >= 16 && idade < 18) || idade > 70){
            System.out.printf("O senhor(a) %s pode optar por votar!", nome);
        }
        else{
            System.out.printf("O senhor(a) %s tem a obrigação de votar", nome);
        }
    }
}
