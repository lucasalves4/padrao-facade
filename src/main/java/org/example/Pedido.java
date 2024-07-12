package org.example;

public class Pedido {

    public boolean finalizarPedido() {
        return PedidoFacade.verificarPendenciasPedido(this);
    }

}
