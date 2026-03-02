public class BadStudent {
    private String name;
    private int levelOfBad;

    public BadStudent() {
    }

    public BadStudent(String name, int levelOfBad) {
        this.name = name;
        this.levelOfBad = levelOfBad;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevelOfBad() {
        return levelOfBad;
    }

    public void setLevelOfBad(int levelOfBad) {
        this.levelOfBad = levelOfBad;
    }



    @Override
    public String toString() {
        return "BadStudent{" +
                "name='" + name + '\'' +
                ", levelOfBad=" + levelOfBad +
                '}';
    }
}

