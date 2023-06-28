public class Toy {

    private int id;
    private String name;
    private int drop;

    public Toy(int id, String name,int drop){
        this.id = id;
        this.name = name;
        this.drop = drop;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDrop() {
        return drop;
    }

    public void setDrop(int drop) {
        this.drop = drop;
    }



}