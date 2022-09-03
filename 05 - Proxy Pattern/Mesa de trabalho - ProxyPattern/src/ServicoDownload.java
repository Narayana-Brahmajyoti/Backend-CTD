public class ServicoDownload implements Download{

    @Override
    public void baixarMusica(Usuario usuario, String nomeMusica) {
        System.out.println("Usuário " + usuario.getId() + " - " + usuario.getTipoUsuario() + ": download da música '" + nomeMusica + "' realizado com sucesso.");
    }



}
