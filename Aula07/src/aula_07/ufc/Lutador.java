package aula_07.ufc;

public class Lutador {

    //Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    //Métodos  
    public void apresentar() {
        System.out.println("\nLutador: " + this.getNome());
        System.out.println("Nacionalidade: " + this.getNacionalidade());
        System.out.println("Idade: " + this.getIdade()+ " anos ");
        System.out.println("Altura: " + this.getAltura() + " metros ");
        System.out.println("Peso: " + this.getPeso() + " kgs ");
        System.out.println("Categoria: " + this.getCategoria());
        System.out.println("Vitórias: " + this.getVitorias());
        System.out.println("Empates: " + this.getEmpates());
        System.out.println("Derrotas:" + this.getDerrotas()+ "\n");
    }

    public void status() {
        //System.out.println(" ------------------------ ");
        System.out.println(this.getNome());
        System.out.println("tem um peso de " + this.getPeso());
        System.out.println(this.getVitorias() + " vitórias. ");
        System.out.println(this.getEmpates() + " empates. ");
        System.out.println(this.getDerrotas() + " derrotas \n");
      System.out.println(" ------------------------ ");
    }

    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empataLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }

    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }

    public String getNome() {
        return this.nome;
    }

    public String getNacionalidade() {
        return this.nacionalidade;
    }

    public int getIdade() {
        return this.idade;
    }

    public float getAltura() {
        return this.altura;
    }

    public float getPeso() {
        return this.peso;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public int getVitorias() {
        return this.vitorias;
    }

    public int getDerrotas() {
        return this.derrotas;
    }
    public int getEmpates(){
        return this.empates;
    }

    public void setNome(String no) {
        this.nome = no;
    }

    public void setNacionalidade(String na) {
        this.nacionalidade = na;
    }

    public void setIdade(int id) {
        this.idade = id;
    }

    public void setAltura(float al) {
        this.altura = al;
    }

    private void setPeso(float pe) {
        this.peso = pe;
        this.setCategoria();

    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    private void setCategoria() {
        if (this.getPeso() < 52.2) {
            this.categoria= " Inválido ";
        } else if (this.getPeso() <= 70.3) {
            this.categoria = " Leve ";
        } else if (this.getPeso()  <= 83.9) {
            this.categoria = " Médio ";
        } else if (this.getPeso() <= 120.2) {
            this.categoria = " Pesado ";
        } else {
            this.categoria = " Inválido ";
        }
    }
}
