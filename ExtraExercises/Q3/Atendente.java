package ExtraExercises.Q3;

public class Atendente implements Runnable {
    private String nome;
    private ColecaoClientes colecaoClientes;

    public Atendente(String nome, ColecaoClientes colecaoClientes) {
        this.nome = nome;
        this.colecaoClientes = colecaoClientes;
    }

    @Override
    public void run() {
        while (true) {
            Cliente cliente = colecaoClientes.obterProximoCliente();

            if (cliente == null) {
                System.out.println(nome + " encerrou.");
                break;
            }

            System.out.println(nome + " atendendo: " + cliente.getNome());
        }
    }
}
