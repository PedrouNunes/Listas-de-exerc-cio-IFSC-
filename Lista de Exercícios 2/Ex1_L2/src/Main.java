
public class Main {

  
    public static void main(String[] args) {
      Professor professor = new Professor(1234,1000,"Fabricio",123345);
      
      professor.fala();
      professor.perfil();
       System.out.println("");
       
      Aluno aluno = new Aluno(4567,600,"Pedro",789910);
      aluno.fala();
      aluno.perfil();
    }
    
}
