public abstract class Conta {

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected double limite;
    private Clientes cliente;

    public Conta(int agencia, int numero, Clientes cliente, double limite) {
        this.agencia = agencia;
        this.numero = numero;
        this.cliente = cliente;
        this.limite = limite;
    }

    protected void sacar(double valor){
        if(this.saldo + limite > valor){
            this.saldo = this.saldo - valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    protected void depositar(double valor){
        this.saldo += valor;
    }

    protected void transferir(double valor, Conta contaDestino){
        if(valor > 1000.0) valor += valor * 0.1;
        if(this.saldo + limite > valor){
            this.sacar(valor);
            contaDestino.depositar(valor);
        } else {
            System.out.println("Saldo insuficiente para realizar a transferência!");
        }
    }

    protected void extrato(){
        System.out.println("===== EXTRATO =====");
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agência: %d", this.agencia));
        System.out.println(String.format("Número: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.getSaldo()));
    }

    protected int getAgencia() {
        return agencia;
    }

    protected int getNumero() {
        return numero;
    }

    protected double getSaldo() {
        return saldo;
    }
}
