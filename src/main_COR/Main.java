package main_COR;

import chainOfResponsibility.*;

public class Main {
    public static void main(String[] args) {
       Handler troleibuz = new TroleibuzHandler(3);
       Handler autobuz = new AutobuzHandler(5);
       Handler tramvai = new TramvaiHandler(10);
       Handler metrou = new MetrouHandler(1000);

       troleibuz.setNextHandler(autobuz);
       autobuz.setNextHandler(tramvai);
       tramvai.setNextHandler(metrou);

       troleibuz.afisareRecomandare(8);
       troleibuz.afisareRecomandare(1);
       troleibuz.afisareRecomandare(14);
       troleibuz.afisareRecomandare(4);

        System.out.println("PENTRU CLUJ");
        Handler metrouCJ = new MetrouHandler(2);
        Handler troleibuzCJ = new TroleibuzHandler(5);
        Handler autobuzCJ = new AutobuzHandler(1000);
        Handler tramvaiCJ = new TramvaiHandler(3);

        metrouCJ.setNextHandler(tramvaiCJ);
        tramvaiCJ.setNextHandler(troleibuzCJ);
        troleibuzCJ.setNextHandler(autobuzCJ);

        metrouCJ.afisareRecomandare(3);
        metrouCJ.afisareRecomandare(6);







    }
}
