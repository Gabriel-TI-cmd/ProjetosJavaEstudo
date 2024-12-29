public class CompararString {
    public static void main(String[] args) {
        String nome1 = "Gabriel";
        String nome2 = "Gabriel";
        String nome3 = new String("Gabriel");
        String res;
        res = (nome1.equals(nome3))?"igual":"diferente"; //O método equals() tem para qualquer classe invólucro.
        System.out.println(res);
    }
}
