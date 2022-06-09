
package ex4_l2;


public class Main {

   
    public static void main(String[] args) {
       FiguraGeometrica quadrado = new Quadrado(6,2);
       
       System.out.println("Área do quadrado em m²: " + quadrado.calculaArea());
       System.out.println("Perímetro do quadrado em m: " + quadrado.calculaPerimetro());
       System.out.println("");
       
       FiguraGeometrica triangulo = new Triangulo(10,8);
       
       System.out.println("Área do triangulo em m²: " + triangulo.calculaArea());
       System.out.println("Perímetro do triangulo em m: " + triangulo.calculaPerimetro());
       System.out.println("");
    }
    
}
