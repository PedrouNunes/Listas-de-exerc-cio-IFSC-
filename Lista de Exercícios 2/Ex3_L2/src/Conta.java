
public class Conta {
    protected String titular;
    protected int numero;
    protected double saldo;
    protected double rendimento;

    public Conta(String titular, int numero, double saldo) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
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
    
    public void sacar(double sacar){
    if (sacar > this.saldo) {
            System.out.println("Esse valor não pode ser sacado! ");
        }else{
        this.saldo -= sacar;
    }
}

    public void depositar(double depositar){
        this.saldo += depositar;
        }
    
     public void imprimeRecibo(){
         System.out.println("Titular: " + titular);
         System.out.println("Numero: " + numero);
         System.out.println("Saldo: " + this.saldo);
         System.out.println("Rendimento: " + this.rendimento);
    }
     
     public void calculaRendimento(){
         
     }
}

   
