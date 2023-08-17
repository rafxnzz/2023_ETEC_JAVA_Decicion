import javax.swing.JOptionPane;

public class Exercicio4 
{
    public static void main(String[] args) 
    {
        double qp, res;
        qp = Double.parseDouble(JOptionPane.showInputDialog("Indique o peso de peixe pescado"));
        
        if ( qp <= 50 )
        {
            JOptionPane.showMessageDialog(null, "Não será necessario pagar multa");
        }
        else
        {
            res= (qp - 50) * 4 ;  
            JOptionPane.showMessageDialog(null,"Será necessario pagar: "+res+" R$ de multa");
        }
    }
}
