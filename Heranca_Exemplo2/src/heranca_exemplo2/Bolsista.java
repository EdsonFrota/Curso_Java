package heranca_exemplo2;
public class Bolsista extends Aluno {
    private int bolsa;
       
    public void renovarBolsa(){
        System.out.print("Renovando a bolsa do Aluno" + this.getNome());
    }
    @Override
    public void pagarMensalidade(){
        System.out.println("Aluno bolsista pagamento facilitado!");
    }
    
    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }

}
