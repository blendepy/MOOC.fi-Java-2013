package reader.criteria;

import java.util.ArrayList;
import java.util.List;

public class Not implements Criterion {

    private Criterion criteria;
    private List<String> notCriteria;

    public Not(Criterion criteria) {
        this.criteria = criteria;
        notCriteria = new ArrayList<String>();
    }

    @Override
    public boolean complies(String line) {
        return !criteria.complies(line) ? notCriteria.add(line) : false;
    }
}
