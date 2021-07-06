package warmup;

public class Solution  {

    public static void main(String[] args) {

        Parent parent = new Parent();

        parent.parent();

        Subclass child = new Subclass();

        child.child();
        child.parent();

    }


}
