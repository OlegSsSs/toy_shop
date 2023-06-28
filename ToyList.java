import java.util.PriorityQueue;

public class ToyList {
    PriorityQueue<Toy> toyList = new PriorityQueue<>();

    public void addToQueu(Toy toy) {
        toyList.add(toy);
    }
}
