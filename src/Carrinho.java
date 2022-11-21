
import java.util.ArrayList;
import java.util.List;

public class Carrinho {



    private List<Produto> produtos = new ArrayList<Produto>();

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public double getPreco (){
        double soma = 0.0;
        for (Produto produto: produtos) {
            soma +=(produto.getValor()*produto.getQuantidade());
        }
        return soma;
    }
}
