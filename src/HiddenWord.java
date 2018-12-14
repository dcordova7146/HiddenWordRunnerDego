public class HiddenWord {
    private String Match;
    public HiddenWord(String match){
        this.Match = match;
    }
    public String getHint(String guess){
        guess = guess.toUpperCase();
        String Hint = "";
        if(guess.equals(Match)){
            return Match;
        }
    }
}
