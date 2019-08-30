package heranca;
public class Funcionario extends Pessoa{  //necessário colocar o extends para herdar
                                         //os atirbutos da SUPER CLASSE PESSOA   
    //Atributos 
    //private String nome; Está na super classe PESSOA
    //private int idade; Está na super classe PESSOA
    //private String sexo; Está na super classe PESSOA
    private String setor;
    private boolean trabalhando;
    
    // public void fazerAniversario(){}  Está na super classe PESSOA
    public void mudarTrabalho(){}

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando() {
        this.trabalhando = trabalhando;
    }

    public Funcionario() {
        //this.setor = setor;
    }
    
    
    
}
