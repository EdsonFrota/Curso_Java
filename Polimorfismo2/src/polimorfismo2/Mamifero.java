package polimorfismo2;

public class Mamifero extends Animal {
    
    protected String corPelo;
    /* A notação @Override é para SOBREPOSIÇÃO ou seja ele implemeta todos os
    métodos da sua classe MÃE a classe Animal*/
    
    @Override
    public void emitirSom(){
        System.out.println("Som de Mamífero!");
    }
    
}
