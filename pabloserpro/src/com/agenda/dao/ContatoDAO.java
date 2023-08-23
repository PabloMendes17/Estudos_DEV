package com.agenda.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.Date;
import org.postgresql.core.ConnectionFactory;
import com.agenda.factory.ConectionFactory;
import com.agenda.model.Contato;
import com.mysql.cj.xdevapi.PreparableStatement;


public class ContatoDAO {

   public void save(Contato contato){
      String sql = "INSERT INTO contatos(nome,idade,datacadastro)VALUES(?,?,?)";
      Connection conn=null;
      PreparedStatement pstm=null;

      try{
         conn = ConectionFactory.abreConexaoMySql();
         pstm= (PreparedStatement) conn.prepareStatement(sql);
         pstm.setString(1,contato.getNome());
         pstm.setInt(2,contato.getIdade());
         pstm.setDate(3, new Date(contato.getDataCadastro().getTime()));
         
         pstm.execute();
      }catch (Exception e){
         e.printStackTrace();
      }finally{
         try{if(pstm!=null){
            pstm.close();
         }
         if(conn!=null){
            conn.close();
         }}catch(Exception e){
            e.printStackTrace();
         }
      }

   } 
   public void savep(Contato contatop){
      String sql = "INSERT INTO contatos(nome,idade,datacadastro)VALUES(?,?,?)";
      Connection conp=null;
      PreparedStatement pstmp=null;

      try{
         conp = ConectionFactory.abrePostgre();
         pstmp= (PreparedStatement) conp.prepareStatement(sql);
         pstmp.setString(1,contatop.getNome());
         pstmp.setInt(2,contatop.getIdade());
         pstmp.setDate(3, new Date(contatop.getDataCadastro().getTime()));
         
         pstmp.execute();
      }catch (Exception e){
         e.printStackTrace();
      }finally{
         try{if(pstmp!=null){
            pstmp.close();
         }
         if(conp!=null){
            conp.close();
         }}catch(Exception e){
            e.printStackTrace();
         }
      }

   } 
   public List<Contato> getContatos(){
        String sql = "Select * from contatos";
        List<Contato> contatos =new ArrayList<Contato>();
        Connection conn =null;
        PreparedStatement pstm =null;
        ResultSet rset=null;
         try{
            conn=ConectionFactory.abreConexaoMySql();
            pstm=(PreparedStatement) conn.prepareStatement(sql);
            rset= pstm.executeQuery();
            while(rset.next()){
               Contato contato=new Contato();
               contato.setId(rset.getInt("id"));
               contato.setNome(rset.getString("Nome"));
               contato.setIdade(rset.getInt("idade"));
               contato.setDataCadastro(rset.getDate("datacadastro"));
               
               contatos.add(contato);
            }
         }catch(Exception e){
            e.printStackTrace();
         }finally{
               try{
                  if(rset!=null){
                  rset.close();
               }
               if(pstm!=null){
                  rset.close();
               }
               if(conn!=null){
                  rset.close();
               }
               }catch(Exception e){
               e.printStackTrace();
               }
         }
         return contatos;
   }
   public List<Contato> getContatosp(){
      String sql ="SELECT * FROM contatos";
      List<Contato> contatosp = new ArrayList<Contato>();
      Connection conp =null;
      PreparedStatement pstmp=null;
      ResultSet rsetp=null;

      try{
         conp=ConectionFactory.abrePostgre();
         pstmp=(PreparedStatement) conp.prepareStatement(sql);
         rsetp=pstmp.executeQuery();
         while(rsetp.next()){
            Contato contatop = new Contato();
            contatop.setId(rsetp.getInt("id"));
            contatop.setNome(rsetp.getString("Nome"));
            contatop.setIdade(rsetp.getInt("Idade"));
            contatop.setDataCadastro(rsetp.getDate("datacadastro"));
            
            contatosp.add(contatop);
         }

      }catch(Exception e){
         e.printStackTrace();
      }finally{
         try{
            if(rsetp!=null){
               rsetp.close();
            }
            if(pstmp!=null){
               pstmp.close();
            }
            if(rsetp!=null){
               pstmp.close();
            }

         }catch(Exception e){
            e.printStackTrace();
         }
         
      }
      return contatosp;
   }
   public void update(Contato contato){

      String sql ="UPDATE contatos set contatos.nome=?,contatos.idade=?,contatos.datacadastro=? "+"WHERE id=?";
      Connection conn=null;
      PreparedStatement pstm =null;
      
      try{
         conn= ConectionFactory.abreConexaoMySql();
         pstm= (PreparedStatement) conn.prepareStatement(sql);
         pstm.setString(1,contato.getNome());
         pstm.setInt(2,contato.getIdade());
         pstm.setDate(3, new Date(contato.getDataCadastro().getTime()));
         pstm.setInt(4,contato.getId());

         pstm.execute();

      }catch(Exception e){e.printStackTrace();
      }finally{
         try{
            if(pstm!=null){
               pstm.close();
            }
            if(conn!=null){
               conn.close();
            }
         }catch(Exception e){
            e.printStackTrace();
         }
      }
    


   }

}   




    

