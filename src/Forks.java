import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Forks{
    private static final List <Boolean> forksList = new ArrayList<>(Arrays.asList(true, true, true, true, true));

    public synchronized List<Boolean> getForks() {
        return forksList;
    }
}
