package datastructuce.LenkedList;

public class Lenkedlist {
private Node first;
private Node last;

    public class Node {
        private int value;
        private Node next;

        public Node(int value){
            this.value=value;
        }
    }

    public void addlast(int item){
        var node=new Node(item);

        if(first==null) first=last=node;
        else {
            last.next=node;
            last=node;
        }
    }

public void addfirst(int item){
    var obj1= new Node(item);
    if(first==null) {
        first = last =obj1;
    }else{
        obj1.next=first;
    first=obj1;
    }
}

public int indexOf(int item){
int index=0;
var current=first;
while(current != null){
    if(current.value==item) return index;
    current=current.next;
    index++;
}
return -1;
    }

    public boolean conrains(int item){
//        var current=first;
//        while(current!=null){
//            if(current.value==item) return true;
//            current=current.next;
//        }
//        return false;
        return indexOf(item)!=-1;
    }
    public void removefirst(){
        var second=first.next;
        first.next=null;
        first=second;
        }
    public void removelast(){
     var prevuas =getprevuas(last);
     last=prevuas;
     last.next=null;

    }

    private Node getprevuas(Node node){
        var current=first;
        while (current != null){
            if(current.next == node) return current;
            current=current.next;
        }
        return null;
    }

    public int siza(){
        int index=1;
        var current=first;
        while(current !=null){
            if(current.next==null) return index;
               current=current.next;
                index++;
        }
        return 0;
    }

    public int[] toarray(){
        var current=first;
        int[] array = new int[siza()];
        //mosh- way

//        var index =0;
//        while(current != null){
//            array[index++]=current.value;
//            current=current.next;
//        }
//        return array;

        //my - way
        for(int i=0; i<siza(); i++){
           if(current==null) return array;
             else{
                 array[i]=current.value;
                 current=current.next;
             }
           }
        return array;
        }
        public void reverse(){
        var current = first;
        int[] array= new int[siza()];
        for(int i =siza(); i>0; i--){
            array[(i-1)]= current.value;
            current=current.next;
        }
        current = first;
        for(int i =0; i<siza(); i++){
            current.value=array[i];
          current= current.next;
        }
        }

        // 50-40-30-20-10
       //   1-2 - 3 -4 -5
    public int kthNode(int k){
        if(k>5)throw new IllegalArgumentException();
        var a=first;
        var b=last;
        if(k>=1 && k<=5)
        for(int i=0; i<6-k; i++){
            b=a;
            a=a.next;
        }
        return b.value;
    }

    }


