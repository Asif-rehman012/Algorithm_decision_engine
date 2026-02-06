import java.util.*;

public class AlgorithmDB {

    public static List<Algorithm> getAlgorithms() {
        List<Algorithm> list = new ArrayList<>();

        list.add(new Algorithm("Dijkstra (Min Heap)", "shortest_path", "O(E log V)", false));
        list.add(new Algorithm("Bellman Ford", "shortest_path", "O(VE)", true));
        list.add(new Algorithm("Floyd Warshall", "shortest_path", "O(n^3)", true));
        list.add(new Algorithm("BFS", "shortest_path", "O(V+E)", false));

        list.add(new Algorithm("Quick Sort", "sorting", "O(n log n)", false));
        list.add(new Algorithm("Merge Sort", "sorting", "O(n log n)", false));
        list.add(new Algorithm("Insertion Sort", "sorting", "O(n^2)", false));

        return list;
    }
}
