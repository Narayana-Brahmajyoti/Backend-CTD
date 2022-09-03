public class Lote extends Gerenciador {
    @Override
    public void verificar(Artigo artigo) {
        if (artigo.getLote() > 999 && artigo.getLote() < 2001){
            if(this.getGerenciadorSeguinte() != null) {
                this.getGerenciadorSeguinte().verificar(artigo);
            }
        }else{
            System.out.println("Produto rejeitado por não atender aos requisitos de qualidade");
        }
    }
}
