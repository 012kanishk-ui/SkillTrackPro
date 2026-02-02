public class RecommendationService {

    public void giveRecommendations(SkillService service) {
        System.out.println("\n--- Recommendations ---");

        for (Skill s : service.skills) {
            if (s.daysSinceLastPractice >= 5) {
                System.out.println("⚠ Revise: " + s.name);
            }
            if (s.totalHours > 40) {
                System.out.println("🔥 Strong progress in " + s.name);
            }
        }

        double avgFocus = service.sessions.stream()
                .mapToInt(s -> s.focus)
                .average()
                .orElse(5);

        if (avgFocus < 3) {
            System.out.println("⚠ Low focus detected. Consider lighter sessions.");
        } else {
            System.out.println("✅ Focus levels healthy. Keep pushing.");
        }
    }
}