package models;

import java.util.Scanner;

public class Cliente extends Pessoa {
    private String cnpj;
    private int telefone;

    public Cliente(){
    }
    public Cliente(String nome, String email, int telefone, String cpf, String cnpj, String endereco){
        super(nome,email,cpf,endereco);
        this.cnpj = cnpj;
        this.telefone = telefone;
    }

    public void cadastrarCliente(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("#### CADASTRO CLIENTE ####");
        System.out.print("Nome: ");
        setNome(scanner.next());
        System.out.print("Email: ");
        setEmail(scanner.next());
        System.out.print("Telefone: ");
        setTelefone(scanner.nextInt());
        System.out.print("1: cpf/2: cnpj: ");
        int acao = scanner.nextInt();
        if (acao == 1){
            setCpf(scanner.next());
        }else if (acao == 2){
            setCnpj(scanner.next());
        }
        System.out.print("Endereço: ");
       setEndereco(scanner.next());
        new Cliente(getNome(), getEmail(), getTelefone(),getCpf(), getCnpj(), getEndereco());
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
}
