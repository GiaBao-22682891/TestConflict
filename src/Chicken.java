public class Chicken {
    private String name;
    private int ga;

    public Chicken(String name, int ga) {
        this.name = name;
        this.ga = ga;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGa(int ga) {
        this.ga = ga;
    }

    public String getName() {
        return name;
    }

    public int getGa() {
        return ga;
    }


    @Override
    public String toString() {
        return "Chicken{" +
                "name='" + name + '\'' +
                ", ga=" + ga +
                '}';
    }
}
