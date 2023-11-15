package models;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Produto {
    private String nome;
    private double valor;
    private String categoria;

    public Produto(){
    }
    public Produto(String nome, double valor, String categoria){
        this.nome = nome;
        this.valor = valor;
        this.categoria = categoria;
    }
    List<Produto> listaDeProdutos = new ArrayList<>();
    public void cadastrarProduto() {
        Scanner scanner = new Scanner(System.in);

        int quantidadeProduto = 0;
        System.out.println("Quantos produtos deseja cadastrar: ");
        quantidadeProduto = scanner.nextInt();

        for (int i = 0; i < quantidadeProduto; i++) {
            System.out.println("Cadastrando produto " + (i + 1));
            System.out.println("Nome");
            String nome = scanner.next();
            System.out.println("Preço");
            double preco = scanner.nextDouble();
            System.out.println("Categoria");
            String categoria = scanner.next();

            Produto produto = new Produto(nome, preco, categoria);
            listaDeProdutos.add(produto);
        }
    }
    public void gerarRelatorioCSV(String nomeArquivo) {
        try (FileWriter writer = new FileWriter(nomeArquivo)) {
            // Escrever cabeçalho do CSV
            writer.append("Nome,Valor Unitário,Categoria\n");

            // Escrever dados dos produtos no CSV
            for (Produto produto : listaDeProdutos) {
                writer.append(produto.getNome())
                        .append(",")
                        .append(String.valueOf(produto.getValor()))
                        .append(",")
                        .append(produto.getCategoria())
                        .append("\n");
            }

            System.out.println("Relatório gerado com sucesso: " + nomeArquivo);

        } catch (IOException e) {
            System.err.println("Erro ao escrever no arquivo CSV: " + e.getMessage());
        }
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
