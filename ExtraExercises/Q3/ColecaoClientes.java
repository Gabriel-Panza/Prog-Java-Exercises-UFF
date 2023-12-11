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
}