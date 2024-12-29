import java.util.Date;

public class HoraDoSistema {
    public static void main(String[] args) {
        Date data = new Date(); // O new cria um objeto, logo, data se tornou um objeto; Date pega o tempo do sistema;
        System.out.println("A hora do sistema é:");
        System.out.println(data.toString());
    }
}
