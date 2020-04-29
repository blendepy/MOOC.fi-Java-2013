
package reader.criteria;

import java.util.ArrayList;
import java.util.List;

public class LengthAtLeast implements Criterion{
    private int length;
    private List<String> lengthAtLeast;

    public LengthAtLeast(int length) {
        this.length = length;
        lengthAtLeast = new ArrayList<String>();
    }
    
    @Override
    public boolean complies(String line) {
        return line.length() >= length ? lengthAtLeast.add(line) : false;
    }   
}
