import java.util.Random;

public class Studying1 {

	public Studying1() {
		Random ra = new Random();
		int b = ra.nextInt(10);

		switch(b) {
		case 0:Game.mainTextArea.setText("「言葉というものはなんとも複雑怪奇だな」\n「しかし、言葉がないと思っていることを伝えられない」\n「難しいものだ」");break;
		case 1:Game.mainTextArea.setText("「教えるのもやぶさかではない」");break;
		case 2:Game.mainTextArea.setText("「ここがわからないんだがちょっと教えてくれないか？」\n「助かるよ」");break;
		case 3:Game.mainTextArea.setText("「学校で効率のいい勉強法も是非教えて欲しいところだな」");break;
		case 4:Game.mainTextArea.setText("「世界史の陰にも私たちのような一般市民がいるのだと思うとなにやら感慨深いものがあると思わないか？」");break;
		case 5:Game.mainTextArea.setText("「すまない、集中したいんだ」\n「君も君のやるべきことに集中したらどうだ」");break;
		case 6:Game.mainTextArea.setText("「古文や漢文からは過去の人々の暮らしや考え方まで読み取れるのが面白いな」\n「今私たちが読んでいるような本もいつか古典と呼ばれる日が来るんだろうか」");break;
		case 7:Game.mainTextArea.setText("「ん、感心感心」\n「復習は大切だからな」");break;
		case 8:Game.mainTextArea.setText("「ああ、この参考書はわかりやすい上にかなりレベルも高くていいよ」\n「君も使うといい」\n「完全に解けるようになれば大変結構だ」");break;
		case 9:Game.mainTextArea.setText("「へぇ･･･結構真面目に学んでいるんだな」\n「何かわからないことがあれば気軽に聞いてくれて構わないぞ」\n「なに、困ったときはお互い様だ」");break;


		}


	}
}
