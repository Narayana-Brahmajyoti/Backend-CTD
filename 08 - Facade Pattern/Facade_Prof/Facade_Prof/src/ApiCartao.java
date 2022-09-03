public class ApiCartao {
    public static final String BANCO = "Star Bank";

    public int desconto(Cartao cartao) {
        if (cartao.getBanco().equals(BANCO)) {
            return 20;
        } else {
            return 0;
        }
    }
}
