package polimorfismo2;
public class Lobo extends Mamifero{
    
    /* A notação @Override é para SOBREPOSIÇÃO ou seja ele implemeta todos os
    métodos da sua classe MÃE a classe Animal*/
    
    @Override
    public void emitirSom(){
        System.out.println("Auuuuuuuuuuuuuuuuu");
    }
    
}
