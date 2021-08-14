public enum TypeEntreprise {

    MULTINAT(-1), // avec -1 on considère qu'il n'y a pas de limite
    PME(20),
    INDEPENDANT(1),
    FICTIVE(0);

    private final int nbrMaxEmploye;

    TypeEntreprise(int nbrMaxEmploye) {
        this.nbrMaxEmploye = nbrMaxEmploye;
    }

    public int getNbrMaxEmploye() {
        return nbrMaxEmploye;
    }
}
