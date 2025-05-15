import java.security.cert.Extension;


abstract class Zwierze {
    protected String nazwa;
    protected int wiek;

    Zwierze(String nazwa, int wiek) {
        this.nazwa = nazwa;
        this.wiek = wiek;
    }


    abstract String wydajDzwiek();

    abstract String poruszajSie();

    public void wyswietlInformacje() {
        System.out.println("Nazwa: " + nazwa);
        System.out.println("Wiek: " + wiek);
    }

    protected String getNazwa() {
        return this.nazwa;
    }

    protected int getWiek() {
        return this.wiek;
    }

    protected void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    protected void setWiek(int wiek) {
        this.wiek = wiek;
    }





    class Ssak extends Zwierze {
        int ileMaNog;
        Ssak(String nazwa, int wiek, int ileMaNog) {
            super(nazwa, wiek);
            if (ileMaNog > 1) {
                this.ileMaNog = ileMaNog;
            }else {
                System.out.println("Ssak musi mieć conajmniej 2 nogi");
            }
        }

        @Override
        String wydajDzwiek() {
            return "Rawr!";
        }

        @Override
        String poruszajSie() {
            return "Tup tup tup tup tup";
        }

        void wyswietlIloscNog(){
            System.out.println(this.nazwa + " ma " + this.ileMaNog + " nogi.");
        }
    }



    class Ptak extends Zwierze {
        boolean czyLata;
        Ptak(String nazwa, int wiek, boolean czyLata) {
            super(nazwa, wiek);
            this.czyLata = czyLata;
        }


        @Override
        String wydajDzwiek() {
            return "Hawk!";
        }

        @Override
        String poruszajSie() {
            return "Flap flap";
        }

        void wyswietlCzyLata(){
            if(czyLata) {
                System.out.println(this.nazwa + "może latać.");
            } else if (!czyLata) {
                System.out.println(this.nazwa + "nie może latać.");
            }
        }
    }



    class Gad extends Zwierze {
        boolean czyJestToksyczny;
        Gad(String nazwa, int wiek, boolean czyJestToksyczny) {
            super(nazwa, wiek);
            this.czyJestToksyczny = czyJestToksyczny;
        }


        @Override
        String wydajDzwiek() {
            return "Ssssss";
        }

        @Override
        String poruszajSie() {
            return "Tap tap tap tap tap";
        }

        void wyswietlCzyJestToksyczny(){
            if(czyJestToksyczny) {
                System.out.println(this.nazwa + "jest toksyczny.");
            } else if (!czyJestToksyczny) {
                System.out.println(this.nazwa + "nie jest toksyczny.");
            }
        }
    }


}








public class Main {
    public static void main(String[] args) {


    }
}