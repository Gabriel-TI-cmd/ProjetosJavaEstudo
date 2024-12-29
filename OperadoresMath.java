public class OperadoresMath {
    public static void main(String[] args) {
        /*int n1 = (int) Math.cbrt(27);
        int n2 = (int) Math.sqrt(25);
        System.out.println("A raiz cúbica de 27 é: " + n1);
        System.out.println("A raiz quadrada de 25 é: " + n2);*/
        /*float n = 8.2f;
        int ar = (int) Math.round(n);
        System.out.println(ar);*/
        double ale = Math.random();
        int n = (int) (5 + ale * (10 - 5));
        System.out.println("O número inteiro sorteado entre 5 e 10 é: " + n);
    }
}
