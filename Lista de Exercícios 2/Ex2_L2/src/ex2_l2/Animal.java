
package ex2_l2;


public class Animal {
   protected String nome;
   protected float peso;

    public Animal(String nome, float peso) {
        this.nome = nome;
        this.peso = peso;
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
   
   public void fazerExercício(){
       this.peso -= 1;
   }
   
   public void emitirSom(){
       System.out.println("aaaarrrghhhhhh");
   }
}
