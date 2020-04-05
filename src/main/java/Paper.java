

public class Paper implements Recycle{

    private int num; // 1- recyclable 2 - not recyclable

    public Paper(int n) {
        num = n;
    }

    public boolean isRecyclable() {
        if (num != 1)
            System.out.println("Paper is not recyclable");
        return num == 1;
    }

    public void recycle() {

        System.out.println("The paper has been recycled");

    }
}
