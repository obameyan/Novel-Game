
public class Player {
	private String name;				//��l���̖��O
	private int intelligence;			//�w�́i��w���w�̂��߁j
	private int hp;

	public Player(int hp,int intelligence) {
		this.name = Game.textName;
		this.intelligence = intelligence;
		this.hp = hp;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
	public int getIntelligence() {
		return intelligence;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getHp() {
		return hp;
	}
	public void addIntelligence(int diff) {
		this.setIntelligence(getIntelligence()+diff);
	}
	public void addHp(int diff) {
		this.setHp(getHp()+diff);

	}

}
