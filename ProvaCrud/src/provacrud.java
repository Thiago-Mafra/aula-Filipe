
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class provacrud {

    public static void main(String[] args) {
        ArrayList<Product> produto = new ArrayList<Product>();
        

        while (true) {
            int opcao = exibirMenu();

            switch (opcao) {
                case 1: // Criar
                    cadastrarProduto(produto);
                    break;
                case 2: // Ler
                    listarProduto(produto);
                    break;
                case 3: // Atualizar
                    atualizarProduto(produto);
                    break;
                case 4: // Deletar
                    deletarProduto(produto);
                    break;

                case 5:// Reservar produto
                    reservarProduto(produto);

                case 6:// Reservar produto
                    deletarReserva(produto);

                case 7: // Sair
                    JOptionPane.showMessageDialog(null, "Encerrando o programa.");
                    return;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
            }
        }
    }

    private static int exibirMenu() {
        String menu = "Escolha uma opção:\n"
                + "1. Cadastrar produto\n"
                + "2. Listar produtos\n"
                + "3. Atualizar produtos\n"
                + "4. Deletar produto\n"
                + "5. Reservar produtos\n"
                + "6. Deletar reserva produtos\n"
                + "7. Sair";

        String opcaoErrada = JOptionPane.showInputDialog(menu);

        try {
            return Integer.parseInt(opcaoErrada);
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    private static void cadastrarProduto(ArrayList<Product> produto) {
        String nome = JOptionPane.showInputDialog("Digite o nome do produto a ser cadastrado:");
        Double valorUnitario = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser cadastrado:"));
        int qtdDisponivel = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade a ser cadastrado:"));

        ArrayList<Product> p = new ArrayList<Product>();

        JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");
    }

    private static void listarProduto(ArrayList<Product> produto) {
        StringBuilder lista = new StringBuilder("Produtos cadastrados:\n");
        for (int i = 0; i < produto.size(); i++) {
            lista.append(i + 1).append(". ").append(produto.get(i)).append("\n");
        }
        JOptionPane.showMessageDialog(null, lista.toString());
    }

    private static void atualizarProduto(ArrayList<Product> produto) {

        int indice = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do produto a ser atualizado:")) - 1;

        if (indice >= 0 && indice < produto.size()) {
            String novoProduto = JOptionPane.showInputDialog("Digite o novo Produto:");

            JOptionPane.showMessageDialog(null, "Produto atualizado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Índice inválido. Nenhum produto foi atualizado.");
        }
    }

    private static void deletarProduto(ArrayList<Product> produto) {

        int indice = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do produto a ser deletado:")) - 1;

        if (indice >= 0 && indice < produto.size()) {
            produto.remove(indice);
            JOptionPane.showMessageDialog(null, "Produto deletado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Índice inválido. Nenhum nome foi deletado.");
        }
    }

    private static void reservarProduto(ArrayList<Product> produto) {
        String produtos = JOptionPane.showInputDialog("Digite o produto a ser cadastrado:");

        JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");
    }

    private static void deletarReserva(ArrayList<Product> produto) {

        int indice = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do produto a ser deletado:")) - 1;

        if (indice >= 0 && indice < produto.size()) {
            produto.remove(indice);
            JOptionPane.showMessageDialog(null, "Produto deletado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Índice inválido. Nenhum nome foi deletado.");
        }
    }

}
