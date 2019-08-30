package aula02;

public class Caneta {
    
    //Atributos
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;
    
    //Métodos
    
    public void status(){
    System.out.println("Cor: " + this.cor);
    System.out.println("Estado: " + this.tampada);
    System.out.println("Modelo: " + this.modelo);
    System.out.println("Ponta: " + this.ponta);
    System.out.println("Carga: " + this.carga);
    
    }
    
   public void rabiscar(){
    if (this.tampada == true){
       System.out.println("ERRO!, Não pode rabiscar!");
    }else{
           System.out.println("Rabiscando!");

    }
    }
    protected void tampar(){
        this.tampada = true;
    }
    protected void destampar(){
       this.tampada = false;
    }
    
    
}
