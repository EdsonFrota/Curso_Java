package aula04;
public class Caneta {
    public String modelo;
    private float ponta;
    private boolean tampada;
    private final String cor;
    
    public Caneta(String m, String c, float p){ // este é o método construtor pois ele tem o mesmo nome da classe
     this.modelo = m;
     this.cor  = c;
     this.ponta = p;
     
    }
    
    public String getModelo(){
        
    return this.modelo;
    }
    
    public void setModelo(String m){
        this.modelo = m;
    }
    
    
    public float getPonta(){
    
        return this.ponta;
    }
    
    public void setPonta(float p){
        this.ponta = p;
    
    }
    
    public void tampar(){
    this.tampada = true;
    }
    public void destampar(){
    this.tampada = false;
}
    
    public void status(){
    System.out.println("Sobre a Caneta: ");
    System.out.println("Modelo: " + getModelo());
    System.out.println("Ponta: " + getPonta());
    System.out.println("Cor: " + this.cor);
    System.out.println("Tampada: " + this.tampada);
    }
    
}
