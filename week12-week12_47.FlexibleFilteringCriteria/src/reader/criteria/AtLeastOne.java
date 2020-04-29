package reader.criteria;

import java.util.ArrayList;
import java.util.List;

public class AtLeastOne implements Criterion {

    private Criterion[] criterias;
    private List<String> atLeastOne;

    public AtLeastOne(Criterion... criterias) {
        this.criterias = criterias;
        atLeastOne = new ArrayList<String>();
    }

    @Override
    public boolean complies(String line) {
        for (Criterion criteria : criterias) {
            if (criteria.complies(line)) {
                atLeastOne.add(line);
                return true;
            }
        }
        return false;
    }
}
