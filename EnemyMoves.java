public class EnemyMoves {

    //so maybe you can do a 2p mode? human vs human?
    
    //try to place the spot on the center, then on the sides, then in the rest of the space, and then check
    //if anyone has won the game yet.

    /**
     * Tries to place a spot in the center of the playfield.
     * @param p1 first player
     * @param p2 second player (AI or human)
     */
    
    public void placeAtCenter(Player p1, Player p2){
        
        if (!p1.playfield[4] && !p2.playfield[4])
            p2.playfield[4]=true;
        
    }
    
    /**
     * Tries to place a spot in the corners of the playfield.
     * @param p1 first player
     * @param p2 second player (AI or human)
     */
    public void placeAtCorners(Player p1, Player p2){
        
        if (!p1.playfield[0] && !p2.playfield[0])
            p2.playfield[0]=true;
        else if (!p1.playfield[2] && !p2.playfield[2])
            p2.playfield[2]=true;
        else if (!p1.playfield[6] && !p2.playfield[6])
            p1.playfield[6]=true;
        else if (!p1.playfield[8] && !p2.playfield[8])
            p1.playfield[8]=true;
        
    }
    
    /**
     * Tries to place a spot in the remaining space of the playfield.
     * @param p1 first player
     * @param p2 second player (AI or human)
     */
    public void placeAtCorners(Player p1, Player p2){
        
        if (!p1.playfield[1] && !p2.playfield[1])
            p2.playfield[1]=true;
        else if (!p1.playfield[3] && !p2.playfield[3])
            p2.playfield[3]=true;
        else if (!p1.playfield[5] && !p2.playfield[5])
            p1.playfield[5]=true;
        else if (!p1.playfield[7] && !p2.playfield[7])
            p1.playfield[7]=true;
        
    }
    
}
