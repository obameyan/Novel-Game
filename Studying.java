import java.util.Random;
public class Studying {
	public Studying() {
		Random ra = new Random();
		int b = ra.nextInt(10);

		switch(b) {
		case 0:Game.mainTextArea.setText("�u�N���[���Z�p�ł�����l���ꂽ�炻�����ɕ׋���点��̂Ɂ[�v\n�u���A�ǂ������׋����邩�ł��񂩂ɂȂ肻�����āH�v\n�u�����Ԃ��Ȃ��̂��������Ƃ���ˁv");break;
		case 1:Game.mainTextArea.setText("�u�w�w���s�v��㦁@�v���s�w���w�x�Ƃ������t��m���Ă邩����H�v\n�u�悭�l���A�悭�w�тȂ����Ƃ����Ӗ��̂��肪���[�����t��v\n�u�����A�׋��ɖ߂�܂���v");break;
		case 2:Game.mainTextArea.setText("�u���w���Ă���Ă݂�ƈĊO�y�����˂��v\n�u���������ۂɂ��Ȃ���o����������Ɗy�����̂Ɂv");break;
		case 3:Game.mainTextArea.setText("�u�w�w�R��m�s���@���R��m���x�Ƃ������t��m���Ă邩����H�v\n�u�������g�Ŋw��ł͂��߂Ď����ɑ���Ȃ��Ƃ��낪�킩���āA�l�ɋ����邱�Ƃł͂��߂Ă��̓�����킩��Ƃ����Ӗ���v\n�u�Ƃ�����ŏ������w�����āI�v");break;
		case 4:Game.mainTextArea.setText("�u�׋����邼�[�v\n(�C���͏\���̂悤��)\n�u�܂��͕׋����邽�߂ɕ׋��̎d����׋����邼�[�v\n�i�E�E�E�j\n�u����׋����Ȃ���_���H�v");break;
		case 5:Game.mainTextArea.setText("�u��������Ĉꏏ�ɕ׋����Ă�Ɛ̂��񂽂̉Ƃňꏏ�ɏh�������̎v���o���Ȃ��v\n�u���̍��͎Ⴉ�����̂�����v");break;
		case 6:Game.mainTextArea.setText("�u���׋����Ă�́H���A�Õ��H�v\n�u�����Ă���������A����A���񂪁v");break;
		case 7:Game.mainTextArea.setText("�u���w�S�R�킩��Ȃ���[�A����3�N�����Ă����̂Ɂv\n�u���̂܂܂��ᕔ���_������������॥��v\n���ɂȂ�A�͐[���ȕ\�\n�u���ӂȂ񂾂����炿����ƕ����������Ƃ���񂾂��ǁA�����H�v");break;
		case 8:Game.mainTextArea.setText("�u�A�E�X�e�����b�c�̎O����A�_�����[�}�鍑�A�}�j�t�F�X�g�f�X�e�B�j�[�������v\n�u���Ő��E�j�̗p����Ă�����X�����������񂾂�A���̖��͂��������킹�饥��v\n�u�ʂɓ��Ӌ��Ȃł��Ȃ�������āH����͌�������_���v");break;
		case 9:Game.mainTextArea.setText("�u�p��������ė~�����H�ӂӁA����Ɠ��{�͎����ɂƂ��ċ�������ƋC�t�����̂ˁH�v\n���������Ƃ����ނ�ɗ����オ��A�����r��U��グ�Ă������񂾁B\n�u���E���l��ɍs�����I�v\n�u���Ⴀ�܂��͒P�ꂩ��ˁI�v");break;


		}


	}

}
