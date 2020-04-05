import java.util.ArrayList;
import java.util.Arrays;

public class Run {
    public static void main(String[] args) {

        Paper p1 = new Paper(1);
        Paper p2 = new Paper(2);
        Paper p3 = new Paper(1);

        Aluminum c1 = new Aluminum();
        Aluminum c2 = new Aluminum();

        Plastic p11 = new Plastic(2);
        Plastic p12 = new Plastic(3);
        Plastic p13 = new Plastic(7);

        Trash t1 = new Trash();
        Trash t2 = new Trash();

        ArrayList<Object> cycle = new ArrayList<Object>();

        cycle.add(p1);
        cycle.add(p2);
        cycle.add(p3);
        cycle.add(c1);
        cycle.add(c2);
        cycle.add(p11);
        cycle.add(p12);
        cycle.add(p13);
        cycle.add(t1);
        cycle.add(t2);

        for (int i = 0; i < cycle.size(); i++) {

            if (cycle.get(i) instanceof Recycle) {
                Recycle item = (Recycle) cycle.get(i);
                if (item.isRecyclable())
                    item.recycle();
            } else
                System.out.println("This item is not recyclable");
        }

    }
}
