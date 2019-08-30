package polimorfismo2;
public class Polimorfismo2 {
    public static void main(String[] args) {
        
       //Criação dos objetos de cada classe
        Lobo objeto_Lobo = new Lobo();
        Cachorro objeto_Cachorro = new Cachorro();
        
        objeto_Lobo.emitirSom();
        objeto_Cachorro.emitirSom();
    }
    
}
