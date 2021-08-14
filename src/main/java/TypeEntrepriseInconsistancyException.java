import java.io.PrintWriter;

public class TypeEntrepriseInconsistancyException extends RuntimeException {

    private final TypeEntreprise type;

    public TypeEntrepriseInconsistancyException(TypeEntreprise type){
        this("le type de l'entreprise est inconsistent avec l'action demandée", type);
    }

    public TypeEntrepriseInconsistancyException(String message, TypeEntreprise type) {
        super(message);
        this.type = type;
    }

    public TypeEntreprise getType() {
        return type;
    }
}
