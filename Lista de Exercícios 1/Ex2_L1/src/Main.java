
public class Main {

    
    public static void main(String[] args) {
       Conta conta1 = new Conta(1234, "Pedro", 1000);
       
       conta1.sacar(200);
       conta1.saldo();
       conta1.depositar(300);
       conta1.saldo();
    }
    
}
