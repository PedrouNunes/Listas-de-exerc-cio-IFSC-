
public class Professor extends Pessoa{
    private int siape;
    private double salario;

    public Professor(int siape, double salario, String nome, int cpf) {
        super(nome, cpf);
        this.siape = siape;
        this.salario = salario;
    }

    public int getSiape() {
        return siape;
    }

    public void setSiape(int siape) {
        this.siape = siape;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
   
    @Override
    public void fala(){
        System.out.println("Alguma dúvida? ");
    }
    
    @Override
    public void perfil(){
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Número do siape: " + siape);
        System.out.println("Salário: R$" + salario);
    }
}
