import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Game {
	JFrame window;
	Container con;
	JPanel InputPanel,textPanel,titleNamePanel,startButtonPanel,mainTextPanel,choiceButtonPanel,playerPanel,nextButtonPanel,TextPanel;
	JLabel textLabel,titleNameLabel, ALoveLabel, ALoveNumber,BLoveLabel,BLoveNumber,DayLabel,DayLabelNumber,NameLabel,NamesetLabel,IntelliLabel,IntelliNumber,TimeLabel,TimeLabelNumber,HPLabel,HPNumber;
	Font titleFont = new Font("Font.MONOSPACED",Font.PLAIN,70);
	Font smallFont = new Font("Font.MONOSPACED",Font.PLAIN,20);
	Font normalFont = new Font("Font.MONOSPACED",Font.PLAIN,28);
	JButton Name,nextButton,startButton,choice1, choice2,choice3,choice4,choice5,choice6,choice7;
	static JTextArea mainTextArea,TextArea;
	JTextField jtf;
	static String textName;
	static int Day = 1;
	static int time =0;
	Player p = new Player(2,5);
	Character A = new Character("A",0);
	Character B = new Character("B",0);
	String position;


	NameEnterHandler neHandler = new NameEnterHandler();
	ExplanationHandler exHandler = new ExplanationHandler();
	TitleScreenHandler tsHandler = new TitleScreenHandler();
	ChoiceHandler choiceHandler = new ChoiceHandler();

	public Game() {

		window = new JFrame();
		window.setSize(1200,800);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.BLACK);
		window.setLayout(null);
		window.setVisible(true);
		con = window.getContentPane();

		textPanel = new JPanel();
		textPanel.setBounds(100,150,800,200);
		textPanel.setBackground(Color.black);
		textLabel = new JLabel("���O����͂��āA�N���b�N���Ă�������");
		textLabel.setForeground(Color.WHITE);
		textLabel.setFont(normalFont);
		textPanel.add(textLabel);
		con.add(textPanel);

		InputPanel = new JPanel();
		InputPanel.setBounds(150,650,800,50);
		InputPanel.setBackground(Color.black);
		InputPanel.setLayout(new GridLayout(1,2));

		jtf = new JTextField();
		InputPanel.add(jtf);

		Name = new JButton("ENTER");
		Name.setForeground(Color.black);
		Name.addActionListener(neHandler);
		InputPanel.add(Name);
		con.add(InputPanel);

	}
	public void Explanation() {
		textPanel.setVisible(false);
		InputPanel.setVisible(false);


		TextPanel = new JPanel();
		TextPanel.setBounds(200,100,800,600);
		TextPanel.setBackground(Color.black);
		con.add(TextPanel);

		TextArea = new JTextArea();
		TextArea.setBounds(200,100,800,600);
		TextArea.setBackground(Color.black);
		TextArea.setForeground(Color.white);
		TextArea.setFont(normalFont);
		TextArea.setLineWrap(true);
		TextPanel.add(TextArea);
		TextArea.setText("�����̃Q�[���ɂ����Ď�l���i���Ȃ��j�͍��Z3�N���̊w���ł���B\n���̐��E�ɂ������N��20�T�ŕ\����A20�T�ڂɍ����C�x���g����������B\n����܂łɍD�݂̂ق��̃L�����̍D���x���グ�Ă����K�v������B\n�܂��w���̖{���ł���׋����ӂ��Ă͂����Ȃ��B��w�󌱂��T���Ă��邩�炾�B\n\n���̃Q�[���ɂ�HP�v�f�����肻�������邱�Ƃœ���̃L�����̍D���x���グ�邱�Ƃ��ł���B������HP��0�ɂȂ��Ă��܂��ƕs�^�Ȃ��Ƃ��N���邽�ߒ��ӂ��Ăق����B\n����ł̓Q�[���X�^�[�g�I");


		nextButtonPanel = new JPanel();
		nextButtonPanel.setBackground(Color.black);
		nextButtonPanel.setBounds(400,650,200,100);

		nextButton = new JButton("����");
		nextButton.setBackground(Color.black);
		nextButton.setForeground(Color.white);
		nextButton.setFont(normalFont);
		nextButton.addActionListener(exHandler);
		nextButton.setFocusPainted(false);


		nextButtonPanel.add(nextButton);


		con.add(nextButtonPanel);
	}
	public void NameEnter() {

		TextPanel.setVisible(false);
		nextButtonPanel.setVisible(false);


		titleNamePanel = new JPanel();
		titleNamePanel.setBounds(200,100,600,250);
		titleNamePanel.setBackground(Color.black);
		titleNameLabel = new JLabel("ROMANCE NOVEL");
		titleNameLabel.setForeground(Color.white);
		titleNameLabel.setFont(titleFont);

		startButtonPanel = new JPanel();
		startButtonPanel.setBackground(Color.black);
		startButtonPanel.setBounds(400,600,200,100);

		startButton = new JButton("START");
		startButton.setBackground(Color.black);
		startButton.setForeground(Color.white);
		startButton.setFont(normalFont);
		startButton.addActionListener(tsHandler);
		startButton.setFocusPainted(false);

		titleNamePanel.add(titleNameLabel);
		startButtonPanel.add(startButton);

		con.add(titleNamePanel);
		con.add(startButtonPanel);

	}
	public void createGameScreen() {

		titleNamePanel.setVisible(false);
		startButtonPanel.setVisible(false);

		mainTextPanel = new JPanel();
		mainTextPanel.setBounds(200,100,800,400);
		mainTextPanel.setBackground(Color.black);
		con.add(mainTextPanel);

		mainTextArea = new JTextArea();
		mainTextArea.setBounds(200,100,800,400);
		mainTextArea.setBackground(Color.black);
		mainTextArea.setForeground(Color.white);
		mainTextArea.setFont(normalFont);
		mainTextArea.setLineWrap(true);
		mainTextPanel.add(mainTextArea);

		choiceButtonPanel = new JPanel();
		choiceButtonPanel.setBounds(150,500,700,150);
		choiceButtonPanel.setBackground(Color.black);
		choiceButtonPanel.setLayout(new GridLayout(4,2));
		con.add(choiceButtonPanel);

		choice1 = new JButton("1");
		choice1.setBackground(Color.black);
		choice1.setForeground(Color.white);
		choice1.setFont(normalFont);
		choice1.setFocusPainted(false);
		choice1.addActionListener(choiceHandler);
		choice1.setActionCommand("c1");
		choiceButtonPanel.add(choice1);

		choice2 = new JButton("2");
		choice2.setBackground(Color.black);
		choice2.setForeground(Color.white);
		choice2.setFont(normalFont);
		choice2.setFocusPainted(false);
		choice2.addActionListener(choiceHandler);
		choice2.setActionCommand("c2");
		choiceButtonPanel.add(choice2);

		choice3 = new JButton("3");
		choice3.setBackground(Color.black);
		choice3.setForeground(Color.white);
		choice3.setFont(normalFont);
		choice3.setFocusPainted(false);
		choice3.addActionListener(choiceHandler);
		choice3.setActionCommand("c3");
		choiceButtonPanel.add(choice3);

		choice4 = new JButton("4");
		choice4.setBackground(Color.black);
		choice4.setForeground(Color.white);
		choice4.setFont(normalFont);
		choice4.setFocusPainted(false);
		choice4.addActionListener(choiceHandler);
		choice4.setActionCommand("c4");
		choiceButtonPanel.add(choice4);

		choice5 = new JButton("5");
		choice5.setBackground(Color.black);
		choice5.setForeground(Color.white);
		choice5.setFont(normalFont);
		choice5.setFocusPainted(false);
		choice5.addActionListener(choiceHandler);
		choice5.setActionCommand("c5");
		choiceButtonPanel.add(choice5);


		choice6 = new JButton("6");
		choice6.setBackground(Color.black);
		choice6.setForeground(Color.white);
		choice6.setFont(normalFont);
		choice6.setFocusPainted(false);
		choice6.addActionListener(choiceHandler);
		choice6.setActionCommand("c6");
		choiceButtonPanel.add(choice6);

		choice7 = new JButton("7");
		choice7.setBackground(Color.black);
		choice7.setForeground(Color.white);
		choice7.setFont(normalFont);
		choice7.setFocusPainted(false);
		choice7.addActionListener(choiceHandler);
		choice7.setActionCommand("c7");
		choiceButtonPanel.add(choice7);

		playerPanel = new JPanel();
		playerPanel.setBounds(0,15,1200,50);
		playerPanel.setBackground(Color.blue);
		playerPanel.setLayout(new GridLayout(2,8));
		con.add(playerPanel);

		NameLabel = new JLabel("���O:");
		NameLabel.setFont(smallFont);
		NameLabel.setForeground(Color.white);
		playerPanel.add(NameLabel);

		NamesetLabel = new JLabel(textName);
		NamesetLabel.setFont(smallFont);
		NamesetLabel.setForeground(Color.white);
		playerPanel.add(NamesetLabel);

		HPLabel = new JLabel(" HP:");
		HPLabel.setFont(smallFont);
		HPLabel.setForeground(Color.white);
		playerPanel.add(HPLabel);

		HPNumber = new JLabel(""+p.getHp());
		HPNumber.setFont(smallFont);
		HPNumber.setForeground(Color.white);
		playerPanel.add(HPNumber);

		DayLabel = new JLabel(" �o�ߎ���:");
		DayLabel.setFont(smallFont);
		DayLabel.setForeground(Color.white);
		playerPanel.add(DayLabel);

		DayLabelNumber = new JLabel(""+Day+"�T��");
		DayLabelNumber.setFont(smallFont);
		DayLabelNumber.setForeground(Color.white);
		playerPanel.add(DayLabelNumber);

		TimeLabel = new JLabel(" ����:");
		TimeLabel.setFont(smallFont);
		TimeLabel.setForeground(Color.white);
		playerPanel.add(TimeLabel);

		TimeLabelNumber = new JLabel(Time.time());
		TimeLabelNumber.setFont(smallFont);
		TimeLabelNumber.setForeground(Color.white);
		playerPanel.add(TimeLabelNumber);

		IntelliLabel = new JLabel(" �m��:");
		IntelliLabel.setFont(smallFont);
		IntelliLabel.setForeground(Color.white);
		playerPanel.add(IntelliLabel);

		IntelliNumber = new JLabel(""+p.getIntelligence());
		IntelliNumber.setFont(smallFont);
		IntelliNumber.setForeground(Color.white);
		playerPanel.add(IntelliNumber);

		ALoveLabel = new JLabel(""+A.getName()+"�̍D���x:");
		ALoveLabel.setFont(smallFont);
		ALoveLabel.setForeground(Color.white);
		playerPanel.add(ALoveLabel);

		ALoveNumber = new JLabel(""+A.getLovepoint());
		ALoveNumber.setFont(smallFont);
		ALoveNumber.setForeground(Color.white);
		playerPanel.add(ALoveNumber);

		BLoveLabel = new JLabel(""+B.getName()+"�̍D���x:");
		BLoveLabel.setFont(smallFont);
		BLoveLabel.setForeground(Color.white);
		playerPanel.add(BLoveLabel);

		BLoveNumber = new JLabel(""+B.getLovepoint());
		BLoveNumber.setFont(smallFont);
		BLoveNumber.setForeground(Color.white);
		playerPanel.add(BLoveNumber);

		Choose();

	}
	public void Choose() {
		position = "�I��";

		if(Day == 10) {
			if(A.getLovepoint()<=0) {
				mainTextArea.setText("A��������肵�Ă���\nB�̍D���x��10��������");
				B.addLovepoint(-10);
				BLoveNumber.setText(""+B.getLovepoint());
			}
			if(B.getLovepoint()<=0) {
				mainTextArea.setText("B��������肵�Ă���\nA�̍D���x��10��������");
				A.addLovepoint(-10);
				ALoveNumber.setText(""+A.getLovepoint());
			}
		}

		else {
			mainTextArea.setText("");
		}
		choice1.setText("A�Ɖ�b����");
		choice2.setText("B�Ɖ�b����");
		choice3.setText("A�ƕ׋�����");
		choice4.setText("B�ƕ׋�����");
		choice5.setText("A�̍D���x������");
		choice6.setText("B�̍D���x������");
		choice7.setText("HP���񕜂�����");
	}

	public void CommunicateA() {
		position = "A��b";

		Conversation co = new Conversation();


		int Aadd = new java.util.Random().nextInt(5)+1;
		A.addLovepoint(Aadd);
		ALoveNumber.setText(""+A.getLovepoint());

		int Badd = new java.util.Random().nextInt(2)+1;
		B.addLovepoint(-Badd);
		BLoveNumber.setText(""+B.getLovepoint());


		time = time + 1;
		TimeLabelNumber.setText(Time.time());
		if(time%2 == 0) {
			Day = Day +1;
			DayLabelNumber.setText(""+Day+"�T��");
		}

		choice1.setText(">");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
		choice5.setText("");
		choice6.setText("");
		choice7.setText("");


	}

	public void StudyA() {
		position = "A�׋�";

		Studying st = new Studying();

		int Aadd1 = new java.util.Random().nextInt(2)+1;
		A.addLovepoint(Aadd1);
		ALoveNumber.setText(""+A.getLovepoint());

		int Badd = new java.util.Random().nextInt(1)+1;
		B.addLovepoint(-Badd);
		BLoveNumber.setText(""+B.getLovepoint());

		int study = new java.util.Random().nextInt(5)+1;
		p.addIntelligence(study);
		IntelliNumber.setText(""+p.getIntelligence());


		time = time + 1;
		TimeLabelNumber.setText(Time.time());
		if(time%2 == 0) {
			Day = Day +1;
			DayLabelNumber.setText(""+Day+"�T��");
		}


		choice1.setText(">");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
		choice5.setText("");
		choice6.setText("");
		choice7.setText("");
	}

	public void HPgiveA() {
		position = "AHP�^����";

		mainTextArea.setText("HP�������A�̍D���x��10�オ��܂���");

		int Badd = new java.util.Random().nextInt(2)+1;
		B.addLovepoint(-Badd);
		BLoveNumber.setText(""+B.getLovepoint());

		p.addHp(-1);
		HPNumber.setText(""+p.getHp());
		if(p.getHp()==0) {
			mainTextArea.setText("�s�^�Ȏ��̂ɂ����Ă��܂��A�����ԓ��@���Ă��܂���");
			Day = 19;
			DayLabelNumber.setText(""+Day+"�T��");
		}else {
			A.addLovepoint(10);
			ALoveNumber.setText(""+A.getLovepoint());

			time = time + 1;
			TimeLabelNumber.setText(Time.time());
			if(time%2 == 0) {
				Day = Day +1;
				DayLabelNumber.setText(""+Day+"�T��");
			}
		}


		choice1.setText(">");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
		choice5.setText("");
		choice6.setText("");
		choice7.setText("");
	}

	public void CommunicateB() {
		position = "B��b";

		Conversation1 conv = new Conversation1();


		int Badd = new java.util.Random().nextInt(5)+1;
		B.addLovepoint(Badd);
		BLoveNumber.setText(""+B.getLovepoint());

		int Aadd = new java.util.Random().nextInt(2)+1;
		A.addLovepoint(-Aadd);
		ALoveNumber.setText(""+A.getLovepoint());

		time = time + 1;
		TimeLabelNumber.setText(Time.time());
		if(time%2 == 0) {
			Day = Day+1;
			DayLabelNumber.setText(""+Day+"�T��");
		}

		choice1.setText(">");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
		choice5.setText("");
		choice6.setText("");
		choice7.setText("");

	}

	public void StudyB() {
		position = "B�׋�";

		Studying1 stu = new Studying1();


		int Badd1 = new java.util.Random().nextInt(2)+1;
		B.addLovepoint(Badd1);
		BLoveNumber.setText(""+B.getLovepoint());

		int Aadd = new java.util.Random().nextInt(1)+1;
		A.addLovepoint(-Aadd);
		ALoveNumber.setText(""+A.getLovepoint());

		int study = new java.util.Random().nextInt(5)+1;
		p.addIntelligence(study);
		IntelliNumber.setText(""+p.getIntelligence());


		time = time + 1;
		TimeLabelNumber.setText(Time.time());
		if(time%2 == 0) {
			Day = Day +1;
			DayLabelNumber.setText(""+Day+"�T��");
		}


		choice1.setText(">");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
		choice5.setText("");
		choice6.setText("");
		choice7.setText("");


	}
	public void HPgiveB() {
		position = "BHP�^����";

		mainTextArea.setText("HP�������B�̍D���x��10�オ��܂���");

		int Aadd = new java.util.Random().nextInt(2)+1;
		A.addLovepoint(-Aadd);
		ALoveNumber.setText(""+A.getLovepoint());

		p.addHp(-1);
		HPNumber.setText(""+p.getHp());

		if(p.getHp()==0) {
			mainTextArea.setText("�s�^�Ȏ��̂ɂ����Ă��܂��A�����ԓ��@���Ă��܂���");
			Day = 19;
			DayLabelNumber.setText(""+Day+"�T��");
		}
		else {
			B.addLovepoint(10);
			BLoveNumber.setText(""+B.getLovepoint());

			time = time + 1;
			TimeLabelNumber.setText(Time.time());
			if(time%2 == 0) {
				Day = Day +1;
				DayLabelNumber.setText(""+Day+"�T��");
			}
		}


		choice1.setText(">");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
		choice5.setText("");
		choice6.setText("");
		choice7.setText("");
	}
	public void Hpheal() {
		position = "��";
		mainTextArea.setText("HP��1���₵��");
		p.addHp(1);
		HPNumber.setText(""+p.getHp());

		time = time + 1;
		TimeLabelNumber.setText(Time.time());
		if(time%2 == 0) {
			Day = Day +1;
			DayLabelNumber.setText(""+Day+"�T��");
		}
		choice1.setText(">");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
		choice5.setText("");
		choice6.setText("");
		choice7.setText("");

	}
	public void Confession() {
		position = "����";
		mainTextArea.setText("�Ƃ��Ƃ����Z���Ƃ̓����E�E�E\n�׋��������̂���Ȃ�ɂ���Ă������肾\n�����A�ǂ����ɍ�������H");

		choice1.setText("A");
		choice2.setText("B");
		choice3.setText("");
		choice4.setText("");
		choice5.setText("");
		choice6.setText("");
		choice7.setText("");
	}
	public void resultA() {
		playerPanel.setVisible(false);
		choiceButtonPanel.setVisible(false);
		if(p.getIntelligence()>=50 && A.getLovepoint()>=50) {
			mainTextArea.setText("��w\n���i�I\n�׋����������Ȃ������������ő��u�]�̑�w�ɍ��i���邱�Ƃ��o�����I\n�{����S������w���̊ӂ�\n\n����\n�u������v\nA�͂ɂ�����΂��ƍ�����OK����");
		}else if(p.getIntelligence()>=50 && A.getLovepoint()<50){
			mainTextArea.setText("��w\n���i�I\n�׋����������Ȃ������������ő��u�]�̑�w�ɍ��i���邱�Ƃ��o�����I\n\n����\n�u���߂�Ȃ����v\nA�ɍ�����f���Ă��܂����E�E�E");
		}else if(p.getIntelligence()<50 && A.getLovepoint()>=50) {
			mainTextArea.setText("��w\n�s���i\n���q�Ƃ̉�b�ɂ��܂��������̂��A���u�]�̑�w�ɗ����Ă��܂����E�E�E���͂����ƕ׋����悤�E�E�E\n\n����\n�u������v\nA�͂ɂ�����΂��ƍ�����OK����");
		}else if(p.getIntelligence()<50 && A.getLovepoint()<50) {
			mainTextArea.setText("��w\n�s���i\n���q�Ƃ̉�b�ɂ��܂��������̂��A���u�]�̑�w�ɗ����Ă��܂����E�E�E���͂����ƕ׋����悤�E�E�E\n\n����\n�u���߂�Ȃ����v\nA�ɍ�����f���Ă��܂����E�E�E");
		}
	}
	public void resultB() {
		playerPanel.setVisible(false);
		choiceButtonPanel.setVisible(false);
		if(p.getIntelligence()>=50 && B.getLovepoint()>=50) {
			mainTextArea.setText("��w\n���i�I\n�׋����������Ȃ������������ő��u�]�̑�w�ɍ��i���邱�Ƃ��o�����I\n�{����S������w���̊ӂ�\n\n����\n�u��A���ŁE�E�E���ꂩ�����낵���v\nB�Ɨ��l�ɂȂ���");
		}else if(p.getIntelligence()>=50 && B.getLovepoint()<50){
			mainTextArea.setText("��w\n���i�I\n�׋����������Ȃ������������ő��u�]�̑�w�ɍ��i���邱�Ƃ��o�����I\n\n����\n�u�������ǁA���Ȃ��̎v���ɂ������邱�Ƃ͂ł��Ȃ���v\nB�ɍ�����f���Ă��܂����E�E�E");
		}else if(p.getIntelligence()<50 && B.getLovepoint()>=50) {
			mainTextArea.setText("��w\n�s���i\n���q�Ƃ̉�b�ɂ��܂��������̂��A���u�]�̑�w�ɗ����Ă��܂����E�E�E���͂����ƕ׋����悤�E�E�E\n\n����\n�u��A���ŁE�E�E���ꂩ�����낵���v\nB�Ɨ��l�ɂȂ���");
		}else if(p.getIntelligence()<50 && B.getLovepoint()<50) {
			mainTextArea.setText("��w\n�s���i\n���q�Ƃ̉�b�ɂ��܂��������̂��A���u�]�̑�w�ɗ����Ă��܂����E�E�E���͂����ƕ׋����悤�E�E�E\n\n����\n�u�������ǁA���Ȃ��̎v���ɂ������邱�Ƃ͂ł��Ȃ���v\nB�ɍ�����f���Ă��܂����E�E�E");
		}
	}
	public void playerStatus() {


	}

	public class NameEnterHandler implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			textName = jtf.getText();

			Explanation();
		}
	}
	public class ExplanationHandler implements ActionListener{
		public void actionPerformed(ActionEvent event) {

			NameEnter();

		}
	}
	public class TitleScreenHandler implements ActionListener{

		public void actionPerformed(ActionEvent event) {

			createGameScreen();
		}
	}
	public class ChoiceHandler implements ActionListener{
		public void actionPerformed(ActionEvent event) {

			String yourChoice = event.getActionCommand();

			if(Day != 20 ) {
				switch(position) {
				case"�I��":
					switch(yourChoice) {
					case"c1":CommunicateA();break;
					case"c2":CommunicateB();break;
					case"c3":StudyA();break;
					case"c4":StudyB();break;
					case"c5":HPgiveA();break;
					case"c6":HPgiveB();break;
					case"c7":Hpheal();break;
					}
					break;
				case"A��b":
					switch(yourChoice) {
					case"c1":Choose();break;
					}
					break;
				case"B��b":
					switch(yourChoice) {
					case"c1":Choose();break;
					}
					break;
				case"A�׋�":
					switch(yourChoice) {
					case"c1":Choose();break;
					}
					break;
				case"B�׋�":
					switch(yourChoice) {
					case"c1":Choose();break;
					}
					break;
				case"AHP�^����":
					switch(yourChoice) {
					case"c1":Choose();break;
					}
					break;
				case"BHP�^����":
					switch(yourChoice) {
					case"c1":Choose();break;
					}
					break;
				case"��":
					switch(yourChoice) {
					case"c1":Choose();break;
					}
					break;

				}
			}else if(Day == 20){
				switch(position) {
				case"A��b":
					switch(yourChoice) {
					case"c1":Confession();break;
					}
					break;
				case"B��b":
					switch(yourChoice) {
					case"c1":Confession();break;
					}
					break;
				case"A�׋�":
					switch(yourChoice) {
					case"c1":Confession();break;
					}
					break;
				case"B�׋�":
					switch(yourChoice) {
					case"c1":Confession();break;
					}
					break;
				case"AHP�^����":
					switch(yourChoice) {
					case"c1":Confession();break;
					}
					break;
				case"BHP�^����":
					switch(yourChoice) {
					case"c1":Confession();break;
					}
					break;
				case"��":
					switch(yourChoice) {
					case"c1":Confession();break;
					}
					break;

				case"����":
					switch(yourChoice) {
					case"c1":resultA();break;
					case"c2":resultB();break;
					}
					break;
				}
			}
		}
	}
}


