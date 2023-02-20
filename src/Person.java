public class Person {
    private  String name;
    private byte age;
    private char gender;
    private  String eMaill;

    public Person(String name, byte age, char gender, String eMaill) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.eMaill = eMaill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String geteMaill() {
        return eMaill;
    }

    public void seteMaill(String eMaill) {
        this.eMaill = eMaill;
    }

    @Override
    public String toString() {
        return "Person " +
                "name " + name + " " +
                "age " + age +" "+
                "gender " + gender + " "+
                "eMaill " + eMaill;
    }
}
