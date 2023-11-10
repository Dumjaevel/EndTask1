package EndTask;
public class CharBackground {

    public int getRowsNumber;
    public int getLetters;

    private int rows;
    private int letters;
    public CharBackground() {
        this.rows = 0;
        this.letters = 0;
    }

    public void readInput(String input) {

        if(!input.isEmpty() && !input.equalsIgnoreCase("stop")) {
            rows++;
            input = input.replaceAll("[^a-zA-Z]", "");
            letters += input.length();
        }
    }
    public String readResults(){
        String result = "Your text contains " +rows+ " rows and " +letters+ " letters.";
        return result;
    }

}
