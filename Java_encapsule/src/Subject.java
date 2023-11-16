public class Subject {
    private String name;
    private String difficultyLevel;

    public Subject(String name, String difficultyLevel) {
        this.name = name;
        this.difficultyLevel = difficultyLevel;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDifficultyLevel() {
        return this.difficultyLevel;
    }

    public void setDifficultyLevel(String difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }
}