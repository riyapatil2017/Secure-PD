
import javax.swing.JButton;
import javax.swing.JFrame;


 
public class safecopy
{
public void safecopy()
{
    JFrame frame = new JFrame();
    
        JButton cfu=new JButton("Copy from USB");
        
        JButton cfs =new JButton("Copy from System");
        cfu.setBounds(110,180,180,70);
        cfs.setBounds(110,85,180,70);
        
        frame.add(cfu);
        frame.add(cfs);

        frame.setSize(400,400);

        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
}
public static void main(String args[])
{
    safecopy s = new safecopy();
    s.safecopy();
}
        
}


    

    

