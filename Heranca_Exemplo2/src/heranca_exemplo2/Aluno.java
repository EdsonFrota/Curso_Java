package heranca_exemplo2;
public class Aluno extends Pessoa {
    
    private int matricula;
    private String curso;
    
    public void pagarMensalidade(){
        System.out.println(" Mensalidade do " + this.getNome()+ " paga com sucesso! ");
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
       
}
