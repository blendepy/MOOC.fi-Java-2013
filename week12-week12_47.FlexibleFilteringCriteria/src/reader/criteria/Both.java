package reader.criteria;

import java.util.ArrayList;
import java.util.List;

public class Both implements Criterion {

    private Criterion firstCriteria;
    private Criterion secondCriteria;
    private List<String> bothCriteria;

    public Both(Criterion firstCriteria, Criterion secondCriteria) {
        this.firstCriteria = firstCriteria;
        this.secondCriteria = secondCriteria;
        bothCriteria = new ArrayList<String>();
    }

    @Override
    public boolean complies(String line) {
        return firstCriteria.complies(line) && secondCriteria.complies(line) ? bothCriteria.add(line) : false;
    }
}
