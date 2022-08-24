package Roleta;

import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;

    // Métodos Públicos

    public void marcarLuta(Lutador j1, Lutador j2){
        this.desafiado = j1;
        this.desafiante = j2;
    }
    public void lutar() {
        System.out.println("### DESAFIADO ###");
        this.desafiado.apresentar();
        System.out.println("### DESAFIANTE ###");
        this.desafiante.apresentar();

        Random aleatorio = new Random();
        int vencedor = aleatorio.nextInt(3);
        switch (vencedor){
            case 0: // Empate
                System.out.println("==================");
                System.out.println("Empatou!");
                this.desafiado.empatarJogo();
                this.desafiante.empatarJogo();
                break;
            case 1: // Desafiado vence
                System.out.println("==================");
                System.out.println("Vitória do: " + this.desafiado.getNome());
                this.desafiado.ganharJogo();
                this.desafiante.perderJogo();
                break;
            case 2: // Desafiante vence
                System.out.println("==================");
                System.out.println("Vitória do: " + this.desafiante.getNome());
                this.desafiante.ganharJogo();
                this.desafiado.perderJogo();
                break;
        }
    }

    // Getters e Setters

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public void status() {
    }
}
