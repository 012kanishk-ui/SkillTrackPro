public class Skill {
    String name;
    int level;
    int totalHours;
    int daysSinceLastPractice;

    public Skill(String name, int level) {
        this.name = name;
        this.level = level;
        this.totalHours = 0;
        this.daysSinceLastPractice = 0;
    }
}