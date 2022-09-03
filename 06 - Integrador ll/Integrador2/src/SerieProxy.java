public class SerieProxy implements ISerie{
    private int qtdViews;
    private Serie serie;

    public int getQtdViews() {
        return qtdViews;
    }

    public void setQtdViews(int qtdViews) {
        this.qtdViews = qtdViews;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public String getSerie(String nomeSerie) throws SerieNaoHabilitadaException{
        String s = this.serie.getNomeSerie();
        serie.getSerie(serie.getNomeSerie());
        if (qtdViews < 5){
            qtdViews++;
            System.out.println("Buscando por: " + nomeSerie + ". Encontrado: " + s + ".");
        } else
            throw new SerieNaoHabilitadaException("Excede o número de reproduções permitidas");
        return s;
    }

    @Override
    public String getSerie(String nomeSerie) {
        return null;
    }
}
