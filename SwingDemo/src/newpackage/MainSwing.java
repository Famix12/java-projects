package newpackage;


import java.awt.*;
import javax.swing.*;


public class MainSwing {

    public static void main(String[] args) {
//        window w = new window();
   a A = new a(20);
   
   
   
   int x = (int)4.5; 
   
   double y = 4; 
    
    }
}

//class window extends JFrame {
//
//    JButton btn = new JButton("Click me");
//
//    public window() {
//        setLayout(new FlowLayout());
//        setSize(500, 400);
//        setVisible(true);
//        setTitle("Ti");
////        btn.setSize(100, 150);
//        add(btn);
//    }
//
//}




class b { 
    
    public b(){
        System.out.println("B is 10");     
    }
    public b(int x){
        System.out.println("B is " + x);
    }
}

class a extends b{ 

    public a(int t){
        System.out.println("A is " + t);
    }
}
