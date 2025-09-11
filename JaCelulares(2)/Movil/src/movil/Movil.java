package movil;
import javax.swing.*;
/**
 *
 * @author Joseph
 */
public class Movil{

    /**
     * @param args the command line arguments
     */    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Cellphone Celphone1 = new Cellphone();
        Cellphone Celphone2 = new Cellphone("Desconocido",0,0.00F,false, null);

        JOptionPane.showMessageDialog(null,"Estado inicial de los Celphonees\n"+
        Celphone1.toString() + "\n" +Celphone2.toString());

        Celphone1.setNumber("123-123-1234");
        Celphone1.setBatery(79);
        Celphone1.setAcountBalance(137.00F);
        Celphone1.setOn(true);

        Celphone2.setNumber("231-157-0409");
        Celphone2.setBatery(12);
        Celphone2.setAcountBalance(2.00F);
        Celphone2.setOn(false);

        JOptionPane.showMessageDialog(null,"Estado actural de los Celphonees\n"+
                Celphone1.toString() + "\n" +Celphone2.toString());

        JOptionPane.showMessageDialog(null,"Celphone 1\n"+
                "Numero de telefono: "+Celphone1.getNumber());

        JOptionPane.showMessageDialog(null,"Celphone 1\n"+
                "Bateria: "+Celphone1.getBatery() + "%");

        JOptionPane.showMessageDialog(null,"Celphone 1\n"+
                "Saldo: $ "+Celphone1.getAcountBalance());

        JOptionPane.showMessageDialog(null,"Celphone 1\n"+
                "Estado: "+Celphone1.isOn());

        JOptionPane.showMessageDialog(null,"Celphone 2\n"+
                "Numero de telefono: "+Celphone2.getNumber());

        JOptionPane.showMessageDialog(null,"Celphone 2\n"+
                "Bateria: "+Celphone2.getBatery() + "%");

        JOptionPane.showMessageDialog(null,"Celphone 2\n"+
                "Saldo: $ "+Celphone2.getAcountBalance());

        JOptionPane.showMessageDialog(null,"Celphone 2\n"+
                "Estado: "+Celphone2.isOn());
    }
    
}
