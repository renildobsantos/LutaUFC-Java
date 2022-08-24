package Roleta;

public class Main {
    public static void main(String[] args) {
        Lutador A = new Lutador("Freddy", 30, "Masculino", "USA", 5, 2, 1);
        Lutador B = new Lutador("João", 25, "Masculino", "Brasil", 4, 2, 2);
        Lutador C = new Lutador("Ana", 32, "Feminino", "Argentina", 3, 4, 1);
        Lutador D = new Lutador("Maria", 20, "Feminino", "México", 2, 4, 2);

        Luta START = new Luta();
        START.marcarLuta(D, A);
        START.lutar();
        A.status();
        B.status();
        C.status();
        D.status();


    }

}
