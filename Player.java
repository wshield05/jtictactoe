public class Player {

    private String name;
    private boolean isCurrentTurn;
    private char symbol;
    /*in the playfield, each player's move is represented 
    either by a false or a true in the array.
    if a player occupies a spot, the position in the array will be true.
    symbol is O -> 
    */
    private boolean[] playfield = {false, false, false, false, false, false, false, false, false};
    //if the player hasn't occupied that space, it's false, else it's true.
    
    /*structure of the array
    
        -------------
        | 6 | 7 | 8 |
        -------------
        | 3 | 4 | 5 |
        -------------
        | 0 | 1 | 2 |
        -------------
    
    */
    
    public Player(String name) {
        this.name = name;
    }
}


