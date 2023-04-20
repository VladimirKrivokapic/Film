public class Film {

    private String nazivFilma;
    private int godinaFilma;
    private String reziser;

    private int godineRezisera;

    public Film(String nazivFilma, int godinaFilma, String reziser, int godineRezisera) {
        this.nazivFilma = nazivFilma;
        this.godinaFilma = godinaFilma;
        this.reziser = reziser;
        this.godineRezisera = godineRezisera;
    }

    public String getNazivFilma() {
        return nazivFilma;
    }

    public void setNazivFilma(String nazivFilma) {
        this.nazivFilma = nazivFilma;
    }

    public int getGodinaFilma() {
        return godinaFilma;
    }

    public void setGodinaFilma(int godinaFilma) {
        this.godinaFilma = godinaFilma;
    }

    public String getReziser() {
        return reziser;
    }

    public void setReziser(String reziser) {
        this.reziser = reziser;
    }

    public int getGodineRezisera() {
        return godineRezisera;
    }

    public void setGodineRezisera(int godineRezisera) {
        this.godineRezisera = godineRezisera;
    }

    public void print(){
        System.out.println("Naziv filma : " + nazivFilma + " " + godinaFilma);
        System.out.println("Rezirao je : " + reziser + " koji ima : " + godineRezisera + " godine");
    }

    @Override
    public String toString() {
        return "Film{" +
                "nazivFilma='" + nazivFilma + '\'' +
                ", godinaFilma=" + godinaFilma +
                ", reziser='" + reziser + '\'' +
                '}';
    }
}
