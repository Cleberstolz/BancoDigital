package dioBootcamp.desafio.bancoDigital;

public class Main {
    public static void main(String[] args) {
        Cliente cleberson = new Cliente();
        cleberson.setNome("Cleberson");

        Conta cc = new ContaCorrente(cleberson);
        Conta poupanca = new ContaPoupanca(cleberson);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
