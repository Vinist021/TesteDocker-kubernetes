package DAO;

import conexao.Conexao;
import entity.Mensagem;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MensagemDAO {

    public void cadastrarUsuario(Mensagem usuario){
        String sql = "INSERT INTO mensagens(NOME, EMAIL, COMENTARIO) VALUES (?, ?, ?)";

        PreparedStatement ps = null;

        try {
            ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, usuario.getUsername());
            ps.setString(2, usuario.getEmail());
            ps.setString(3, usuario.getComentario());

            ps.execute();
            ps.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
