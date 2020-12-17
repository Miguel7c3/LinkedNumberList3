import java.util.LinkedList;

public class Runner {


    public static void main(String[]args){

        LinkedNumberList  linkedNumberList = new LinkedNumberList();
        linkedNumberList.insert(1);
        linkedNumberList.insert(2);
        linkedNumberList.insert(2);
        linkedNumberList.insert(3);
        linkedNumberList.insert(4);
        //System.out.println(linkedNumberList.contains(1));
        System.out.println(linkedNumberList.frequency(linkedNumberList.getHead(),9));

 /*       LinkedNumberList test1 =  new LinkedNumberList();
        test1.insert(32);
        test1.insert(10);
        test1.insert(11);
        test1.insert(31);


        test1.frequency(test1 ,32);   // I made the method frequency non static and it will return test1 as type LinkedNumber list, however return type Lnode is expected
*/
//        LinkedNumberList.frequency (test1,32); // I made the method frequency static and it  "        " .



//        System.out.println(test1.toString());
//        System.out.println(test1.contains(1));


    /*    LinkedList laLista = new LinkedList();
        laLista.addFirst(4);
        laLista.add(6);
        laLista.add(21);
        laLista.add(5);
        laLista.addLast(4);

        laLista.getFirst();*/

//        LinkedNumberList.frequency(laLista,4);
//        System.out.println(laLista);


//        LinkedNumberList.frequency (test1,32);






    }

/*    public int frequency( Lnode myList, int element ){

        if( myList == null)
            return 0;

        else if( myList.getInfo() == element)
            return 1 + frequency(myList.getLink(), element);

        else
            return frequency(myList.getLink(),element);

   }*/




}
