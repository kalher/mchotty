/**
 * Created with IntelliJ IDEA.
 * User: Jamie
 * Date: 12/06/13
 * Time: 16:37
 * To change this template use File | Settings | File Templates.
 */
public class Meter {
    int value;
    public Meter(int i) {
        //To change body of created methods use File | Settings | File Templates.
       this.value = i;
    }
     @Override
     public String toString(){
             String mystring = new String();
             mystring = value + "m";
             return mystring;
     }

    public static void main(String[] args) {
        Meter meter = new Meter(9);
        System.out.println(meter);
    }
}
