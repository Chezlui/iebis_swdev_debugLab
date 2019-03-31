public class Board {
    int height; // mandatory
    int width; // mandatory
    int numberMines;    // mandatory
    String name;
    int numberLives;
    boolean defusableMines;
    boolean timeLimit;
    int maxTime;

    public Board(int height, int width, int numberMines, String name, int numberLives, boolean defusableMines, boolean timeLimit, int maxTime) {
        this.height = height;
        this.width = width;
        this.numberMines = numberMines;
        this.name = name;
        this.numberLives = numberLives;
        this.defusableMines = defusableMines;
        this.timeLimit = timeLimit;
        this.maxTime = maxTime;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getNumberMines() {
        return numberMines;
    }

    public void setNumberMines(int numberMines) {
        this.numberMines = numberMines;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberLives() {
        return numberLives;
    }

    public void setNumberLives(int numberLives) {
        this.numberLives = numberLives;
    }

    public boolean isDefusableMines() {
        return defusableMines;
    }

    public void setDefusableMines(boolean defusableMines) {
        this.defusableMines = defusableMines;
    }

    public boolean isTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(boolean timeLimit) {
        this.timeLimit = timeLimit;
    }

    public int getMaxTime() {
        return maxTime;
    }

    public void setMaxTime(int maxTime) {
        this.maxTime = maxTime;
    }
}
