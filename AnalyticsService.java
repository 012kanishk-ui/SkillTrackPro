public class AnalyticsService {

    public void showAnalytics(SkillService service) {
        System.out.println("\n--- Analytics ---");

        for (Skill s : service.skills) {
            System.out.println(
                s.name +
                " | Level: " + s.level +
                " | Hours: " + s.totalHours +
                " | Days inactive: " + s.daysSinceLastPractice
            );
        }

        double avgFocus = service.sessions.stream()
                .mapToInt(s -> s.focus)
                .average()
                .orElse(0);

        System.out.println("Average focus score: " + avgFocus);
    }
}