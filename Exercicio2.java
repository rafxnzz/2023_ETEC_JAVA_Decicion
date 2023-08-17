import javax.swing.JOptionPane;

public class Exercicio2 
{
    public static void main(String[] args) 
    {
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog("Descubra se o numero inteiro indicado é positivo ou negativo"));
        
        if (num >=0)
        {
        JOptionPane.showMessageDialog(null, "O seu numero é positivo");
        }
        else
        {
        JOptionPane.showMessageDialog(null, "O seu numero é negativo");
        }
    }
}
