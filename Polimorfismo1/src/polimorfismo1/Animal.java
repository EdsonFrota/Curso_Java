package polimorfismo1;
public abstract class Animal {
    
    private float peso;
    private int idade;
    private int membros;
    
    public void locomover(){}
    public void alimentar(){}
    public void emitirSom(){}

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }
    
    
}
