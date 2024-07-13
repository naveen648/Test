import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Iterators_Call {
    
    public static void main(String[] args) {
        Collection<Integer> it1=new ArrayList<Integer>();
        it1.add(10);
        it1.add(25);
        it1.add(30);
        remove(it1);
        System.out.println(it1);
    }

    static void remove(Collection<?> c){
        Iterator<?> it=c.iterator();

        while(it.hasNext()){
            int x=(Integer)it.next();
            if(x%2==0){
                it.remove();
            }
        }
        
    }


}
