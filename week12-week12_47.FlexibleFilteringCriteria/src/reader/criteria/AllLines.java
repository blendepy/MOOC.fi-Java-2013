package reader.criteria;

import java.util.ArrayList;
import java.util.List;

public class AllLines implements Criterion {

    private List<String> allLines;

    public AllLines() {
        allLines = new ArrayList<String>();
    }

    @Override
    public boolean complies(String line) {
        allLines.add(line);
        return allLines.contains(line);
    }
}
