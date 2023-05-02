import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {
    @Test
    void deveRetornarAtendimentoFarmacia() {
        Cliente cliente = new Cliente();

        assertEquals("Novo atendimento para Farmácia", cliente.novoAtendimento(1));
    }

    @Test
    void deveRetornarAtendimentoVendas() {
        Cliente cliente = new Cliente();

        assertEquals("Novo atendimento para Vendas", cliente.novoAtendimento(2));
    }

    @Test
    void deveRetornarAtendimentoBanhoTosa() {
        Cliente cliente = new Cliente();

        assertEquals("Novo atendimento para Banho e Tosa", cliente.novoAtendimento(3));
    }

    @Test
    void deveRetornarAtendimentoInvalido() {
        Cliente cliente = new Cliente();

        assertEquals("Número para atendimento inválido", cliente.novoAtendimento(4));
    }
}