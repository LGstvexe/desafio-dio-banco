public class Main {

    public static void main(String[] args) {
        Cliente gustavo = new Cliente();
        gustavo.setNome("Gustavo");

        Conta contaCorrente = new ContaCorrente(gustavo, 123456); //Conta Corrente
        contaCorrente.depositar(5000, 123456);
        contaCorrente.imprimirExtrato();
        System.out.println();

        contaCorrente.sacar(1000, 123456);

        contaCorrente.imprimirExtrato();
        System.out.println();

        //Criação da conta poupança
        Conta contaPoupanca = new ContaPoupanca(gustavo, 123456);
        contaPoupanca.imprimirExtrato();
        System.out.println();

        contaCorrente.transferir(2000, 123456, contaPoupanca);
        contaPoupanca.imprimirExtrato();
        System.out.println();
        contaCorrente.imprimirExtrato();
        System.out.println();

    }
}
