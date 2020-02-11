 public class JogadorDeFutebol {
    public String nome;
    public int energia;
    public String alegria;
    public int gols;
    public int experiencia;

    public JogadorDeFutebol(String nome, int energia, String alegria, int gols, int experiencia) {
        this.nome = nome;
        this.energia = energia;
        this.alegria = alegria;
        this.gols = gols;
        this.experiencia = experiencia;
    }
    public void fazerGold() {
        if (this.energia >= 5) {
            this.energia -= 5;
            this.alegria = +10;
            this.gols++;
            System.out.println("GOOOOOOOOOLL!!!!!");
        } else {
            System.out.println("SEM ENERGIA!");
        }
    }
 }