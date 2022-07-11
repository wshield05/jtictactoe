public class Player {

    private String name;
    private boolean isCurrentTurn;
    private boolean currentStatus; //is it true or false? see later comment
    private char symbol;
    /*in the playfield, each player's move is represented 
    either by a false or a true in the array.
    */

    public Player(String name) {
        this.name = name;
    }
	
    //public void startTurn ()
            //the player chooses which symbol to use; true uses X, false uses O.
}


