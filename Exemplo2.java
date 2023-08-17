import javax.swing.JOptionPane;

public class Exemplo2 
{
    public static void main(String[] args) 
    {
        double nota1, nota2, media;
        nota1 = 0;
        nota2 = 0;
        media = 0;
        
        nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 1º nota"));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 2º nota"));
        
        media = (nota1 + nota2)/2;
        if (media>=5)
        {
            JOptionPane.showMessageDialog(null, "O aluno foi aprovado com média: "+media);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "O aluno foi reprovado com média: "+media);
        }
    }
}