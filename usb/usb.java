import update.update;
import update_display.display;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigInteger;
import java.security.MessageDigest;
import javax.swing.JButton;
import javax.swing.JFrame;

class JButtonExample 
{
   JButtonExample()
   {
        JFrame frame=new JFrame();

        JButton b=new JButton("User.");
        b.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                UserPassValidation ud=new UserPassValidation();
                ud.UserPassValidation1();

            }
        });
        JButton a=new JButton("Admin");
        a.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                UserPassValidation2 u=new UserPassValidation2();
                u.UserPassValidation3();
            }
        });
        
        b.setBounds(130,180,110, 70);
        a.setBounds(130,85,110,70);
        
        frame.add(b);
        frame.add(a);

        frame.setSize(400,400);

        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class UserPassValidation extends JFrame implements ActionListener
{
    String noori1,noori2;
  
  TextField nameField, passField, resultField;
  Label lab1, lab2, lab3;

  void UserPassValidation1()
  {                   

    setLayout(new GridLayout(3, 2, 0, 10));
    setBackground(Color.pink);  
                         
    nameField = new TextField(15);
    passField = new TextField(15);
    resultField = new TextField(15);
    lab1 = new Label("Enter User Name");
    lab2 = new Label("Enter Password");
    lab3 = new Label("Display Result");
    	             
    passField.addActionListener(this);
    	           
    passField.setEchoChar('*');
                                               
    resultField.setEditable(false);

    add(lab1);   add(nameField);
    add(lab2);   add(passField);
    add(lab3);   add(resultField);

    setTitle("User Name & Password Validation");
    setSize(300, 300);
    setVisible(true);
    setLocationRelativeTo(null);
   }
   public void actionPerformed(ActionEvent e)
   {                   
     String str1 = nameField.getText();
     String str2 = passField.getText();
    
     Hashing obj = new Hashing();
     
     noori1 = obj.MD5("zainab");
     noori2 = obj.MD5("zainab@123");
                       
     if((obj.MD5(str1)).equals(noori1) && (obj.MD5(str2)).equals(noori2))
     {  
       resultField.setText("VALID");
       Files_in_usb files = new Files_in_usb();
       files.Files_in_usb();
     }
     else
     {
       resultField.setText("INVALID, TRY AGAIN");
     }
   }
}

class UserPassValidation2 extends JFrame implements ActionListener
{
  String noori3, noori4;
  TextField nameField, passField, resultField;
  Label lab1, lab2, lab3;

  void UserPassValidation3()
  {                       
    setLayout(new GridLayout(3, 2, 0, 10));
    setBackground(Color.pink);  
    nameField = new TextField(15);
    passField = new TextField(15);
    resultField = new TextField(15);
    lab1 = new Label("Enter User Name");
    lab2 = new Label("Enter Password");
    lab3 = new Label("Display Result");
    	            
    passField.addActionListener(this);
    	           
    passField.setEchoChar('*');
                                              
    resultField.setEditable(false);

    add(lab1);   add(nameField);
    add(lab2);   add(passField);
    add(lab3);   add(resultField);

    setTitle("User Name & Password Validation");
    setSize(300, 300);
    setVisible(true);
    setLocationRelativeTo(null);
   }
   public void actionPerformed(ActionEvent e)
   {                   
     String str1 = nameField.getText();
     String str2 = passField.getText();
 
     Hashing ob = new Hashing();
        
     noori3 = ob.MD5("sarah");
     noori4 = ob.MD5("sarah@123");
     if((ob.MD5(str1)).equals(noori3) && (ob.MD5(str2)).equals(noori4))
     {
       resultField.setText("VALID");
      
       update obj= new update();
       obj.update();
     }
     else
     {
       resultField.setText("INVALID, TRY AGAIN");
     }
   }

}

                                                      

   class Files_in_usb
   {
     void Files_in_usb()
     {
         JFrame f = new JFrame();
         JButton x=new JButton("Safe Copy");
          x.setBounds(130,85,110,70);
           f.add(x);
           
        x.addActionListener(new ActionListener()
                {
          public void actionPerformed(ActionEvent e)
          {
           safecopy sc=new safecopy();
           sc.safecopy();
          }
               
           });
           f.setSize(400,400);

        f.setLayout(null);
        f.setVisible(true);
        f.setLocationRelativeTo(null);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
     }
   }
/*class DemoJFile extends JPanel
   implements ActionListener {
   JButton go;

   JFileChooser chooser;
   String choosertitle;

  public DemoJFile() {
    go = new JButton("Do it");
    go.addActionListener(this);
    add(go);
   }

  public void actionPerformed(ActionEvent e) {            
    chooser = new JFileChooser(); 
    chooser.setCurrentDirectory(new java.io.File("."));
    chooser.setDialogTitle(choosertitle);
    chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
    //
    // disable the "All files" option.
    //
    chooser.setAcceptAllFileFilterUsed(false);
    //    
    if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) { //button of ok cancel
        System.out.println("getCurrentDirectory(): " 
         +  chooser.getCurrentDirectory());
        System.out.println("getSelectedFile() : "
        +  chooser.getSelectedFile());
        //System.out.println("get current path" + chooser.getCanonicalPath());
        File file = chooser.getSelectedFile();
              //  File file = new File("a");
		File destinationDir = new File("E:\\");
                if(file.isFile())
                {
            try {
                FileUtils.copyFileToDirectory(file, destinationDir); // Logger.getLogger(DemoJFileChooser.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(DemoJFile.class.getName()).log(Level.SEVERE, null, ex);
            }
                }
                else
                {
            try {
                FileUtils.copyDirectory(file, destinationDir); //Logger.getLogger(DemoJFileChooser.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) 
            {
                Logger.getLogger(DemoJFile.class.getName()).log(Level.SEVERE, null, ex);
            }
               
                }
      }
    else {
      System.out.println("No Selection ");
      }
     }

  public Dimension getPreferredSize(){
    return new Dimension(200, 200);
    }

  void demo() 
  {
    JFrame frame = new JFrame("");
    DemoJFile panel = new DemoJFile();
    frame.addWindowListener(
      new WindowAdapter() {
        public void windowClosing(WindowEvent e) {
          System.exit(0);
          }
        }
      );
    frame.getContentPane().add(panel,"Center");
    frame.setSize(panel.getPreferredSize());
    frame.setVisible(true);
    }

    }

   }*/

 class Hashing{
   
     
    public static String MD5(String input)
    {
    
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
        
        byte[] messageDigest = md.digest(input.getBytes());
        BigInteger number = new BigInteger(1, messageDigest);
        String hashtext = number.toString(16);
        while(hashtext.length()<32)
        {
            hashtext = "0"+hashtext;
        }
        return hashtext;
    } catch (Exception e)
    {
        throw new RuntimeException(e);
    }
}
}



   class usb
   {
    public static void main(String args[])
   {
         new JButtonExample();    
   } 
    
   }