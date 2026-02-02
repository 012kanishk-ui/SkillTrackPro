import java.util.*;

public class SkillService {
    ArrayList<Skill> skills = new ArrayList<>();
    ArrayList<StudySession> sessions = new ArrayList<>();

    public void addSkill(Scanner sc) {
        System.out.print("Skill name: ");
        String name = sc.nextLine();
        System.out.print("Skill level (1-10): ");
        int level = sc.nextInt();
        sc.nextLine();

        skills.add(new Skill(name, level));
        System.out.println("Skill added.");
    }

    public void logSession(Scanner sc) {
        System.out.print("Skill practiced: ");
        String skillName = sc.nextLine();
        System.out.print("Duration (hours): ");
        int duration = sc.nextInt();
        System.out.print("Focus (1-5): ");
        int focus = sc.nextInt();
        sc.nextLine();

        sessions.add(new StudySession(skillName, duration, focus));

        for (Skill s : skills) {
            if (s.name.equalsIgnoreCase(skillName)) {
                s.totalHours += duration;
                s.daysSinceLastPractice = 0;
            }
        }

        System.out.println("Session logged.");
    }
}