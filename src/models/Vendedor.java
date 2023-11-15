package models;

import models.Pessoa;

import java.util.Scanner;

public class Vendedor extends Pessoa {
    private String rg;

    public Vendedor(){
    }
    public Vendedor(String nome, String email, String cpf,String rg, String endereco){
      super(nome,email,cpf,endereco);
      this.rg = rg;
    }

    public void cadastrarVendedor(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("#### CADASTRO VENDEDOR ####");
        System.out.print("Nome: ");
        setNome(scanner.next());
        System.out.print("Email: ");
        setEmail(scanner.next());
        System.out.print("1: cpf/2: rg: ");
        int acao = scanner.nextInt();
        if (acao == 1){
            setCpf(scanner.next());
        }else if (acao == 2){
            setRg(scanner.next());
        }
        System.out.print("Endereço: ");
        setEndereco(scanner.next());
        new Vendedor(getNome(), getEmail(),getCpf(), getRg(), getEndereco());
    }




    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
}
