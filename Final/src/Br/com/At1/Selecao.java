package Br.com.At1;
import javax.swing.JOptionPane;
public class Selecao {
 public static void main(String[] args) {
    String nome;
    String selecao;
    selecao = JOptionPane.showInputDialog("Seleção do jogador e?" ,"digite aqui" );
    nome = JOptionPane.showInputDialog("o nome de seu jogador de futebol preferido?" ,"digite aqui" );  
    JOptionPane.showMessageDialog(null, "Nome do jogador: " + nome + "\nSeleção: " + selecao);  
    }
}
