import java.util.ArrayList;
import java.util.List;
public class formansmapp{

    protected Mono<Forsakring> fetchSingleInsurance(UUID employmentId, AnstallningSelectable... selects) {
        var filter = insuranceIdQueryFilter(insuranceId).and(insuranceTypeFilter);
        return fetchInsurance(true, filter, selects).next();
    }
}
