
import java.util.Calendar;
import java.util.Date;

public class CalculadoraDataVencimentoUtil {
    public static void main(String[] args) {

        Calendar dataSemJuros = Calendar.getInstance();
        Date dataVencimento = new Date(1627700400000L);

        dataSemJuros.setTime(dataVencimento);

        dataSemJuros.add(Calendar.DATE, 10);

        var diaDaSemana = dataSemJuros.get(Calendar.DAY_OF_WEEK);

        if (diaDaSemana == 7) {
            dataSemJuros.add(Calendar.DATE, 2);
        } else if (diaDaSemana == 1) {
            dataSemJuros.add(Calendar.DATE, 1);
        }
        System.out.printf("Data de vencimento: %tF\n", dataVencimento);

        System.out.printf("Data de vemcimento maxima para pagamento sem juros: %tF\n", dataSemJuros);
    }
}
