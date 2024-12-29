import java.util.Scanner;

public class CalcularMedia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float n1, n2, n3, n4, m;
        System.out.println("Digite a primeira nota: ");
        n1 = teclado.nextFloat();
        System.out.println("Digite a segunda nota: ");
        n2 = teclado.nextFloat();
        System.out.println("Digite a terceira nota: ");
        n3 = teclado.nextFloat();
        System.out.println("Digite a última nota: ");
        n4 = teclado.nextFloat();
        m = (n1 + n2 + n3 + n4) / 4f;
        System.out.printf("A média das notas é: %.2f\n", m);
        if (m>=6.0){
            System.out.println("APROVADO!");
            System.out.println("PARABÉNS!");
        }
        else if (m<6 && m>=4){
            System.out.println("RECUPERAÇÃO!");
            System.out.println("ESTUDE MAIS!");
        }
        else{
            System.out.println("REPROVADO!");
            System.out.println("ESTUDE MUITO MAIS!");
        }
    }
}
