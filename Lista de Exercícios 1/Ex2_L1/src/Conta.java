
public class Conta {
     public int numero;
     public String titular;
     public float saldo;

    public Conta(int numero, String titular, float saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

     
public void sacar(float sacar){
if (sacar > this.saldo) {
        System.out.println("Esse valor não pode ser sacado! ");
    }else{
    this.saldo -= sacar;
}
}

public void depositar(float depositar){
    this.saldo += depositar;
}

public void saldo(){
    System.out.println("Numero da conta: " + numero + ", titular da conta: " + titular + ", saldo da conta: R$" + this.saldo);
    System.out.println("");
}
}
