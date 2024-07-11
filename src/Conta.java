public abstract class Conta implements IConta {

    //Atributos
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    private int agencia;
    private int numero;
    private double saldo;
    private int senha;
    protected Cliente cliente;

    public Conta(Cliente cliente, int senha) {
        this.cliente = cliente;
        this.senha = senha;
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getSenha() {
        return senha;
    }

    @Override
    public void sacar(double valor, int senha) {
        if (getSenha() == senha) {
            saldo -= valor;
        } else {
            System.out.println("Senha incorreta, não foi possível realizar a operação.");
        }
    }

    @Override
    public void depositar(double valor, int senha) {
        if (getSenha() == senha) {
            saldo += valor;
        } else {
            System.out.println("Senha incorreta, não foi possível realizar a operação.");
        }
    }

    @Override
    public void transferir(double valor, int senha, Conta contaDestino) {
        int senhaFornecida = senha;
        if (senhaFornecida == getSenha()) {
            this.sacar(valor, senhaFornecida);
            contaDestino.depositar(valor, senhaFornecida);
        } else {
            System.out.println("Senha incorreta, não foi possível realizar a operação.");
        }
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", getAgencia()));
        System.out.println(String.format("Número: %d", getNumero()));
        System.out.println(String.format("Saldo: R$%.2f", getSaldo()));
    }

}
