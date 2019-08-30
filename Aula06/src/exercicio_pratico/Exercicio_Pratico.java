package exercicio_pratico;
public class Exercicio_Pratico {
    public static void main(String[] args) {
        
        //Objeto pessoa vetor de 3 posições
        Pessoa[] objeto_pessoa = new Pessoa[3];
        Livro[] objeto_livro = new Livro[3];
        
        objeto_pessoa[0] = new Pessoa("Edson", 22, "Masculino");
        objeto_pessoa[1] = new Pessoa("Junior", 23, "Masculino");
        objeto_pessoa[2] = new Pessoa("Frota", 25, "Masculino");
        
        objeto_livro[0] = new Livro(" Buracos Negros "," Albert Einstein ", 189, objeto_pessoa[0]);
        objeto_livro[1] = new Livro(" Breve História do Tempo ", " Stheven Halking ",120, objeto_pessoa[1]);
        objeto_livro[2] = new Livro(" Universo ", " Stheven Halking ",125, objeto_pessoa[2]);
        
       objeto_livro[2].abrir();
        objeto_livro[2].folear(500);
        objeto_livro[1].folear(500);
        objeto_livro[0].folear(500);
        
        for(int i = 0; i<objeto_pessoa.length; i++){
            
             //objeto_livro[i].abrir();
       // objeto_livro[i].folear(500);
        //objeto_livro[i].folear(500);
          //objeto_livro[i].folear(500);
        
            System.out.println(objeto_livro[i].detalhes());
        }
        
        //System.out.println(objeto_livro[0].detalhes());
    }
}
