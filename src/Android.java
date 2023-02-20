public class Android extends Person{
    public Android(String name, byte age, char gender, String eMaill) {
        super(name, age, gender, eMaill);
    }

    @Override
    public String toString() {
        return "name " +getName()+ " "+
                "age "+getAge()+" "+
                "gender "+getGender();
    }
}
