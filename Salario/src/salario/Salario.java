
package salario;
        

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Salario {

    public static void main(String args[]) {
        int opcao = 0;
        Controle ctl = new Controle();
        String msg = "Digite a opcao: \n 1- Inserir assalariado \n 2- Inserir horista \n 3- listar \n 4- editar assalariado \n 5- editar horista \n 0- Sair";
       
        ArrayList<Funcionario> Folha = new ArrayList<Funcionario>();
       
        Folha = Util.le();
       
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(msg));
            switch (opcao) {
                case 1: {
                    ctl.insereassalariado(Folha);
                }
                break;
                case 2: {
                    ctl.inserehorista(Folha);
                }
                break;
                case 3: {
                    ctl.listar(Folha);
                }
                break;
                case 4: {
                    ctl.editarassalariado(Folha);
                }
                break;
                 case 5: {
                    ctl.editarhorista(Folha);
                }
                break;
                case 0:{
                    Util.grava(Folha);
                    JOptionPane.showMessageDialog(null, "Saindo");
                }
                break;
                default:{
                    JOptionPane.showMessageDialog(null, "Opção inválida");
                }
            }

        } while (opcao != 0);
    }


}
