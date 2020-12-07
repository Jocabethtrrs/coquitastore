/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coquitastore.datos;

/**
 *
 * @author Toshiba
 */
import coquitastore.domain.Usuario;
import static coquitastore.datos.Conexion.close;
import static coquitastore.datos.Conexion.getConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class UsuarioDAO {

    private static final String SQL_SELECT = "SELECT idusuario, password, tipo_usuario FROM usuarios";
    private static final String SQL_INSERT = "INSERT INTO usuarios( idusuario, password, tipo_usuario) VALUES (?,?,? )";
    private static final String SQL_UPDATE = "UPDATE usuarios SET password=?, tipo_usuario=? WHERE idusuario=?";
    private static final String SQL_DELETE = "DELETE FROM usuarios WHERE idusuario=?";

    public List<Usuario> seleccionar() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Usuario usuario = null;
        List<Usuario> usuarios = new ArrayList<Usuario>();

        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();

            while (rs.next()) {
                String idusuario = rs.getString("idusuario");
                String password = rs.getString("password");
                String tipoUsuario = rs.getString("tipo_usuario");
                //Creamos nuestro tipo usuario, convertimos a objetos java.
                usuario = new Usuario(idusuario, password, tipoUsuario);
                //Se agrega a la lista
                usuarios.add(usuario);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {

                close(rs);
                close(stmt);
                close(conn);

            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return usuarios;
    }

    public int insertar(Usuario usuario) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        //Insertar datos.
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, usuario.getIdUsuario());
            stmt.setString(2, usuario.getPassword());
            stmt.setString(3, usuario.getTipoUsuario());
            registros = stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "El usuario se ha registado correctamente");

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            JOptionPane.showMessageDialog(null, "Revisar el siguiente exception: " + ex);
        } finally {
            try {
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }

    public int actualizar(Usuario usuario) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        //Insertar datos.
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);

            stmt.setString(1, usuario.getPassword());
            stmt.setString(2, usuario.getTipoUsuario());
            stmt.setString(3, usuario.getIdUsuario());

            registros = stmt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }

    public int eliminar(Usuario usuario) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        //Eliminar datos.
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setString(1, usuario.getIdUsuario());
            registros = stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se ha eliminado correctamente el usuario");

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            JOptionPane.showMessageDialog(null, "Revisar el siguiente exception: " + ex);
        } finally {
            try {
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }
}
