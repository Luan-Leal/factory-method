package org.example;

public class ServicoVenda  implements IServico{

    public String executar() {
        return "Venda efetuada";
    }

    public String cancelar() {
        return "Venda cancelada";
    }

}
