package heranca;
public class Aluno extends Pessoa{  //necessário colocar o extends para herdar
                                   //os atirbutos da SUPER CLASSE PESSOA    
    //Atributos
    //private String nome; Está na super classe PESSOA
    //private int idade; Está na super classe PESSOA
    //private String sexo; Está na super classe PESSOA
    private int matricula;
    private String curso;
    
    //public void fazerAniversario(){} Está na super classe PESSOA
    public void cancelarMatricula(){
        System.out.println(" A matrícula será cancelada! ");
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Aluno() {
       // this.matricula = matricula;
        //this.curso = curso;
    }
    public void mostrar(){
      this.setNome("edson");
      
      System.out.println(this.getCurso());
      System.out.println(this.getMatricula());
      System.out.println(this.getNome());
    }
    
    
    
}
