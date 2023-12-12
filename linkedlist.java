import java.util.*;

class linkedlist {
    public static void main(String args[]){
        LinkedList<String> list =new LinkedList<String>();
        list.addFirst("is");


        
        list.addLast("the");
        list.addFirst("4");
        for(int i=0; i<list.size();i++){
        if(list.get(i)=="4"){
             System.out.println(i);   
        }
    }
        System.out.println(list);
    }
}
