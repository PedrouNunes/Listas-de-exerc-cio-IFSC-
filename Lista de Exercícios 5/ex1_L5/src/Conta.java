
public abstract class Conta implements Operacoes{
   protected String titular;
   protected String numero;
   protected double saldo;

    public Conta(String titular, String numero, double saldo) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
    }
    
   
    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }
    
    public abstract void extrato();
   
}
