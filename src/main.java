import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Pouzivatel p = new Pouzivatel();
        System.out.println(p.getaMeno());
        p.vypisInfo();

        /*
        ArrayList<Integer> cisla = new ArrayList<>();
        cisla.add(20);
        System.out.println(cisla.size());
        System.out.println("Na pozicii 0 je " + cisla.get(0));
        cisla.remove(0);
        System.out.println(cisla.size());
        */


        SocSiet siet = new SocSiet("Facebook");
        Pouzivatel p2 = new Pouzivatel(
                "mrkva3",
                "heslo2",
                "Jozek",
                "Mrkva",
                Pohlavie.MUZ);
        Pouzivatel p3 = new Pouzivatel(
                "skap",
                "heslo3",
                "Micho",
                "Veduci", Pohlavie.MUZ);
        Pouzivatel p4 = new Pouzivatel(
                "sef",
                "heslo4",
                "Zuzka",
                "Nasa", Pohlavie.ZENA);

        siet.pridajPouzivatela(p2);
        siet.pridajPouzivatela(p3);
        siet.pridajPouzivatela(p4);
        siet.pridajPouzivatela(p);
        siet.vypisPocetPozivatelov();
        siet.vymazPoucivaela("skap");

    }
}