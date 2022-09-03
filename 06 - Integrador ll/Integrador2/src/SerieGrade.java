public class SerieGrade implements ISerie{

    @Override
    public String getSerie(String nomeSerie) {
        Serie s = null;

        String link = "www." + nomeSerie.toLowerCase().replace(" ","") + ".com";

        switch (nomeSerie) {
            case "The Black list":
                s = new Serie("The Black list", "Argentina");
                break;
            case "The big bang theory":
                s = new Serie("The big bang theory", "Brasil" );
                break;
            case "Manifest":
                s = new Serie("Manifest", "Colombia");
                break;
            case "For Life":
                s = new Serie("For Life", "Argentina");
                break;
            case "Suits":
                s = new Serie("Suits", "Colombia");
                break;
        }
        return link;
    }
}
