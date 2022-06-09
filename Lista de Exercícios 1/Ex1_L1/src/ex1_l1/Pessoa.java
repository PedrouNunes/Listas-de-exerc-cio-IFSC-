
package ex1_l1;


public class Pessoa {
    public int idade;
    public String nome;
    public int peso;

    public Pessoa(int idade, String nome, int peso) {
        this.idade = idade;
        this.nome = nome;
        this.peso = peso;
    }
    
    public void caminha(){
        this.peso --;
    }
    
    public void come (){
        this.peso ++;
    }
    
    public void fazAniversario(){
        this.idade ++;
    }
    
    public void imprime(){
        System.out.println("O " + this.nome + ", possui " + this.peso + "kg, e possui " + this.idade + " anos!");
        System.out.println("");
    }
}
