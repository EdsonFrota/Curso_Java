public class UFC{
public static void main(String[] args) {
        Lutador l[] = new Lutador[6];
        
        l[0] = new Lutador("Edson", "Holanda", 22, 1.77f, 72.30f, 10, 0, 0);
        l[1] = new Lutador("Junior", "França", 23, 1.78f, 88.30f, 9, 1, 0);
        l[2] = new Lutador("Frota", "EUA", 24, 1.79f, 66.30f, 8, 1, 1);
        l[3] = new Lutador("Silva", "Brasil", 25, 1.70f, 99.30f, 0, 5, 5);
        l[4] = new Lutador("Ed", "China", 26, 1.71f, 89.30f, 5, 5, 0);
        l[5] = new Lutador("Son", "Dinamarca", 27, 1.72f, 123.30f, 0, 0, 10);
        //l[5].perderLuta();
       // l[5].empataLuta();
        //l[5].ganharLuta();
       // l[5].status();
        for(int i = 0; i< 6; i++){
            l[i].apresentar();
            l[i].status();
        }
}
}