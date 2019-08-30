package aula02;

public class Caneta {
    
    //Atributos
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    //Métodos
    void rabiscar(){
    if (this.tampada == true){
       System.out.println("ERRO!, Não pode rabiscar!");
    }else{
           System.out.println("Rabiscando!");

    }
    }
    void tampar(){
        this.tampada = true;
    }
    void destampar(){
       this.tampada = false;
    }
    void status(){
    System.out.println("Caneta de cor " + this.cor);
    System.out.println("A caneta está tampada? " + this.tampada);
    System.out.println("O modelo da Caneta é " + this.modelo);
    System.out.println("A Ponta é " + this.ponta);
    System.out.println("Carga: " + this.carga);
    
    }
    
}
