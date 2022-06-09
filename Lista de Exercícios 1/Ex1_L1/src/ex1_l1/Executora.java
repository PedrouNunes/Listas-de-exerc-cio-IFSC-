
package ex1_l1;


public class Executora {

    
    public static void main(String[] args) {
      Pessoa pessoa1 = new Pessoa(18, "Pedro", 70);

      pessoa1.caminha();
      pessoa1.caminha();
      pessoa1.come();
      pessoa1.fazAniversario();
      pessoa1.imprime();


     Pessoa pessoa2 = new Pessoa(15, "João", 60);

      pessoa2.caminha();
      pessoa2.come();
      pessoa2.come();
      pessoa2.fazAniversario();
      pessoa2.imprime();
    }
    
}
