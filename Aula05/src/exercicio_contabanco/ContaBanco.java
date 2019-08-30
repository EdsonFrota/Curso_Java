package exercicio_contabanco;

public class ContaBanco {

    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    //constutor
    public ContaBanco() {
       this.saldo = 0;
       this.status = false;
    }
    
    public void estadoAtual(){
          System.out.println("Conta: " + this.getNumConta());
          System.out.println("Tipo de conta: " + this.getTipo());
          System.out.println("Dono: "+ this.getDono());
          System.out.println("Saldo: R$ " + this.getSaldo());
          System.out.println("Status da conta: " + this.getStatus());
    }

    //Metodos
    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC")  {
                this.setSaldo(50);
        }else if(t == "CP"){
                this.setSaldo(150);
                        }
        System.out.println("Conta aberta com sucesso!");
        }
    

    public void fecharConta() {
        if (saldo < 0) {
            System.out.println("Conta em débito.!");
        } else if (saldo > 0) {
            System.out.println("A conta está ativa! o saldo é: " + getSaldo());
        } else {
            setStatus(false);
            System.out.println("Conta fechada com sucesso.!");
        }
    }

    public void depositar(float v) {

        if (this.getStatus() == true) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado na conta " + this.getDono());
        } else {
            System.out.println("Impossível depositar, conta fechada!");
        }
    }

    public void sacar(float v) {

        if (this.getStatus() == true) {
            if (this.getSaldo()>= v) {
                this.setSaldo(this.getSaldo()- v);
                System.out.println("Saque realizado na conta de " + this.getDono());
            }
          else {
            System.out.println("Saldo insuficiente para saque!");
         }
        }else{
        System.out.println("Impossivel sacar pois a conta está fechada!");
        }
    }

    public void pagarMensal() {
      int v = 0;
     if (this.getTipo() == "CC"){
         v = 12;
        }
     else if (this.getTipo() == "CP" ){
         v = 20;
     }
     if (this.getStatus()){
         System.out.println("Mensalidade paga com sucsso por " + this.getDono());
     }else{
     System.out.println("Impossivel pagar, conta fechada.!");
     }   
    }

    public void setNumConta(int n) {
        numConta = n;

    }

    public int getNumConta() {
        return this.numConta;

    }

    public void setTipo(String t) {
        tipo = t;

    }

    public String getTipo() {
        return this.tipo;
    }

    public void setDono(String d) {
        dono = d;
    }

    public String getDono() {
        return this.dono;
    }

    public void setSaldo(float d) {
        saldo = d;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setStatus(boolean s) {
        status = s;

    }

    public boolean getStatus() {
        return this.status;
    }
}
