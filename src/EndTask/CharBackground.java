package EndTask;

public class CharBackground {

    private int Rows;
    private int Letters;
    public CharBackground() {
        this.Rows = 0;
        this.Letters = 0;
    }

    public void readInput(String input) {

        if(!input.isEmpty() && !input.equalsIgnoreCase("stop")) {
            Rows++;
            input = input.replaceAll("[^a-zA-Z]", "");
            Letters += input.length();
        }
    }
    public String readResults(){
        String result = "Your text contains " +Rows+ " rows and " +Letters+ " letters.";
        return result;
    }
    public int getRows() {
            return Rows;
    }

    public int getLetters() {
        return Letters;
    }
}
