package org.example;

public class PedidoFacade {

    public static boolean verificarPendenciasPedido(Pedido pedido) {
        if (Financeiro.getInstancia().verificarPedidoComPendencia(pedido)) {
            return false;
        }
        if (Administrativo.getInstancia().verificarPedidoComPendencia(pedido)) {
            return false;
        }
        if (Logistica.getInstancia().verificarPedidoComPendencia(pedido)) {
            return false;
        }
        return true;
    }

}
