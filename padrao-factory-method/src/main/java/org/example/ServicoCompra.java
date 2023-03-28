package org.example;

public class ServicoCompra implements IServico {

    public String executar() {
        return "Compra efetuada";
    }

    public String cancelar() {
        return "Compra cancelada";
    }
}
