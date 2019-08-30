package polimorfismo1;
public class Canguru extends Mamifero {
    
    public void usarBolsa(){
        System.out.println("Usando a Bolsa");
    }
    
    @Override
    public void locomover(){
        System.out.println("Saltando");
    }
    }
