
public class Poupanca extends Conta{

    public Poupanca(String titular, int numero, double saldo) {
        super(titular, numero, saldo);
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
      @Override
    public void calculaRendimento(){
        this.rendimento = this.saldo *  0.05;
    } 
}
