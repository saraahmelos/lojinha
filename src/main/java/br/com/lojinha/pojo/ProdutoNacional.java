package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.interfaces.Favorito;

// aqui estamos usando extends para pegar tudo da classe produto - se chama herança.

public class ProdutoNacional extends Produto implements Favorito {
    private double impostoNacional;



    public ProdutoNacional(String marcaInicial, Tamanho tamanhoInicial) {
        super(marcaInicial, tamanhoInicial);
    }

    public double getImpostoNacional() {
        return this.impostoNacional;
    }

    public void setImpostoNacional(double novoImpostoNacional) {
        this.impostoNacional = novoImpostoNacional;
    }

    @Override
    public String getDadosFavoritos() {
        return this.getNome() + "," + this.getMarca() + ", " + "e" + this.getValor();
    }
}
