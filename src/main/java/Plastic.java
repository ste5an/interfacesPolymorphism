public class Plastic implements Recycle{

    private int num; //2,5,7 - recyclable 1,3,4,6 - not recyclable

    public Plastic(int n) {
        num = n;
    }

    public boolean isRecyclable() {
        if (num != 2 && num !=5 && num !=7)
            System.out.println("The plastic Bottle Can not be recyclable");
        return num == 2 || num == 6 || num == 7;
    }

    public void recycle() {

        System.out.println("The plastic bottle is not recyclable");

    }
}
