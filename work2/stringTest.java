
///adsadadsadasdasdsadasdsa
//dasdsadsadsadaadsadas

package work2;

public final class stringTest {

    private static int nextID = 0;

    private String name;

    private final int idnum;

    private int year;

    private stringTest next;
    public stringTest(String firstName, String lastName, int year) {
        this.name = firstName + "  " + lastName;
        nextID++;
        idnum = nextID;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getIdnum() {
        return idnum;
    }

    public int getYear() {
        return year;
    }

    public void setName(String firstName, String lastName) {
        this.name = firstName + " " + lastName;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("stringTest{");
        sb.append("name=").append(name);
        sb.append(", idnum=").append(idnum);
        sb.append(", year=").append(year);
        sb.append('}');
        return sb.toString();
    }
    
}
