package heranca_exemplo2;
public class Tecnico extends Aluno{
    
    private String registro;
    
    public void praticar(){
        System.out.println("Prática execultada com sucesso");
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }
        
}
