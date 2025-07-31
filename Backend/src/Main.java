import DAO.UsuarioDAO;
import entity.Usuario;

public class Main {

    public static void main(String[] args) {
        Usuario u = new Usuario();

        u.setNome("teste");
        u.setEmail("teste@gmail.com");
        u.setComentario("teste de comentario");

        new UsuarioDAO().cadastrarUsuario(u);

    }

}
