package org.example;

public class ServicoReembolso implements IServico{

    public String executar() {
        return "Reembolso efetuado";
    }

    public String cancelar() {
        return "Reembolso cancelado";
    }
}
