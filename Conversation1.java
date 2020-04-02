import java.util.Random;

public class Conversation1 {

	public Conversation1() {
		Random rand = new Random();
		int a = rand.nextInt(16);

		switch(a) {
		case 0: Game.mainTextArea.setText("「ああ、君か」\n「早く掃除を済ませてしまおう」\n「だらだらやるのは愚者の行いだ」");break;
		case 1: Game.mainTextArea.setText("「･･･別に無理に話題を振ろうとしなくてもいいんだぞ」\n「沈黙が心地いい、そういう時もある」");break;
		case 2: Game.mainTextArea.setText("「しゃべってくれるのは嬉しいのだが･･･」\n「私にかまけてる時間があるのか、君」\n「風の噂では成績が怪しいとか聞いたが」");break;
		case 3: Game.mainTextArea.setText("「･･･私みたいなのに構うなんて、君も相当奇特なヤツだな」");break;
		case 4: Game.mainTextArea.setText("「今日は特に空が澄んでるな」\n「ああ、いい天気だ･･･」");break;
		case 5: Game.mainTextArea.setText("「きゃあ！」\n「むっむ、虫！虫！」\n「た、助かったよ、どうも虫だけは苦手でね」\n「いや、無理してるわけじゃない」");break;
		case 6: Game.mainTextArea.setText("「お茶を淹れたんで飲んでみてくれないか」\n「おいしい？ならいいんだ」");break;
		case 7: Game.mainTextArea.setText("「料理？あまり上手くはないな」\n「期待してたって？残念だったね」\n「ただお茶には自信があるから今度飲ませてあげるよ」");break;
		case 8: Game.mainTextArea.setText("「おや、暇なのか？」\n「いや、嫌味で言ったわけじゃない」\n「でも、暇だからと言って私と話しても面白くないだろう？」");break;
		case 9: Game.mainTextArea.setText("「何か話のタネはあったかな･･･」\n「まあ無理に話すこともないか」\n「何をするでもなくただ時間を過ごすというのも悪くないさ」");break;
		case 10: Game.mainTextArea.setText("「呼び方？『君』じゃ不満か？」\n「何？名前で呼んでみてほしいだって？！」\n「で、出来るわけないだろう」\n「なんというか･･･そんな･･･こっ恥ずかしいこと！」\n「わかったか？君」");
		case 11: Game.mainTextArea.setText("「実は私はまだ君のことをあまり知らない」\n「今日は君の話をしてくれないか？」");
		case 12: Game.mainTextArea.setText("「あ、ああ･･･そうだな」\nBの受け答えは何故か少しぎこちない");
		case 13: Game.mainTextArea.setText("「く、くくっ･･･ふふふっ」\n「思い出すだけで･･･くっふふ･･･」\nどうやら冗談が壺に入ってしまったようだ");
		case 14: Game.mainTextArea.setText("Bの肩を叩き、指を突き出して待つ\n「うん？どうした･･･」\nぷにっと音がしそうなほど柔らかく、指が頬を突いた\n「･･･この行為に意味があるとは思えない」\nしかし、指を刺したままにして動かさない\nするとそのまま頬を膨らませる\n「･･･子供か、君は」\n(少し悔しそう、勝った)");
		case 15: Game.mainTextArea.setText("「綺麗な夕日だ」\n「ん、夕焼けを眺めてため息を吐くなんて」\n「存外君はロマンチストなのかもしれないな」");



		}
	}

}
