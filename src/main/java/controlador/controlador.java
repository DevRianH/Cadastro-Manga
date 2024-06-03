package controlador;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serializable;


@Named
@SessionScoped
public class controlador implements Serializable{
    

    private String nome, capitulo, mangaka, criacao;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getCapitulo(){
        return capitulo;
    }

    public void setCapitulo(String capitulo) {
        this.capitulo = capitulo;
    }

    public String getMangaka() {
        return mangaka;
    }

    
    public void setMangaka(String mangaka) {
        this.mangaka = mangaka;
    }

    public String getCriacao() {
        return criacao;
    }

    public void setCriacao(String criacao) {
        this.criacao = criacao;
    }
    
    
    
    
}
