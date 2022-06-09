
package ex2_l2;


public class Main {

    
    public static void main(String[] args) {
        Animal cachorro = new Cachorro("Vegas",5);
        
        cachorro.emitirSom();
        
        System.out.println("");
        
        Animal gato = new Gato("Simba",3);
        gato.emitirSom();
    }
    
}
