package aula_07.ufc;
import java.util.Random;


public class Luta {
    //Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    //Métodos Públicos
   public void marcarLuta(Lutador l1, Lutador l2){
       if( (l1.getCategoria().equals(l2.getCategoria())) && (l1 != l2) ){
           this.setAprovada(true);
           this.desafiado = l1;
           this.desafiante = l2;
       }else{
           this.setAprovada(false);
           this.setDesafiado(null);
           this.setDesafiante(null);
       }
   }
   public void lutar(){
       if(this.getAprovada() == true){
           System.out.println(" Luta Aprovada! ");
           this.getDesafiado().apresentar();
           this.getDesafiante().apresentar();
           
           Random aleatorio = new Random();
           int vencedor = aleatorio.nextInt(3);
           
           switch(vencedor){
               
               case 0: //Empate
                   this.getDesafiado().empataLuta();
                   this.getDesafiante().empataLuta();
                   System.out.println(" EMPATOU! ");
                   break;
                
               case 1: // Desafiado
                   this.getDesafiado().ganharLuta();
                   this.getDesafiante().perderLuta();
                   System.out.println("Ganhador: " + this.getDesafiado().getNome());
                   break;
                
               case 2: //Desafiante
                   this.getDesafiado().perderLuta();
                   this.getDesafiante().ganharLuta();
                   System.out.println("Ganhador: " + this.getDesafiante().getNome());
                   break;
           }
           
       }else{
       System.out.println(" A luta não pode acontecer!");
       }
       
   
   }
   
   public Lutador getDesafiado(){
       return this.desafiado;
   }
   
   public Lutador getDesafiante(){
       return this.desafiante;
   }
   
   public int getRounds(){
       return this.rounds;
   }
   
   public boolean getAprovada(){
       return this.aprovada;
   }
   
   public void setDesafiado(Lutador dd){
       this.desafiado = dd;
   }
   
   public void setDesafiante(Lutador df){
       this.desafiante = df;
   }
   
   public void setRounds(int r){
       this.rounds = r;
   }
   
   public void setAprovada(boolean ap){
       this.aprovada = ap;
   }
   
    
}
