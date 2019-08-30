package exercicio_contabanco;
public class Exercicio_ContaBanco {
   public static void main(String[] args) {
       
        //Conta Usuário 01
       System.out.println("Usuário 01\n");
       ContaBanco usuario_01 = new ContaBanco(); //criação do objeto 
       usuario_01.setNumConta(11111);
       usuario_01.setDono("Usuário 01");
       usuario_01.abrirConta("CC");
      // usuario_01.depositar(120);
       usuario_01.estadoAtual();
        
       // Conta Usuário 02
       System.out.println("\nUsuário 02: \n");
       ContaBanco usuario_02 = new ContaBanco();   // criação do objeto
       usuario_02.setNumConta(222222);
       usuario_02.setDono("Usuário 02");
       usuario_02.abrirConta("CP");
       //usuario_02.depositar(120);
       usuario_02.estadoAtual();
       
    }
    
}
