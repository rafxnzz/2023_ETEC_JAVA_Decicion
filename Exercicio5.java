import javax.swing.JOptionPane;

public class Exercicio5 
{
    public static void main(String[] args) 
    {
        double senha;
        senha = Double.parseDouble(JOptionPane.showInputDialog("Digite a senha"));

        if (senha == 123)
        {
            JOptionPane.showMessageDialog(null, "Senha válida");
        }
        else 
        {
            JOptionPane.showMessageDialog(null, "Senha inválida");
        }   
    }
}