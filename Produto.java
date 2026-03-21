package dadosdoproduto;

import java.util.Scanner;

public class Produto {

    Scanner scanner = new Scanner(System.in);

   public String nome;
    public double preco;
    public int quantidade;


    public double valortotalemestoque(){return preco * quantidade;}
    public void adicionarprodutos(int quantidade){
        this.quantidade += quantidade;
    }
    public void removerprodutos(int quantidade){
        this.quantidade -= quantidade;
    }


public String toString(){
        return nome
                +", $"
                +preco
                +", "
                +quantidade
                +" unidades total: $"
                +valortotalemestoque();
}
}
