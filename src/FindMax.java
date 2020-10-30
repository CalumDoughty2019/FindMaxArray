import java.util.List;

public class FindMax {

    public int findMax(List<Integer> list) {
        if (list.size() > 0) {
            int max = list.get(0);
            for (int n = 1; n < list.size(); n++) { //compare location 0 to location 1
                if (list.get(n) > max) {
                    max = list.get(n);
                }
            }
            return max;
        }
        return 0;
    }
}
