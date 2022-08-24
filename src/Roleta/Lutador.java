package Roleta;

public class Lutador {
    private String nome;
    private int idade;
    private String sexo;
    private String pais;
    private int vitorias, empates, derrotas;

    // Métodos Públicos

    public void apresentar(){
        System.out.println("--------------------------");
        System.out.println("Chegou a hora! Apresentamos o lutador " + this.getNome());
        System.out.println("Pais de origem " + this.getPais());
        System.out.println("Com " + this.getIdade() + " anos");
        System.out.println(this.getVitorias() + " Vitórias");
        System.out.println(this.getDerrotas() + " Derrotas e");
        System.out.println(this.getEmpates() + " Empates!");
    }
    public void status(){
        System.out.println("==================");
        System.out.println(this.getNome());
        System.out.println("Ganhou " + this.getVitorias() + " vezes");
        System.out.println("Perdeu " + this.getDerrotas() + " vezes");
        System.out.println("Empatou " + this.getEmpates() + " vezes");

    }
    public void ganharJogo(){
        this.setVitorias(this.getVitorias() + 1);
    }
    public void perderJogo(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    public void empatarJogo(){
        this.setEmpates(this.getEmpates() + 1);
    }

    // Construtor

    public Lutador(String nome, int idade, String sexo, String pais, int vitorias, int empates, int derrotas) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.pais = pais;
        this.vitorias = vitorias;
        this.empates = empates;
        this.derrotas = derrotas;
    }

    // Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
}
