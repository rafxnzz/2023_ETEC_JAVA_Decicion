import javax.swing.JOptionPane;

public class Exercicio1 
{
    public static void main(String[] args) 
    {   
        char Sex;
        double alt, calf, calm ;
        
        alt = Double.parseDouble(JOptionPane.showInputDialog("Indique a sua altura em centimetros"));
        Sex = JOptionPane.showInputDialog("Indique o seu sexo: m ou f").charAt(0);
        
        if (Sex=='m')  
        {
            calm = (72.7*alt)-58 ;
            JOptionPane.showMessageDialog(null, "O peso ideal para a sua altura é: "+calm+" Kg");
        }
        if (Sex=='f')
        {
            calf = (62.1*alt)-44.7 ;
            JOptionPane.showMessageDialog(null,"O peso ideal para a sua altura é: "+calf+" Kg");
        }
    }
    
}
