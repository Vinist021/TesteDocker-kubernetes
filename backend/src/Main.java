import DAO.MensagemDAO;
import entity.Mensagem;

public class Main {

    public static void main(String[] args) {
        Mensagem u = new Mensagem();

        u.setUsername("teste");
        u.setEmail("teste@gmail.com");
        u.setComentario("teste de comentario");

        new MensagemDAO().cadastrarUsuario(u);

    }

}
