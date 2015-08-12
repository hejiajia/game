/**
 * Created by twer on 3/28/14.
 */
public class Player{

	private String name;
	private int blood;
	private int attact;

	public Player(){

	}
	public Player(String name,int blood,int attact){
		this.name = name;
		this.blood = blood;
		this.attact = attact;
	}

	public String getName(){
		return name;
	}

	public int getBlood(){
		return blood;
	}

	public void setBlood(int blood ){
		if (blood>0) {
			this.blood = blood;
		}else{
			this.blood = 0;
		}
	}

	public int getAttact(){
		return attact;
	}

	public boolean isBloodEmpty(){
		if(this.blood <=0){
			return true;
		} else {
			return false;
		}
	}

}
