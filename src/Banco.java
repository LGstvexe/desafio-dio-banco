import java.util.List;

public class Banco {

    //Atributos
    private String nome;
    private List<Conta> contas;

    public String getNome() {
        return nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }
}
