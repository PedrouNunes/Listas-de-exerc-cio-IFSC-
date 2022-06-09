
package ex4_l2;


public class FiguraGeometrica {
    public double base;
    public double altura;

    public FiguraGeometrica(double base, double altura) {
        this.base = base;
        this.altura = altura;
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
    
    public double calculaArea(){
      double area = base * altura;
      area = (base * altura ) / 2;
      return area;
    }
    public double calculaPerimetro(){
        double perimetro = 4 * altura;
        perimetro = 3 * altura;
         return perimetro;
    }
}
