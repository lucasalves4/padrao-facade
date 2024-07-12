package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    @Test
    void deveRetornarPendenciaFinanceiroPedido() {
        Pedido pedido = new Pedido();
        Financeiro.getInstancia().addPedidoPendente(pedido);

        assertEquals(false, pedido.finalizarPedido());
    }

    @Test
    void deveRetornarPendenciaAdministrativoPedido() {
        Pedido pedido = new Pedido();
        Administrativo.getInstancia().addPedidoPendente(pedido);

        assertEquals(false, pedido.finalizarPedido());
    }

    @Test
    void deveRetornarPendenciaLogisticaPedido() {
        Pedido pedido = new Pedido();
        Logistica.getInstancia().addPedidoPendente(pedido);

        assertEquals(false, pedido.finalizarPedido());
    }

    @Test
    void deveRetornarPedidoSemPendenciaFinalizado() {
        Pedido pedido = new Pedido();

        assertEquals(true, pedido.finalizarPedido());
    }


}