import java.util.Date;
import java.util.Map;

public class Crianca {
    private String Nome;
    private Date DataNascimento;
    private  String ProblemaSaude;
    private String Alergia;
    private Map <String, String> horarioremedio;

    public Crianca(String nome, Date dataNascimento, String problemaSaude, String alergia, Map<String, String> horarioremedio) {
        Nome = nome;
        DataNascimento = dataNascimento;
        ProblemaSaude = problemaSaude;
        Alergia = alergia;
        this.horarioremedio = horarioremedio;
    }

    public String getNome() {
        return Nome;
    }

}
