public class AtendimentoFacade {
    public static String novoAtendimento(int numAtendimento) {
        if(numAtendimento == 1) {
            return AtendimentoFarmacia.getInstancia().iniciarAtendimento();
        }
        if(numAtendimento == 2) {
            return AtendimentoVendas.getInstancia().iniciarAtendimento();
        }
        if(numAtendimento == 3) {
            return AtendimentoBanhoTosa.getInstancia().iniciarAtendimento();
        }
        return "Número para atendimento inválido";
    }
}
