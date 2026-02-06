import java.util.*;

public class DecisionEngine {

    public static void decide(Problem problem) {

        String type = detectProblemType(problem.description);
        List<Algorithm> algorithms = AlgorithmDB.getAlgorithms();

        Map<String, Integer> scoreMap = new HashMap<>();
        Map<String, String> reasonMap = new HashMap<>();

        for (Algorithm algo : algorithms) {

            if (!algo.category.equals(type)) continue;

            int score = 0;
            StringBuilder reason = new StringBuilder();

            // Input size rule
            if (problem.n > 10000 && algo.timeComplexity.contains("n^3")) {
                score -= 60;
                reason.append("Large input, O(n³) slow. ");
            }

            // Weighted graph rule
            if (problem.weighted && algo.name.contains("Dijkstra")) {
                score += 40;
                reason.append("Weighted graph supported. ");
            }

            // Negative weight rule
            if (problem.negativeWeight && algo.supportsNegative) {
                score += 50;
                reason.append("Handles negative weights. ");
            }
            if (problem.negativeWeight && !algo.supportsNegative) {
                score -= 50;
                reason.append("Does NOT support negative weights. ");
            }

            // Small input optimization
            if (problem.n < 50 && algo.name.contains("Insertion")) {
                score += 30;
                reason.append("Small input optimized. ");
            }

            // BFS rule
            if (!problem.weighted && algo.name.equals("BFS")) {
                score += 40;
                reason.append("Unweighted graph best for BFS. ");
            }

            scoreMap.put(algo.name, score);
            reasonMap.put(algo.name, reason.toString());
        }

        printResult(scoreMap, reasonMap);
    }

    private static String detectProblemType(String desc) {
        if (desc.contains("shortest") || desc.contains("distance") || desc.contains("path"))
            return "shortest_path";
        if (desc.contains("sort"))
            return "sorting";
        return "unknown";
    }

    private static void printResult(Map<String, Integer> scoreMap, Map<String, String> reasonMap) {

        String bestAlgo = null;
        int bestScore = Integer.MIN_VALUE;

        for (String algo : scoreMap.keySet()) {
            if (scoreMap.get(algo) > bestScore) {
                bestScore = scoreMap.get(algo);
                bestAlgo = algo;
            }
        }

        System.out.println("\n✅ Best Algorithm: " + bestAlgo);
        System.out.println("📊 Confidence: " + Math.min(100, bestScore + 60) + "%");
        System.out.println("📌 Reason: " + reasonMap.get(bestAlgo));

        System.out.println("\n❌ Avoid:");
        for (String algo : scoreMap.keySet()) {
            if (!algo.equals(bestAlgo)) {
                System.out.println("- " + algo);
            }
        }
    }
}
