public class PersonAssignment2 {
    public static int count;

    private String name;
    private int age;
    private String address;

    public PersonAssignment2(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
        count++;
    }

    public PersonAssignment2(){};

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        PersonAssignment2.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public final void noOverride(String s){
        System.out.println("Cannot override" + s);
    }
}
