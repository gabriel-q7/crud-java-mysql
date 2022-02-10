package DAO;

import java.sql.DriverManager;
import java.sql.Connection;

public class Conexao {
    private String url, user, password;
    
    public Connection conectar(){
        url = Dados.URL;
        user = Dados.USER;
        password = Dados.PASSWORD;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            throw new RuntimeException("Erro na classe de conexao:" + e);
        }
    }
}
