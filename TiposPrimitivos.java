import java.util.Scanner;

public class TiposPrimitivos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do aluno:");
        String nome = teclado.nextLine();
        System.out.println("Digite a primeira nota:");
        float n1 = teclado.nextFloat();
        System.out.println("Digite a segunda nota:");
        float n2 = teclado.nextFloat();
        float m = (float) (n1 + n2) / 2;
        System.out.println("A primeira nota é: " + n1);
        System.out.print("A segunda nota é: " + n2 + "\n");
        System.out.printf("A média do aluno %s, com as notas %.2f e %.2f, é: %.2f", nome, n1, n2, m);
    }
}
