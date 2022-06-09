
public class Executora {

  
    public static void main(String[] args) {
        Conta contaCorrente = new Corrente("Pedro",123,1000);
        
        contaCorrente.depositar(300);
        contaCorrente.sacar(100);
        contaCorrente.calculaRendimento();
        contaCorrente.imprimeRecibo();
        
        
        System.out.println("");
        
        Conta contaPoupanca = new Poupanca("Pedro",456,1200);
        
        contaPoupanca.depositar(100);
        contaPoupanca.sacar(50);
        contaPoupanca.calculaRendimento();
        contaPoupanca.imprimeRecibo();
    }
    
}
