import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        User user = new User("Kanishk", "Academics + Music", 6);
        SkillService skillService = new SkillService();
        AnalyticsService analytics = new AnalyticsService();
        RecommendationService recommender = new RecommendationService();

        while (true) {
            System.out.println("\n=== SkillTrack Pro ===");
            System.out.println("Enter 1 to add skill");
            System.out.println("Enter 2 to log study session");
            System.out.println("Enter 3 to view analytics");
            System.out.println("Enter 4 to get recommendations");
            System.out.println("Enter 5 to exit");
            System.out.print("Choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> skillService.addSkill(sc);
                case 2 -> skillService.logSession(sc);
                case 3 -> analytics.showAnalytics(skillService);
                case 4 -> recommender.giveRecommendations(skillService);
                case 5 -> {
                    System.out.println("Exiting SkillTrack Pro 🚀");
                    return;
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }
}