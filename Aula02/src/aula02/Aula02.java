package aula02;
public class Aula02 {
    public static void main(String[] args) {
        System.out.println("--- Sobre a caneta 1: ---");
   Caneta c1 = new Caneta();
   c1.cor = "Vermelha";
   c1.ponta = 0.5f;
   c1.tampar();
   c1.modelo = "Edson";
   c1.carga = 100;
   c1.rabiscar();
   c1.status();
   
   
   System.out.println("\n--- Sobre a caneta 2: ---");
   Caneta c2 = new Caneta();
    c2.cor = "Preta";
    c2.modelo = "Júnior";
    c2.destampar();
    c2.rabiscar();
    c2.carga = 80;
    c2.status();
    }
    
}
