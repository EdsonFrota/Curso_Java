package heranca;
public class Professor extends Pessoa{ //necessário colocar o extends para herdar
                         //os atirbutos da SUPER CLASSE PESSOA 
    //Atributos
    //private String nome;   Está na super classe PESSOA
    //private int idade;   Está na super classe PESSOA
    //private String sexo;  Está na super classe PESSOA
    private String especialidade;
    private String salario;
    
    //public void fazerAniversario(){}  Está na super classe PESSOA
    public void receberAumento(){}

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public Professor() {
        //this.especialidade = especialidade;
    }
    
    public void mostrar(){
        this.setNome("Joaquin");
        System.out.println(this.getNome());
    }
    
    
}
