
package ex3_l1;


public class Retangulo {
    public float altura;
    public float largura;

    public Retangulo(float altura, float largura) {
        this.altura = altura;
        this.largura = largura;
    }
    
    public float calcularArea(){
        float area = altura * largura;
        return area;
    }
    
    public float calcularPerimetro(){
        float perimetro = (2 * altura) + (2 * largura);
        return perimetro;
    }
    
    public void imprimir(float area, float perimetro){
        System.out.println("Altura do retângulo: " + altura + "m, largura do retângulo: " + largura + "m.");
        System.out.println("Área: " + area + "m², perímetro: " + perimetro + "m.");
        System.out.println("");
    }
}
