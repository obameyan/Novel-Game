import java.util.Random;

public class Studying1 {

	public Studying1() {
		Random ra = new Random();
		int b = ra.nextInt(10);

		switch(b) {
		case 0:Game.mainTextArea.setText("�u���t�Ƃ������̂͂Ȃ�Ƃ����G����ȁv\n�u�������A���t���Ȃ��Ǝv���Ă��邱�Ƃ�`�����Ȃ��v\n�u������̂��v");break;
		case 1:Game.mainTextArea.setText("�u������̂���Ԃ����ł͂Ȃ��v");break;
		case 2:Game.mainTextArea.setText("�u�������킩��Ȃ��񂾂�������Ƌ����Ă���Ȃ����H�v\n�u�������v");break;
		case 3:Game.mainTextArea.setText("�u�w�Z�Ō����̂����׋��@�����񋳂��ė~�����Ƃ��낾�ȁv");break;
		case 4:Game.mainTextArea.setText("�u���E�j�̉A�ɂ��������̂悤�Ȉ�ʎs��������̂��Ǝv���ƂȂɂ�犴�S�[�����̂�����Ǝv��Ȃ����H�v");break;
		case 5:Game.mainTextArea.setText("�u���܂Ȃ��A�W���������񂾁v\n�u�N���N�̂��ׂ����ƂɏW��������ǂ����v");break;
		case 6:Game.mainTextArea.setText("�u�Õ��⊿������͉ߋ��̐l�X�̕�炵��l�����܂œǂݎ���̂��ʔ����ȁv\n�u�����������ǂ�ł���悤�Ȗ{�������ÓT�ƌĂ΂���������񂾂낤���v");break;
		case 7:Game.mainTextArea.setText("�u��A���S���S�v\n�u���K�͑�؂�����ȁv");break;
		case 8:Game.mainTextArea.setText("�u�����A���̎Q�l���͂킩��₷����ɂ��Ȃ背�x���������Ă�����v\n�u�N���g���Ƃ����v\n�u���S�ɉ�����悤�ɂȂ�Α�ό��\���v");break;
		case 9:Game.mainTextArea.setText("�u�ւ�������\�^�ʖڂɊw��ł���񂾂ȁv\n�u�����킩��Ȃ����Ƃ�����΋C�y�ɕ����Ă���č\��Ȃ����v\n�u�ȂɁA�������Ƃ��͂��݂��l���v");break;


		}


	}
}
