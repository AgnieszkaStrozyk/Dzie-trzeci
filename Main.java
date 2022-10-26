public class Main {
    public static void main(String[] args) {

        Rabbit krolik1 = new Rabbit(50, "Zenek", true);
        krolik1.changeNamae("Stefan");
        krolik1.viewName();
        System.out.println(krolik1.viewName());
        krolik1.changeSoftness(false);
        krolik1.viewSoftness();
        System.out.println(krolik1.viewSoftness());
        krolik1.changeLength(20);
        System.out.println(krolik1.viewLength());
        krolik1.convert(20);
        System.out.println(krolik1.convert(krolik1.viewLength()));


    }
}
