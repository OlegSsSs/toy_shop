public class Main {
    public static void main(String[] args) {
        Toy toy1 = new Toy(1, "конструткор", 2);
        Toy toy2 = new Toy(2, "робот", 2);
        Toy toy3 = new Toy(3, "кукла", 6);

        ToyList toyList = new ToyList();
        toyList.addToQueu(toy1);
        toyList.addToQueu(toy2);
        toyList.addToQueu(toy3);


    }
}
