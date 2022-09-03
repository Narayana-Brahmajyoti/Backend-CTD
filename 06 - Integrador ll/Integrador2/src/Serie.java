public class Serie implements ISerie{

    private String nomeSerie;
    private String pais;

    public Serie(String nomeSerie, String pais) {
        this.nomeSerie = nomeSerie;
        this.pais = pais;
    }

    public String getNomeSerie() {
        return nomeSerie;
    }

    public void setNomeSerie(String nomeSerie) {
        this.nomeSerie = nomeSerie;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }


    @Override
    public String getSerie(String nomeSerie) {
        return null;
    }
}
