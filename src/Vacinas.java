import java.util.Date;

public class Vacinas {
    private String nome;
    private Date qndTomou;
    private int idade ;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getQndTomou() {
        return qndTomou;
    }

    public void setQndTomou(Date qndTomou) {
        this.qndTomou = qndTomou;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
