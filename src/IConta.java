public interface IConta {

    public void sacar(double valor, int senha);

    public void depositar(double valor, int senha);

    public void transferir(double valor, int senha, Conta contaDestino);

    public void imprimirExtrato();

}
