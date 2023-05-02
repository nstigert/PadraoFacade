public class AtendimentoVendas {
    private static AtendimentoVendas atendimentoVendas = new AtendimentoVendas();

    private AtendimentoVendas() {};

    public static AtendimentoVendas getInstancia() {
        return atendimentoVendas;
    }

    public String iniciarAtendimento() {
        return "Novo atendimento para Vendas";
    }
}
