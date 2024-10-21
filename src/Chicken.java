public class Chicken {
    private String name;

    private int age;

    public Chicken(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Chicken{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
