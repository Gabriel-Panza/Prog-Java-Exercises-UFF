package ExtraExercises.Q3;

import java.util.*;

public class ColecaoClientes {
    private Queue<Cliente> filaClientes = new LinkedList<>();

    public void adicionarCliente(Cliente cliente) {
        filaClientes.add(cliente);
    }

    public Cliente obterProximoCliente() {
        return filaClientes.poll();
    }

    public static void main(String[] args) {
        ColecaoClientes colecaoClientes = new ColecaoClientes();
        colecaoClientes.adicionarCliente(new Cliente("Cliente1", "111.111.111-11"));
        colecaoClientes.adicionarCliente(new Cliente("Cliente2", "222.222.222-22"));
        colecaoClientes.adicionarCliente(new Cliente("Cliente3", "333.333.333-33"));

        Thread atendente1Thread = new Thread(new Atendente("Atendente1", colecaoClientes));
        Thread atendente2Thread = new Thread(new Atendente("Atendente2", colecaoClientes));

        atendente1Thread.start();
        atendente2Thread.start();
    }
}