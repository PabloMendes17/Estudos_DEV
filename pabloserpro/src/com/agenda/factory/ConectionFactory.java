package com.agenda.factory;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConectionFactory {
    //Definindo as credenciais e local de acesso ao banco
    private static final String USERNAME= "Pablo";
    private static final String PASSWORD= "@Estudos17";
    private static final String DATABASE_URL="jdbc:mysql://localhost:3306/agenda";
    private static final String USERNAMEPOST="postgres";
    private static final String PASSWORDPOST="@Flag1699";
    private static final String DATABASE_URLPOST="jdbc:postgresql://localhost:5432/agenda";
    
    //Conexão com o Banco
   public static Connection abreConexaoMySql() throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
        return connection;
    }
    public static Connection abrePostgre() throws Exception{
        Class.forName("org.postgresql.Driver");
        Connection conexao = DriverManager.getConnection(DATABASE_URLPOST, USERNAMEPOST, PASSWORDPOST);
        return conexao;
    }

    public static void main (String[]args) throws Exception{
         Connection con =abreConexaoMySql();
        if(con!=null){
            System.out.println("Conexão Obtida com sucesso");
            con.close();
        }
        Connection pon =abrePostgre();
        if(pon!=null){
            System.out.println("Conexão Obtida com sucesso");
            pon.close();
        }
    }

    

    
}
