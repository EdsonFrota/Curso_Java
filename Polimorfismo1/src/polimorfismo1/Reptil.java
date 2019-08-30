package polimorfismo1;

public class Reptil extends Animal{
    
    private String corEscama;

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    @Override
    public void locomover(){
        System.out.println("Rasteja");
    }
    
    @Override
    public void alimentar(){
        System.out.println("Restos");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("hjhjhjhjhjhjh");
    }
 
}
