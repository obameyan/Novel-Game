
import java.util.Random;

public class Conversation {


	public Conversation() {
		Random rand = new Random();
		int a = rand.nextInt(17);

		switch(a) {
		case 0: Game.mainTextArea.setText("�u���H���Ƃ��b�����������āH�v\n�u�ӂӁA���񂽂��ɂ�ˁ[�v");break;
		case 1: Game.mainTextArea.setText("�u�������̎��ƁA���񂽂킩�����H�v\n�u���A�����B�킩�����񂾁B�ց[�ӊO�B���Ƃŋ����Ă�v");break;
		case 2: Game.mainTextArea.setText("�u����܂萔�w�͓��ӂ���Ȃ��́B�v\n�������A�����炵���������������Ǝv����\n�u�ӊO�H�ˁA�ӊO�ł���H�����Ċ����Ɍ���ꂪ���Ȃ񂾂�ˁE�E�E�v");break;
		case 3: Game.mainTextArea.setText("�u���̌�ɁH�{���Ɋ���čs���Ȃ��H�D���ȍ�Ƃ���̐V�����o���񂾁[�v\n�u���񂽂̍D���Ȗ{�̃W�����������Ă�B���̓~�X�e���[�����ɍD���v\n\n�i�����~�X�e���[�Ɠ�����Ƃ߂�ǂ�������������߂Ă������E�E�E�j");break;
		case 4: Game.mainTextArea.setText("�u�ւ��E�E�E���܂ɂ͂܂Ƃ��Ȃ��ƌ��������v\n�u���i���炻��𔭊��ł���΂����񂾂��ǂ˂��v\n�u��k��v");break;
		case 5: Game.mainTextArea.setText("�u�����͋C�����̂����V�C�������Ȃ��v\n�u����ȓ��ɂ����Ɗw�Z�ɂ����Ȃ�āA�������t��Q����C���ɂȂ�Ȃ��H�v");break;
		case 6: Game.mainTextArea.setText("�u�����̕����A�������Ă��ˁI�v\n\n(���₢��A���񂽂���)\n�u����A��������Ȃ��v");break;
		case 7: Game.mainTextArea.setText("�u���̂тĂ������ȁH�v\n�u�����ق������񂽂̍D�݂Ȃ�ĕ����ĂȂ���ł����ǁI�v\n�u�����؂�A�A�����炷���ˁv");break;
		case 8: Game.mainTextArea.setText("�u������������Ă�H�v\n�u���H���̓e�j�X�������ǁA���č��X�����悤�Ȃ��ƁH�v");break;
		case 9: Game.mainTextArea.setText("�u���w�����ł��e�X�g������Ȃ�ĕ����ĂȂ���`�v\n�u�����ł����Ȃ��ɋ����Ă��炢�����I�v");break;
		case 10:Game.mainTextArea.setText("�u���]�Ԃ̌����Ȃ����ĒT���̂���`���Ăق������āH�v\n�u���񂽁A����֗����������Ɗ��Ⴂ���ĂȂ��H�܂���`���Ă����Ȃ����Ƃ��Ȃ����ǁv");
		case 11:Game.mainTextArea.setText("�u�ŋ߉w�O�ɃR�[�q�[�V���b�v�ł����̒m���Ă�H�v\n�s�������Ƃ�����ƍ�����Ƌ����ÁX�ȗl�q�Őg�����o��\n�u����������������ˁB�������̃`���R���[�g�t���b�y�͍ō������Ė{���H�v");
		case 12:Game.mainTextArea.setText("�u�����̃j���[�X�͌���������H�v\n�u�������Z3�N���Ȃ񂾂��j���[�X������K�����炢�t�������������񂶂�Ȃ��v");
		case 13:Game.mainTextArea.setText("�u�����o�Z���ɖ�ǔL�������́v\n�u���L�̂悤�ɂ����������ǁA�����𗁂тĔ�������������v\n�u���ǂ͌������̋C�̎����悤���Ăˁv\n�u�������ƌ������H�v");
		case 14:Game.mainTextArea.setText("�u��[�A�����͏h�茩���Ă���Ăǂ����I�v\n�u�낤���v�����ōςނƂ��낾�������珕��������v");
		case 15:Game.mainTextArea.setText("�u���낻�둲�ƂƎv���ƂȂ񂾂����ɂ��ݏグ�Ă�����̂�������ˁv\n�u�͂��A���������Ă��ꂪ�t�����H�������Ă�Ȃ̂�����v");
		case 16:Game.mainTextArea.setText("�u�X�^�o�Ńo�C�g���Ă�B���̌��t�����������ڒu����镗������Ǝv��Ȃ��H�v\n�u���ŃX�^�o��������R���_����̓_���Ȃ́H�I�v\n�u����ς�starbucks���Ă��������������̂��I�ǂ��Ȃ񂾁I�H�v");

		}
	}

}
