package annotations;


class Red {
    public void showMyFavoriteColorOfAllTimefromTheRainbow(){
        System.out.println("I am red");
    }



}

class Orange extends Red {
    @Override // comments for the compiler // it checks to see if that
    // comment is doing what it's supposed to do

    // hey this method should be overriding the method in it's parrant
    // class of red
    public void showMyFavoriteColorOfAllTimefromTheRainbow(){
        System.out.println("I am orange");
    }
}



public class Colors {

    public static void main(String[] args) {
        Red redobj = new Red();
        Orange orangeobj = new Orange();
        redobj.showMyFavoriteColorOfAllTimefromTheRainbow();
        orangeobj.showMyFavoriteColorOfAllTimefromTheRainbow();

    }


}
