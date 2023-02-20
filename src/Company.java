import java.util.Arrays;

public class Company {
    private String companyName;
    private String locatedOfCountry;
    private String address;
    private Java[] java;
    private Android[] android;
    private Go[] go;

    public Company(String companyName, String locatedOfCountry, String address, Java[] java, Android[] android, Go[] go) {
        this.companyName = companyName;
        this.locatedOfCountry = locatedOfCountry;
        this.address = address;
        this.java = java;
        this.android = android;
        this.go = go;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getLocatedOfCountry() {
        return locatedOfCountry;
    }

    public void setLocatedOfCountry(String locatedOfCountry) {
        this.locatedOfCountry = locatedOfCountry;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Java[] getJava() {
        return java;
    }

    public void setJava(Java[] java) {
        this.java = java;
    }

    public Android[] getAndroid() {
        return android;
    }

    public void setAndroid(Android[] android) {
        this.android = android;
    }

    public Go[] getGo() {
        return go;
    }

    public void setGo(Go[] go) {
        this.go = go;
    }

    @Override
    public String toString() {
        return "CompanyName " + companyName + "\n" +
                "locatedOfCountry " + locatedOfCountry + "\n" +
                "address " + address + "\n" +
                "java " + Arrays.toString(java) +"\n"+
                "android " + Arrays.toString(android) +"\n"+
                "go " + Arrays.toString(go);
    }
}