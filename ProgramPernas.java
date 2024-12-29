import java.util.Scanner;

public class ProgramPernas {
    public static void main(String[] args) {
        String tipo;
        int pernas;
        Scanner t = new Scanner(System.in);
        System.out.println("Quantas pernas?");
        pernas = t.nextInt();
        System.out.print("Isso é um(a) ");
        switch(pernas){
            case 1:
                tipo = "Saci.";
                break;
            case 2:
                tipo = "Bípede.";
                break;
            case 4:
                tipo = "Quadrúpede.";
                break;
            case 6, 8:
                tipo = "Aranha.";
                break;
            default:
                tipo = "ET.";
        }
        System.out.print(tipo);
    }
}
// O switch não serve para dados do tipo float, somente inteiros. E nem para intervalos;