/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractclass;

/**
 *
 * @author shoaibswe
 */
public class AbstractClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        x a = new x(10) {};
        a.abs1(5);
// TODO code application logic here
    }
    
}

abstract class abstractclassexm{

int m;
int z;
abstractclassexm(int x){
m=x;
}

abstract public void abs1(int z);

}

class x extends abstractclassexm{

    public x(int x) {
        super(x);
        System.out.println(x);
    }
    

    //@Override
//    public void abs1(int z) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
 void y(){
    System.out.println("y");
}

    @Override
    public void abs1(int z) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

class n extends x{

    public n(int x) {
        super(x);
    }

    @Override
    void y() {
        super.y(); //To change body of generated methods, choose Tools | Templates.
    }
    
//    @Override
//    public void abs1(int z){
//    
//    }

    
}

   