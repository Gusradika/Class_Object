package pertemuan_pt4_2;

public class person {

    String id, name, address;

    public person() {
        id = null;
        name = null;
        address = null;
    }

    public person(String id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    // Setter
    public void id(String id) {
        this.id = id;
    }

    public void name(String name) {
        this.name = name;
    }

    public void address(String address) {
        this.address = address;
    }

    // Getter
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    // Custom

}