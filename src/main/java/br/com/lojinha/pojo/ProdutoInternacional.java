package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.interfaces.Favorito;

public class ProdutoInternacional extends Produto implements Favorito {

    private double taxaDeImportacao;

    public ProdutoInternacional(String marcaInicial, Tamanho tamanhoInicial) {
        super(marcaInicial, tamanhoInicial);
    }

    public double getTaxaDeImportacao() {
        return taxaDeImportacao;
    }

    public void setTaxaDeImportacao(double taxaDeImportacao) {
        this.taxaDeImportacao = taxaDeImportacao;
    }

    public void setValor( double novoValor) {
        if (novoValor > -100){
            this.valor = novoValor;
        }
        else{
            throw new IllegalArgumentException("Valos devem ser maiores que -100.00 ");
        }

    }

    @Override
    public String getDadosFavoritos() {
        return this.getNome() + ", " + this.getMarca() + ", " + "e" + this.getValor();
    }
}
