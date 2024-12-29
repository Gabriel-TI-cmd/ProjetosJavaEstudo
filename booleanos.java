public class booleanos {
    public static void main(String[] args) {
        boolean fimDeSemana = true;
        boolean fazerSol = true;
        boolean irAPraia = fimDeSemana && fazerSol;
        System.out.println("Nós vamos à praia? " + irAPraia);
        String mensagem = fimDeSemana ? "É fim de semana!" : "Não é fim de semana!";
        String msg = fazerSol ? "Tá ensolarado!" : "Não está ensolarado!";
        System.out.println(msg);
        System.out.println(mensagem);
    }
}