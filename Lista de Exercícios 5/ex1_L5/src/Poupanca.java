
public class Poupanca extends Conta{
    private double rendimento;

    public Poupanca(double rendimento, String titular, String numero, double saldo) {
        super(titular, numero, saldo);
        this.rendimento = rendimento;
    }

    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
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
    
    
    
    public void calculaRendimento(){
        this.saldo *= rendimento;
    }

    
    
    @Override
    public void extrato() {
        System.out.println("Conta Poupança "
                + " Titular: " + this.titular
                + "Numero: " + this.numero
                + "Saldo: R$" + this.saldo
                + "Rendimento R$" + this.rendimento);
    }
}
