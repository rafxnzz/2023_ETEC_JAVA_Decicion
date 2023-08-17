import javax.swing.JOptionPane;

public class Exercicio6
{   
    public static void main(String[] args) 
    {
        int ano, anor;
        ano = Integer.parseInt(JOptionPane.showInputDialog("Indique o ano de nacimento"));

        anor = 2023 - ano;

        if (anor>=18)
        {
            JOptionPane.showMessageDialog(null,"Atingiu a maioridade");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Não atingiu a maioridade");
        }
    }
}