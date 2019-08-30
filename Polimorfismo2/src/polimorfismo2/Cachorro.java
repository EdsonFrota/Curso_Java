package polimorfismo2;
public class Cachorro extends Lobo{

    private String frase;
    
    /* A notação @Override é para SOBREPOSIÇÃO ou seja ele implemeta todos os
    métodos da sua classe MÃE a classe Animal*/ 
    @Override
    public void emitirSom(){
        System.out.println("Au Au Au Au Au Au Au");
    }
    
    /*public void reagir(String frase){
        if((this.frase = "Toma comida")||(this.frase = "Olá")){
            System.out.println("Abanar o rabo e latir");
        }
        else{
            System.out.println("Rosnar");
        }
    }*/
   
}
