package polimorfismo1;

public class Peixe extends Animal {
    
    private String corEscama;
    
   public void soltarBolha(){
       System.out.println("Soltando Bolhas");
   }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    @Override
    public void locomover(){
        System.out.println("Nadando");
    }
    
    @Override
    public void alimentar(){
        System.out.println("Comendo Agua");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Peixe não faz som");
    }
}
