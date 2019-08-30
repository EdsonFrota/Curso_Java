
package polimorfismo2;

public abstract class Animal {     /*Uma classe abstrata não é possivel criar um 
                                   objeto para ela, tornando uma classe genérica, 
                                    que origem a outras.*/
    protected float peso;
    protected int idade;
    protected int membros;
    
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
