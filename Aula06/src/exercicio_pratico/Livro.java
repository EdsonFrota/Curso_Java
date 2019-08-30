package exercicio_pratico;
public class Livro implements Publicacao {
    
    //Atributos
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public String detalhes() { // toString
        System.out.println("---------------------------------");
        return "Livro { \n" + "Titulo = " + titulo + 
                " \n Autor = " + autor + 
                " \n Total de Paginas = " + totPaginas + 
                " \n Pagina Atual = " + pagAtual + " " + 
                " \n Aberto = " + aberto + 
                " \n Leitor = " + leitor.getNome() +
                " \n Sexo = " + leitor.getSexo() +
                " \n Idade = " + leitor.getIdade() + "    }";
    } 
    
        public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String t) {
        this.titulo = t;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String a) {
        this.autor = a;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int tPaginas) {
        this.totPaginas = tPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pAtual) {
        this.pagAtual = pAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean ab) {
        this.aberto = ab;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa le) {
        this.leitor = le;
    }

    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
        }
    
    @Override
    public void folear(int p) {
        if(p > this.getTotPaginas()){
        System.out.println("Livro: " + this.getTitulo() + "não possui esse numero de página");
        }
        this.setPagAtual(this.getTotPaginas());
    }

    @Override
    public void avançarPagina() {
        this.setPagAtual(this.getPagAtual() + 1);
    }

    @Override
    public void voltarPagina() {
        this.setPagAtual(this.getPagAtual() - 1);
    }

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }
    
}
