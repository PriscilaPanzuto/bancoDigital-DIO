public class Main {

    public static void main(String[] args) {

        Clientes clientecc = new Clientes("Prikapan", "123.456.789-10");
        Clientes clientecp = new Clientes("Priscila", "321.654.987-01");

        Conta cc = new ContaCorrente(123, 321, clientecc, 1000.0);
        Conta cp = new ContaPoupanca(456, 678, clientecp, 500.0);

        cc.depositar(1000.0);
        cp.depositar(500.0);
        cc.sacar(100.0);
        cc.transferir(200.0, cp);
        cc.extrato();
        cp.extrato();

        cc.transferir(1800.0, cp);
        cc.extrato();


    }
}
