import java.util.List;

public interface Entreprise {

    void engager(String employe);
    boolean virer(String employe);
    List<String> getEmployes();

}
