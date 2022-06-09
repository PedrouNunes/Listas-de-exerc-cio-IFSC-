
package ex4_l2;


public class Triangulo extends FiguraGeometrica{

    public Triangulo(double base, double altura) {
        super(base, altura);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

      @Override
    public double calculaArea(){
        double area = (base * altura ) / 2;
        return area;
    }
    
    @Override
    public double calculaPerimetro(){
        double perimetro = 3 * altura;
        return perimetro;
    } 
   
}
