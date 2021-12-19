

public interface Budynek {
    double setAndGetPowierzchnia(double powierzchnia);
    String setAndGetAdres(String adres);
    int setAndGetLiczbaOkien(int liczbaOkien);
    void setliczbaMieszkańców(int liczbaMieszkańców);
    void setkolorDomu(KolorEnum kolor);
    double ilośćPowierzchniNaMieszkańca(double powierzchnia, int liczbaMieszkańców);
}

