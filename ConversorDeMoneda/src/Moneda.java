import java.util.List;
import java.util.Map;

public record Moneda( //String result,
                      String documentation,
                      String terms_of_use,
                      double time_last_update_unix,
                      String base_code,
                      Map<String, Double>conversion_rates

) {
}
