import java.util.Locale;

public class IdiomaDoSistema {
    public static void main(String[] args) {
        System.out.println("O idioma do sistema é:");
        Locale idioma = Locale.getDefault();
        System.out.println(idioma.toString());
    }
}
