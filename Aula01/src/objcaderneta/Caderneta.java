package objcaderneta;
public class Caderneta {
    //Atributos
    String capa;
    int folhas;
    String impressão;
    int calendario;
    
    //Métodos
    void abrir(){
    System.out.println("Está aberto, pode escrever!");
    }
    void fechar(){
    System.out.println("Está fechado, não é possivel escrever!");
    }
    
    void status(){
    System.out.println("A cor da capa é " + this.capa);
    }
    
}
