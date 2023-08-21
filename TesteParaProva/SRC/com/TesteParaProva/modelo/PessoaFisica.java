package TesteParaProva.SRC.com.TesteParaProva.modelo;

public class PessoaFisica extends Pessoa{

    private String cpf;
    private String foneContato;
    private String logradouro;
    private String numero;
    private String bairro;
    private String cidade;
    private String uf;
    private String cep;
    private String email;

    public PessoaFisica(int id, String razaoSocial, String cpf, String foneContato, String logradouro, String numero, String bairro, String cidade,
            String uf, String cep, String email) {
        super(id,razaoSocial);
        this.cpf = cpf;
        this.foneContato = foneContato;
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.uf = uf;
        this.cep = cep;
        this.email = email;
    }

    public String getCPF(){
        return cpf;
    }
    public void setCPF(String cpf){
        this.cpf=cpf;
    }
    public String getFoneContato(){
        return foneContato;

    } 
    public void setFoneContato(String foneContato){
        this.foneContato=foneContato;

    }
    public String getLogradouro(){
        return logradouro;
    }
    public void setLogradouro(String logradouro){
        this.logradouro=logradouro;
    }
    public String getNumero(){
        return numero;
    }
    public void setNumero(String numero){
        this.numero=numero;
    }
    public String getBairro(){
        return bairro;
    }
    public void setBairro(String bairro){
        this.bairro=bairro;
    }
    public String getCidade(){
        return cidade;
    }
    public void setCidade(String cidade){
        this.cidade=cidade;
    }
    public String getUF(){
        return uf;
    }
    public void setUF(String uf){
        this.uf=uf;
    }
    public String getCEP(){
        return cep;
    }
    public void setCEP(String cep){
        this.cep=cep;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }


    
}
