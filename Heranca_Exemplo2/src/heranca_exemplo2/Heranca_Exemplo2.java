package heranca_exemplo2;
public class Heranca_Exemplo2 {
    public static void main(String[] args){ 
       
     //OBJETOS   
    //Pessoa objeto_Pessoa = new Pessoa(); não funciona pois uma classe abstrata não pode ser instanciada.
    Visitante objeto_Visitante = new Visitante();
    Aluno objeto_Aluno = new Aluno();
    Bolsista objeto_Bolsista = new Bolsista();
    Tecnico objeto_Tecnico = new Tecnico();
    Professor objeto_professor = new Professor();
    
    objeto_Visitante.setNome("Edson");
    objeto_Visitante.setIdade(22);
    objeto_Visitante.setSexo("MASCULINO");
    
    objeto_Aluno.setNome("Júnior");
    objeto_Aluno.setMatricula(2003141567);
    objeto_Aluno.setIdade(30);
    objeto_Aluno.setSexo("MASCULINO");

    
    objeto_Bolsista.setNome("Carlos");
    
    
    System.out.println(objeto_Visitante.toString());
    System.out.println(objeto_Aluno.toString());
    System.out.println(objeto_Bolsista.toString());
    }
 }
