public class Peso extends Gerenciador {
    @Override
    public void verificar(Artigo artigo) {

        if (artigo.getPeso() > 1199 && artigo.getPeso() < 1301){
            if(this.getGerenciadorSeguinte() != null) {
                this.getGerenciadorSeguinte().verificar(artigo);
            }
        }else{
            System.out.println("Produto rejeitado por não atender aos requisitos de qualidade");
        }
    }
}
