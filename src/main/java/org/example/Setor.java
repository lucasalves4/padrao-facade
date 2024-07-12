package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class Setor {

    private List<Pedido> pedidosComPendencia = new ArrayList<Pedido>();

    public void addPedidoPendente(Pedido pedido) {
        this.pedidosComPendencia.add(pedido);
    }

    public boolean verificarPedidoComPendencia(Pedido pedido) {
        return this.pedidosComPendencia.contains(pedido);
    }

}
