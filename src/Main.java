import java.util.ArrayList;
import java.util.*;
class Test{
    private int _x;
    public Test(){}
    public Test(int a){_x = a;}
    public void setx (int a){_x=a;}
    public int getx(){return _x;}
    public boolean equals(Object t) {
        if(this == t) return true;
        if(t == null) return false;
        if(t instanceof Test)
            return _x == ((Test)t)._x;
        return false;
    }
}
class Test2{
    private int _y;
    public Test2(){}
    public Test2(int a){_y = a;}
    public void sety(int a) {_y = a;}
    public int gety (){return _y;}
}
class Stuff <T>{ //T is a data type variable
    private  ArrayList<T> _thing;
    public Stuff(){_thing = new ArrayList<T>();}
    public Stuff (int size){_thing = new ArrayList<T>(size);} //

    // if it wasn't an arraylist set/get methods
//    public T getThing(){return _thing;}
//    public void setThing (T t){_thing = t;}

    public void additem(T t){_thing.add(t);}
    public T removeitem (int idx){
        if(idx <= 0 || idx>= _thing.size()){
            return null;
        }
        else{
            return _thing.remove(idx);
        }
        //if(idx < _thing.size() && idx >=0){
        //  T item = _thing.remove(idx);
        //  return item;
        //}
        //return null;
    }
    public boolean finditem(T item){
        boolean found = false;
        int idx = 0;
        while(!found && idx <_thing.size()){
            if(_thing.get(idx).equals(item)){
                found = true;
            }
            idx++;
        }
        return found;
    }
    public void print(){
        if(_thing !=null)
            System.out.println("Type: "+_thing.getClass().getName() +", value: " + _thing);
        else
            System.out.println("null member variable");
    }
}
public class Main {
    public static void main(String[] args){
        Stuff<Test> s = new Stuff<Test>();
        Stuff<Test> s2 = new Stuff<Test>(5);
        s.additem(new Test(3));
        Test t = new Test(3);
        System.out.println(s.finditem(t));
    }
}


//        s.print();
//        s.setThing(new Test(5));
//        s.print();
//        System.out.println(s.getThing().getx());
