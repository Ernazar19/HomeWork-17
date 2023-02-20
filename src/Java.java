public class Java extends Person{

    public Java(String name, byte age, char gender, String eMaill) {
        super(name, age, gender, eMaill);

    }

    @Override
    public String toString() {
        return "name " +getName()+" "+
                "age "+getAge()+" "+
                "gender "+getGender();
    }
}
