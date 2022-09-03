public class ServicoDownloadProxy extends ServicoDownload {

    @Override
    public void baixarMusica(Usuario usuario, String nomeMusica){
        if(usuario.getTipoUsuario().equalsIgnoreCase("Premium")){
            ServicoDownload servicoDownload = new ServicoDownload();
            servicoDownload.baixarMusica(usuario, nomeMusica);
        } else {
            System.out.println("Download não permitido para categoria Free, ative o Premium e venha curtir suas músicas prediletas offline.");
        }

    }
}
