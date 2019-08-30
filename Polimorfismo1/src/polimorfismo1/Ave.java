package polimorfismo1;
public class Ave extends Animal{
    
    private String corPena;
    
    public void fazerNinho(){
     System.out.println("Contruindo Ninho");
    }
    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
    @Override
    public void locomover(){
        System.out.println("Voa");
    }
    
    @Override
    public void alimentar(){
        System.out.println("Insetos");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Canta");
    }          
}
