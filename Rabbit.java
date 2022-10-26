public class Rabbit {
    private int length;
    private String name;
    private Boolean softness;

    Rabbit(int length, String name, boolean softness){
        this.length= length;
        this.name= name;
        this.softness= softness;

    }
    public void changeNamae(String name){
        this.name = name;
    }
    public String viewName(){
        return name;
    }
    public void changeSoftness(boolean softness){
        this.softness=softness;

    }
    public Boolean viewSoftness(){
        return softness;
    }
}
