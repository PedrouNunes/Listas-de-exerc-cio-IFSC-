
package ex3_l1;


public class Main {

    
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(5,6);
        
        float area = retangulo.calcularArea();
        float perimetro = retangulo.calcularPerimetro();
        
        retangulo.imprimir(area, perimetro);
    }
    
}
