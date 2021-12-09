public class Pouzivatel {
    private String aLogin;
    private String aHeslo;
    private String aMeno;
    private String aPriezvisko;
    private Pohlavie aPohlavie;

    public Pouzivatel (String paLogin,
                       String paHeslo,
                       String paMeno,
                       String paPriezvisko,
                       Pohlavie paPohlavie) {
        this.aLogin = paLogin;
        this.aHeslo = paHeslo;
        this.aMeno = paMeno;
        this.aPriezvisko = paPriezvisko;
        this.aPohlavie = paPohlavie;
    }
    public Pouzivatel () {
        this.aLogin = "login1";
        this.aHeslo = "heslo";
        this.aMeno = "Bez mena";
        this.aPriezvisko = "Bez priezviska";
        this.aPohlavie = Pohlavie.NEUVEDENE;
    }

    public String getaLogin () {
        return this.aLogin;
    }
    public String getaHeslo () {
        return this.aHeslo;
    }
    public String getaMeno () {
        return this.aMeno;
    }
    public String getaPriezvisko () {
        return this.aPriezvisko;
    }
    public Pohlavie getaPohlavie () {
        return this.aPohlavie;
    }
    public void setaLogin (String paLogin) {
        this.aLogin = paLogin;
    }
    public void setaHeslo (String paHeslo) {
        this.aHeslo = paHeslo;
    }
    public void setaMeno (String paMeno) {
        this.aMeno = paMeno;
    }
    public void setaPriezvisko (String paPriezvisko) {
        this.aPriezvisko = paPriezvisko;
    }
    public void setaPohlavie (Pohlavie paPohlavie) {
        this.aPohlavie = paPohlavie;
    }

    public void vypisInfo () {
        System.out.println(this.aLogin + ": " + this.aMeno + " " + this.aPriezvisko + " " + this.aPohlavie);
    }

}