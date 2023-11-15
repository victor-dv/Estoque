package programa;

import models.Cliente;
import models.EstoqueRoupas;
import models.Produto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EstoqueRoupas estoque = new EstoqueRoupas();

        Produto produto = new Produto();
        produto.cadastrarProduto();
         produto.gerarRelatorioCSV("Java");



    }
}
