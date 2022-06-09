
package ex2_l2;


public class Cachorro extends Animal{

    public Cachorro(String nome, float peso) {
        super(nome, peso);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    
    @Override
    public void emitirSom(){
        System.out.println("Au Au"); 
    }
}
