package reader.criteria;

import java.util.ArrayList;
import java.util.List;

public class EndsWithQuestionOrExclamationMark implements Criterion {

    private List<String> questionOrExclamation;

    public EndsWithQuestionOrExclamationMark() {
        questionOrExclamation = new ArrayList<String>();
    }

    @Override
    public boolean complies(String line) {
        return line.endsWith("!") || line.endsWith("?") ? questionOrExclamation.add(line) : false;
    }
}
