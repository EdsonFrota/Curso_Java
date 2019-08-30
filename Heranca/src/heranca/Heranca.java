package heranca;
public class Heranca {
    public static void main(String[] args) {
        
        Pessoa objeto_pessoa = new Pessoa();
        Aluno objeto_aluno = new Aluno();
        Professor objeto_professor = new Professor();
        Funcionario objeto_funcionario = new Funcionario();
        
        objeto_aluno.setNome(" Edson ");
        objeto_professor.setNome(" Marcos ");
        objeto_funcionario.setNome(" Cláudio ");
        
        objeto_aluno.setIdade(22);
        objeto_professor.setIdade(55);
        objeto_funcionario.setIdade(29);
        
        objeto_aluno.setSexo("M");
        objeto_professor.setSexo("M");
        objeto_funcionario.setSexo("M");
        
        System.out.println(objeto_aluno.toString());
        System.out.println(objeto_professor.toString());
        System.out.println(objeto_funcionario.toString());
    }
    
}
