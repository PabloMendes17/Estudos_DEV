package TesteParaProva.SRC.com.TesteParaProva.modelo;

import java.util.Objects;

public abstract class Pessoa {

    private int id;
    private String razaoSocial;

    public Pessoa (int id , String razaoSocial){
        Objects.requireNonNull(id);
        this.id=id;
        Objects.requireNonNull(razaoSocial);
        this.razaoSocial=razaoSocial;
    }

    public int getID(){
        return id;
    }
    public String getRazaoSocial(){
        return razaoSocial;
    }
       


    
}
