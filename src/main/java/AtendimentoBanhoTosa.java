public class AtendimentoBanhoTosa {
    private static AtendimentoBanhoTosa atendimentoBanhoTosa = new AtendimentoBanhoTosa();

    private AtendimentoBanhoTosa() {};

    public static AtendimentoBanhoTosa getInstancia() {
        return atendimentoBanhoTosa;
    }

    public String iniciarAtendimento() {
        return "Novo atendimento para Banho e Tosa";
    }
}
