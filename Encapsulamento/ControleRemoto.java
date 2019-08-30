public class ControleRemoto implements Controlador {

    //Atributos   
    private int volume;
    private boolean ligado;
    private boolean tocando;

//Método Construtor
    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

//Métodos especiais ACESSORES e MODIFICADORE
    public int getVolume() {
        return this.volume;
    }

    public boolean getLigado() {
        return this.ligado;
    }

    public boolean getTocando() {
        return this.tocando;
    }

    public void setVolume(int v) {
        this.volume = v;
    }

    public void setLigado(boolean l) {
        this.ligado = l;
    }

    public void setTocando(boolean t) {
        this.tocando = t;
    }

//Metodos Abstratos    
    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("Está ligado: " + this.getLigado());
        System.out.println("Volume: " + this.getVolume());
        for (int i = 0; i <= this.getVolume(); i += 10) {
            System.out.print("|");
        }
        System.out.println("Esta tocando: " + this.getTocando());
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");
    }

    @Override
    public void maisVolume() {
        if (this.getLigado() == true) {
            this.setVolume(this.getVolume() + 1);
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado() == true) {
            this.setVolume(this.getVolume() - 1);
        }
    }

    @Override
    public void ligarMudo() {
        if(this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if(this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if(this.getTocando() && !(this.getTocando())){
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if(this.getLigado() && this.getTocando()){
            this.setLigado(false);
        }
    }
}
