package javadbex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class AlunoDBOracle {


    public Connection ConexaoDB(){
               
        //try (Connection conn = DriverManager.getConnection(
                //"jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "rm...", "???")) {
       
        Connection conn=null;
       
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
           
            conn = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "rm96687", "060304");


            if(conn!=null)
                System.out.println("Conexão estabelecida com sucesso!");
            else
                System.out.println("Falha na conexão com o Banco de Dados!");


        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
       
        return conn;
    }
   
    public void InserirAlunoDB(Aluno a){
       
        Connection conn = ConexaoDB();
       
        Statement statement;
       
        try {
            String query = String.format("insert into tb_aluno (id,nome,ra,curso) values(%s,'%s', '%s','%s')", a.getId(), a.getNome(), a.getRa(), a.getCurso());
           
            statement = conn.createStatement();
           
            statement.executeUpdate(query);
           
            System.out.println("Registro incluído com sucesso!");
        }catch (Exception e){
            System.out.println(e);
        }
    }
   
    public void ListarAlunoDB(){
       
        Connection conn = ConexaoDB();
       
        Statement statement;
       
        ResultSet rs=null;
       
        try {
            String query= "select * from tb_aluno";
           
            statement=conn.createStatement();
           
            rs=statement.executeQuery(query);
           
            while(rs.next()){
                System.out.print(rs.getString("id")+" ");
                System.out.println(rs.getString("nome"));
                System.out.println(rs.getString("ra"));
                System.out.println(rs.getString("curso"));
            }


        }
        catch (Exception e){
            System.out.println(e);
        }
    }


    public void AtualizarAlunoDB(Aluno a){
       
        Connection conn = ConexaoDB();
       
        Statement statement;
       
        try {
            String query = String.format("update tb_aluno set nome = '%s' where id = %s", a.getNome(), a.getId());
            String query2 = String.format("update tb_aluno set curso = '%s' where id = %s", a.getCurso(), a.getId());
            String query3 = String.format("update tb_aluno set ra = '%s' where id = %s", a.getRa(), a.getId());
           
            statement = conn.createStatement();
           
            statement.executeUpdate(query);
            statement.executeUpdate(query2);
            statement.executeUpdate(query3);
           
            System.out.println("Registro atualizado com sucesso!");
        }catch (Exception e){
            System.out.println(e);
        }
    }
   
    public void ExcluirAlunoDB(int id){
       
        Connection conn = ConexaoDB();
       
        Statement statement;
       
        try {
            String query = String.format("delete from tb_aluno where id = %s", id);
           
            statement = conn.createStatement();
           
            statement.executeUpdate(query);
           
            System.out.println("Registro excluído com sucesso!");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}


