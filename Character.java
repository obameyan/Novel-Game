
public class Character {
	private String name;				//�L�����̖��O
	private int lovepoint;			//��l���ɑ΂���D���x�i���ꂪ�Ⴂ�ƍ����A�E�g�ŃQ�[���I�[�o�[�j

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
