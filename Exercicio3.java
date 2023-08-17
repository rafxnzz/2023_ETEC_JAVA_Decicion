import javax.swing.JOptionPane;

public class Exercicio3 
{
    public static void main(String[] args) 
    {
    double num1, num2, res;
    
    num1 = Double.parseDouble(JOptionPane.showInputDialog("Indique o 1º numero da soma"));
    num2 = Double.parseDouble(JOptionPane.showInputDialog("Indique o 2º numero da soma"));
    
    res = num1 + num2 ;
    
    if (res >=25)
    {
    JOptionPane.showMessageDialog(null, "Soma maior que 25");
    }
    }
}
