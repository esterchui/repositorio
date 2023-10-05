
package salario;

    import java.util.ArrayList;
    import javax.swing.JOptionPane;


public class Controle {
   
    public static void inserecosmetico(ArrayList<Cosmeticos> Estoque) {
        Cosmeticos cosmetico = new Cosmeticos();
        char opcao;
        cosmetico.setMarca(JOptionPane.showInputDialog("Digite a marca: "));
        cosmetico.setProduto(JOptionPane.showInputDialog("Digite o produto: "));
        cosmetico.setCor(JOptionPane.showInputDialog("Digite a cor da embalagem: "));
        cosmetico.setPreco(Float.parseFloat(JOptionPane.showInputDialog("Digite o preço: ")));
        cosmetico.setPeso(Float.parseFloat(JOptionPane.showInputDialog("Digite o peso: ")));

        try {
                cosmetico.setId(Integer.parseInt(JOptionPane.showInputDialog("Digite o ID:")));
                cosmetico.setAnofab(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de fabricação:")));
                cosmetico.setAnoven(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de vencimento:")));
             } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro de conversão");
         }

       
       
        Estoque.add(cosmetico);
    }



    public static void listarcosmetico(ArrayList<Cosmeticos> Estoque) {
        String msg = "Lista de cosmeticos do estoque \n";
        int tamanho = Estoque.size();
        Cosmeticos cosmetico = new Cosmeticos();
        if (tamanho == 0) {
            JOptionPane.showMessageDialog(null, "Estoque Vazio !!");
        }
        else {
            for (int i = 0; i < tamanho; i++) {
               

                msg = msg + "ID: " +  Estoque.get(i).getId();
                msg = msg + "\nMarca: " +  Estoque.get(i).getMarca();
                msg = msg + "\nProduto: " + Estoque.get(i).getProduto();
                msg = msg + "\nCor da embalagem: " + Estoque.get(i).getCor();
                msg = msg + "\nPreço: " + Estoque.get(i).getPreco();
                msg = msg + "\nAno de fabricação: " + Estoque.get(i).getAnofab();
                msg = msg + "\nAno de vencimento: " + Estoque.get(i).getAnoven();
                msg = msg + "\nPeso: " + Estoque.get(i).getPeso();
                msg = msg + "\nTipo: " + Estoque.get(i).getTipo();
                msg = msg + "\n___________________________________________________ \n";
            }
            JOptionPane.showMessageDialog(null, msg);
        }
    }
   
     public static void editarcosmetico(ArrayList<Cosmeticos> Estoque) {
    String msg = "Lista de cosmeticos do estoque \n";
        int tamanho = Estoque.size();
        Cosmeticos cosmetico = new Cosmeticos();
        if (tamanho == 0) {
            JOptionPane.showMessageDialog(null, "Estoque Vazio !!");
        }
        else {
            for (int i = 0; i < tamanho; i++) {
      tamanho = (Integer.parseInt(JOptionPane.showInputDialog("Digite a posição a alterar entre 0 e " + (Estoque.size() - 1))));
                    }
     Estoque.get(tamanho).setId((Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ID", Estoque.get(tamanho).getId()))));
     Estoque.get(tamanho).setCor(JOptionPane.showInputDialog(null, "Digite a cor", Estoque.get(tamanho).getCor()));
     Estoque.get(tamanho).setPreco(Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o preço", Estoque.get(tamanho).getPreco())));
             
        }
    }

    public Controle() {
    }
   
}


    
}
