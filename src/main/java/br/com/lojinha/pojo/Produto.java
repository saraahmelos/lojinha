package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;

import javax.swing.plaf.basic.BasicListUI;
import java.util.List;

public class Produto {
    // itens ou caracteristica que compoe o produto

    private String nome;
    private String marca;
    protected double valor;
    private Tamanho tamanho;
    private List<ItemIncluso> itensInclusos;

    // contrutores - define comandos que serao iniciados durante a instanciação( abrira assim que der new no objt)
   // public Produto() {
   //     this.marca = "Sony";
   // }
    // EXEMPL CONSTR C/ 2 PARAMETRO - EX NA CLASSE EXECUTA
    public Produto (String marcaInicial, Tamanho tamanhoInicial) {
      this.marca = marcaInicial;
      this.tamanho = tamanhoInicial;
    }


    // METODO PARA CAPITURAR e ATRIBUIR VALOR
    public String getMarca(){
        return this.marca;
    }

    public void setMarca( String novaMarca) {
        this.marca = novaMarca;
    }


    public Tamanho getTamanho(){
        return this.tamanho;
    }

    public void setTamanho( Tamanho novoTamanho) {
        this.tamanho = novoTamanho;
    }


    public double getValor() {
        return this.valor;
    }


    public void setValor( double novoValor) {
        if (novoValor > 0){
            this.valor = novoValor;
        }
        else{
            throw new IllegalArgumentException("Valores devem ser maiores que 0");
        }

    }

    public String getNome(){
        return this.nome;
    }

    public void setNome( String novoNome) {
        this.nome = novoNome;
    }

    public List<ItemIncluso> getItensInclusos() {
        return itensInclusos;
    }

   public void setItensInclusos (List<ItemIncluso> novoItem){
        this.itensInclusos = novoItem;
   }


}
