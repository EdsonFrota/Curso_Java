package aula02;
public class Aula02 {
    public static void main(String[] args) {
       // System.out.println("--- Sobre a caneta 1: ---");
   Caneta c1 = new Caneta();
   c1.modelo = "Bic cristal";
   c1.cor = "Azul";
   //c1.ponta = 0.5f;
   c1.carga = 80;
   c1.tampada = false;
   c1.rabiscar();
   c1.status();
    }
    
}
