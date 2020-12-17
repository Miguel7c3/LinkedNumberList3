public class LinkedNumberList implements NumberList {

    // Instance Variable
    private Lnode first; // like sometime of pointer which purpose is to point at first.



    // Constructor
    public LinkedNumberList(){

        first = null; // allows us access to the linkedList, if theres only one node this one will have a null link , but if theres TWO nodes then First's link wont be null because it will be pointing to the ascending node.
    }



    public void insert(int in) {

        Lnode newNode =  new Lnode(in);  // in order to insert a new number we must create a new node to hold the data.

        newNode.setLink(first);  //  Next, we must Set the link  to the head,


        first = newNode;  // afterwards we make the newnode head, since its no longer in the front.

    }

    public boolean isFull() {
        return false; // Linked List CANNOT BE FULL
    }


    public boolean contains(int v) {

        Lnode current = first;
        //Current is a reference
        while( current !=null )  // so , while current is NOT null
            if (current.getInfo() == v)  // if, the data in that node matches the parameter
                return true; // return true
            else   // else, to the next node by using getLink - which gets you to the next node
                current = current.getLink();

        return false;
    }



    public int frequency( Lnode myList, int element ){

        if( myList == null)
            return 0;

        else if( myList.getInfo() == element)
            return 1 + frequency(myList.getLink(), element);

        else
            return frequency(myList.getLink(),element);

    }




    public String toString(){

        String listContent =" The list content is ";
        Lnode current = first;


        while (current != null ) { // looking to see if the info in "cuurent" node  is "null"  we are  not comparing the "link"
            listContent += current.getInfo() + ", ";
            current = current.getLink();
        }
        return listContent;
    }



}
