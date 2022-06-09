
import javax.swing.JTextField;


public class Corrente extends Conta{

    public Corrente(String titular, String numero, double saldo) {
        super(titular, numero, saldo);
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    @Override
    public void extrato() {
        System.out.println("Conta Corrente "
                + " Titular: " + this.titular
                + "Numero: " + this.numero
                + "Saldo: R$" + this.saldo);
    }
   
}
