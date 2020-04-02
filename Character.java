
public class Character {
	private String name;				//キャラの名前
	private int lovepoint;			//主人公に対する好感度（これが低いと告白アウトでゲームオーバー）

	public Character(String name,int lovepoint) {
		this.name = name;
		this.lovepoint = lovepoint;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setLovepoint(int lovepoint) {
		this.lovepoint = lovepoint;
	}
	public int getLovepoint() {
		return lovepoint;
	}

	public void addLovepoint(int diff) {
		this.setLovepoint(getLovepoint()+diff);
	}

}
