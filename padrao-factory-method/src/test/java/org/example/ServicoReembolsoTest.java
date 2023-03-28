package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServicoReembolsoTest {
    @Test
    void deveExecutarReembolso() {
        IServico servico = ServicoFactory.obterServico("Reembolso");
        assertEquals("Reembolso efetuado", servico.executar());
    }

    @Test
    void deveCancelarReembolso() {
        IServico servico = ServicoFactory.obterServico("Reembolso");
        assertEquals("Reembolso cancelado", servico.cancelar());
    }
}
