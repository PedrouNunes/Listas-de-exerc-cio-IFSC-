
public class Aluno extends Pessoa{
    private int matricula;
    private double bolsa;

    public Aluno(int matricula, double bolsa, String nome, int cpf) {
        super(nome, cpf);
        this.matricula = matricula;
        this.bolsa = bolsa;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
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
        System.out.println("Professor, não entendi! ");
    }
    
    @Override
    public void perfil(){
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Número da matricula: " + matricula);
        System.out.println("Bolsa: R$" + bolsa);
    }
}
