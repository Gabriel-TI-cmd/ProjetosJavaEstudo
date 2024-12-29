import java.awt.*;

public class ResolucaoDoSistema {
    public static void main(String[] args) {
        Toolkit sistema;
        sistema = Toolkit.getDefaultToolkit();
        Dimension tela;
        tela = sistema.getScreenSize();
        System.out.println("A resolução da tela é:");
        System.out.println(tela);
    }
}
