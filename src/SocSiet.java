import java.util.ArrayList;

public class SocSiet {
    private String aNazov;
    private ArrayList<Pouzivatel> aPouzivatel;
    public SocSiet (String paNazov) {
        this.aNazov = paNazov;
        this.aPouzivatel = new ArrayList<>();
    }
    public String getaNazov () {
        return this.aNazov;
    }
    public void setaNazov (String paNazov) {
        this.aNazov = paNazov;
    }
    public void pridajPouzivatela (Pouzivatel paPouzivatel) {
        aPouzivatel.add(paPouzivatel);
    }
    public void vypisPocetPozivatelov () {
        System.out.println("Socialna siet " +
                this.aNazov + " ma " +
                aPouzivatel.size() + " pouzivatelov. ");
    }
    public void vymazPoucivaela (String paLogin) {
        for (int i = 0; i < aPouzivatel.size(); i++) {
            Pouzivatel p = aPouzivatel.get(i);
            if (p.getaLogin().equals(paLogin)) {
                System.out.print("Pouzivatel bol odstraneny: ");
                p.vypisInfo();
                aPouzivatel.remove(i);
                return;
            }
        }
        System.out.println("Taky pouzivatel neexistuje. ");
    }
    public void prihlasenie (String paLogin, String paHeslo) {
        for (int i = 0; i < aPouzivatel.size(); i++) {
            Pouzivatel p = aPouzivatel.get(i);
            if (p.getaLogin().equals(paLogin)) {
                p.getaHeslo().equals(paHeslo);
                System.out.println("Heslo je spravne, ");
            } else {
                System.out.println("Nespravne heslo ");
            }
            return;
        }
        System.out.println("Takyto pouzivatel neexistuje ");
    }

}