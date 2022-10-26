public class Rabbit {
    private int length;
    private String name;
    private Boolean softness;

    public Rabbit(int length, String name, Boolean softness) {
        this.length = length;
        this.name = name;
        this.softness = softness;
    }

    public int getLength() {
        return length;
    }

    public String getName() {
        return name;
    }

    public Boolean getSoftness() {
        return softness;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSoftness(Boolean softness) {
        this.softness = softness;
    }
}
