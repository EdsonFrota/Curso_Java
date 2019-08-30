 
package polimorfismo1;
public class Polimorfismo1 {
    public static void main(String[] args) {
        
         //Objetos
     Mamifero objeto_Mamifero = new Mamifero();
     Reptil objeto_Reptil = new Reptil();
     Peixe objeto_Peixe = new Peixe();
     Ave objeto_Ave = new Ave();
     Canguru objeto_Canguru = new Canguru();
     Cachorro objeto_Cachorro = new Cachorro();
     Cobra objeto_Cobra = new Cobra();
     Tartaruga objeto_Tartaruga = new Tartaruga();
     Goldfish objeto_Goldfish = new Goldfish();
     Arara objeto_Arara = new Arara();
     
     //Chamamos todos os métodos objetos criados
     objeto_Mamifero.setPeso(44.50f);
     objeto_Mamifero.setCorPelo("Preto");
     objeto_Mamifero.alimentar();
     objeto_Cachorro.emitirSom();
    
        
    }
    
}
