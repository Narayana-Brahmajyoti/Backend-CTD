public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("1", "Free");
        Usuario usuario2 = new Usuario("2", "Premium");

        Download download = new ServicoDownloadProxy();
        download.baixarMusica(usuario1, "Mc Cesar - Canção infantil");
        download.baixarMusica(usuario2, "Morada - É tudo sobre você");
    }
}