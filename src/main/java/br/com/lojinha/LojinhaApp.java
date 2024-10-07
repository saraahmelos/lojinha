package br.com.lojinha;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.pojo.ItemIncluso;
import br.com.lojinha.pojo.Produto;
import br.com.lojinha.pojo.ProdutoInternacional;
import br.com.lojinha.pojo.ProdutoNacional;

import java.util.ArrayList;
import java.util.List;

public class LojinhaApp { // public é modificador // definição da classe

    public static void main(String[] args) { // metodos // definição do método principal da classe
        // aqui vamos abrir variavel e instaniar, dar vida ao produto
        // o new faz o processo
        //meuProduto.setMarca(" SM "); //chamei pelo contrutor
        //meuProduto.setTamanho(Tamanho.PEQUENO); // chamei pelo construtor

        Produto meuProduto = new Produto("Sony", Tamanho.MEDIO);


        // aqui vamos passar ou setar  valor p  os atributos
        meuProduto.setNome("Play Station 4");
        meuProduto.setValor(30);


        List<ItemIncluso> itensInclusos = new ArrayList<>();

        ItemIncluso primeiroItemIncluso = new ItemIncluso("Controle", 2);
        itensInclusos.add(primeiroItemIncluso);//0

        ItemIncluso segundoItemIncluso = new ItemIncluso("Jogos",3);
        itensInclusos.add(segundoItemIncluso);//1

        ItemIncluso terceiroItemIncluso = new ItemIncluso("Cabos de energia", 2);
        itensInclusos.add(terceiroItemIncluso);//2

        meuProduto.setItensInclusos(itensInclusos);

        System.out.println(" *** Começando a apresentar lista  dos itens inclusos *** ");

        for (ItemIncluso itemAtual: meuProduto.getItensInclusos()){
            System.out.println(itemAtual.getNome());
            System.out.println(itemAtual.getQuantidade());
        }
        System.out.println(" *** Finalizou a lista de itens inclusos *** ");

        System.out.println(meuProduto.getNome());
        System.out.println(meuProduto.getMarca());
        System.out.println(meuProduto.getTamanho());
        System.out.println(meuProduto.getValor());

        ProdutoNacional meuProdutoNacional = new ProdutoNacional("Sony", Tamanho.MEDIO);
        meuProdutoNacional.setImpostoNacional(0.55789);
        System.out.println(meuProdutoNacional.getImpostoNacional());
        System.out.println(meuProdutoNacional.getMarca());

        ProdutoInternacional meuProdutointernacional = new ProdutoInternacional(" Lg", Tamanho.GRANDE);
        meuProdutointernacional.setTaxaDeImportacao(0.5689);
        System.out.println(meuProdutointernacional.getTaxaDeImportacao());
        System.out.println(meuProdutointernacional.getMarca());

       meuProdutointernacional.setValor(-101);
    }
}
