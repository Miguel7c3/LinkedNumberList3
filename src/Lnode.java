public class Lnode {
    //public class Lnode<T> {

    // instance variables
    private int info;
    private Lnode link;

    //constructor

    public Lnode(){
    }

    public Lnode(int in) {

        info = in;
        link = null;
    }


    // member methods
    public int getInfo() {
        return info;
    }

    public Lnode getLink() {
        return link;
    }


    public void setLink(Lnode linkIn) {
        link = linkIn;
    }

}