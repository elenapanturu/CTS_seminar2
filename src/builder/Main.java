package builder;

public class Main {
    public static void main(String[] args) {
        AutobuzBuilder autobuzBuilder = new AutobuzBuilder().setNumeSofer("SOFER CTS").setTextRulat("END LINE");
        AutobuzLinie autobuzLinie = autobuzBuilder.build();
        System.out.println(autobuzLinie);

    }
}
