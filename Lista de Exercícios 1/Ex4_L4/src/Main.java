
public class Main {

    
    public static void main(String[] args) {
        Empregado empregado1 = new Empregado();
        
        empregado1.setNome("Pedro");
        empregado1.setSobrenome("Nunes");
        empregado1.setSalario(3000);
        
        empregado1.salarioAnual();
        
        System.out.println("Nome do empregado: " + empregado1.getNome() + " " + empregado1.getSobrenome() + ", salário anual do empregado: R$" + empregado1.getSalario());
        System.out.println("");
        
        Empregado empregado2 = new Empregado();
        
        empregado2.setNome("Arthur");
        empregado2.setSobrenome("Nunes");
        empregado2.setSalario(2000);
        
        empregado2.salarioAnual();
        
        System.out.println("Nome do empregado: " + empregado2.getNome() + " " + empregado2.getSobrenome() + ", salário anual do empregado: R$" + empregado2.getSalario());
    
    }
    
}
