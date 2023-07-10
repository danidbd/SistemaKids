import java.util.Date;
import java.util.Map;

public class Crianca {
    private String Nome;
    private Date dataNascimento;
    private  String ProblemaSaude;
    private String Alergia;
    private Map <String, String> horarioremedio;

    public Crianca(String nome, Date dataNascimento, String problemaSaude, String alergia, Map<String, String> horarioremedio) {
        Nome = nome;
        dataNascimento = dataNascimento;
        ProblemaSaude = problemaSaude;
        Alergia = alergia;
        this.horarioremedio = horarioremedio;
    }

    public String getNome() {
        return Nome;
    }

    public int calcularTempoPermanencia(Date dataSaida) {
        long diffMillis = dataSaida.getTime() - dataNascimento.getTime();
        long diffMinutes = diffMillis / (60 * 1000);
        return (int) diffMinutes;
    }

    public double calcularValorPermanencia(int tempoPermanencia){
        int tempoMinimo = 30;
        double valorMinimo = 20.0;
        double valorPorMinito = 0.65;

        if (tempoPermanencia <= tempoMinimo){
            return valorMinimo;
        }
        else {
            double valorExedente = (tempoPermanencia - tempoPermanencia)  * valorMinimo;
            return valorMinimo + valorExedente;
        }
    }

}
