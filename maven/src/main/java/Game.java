import java.io.PrintStream;

public class Game{
    private Player playerOne;
    private Player playerTwo;
    private PrintStream printStream;

    public Game(Player playerOne ,Player playerTwo,PrintStream printStream) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        this.printStream = printStream;
    }

    public void start(){
        Player temp = new Player();
        while(oneRound(playerOne,playerTwo)) {
            temp = playerOne;
            playerOne = playerTwo;
            playerTwo = temp;
        }
    }

    public boolean oneRound(Player playerOne,Player playerTwo){
        playerOne.setBlood( playerOne.getBlood() - playerTwo.getAttact() );
        if (playerOne.isBloodEmpty()){
            gameResult(playerOne.getName());
            return false;
        }else{
            return true;
        }
    }

    public void gameResult(String name){
        printStream.println(name + "被打败了");
    }
}