import java.util.*; 
public class GroceryList {
    GroceryList(){
        v1 = new Vector<String>();
    }

    public void add(String item){
        v1.add(item);
    }

    public void remove(String item){
        for(String str: v1){
            if(str.equals(item)){
                int i = v1.indexOf(item);
                v1.remove(i);
            }
        }
    }

    @Override
    public String toString(){
        String str = "Grocery List ";
        for(String item: v1){
            str = str + item + " ";
        }
       return str;
    }

    private Vector<String> v1;
}

