public class AtendimentoFarmacia {
    private static AtendimentoFarmacia atendimentoFarmacia = new AtendimentoFarmacia();

    private AtendimentoFarmacia() {};

    public static AtendimentoFarmacia getInstancia() {
        return atendimentoFarmacia;
    }

    public String iniciarAtendimento() {
        return "Novo atendimento para Farmácia";
    }
}
