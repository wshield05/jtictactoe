public class WinConditions {
	
    public boolean hasWon(){
        
        if (this.playfield[7] && this.playfield[4] && this.playfield[1])
            return true;
        else if (this.playfield[3] && this.playfield[4] && this.playfield[5])
            return true;
        else if (this.playfield[7] && this.playfield[4] && this.playfield[1])
            return true;
        else if (this.playfield[6] && this.playfield[4] && this.playfield[2])
            return true;
        else if (this.playfield[0] && this.playfield[4] && this.playfield[8])
            return true;
        else if (this.playfield[6] && this.playfield[3] && this.playfield[0])
            return true;
        else if (this.playfield[8] && this.playfield[5] && this.playfield[2])
            return true;
        else
            return false;
    }
    
    //refer to the scheme in Player.java to understand.
}

