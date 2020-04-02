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
		textLabel = new JLabel("名前を入力して、クリックしてください");
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
		TextArea.setText("※このゲームにおいて主人公（あなた）は高校3年生の学生である。\nこの世界における一年は20週で表され、20週目に告白イベントが発生する。\nそれまでに好みのほうのキャラの好感度を上げておく必要がある。\nまた学生の本分である勉強も怠ってはいけない。大学受験を控えているからだ。\n\nこのゲームにはHP要素がありそれを消費することで特定のキャラの好感度を上げることができる。ただしHPが0になってしまうと不運なことが起こるため注意してほしい。\nそれではゲームスタート！");


		nextButtonPanel = new JPanel();
		nextButtonPanel.setBackground(Color.black);
		nextButtonPanel.setBounds(400,650,200,100);

		nextButton = new JButton("次へ");
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

		NameLabel = new JLabel("名前:");
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

		DayLabel = new JLabel(" 経過時間:");
		DayLabel.setFont(smallFont);
		DayLabel.setForeground(Color.white);
		playerPanel.add(DayLabel);

		DayLabelNumber = new JLabel(""+Day+"週目");
		DayLabelNumber.setFont(smallFont);
		DayLabelNumber.setForeground(Color.white);
		playerPanel.add(DayLabelNumber);

		TimeLabel = new JLabel(" 時間:");
		TimeLabel.setFont(smallFont);
		TimeLabel.setForeground(Color.white);
		playerPanel.add(TimeLabel);

		TimeLabelNumber = new JLabel(Time.time());
		TimeLabelNumber.setFont(smallFont);
		TimeLabelNumber.setForeground(Color.white);
		playerPanel.add(TimeLabelNumber);

		IntelliLabel = new JLabel(" 知力:");
		IntelliLabel.setFont(smallFont);
		IntelliLabel.setForeground(Color.white);
		playerPanel.add(IntelliLabel);

		IntelliNumber = new JLabel(""+p.getIntelligence());
		IntelliNumber.setFont(smallFont);
		IntelliNumber.setForeground(Color.white);
		playerPanel.add(IntelliNumber);

		ALoveLabel = new JLabel(""+A.getName()+"の好感度:");
		ALoveLabel.setFont(smallFont);
		ALoveLabel.setForeground(Color.white);
		playerPanel.add(ALoveLabel);

		ALoveNumber = new JLabel(""+A.getLovepoint());
		ALoveNumber.setFont(smallFont);
		ALoveNumber.setForeground(Color.white);
		playerPanel.add(ALoveNumber);

		BLoveLabel = new JLabel(""+B.getName()+"の好感度:");
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
		position = "選択";

		if(Day == 10) {
			if(A.getLovepoint()<=0) {
				mainTextArea.setText("Aがやつあたりしてきた\nBの好感度が10下がった");
				B.addLovepoint(-10);
				BLoveNumber.setText(""+B.getLovepoint());
			}
			if(B.getLovepoint()<=0) {
				mainTextArea.setText("Bがやつあたりしてきた\nAの好感度が10下がった");
				A.addLovepoint(-10);
				ALoveNumber.setText(""+A.getLovepoint());
			}
		}

		else {
			mainTextArea.setText("");
		}
		choice1.setText("Aと会話する");
		choice2.setText("Bと会話する");
		choice3.setText("Aと勉強する");
		choice4.setText("Bと勉強する");
		choice5.setText("Aの好感度あげる");
		choice6.setText("Bの好感度あげる");
		choice7.setText("HPを回復させる");
	}

	public void CommunicateA() {
		position = "A会話";

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
			DayLabelNumber.setText(""+Day+"週目");
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
		position = "A勉強";

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
			DayLabelNumber.setText(""+Day+"週目");
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
		position = "AHP与える";

		mainTextArea.setText("HPを消費してAの好感度が10上がりました");

		int Badd = new java.util.Random().nextInt(2)+1;
		B.addLovepoint(-Badd);
		BLoveNumber.setText(""+B.getLovepoint());

		p.addHp(-1);
		HPNumber.setText(""+p.getHp());
		if(p.getHp()==0) {
			mainTextArea.setText("不運な事故にあってしまい、長期間入院してしまった");
			Day = 19;
			DayLabelNumber.setText(""+Day+"週目");
		}else {
			A.addLovepoint(10);
			ALoveNumber.setText(""+A.getLovepoint());

			time = time + 1;
			TimeLabelNumber.setText(Time.time());
			if(time%2 == 0) {
				Day = Day +1;
				DayLabelNumber.setText(""+Day+"週目");
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
		position = "B会話";

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
			DayLabelNumber.setText(""+Day+"週目");
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
		position = "B勉強";

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
			DayLabelNumber.setText(""+Day+"週目");
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
		position = "BHP与える";

		mainTextArea.setText("HPを消費してBの好感度が10上がりました");

		int Aadd = new java.util.Random().nextInt(2)+1;
		A.addLovepoint(-Aadd);
		ALoveNumber.setText(""+A.getLovepoint());

		p.addHp(-1);
		HPNumber.setText(""+p.getHp());

		if(p.getHp()==0) {
			mainTextArea.setText("不運な事故にあってしまい、長期間入院してしまった");
			Day = 19;
			DayLabelNumber.setText(""+Day+"週目");
		}
		else {
			B.addLovepoint(10);
			BLoveNumber.setText(""+B.getLovepoint());

			time = time + 1;
			TimeLabelNumber.setText(Time.time());
			if(time%2 == 0) {
				Day = Day +1;
				DayLabelNumber.setText(""+Day+"週目");
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
		position = "回復";
		mainTextArea.setText("HPを1増やした");
		p.addHp(1);
		HPNumber.setText(""+p.getHp());

		time = time + 1;
		TimeLabelNumber.setText(Time.time());
		if(time%2 == 0) {
			Day = Day +1;
			DayLabelNumber.setText(""+Day+"週目");
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
		position = "告白";
		mainTextArea.setText("とうとう高校卒業の日だ・・・\n勉強も恋愛のそれなりにやってきたつもりだ\nさぁ、どっちに告白する？");

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
			mainTextArea.setText("大学\n合格！\n勉強を欠かさなかったおかげで第一志望の大学に合格することが出来た！\n本分を全うする学生の鑑だ\n\n告白\n「いいよ」\nAはにっこり笑うと告白をOKした");
		}else if(p.getIntelligence()>=50 && A.getLovepoint()<50){
			mainTextArea.setText("大学\n合格！\n勉強を欠かさなかったおかげで第一志望の大学に合格することが出来た！\n\n告白\n「ごめんなさい」\nAに告白を断られてしまった・・・");
		}else if(p.getIntelligence()<50 && A.getLovepoint()>=50) {
			mainTextArea.setText("大学\n不合格\n女子との会話にかまけすぎたのか、第一志望の大学に落ちてしまった・・・次はもっと勉強しよう・・・\n\n告白\n「いいよ」\nAはにっこり笑うと告白をOKした");
		}else if(p.getIntelligence()<50 && A.getLovepoint()<50) {
			mainTextArea.setText("大学\n不合格\n女子との会話にかまけすぎたのか、第一志望の大学に落ちてしまった・・・次はもっと勉強しよう・・・\n\n告白\n「ごめんなさい」\nAに告白を断られてしまった・・・");
		}
	}
	public void resultB() {
		playerPanel.setVisible(false);
		choiceButtonPanel.setVisible(false);
		if(p.getIntelligence()>=50 && B.getLovepoint()>=50) {
			mainTextArea.setText("大学\n合格！\n勉強を欠かさなかったおかげで第一志望の大学に合格することが出来た！\n本分を全うする学生の鑑だ\n\n告白\n「よ、喜んで・・・これからもよろしく」\nBと恋人になった");
		}else if(p.getIntelligence()>=50 && B.getLovepoint()<50){
			mainTextArea.setText("大学\n合格！\n勉強を欠かさなかったおかげで第一志望の大学に合格することが出来た！\n\n告白\n「悪いけど、あなたの思いにこたえることはできないわ」\nBに告白を断られてしまった・・・");
		}else if(p.getIntelligence()<50 && B.getLovepoint()>=50) {
			mainTextArea.setText("大学\n不合格\n女子との会話にかまけすぎたのか、第一志望の大学に落ちてしまった・・・次はもっと勉強しよう・・・\n\n告白\n「よ、喜んで・・・これからもよろしく」\nBと恋人になった");
		}else if(p.getIntelligence()<50 && B.getLovepoint()<50) {
			mainTextArea.setText("大学\n不合格\n女子との会話にかまけすぎたのか、第一志望の大学に落ちてしまった・・・次はもっと勉強しよう・・・\n\n告白\n「悪いけど、あなたの思いにこたえることはできないわ」\nBに告白を断られてしまった・・・");
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
				case"選択":
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
				case"A会話":
					switch(yourChoice) {
					case"c1":Choose();break;
					}
					break;
				case"B会話":
					switch(yourChoice) {
					case"c1":Choose();break;
					}
					break;
				case"A勉強":
					switch(yourChoice) {
					case"c1":Choose();break;
					}
					break;
				case"B勉強":
					switch(yourChoice) {
					case"c1":Choose();break;
					}
					break;
				case"AHP与える":
					switch(yourChoice) {
					case"c1":Choose();break;
					}
					break;
				case"BHP与える":
					switch(yourChoice) {
					case"c1":Choose();break;
					}
					break;
				case"回復":
					switch(yourChoice) {
					case"c1":Choose();break;
					}
					break;

				}
			}else if(Day == 20){
				switch(position) {
				case"A会話":
					switch(yourChoice) {
					case"c1":Confession();break;
					}
					break;
				case"B会話":
					switch(yourChoice) {
					case"c1":Confession();break;
					}
					break;
				case"A勉強":
					switch(yourChoice) {
					case"c1":Confession();break;
					}
					break;
				case"B勉強":
					switch(yourChoice) {
					case"c1":Confession();break;
					}
					break;
				case"AHP与える":
					switch(yourChoice) {
					case"c1":Confession();break;
					}
					break;
				case"BHP与える":
					switch(yourChoice) {
					case"c1":Confession();break;
					}
					break;
				case"回復":
					switch(yourChoice) {
					case"c1":Confession();break;
					}
					break;

				case"告白":
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


