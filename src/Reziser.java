public class Reziser {

    private String imeRezisera;
    private String prezimeRezisera;
    private int godineRezisera;

    public Reziser(){

    }
    public Reziser(String imeRezisera, String prezimeRezisera, int godineRezisera) {
        this.imeRezisera = imeRezisera;
        this.prezimeRezisera = prezimeRezisera;
        this.godineRezisera = godineRezisera;
    }

    public String getImeRezisera() {
        return imeRezisera;
    }

    public void setImeRezisera(String imeRezisera) {
        this.imeRezisera = imeRezisera;
    }

    public String getPrezimeRezisera() {
        return prezimeRezisera;
    }

    public void setPrezimeRezisera(String prezimeRezisera) {
        this.prezimeRezisera = prezimeRezisera;
    }

    public int getGodineRezisera() {
        return godineRezisera;
    }

    public void setGodineRezisera(int godineRezisera) {
        this.godineRezisera = godineRezisera;
    }

    public void print1(){
        System.out.println("Ime rezisera : " + imeRezisera + " prezime rezisera : " + prezimeRezisera + " koji ima : " + godineRezisera );
    }
}




