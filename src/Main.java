import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Carrinho carrinho = new Carrinho();
        Scanner scan = new Scanner(System.in);

        int cont = 0;
        System.out.println("Deseja adicionar um produto no seu carrinho: Digite 'Y' para sim e qualquer outra tecla para Não.");
        String resp = scan.nextLine();
        while (resp.equalsIgnoreCase("y")){
            Produto produto = new Produto();

            System.out.println("Qual o nome do produto "+(cont+1)+" ? ");
            String nome = scan.nextLine();
            produto.setDescricao(nome);
            System.out.println("Qual o valor do produto "+(cont+1)+"? ");
            String valor = scan.nextLine();
            produto.setValor(Double.parseDouble(valor));
            System.out.println("Digite a quantidade do produto " + (cont + 1) + " que deseja: ");
            String quantidade = scan.nextLine();
            produto.setQuantidade(Integer.parseInt(quantidade));
            carrinho.getProdutos().add(produto);

            System.out.println("Deseja adicionar mais itens? Digite 'Y' para sim ou qualquer outra tecla para não.");
            resp = scan.nextLine();
            cont++;

        }
        System.out.println(" Seu carrinho de compras até o momento: ");
//        for (int i = 0; i < carrinho.getProdutos().size(); i++) {
//            System.out.println(carrinho.getProdutos().get(i));
//        }
        cont = 0;
        for (Produto produto: carrinho.getProdutos()) {
            System.out.println("Produto "+(cont+1)+": "+produto.getDescricao()+"\nPreço: "+produto.getValor()+"\nQuantidade: "+produto.getQuantidade());
            System.out.println("---------------------");
            cont++;
        }
        System.out.println("Valor total do Carrinho: "+carrinho.getPreco());
        System.out.println("Deseja remover algum produto? Digite 'Y' para sim ou qualquer outra tecla para não.");
        String aceptRemover = scan.nextLine();

        if (aceptRemover.equalsIgnoreCase("Y")){

            cont = 1;

            while (aceptRemover.equalsIgnoreCase("y")){
                System.out.println("Deixa remover qual do(s) "+carrinho.getProdutos().size()+" Produtos? Digite o número do produto. ");
                String numeroProd = scan.nextLine();
                carrinho.getProdutos().remove(Integer.parseInt(numeroProd) - cont);
                cont++;
                System.out.println("Deseja continuar a remover? 'Y' para sim");
                aceptRemover = scan.nextLine();

            }

            System.out.println("------------- LISTA FINAL -------------");
            cont = 0;
            for (Produto produto: carrinho.getProdutos()) {
                System.out.println("Produto "+(cont+1)+": "+produto.getDescricao()+"\nPreço: "+produto.getValor()+"\nQuantidade: "+produto.getQuantidade());
                System.out.println("---------------------");
                cont++;
            }
            System.out.println("Valor total do Carrinho: "+carrinho.getPreco());


        }



            
    }


}