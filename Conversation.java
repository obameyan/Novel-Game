
import java.util.Random;

public class Conversation {


	public Conversation() {
		Random rand = new Random();
		int a = rand.nextInt(17);

		switch(a) {
		case 0: Game.mainTextArea.setText("「え？私とお話ししたいって？」\n「ふふ、あんたも暇よねー」");break;
		case 1: Game.mainTextArea.setText("「さっきの授業、あんたわかった？」\n「あ、そう。わかったんだ。へー意外。あとで教えてよ」");break;
		case 2: Game.mainTextArea.setText("「あんまり数学は得意じゃないの。」\n珍しく、しおらしくそう言ったかと思えば\n「意外？ね、意外でしょ？私って完璧に見られがちなんだよね・・・」");break;
		case 3: Game.mainTextArea.setText("「この後暇？本屋に寄って行かない？好きな作家さんの新刊が出たんだー」\n「あんたの好きな本のジャンル教えてよ。私はミステリーが特に好き」\n\n（俺もミステリーと答えるとめんどくさそうだしやめておこう・・・）");break;
		case 4: Game.mainTextArea.setText("「へえ・・・たまにはまともなこと言うじゃん」\n「普段からそれを発揮できればいいんだけどねぇ」\n「冗談よ」");break;
		case 5: Game.mainTextArea.setText("「今日は気持ちのいい天気だったなぁ」\n「こんな日にずっと学校にいたなんて、すごく青春を浪費した気分にならない？」");break;
		case 6: Game.mainTextArea.setText("「今日の服装、いかしてるわね！」\n\n(いやいや、あんたこそ)\n「いや、制服じゃない」");break;
		case 7: Game.mainTextArea.setText("「髪のびてきたかな？」\n「長いほうがあんたの好みなんて聞いてないんですけど！」\n「すぐ切ろ、帰ったらすぐね」");break;
		case 8: Game.mainTextArea.setText("「部活何かやってる？」\n「私？私はテニス部だけど、って今更聞くようなこと？」");break;
		case 9: Game.mainTextArea.setText("「数学抜き打ちテストがあるなんて聞いてないよ～」\n「抜き打ちやるなら先に教えてもらいたい！」");break;
		case 10:Game.mainTextArea.setText("「自転車の鍵をなくして探すのを手伝ってほしいって？」\n「あんた、私を便利屋か何かと勘違いしてない？まあ手伝ってあげないこともないけど」");
		case 11:Game.mainTextArea.setText("「最近駅前にコーヒーショップできたの知ってる？」\n行ったことがあると告げると興味津々な様子で身を乗り出す\n「さすが耳が早いわね。あそこのチョコレートフラッペは最高だって本当？」");
		case 12:Game.mainTextArea.setText("「今朝のニュースは見たかしら？」\n「もう高校3年生なんだしニュースを見る習慣くらい付けた方がいいんじゃない」");
		case 13:Game.mainTextArea.setText("「今日登校中に野良猫を見たの」\n「黒猫のようにも見えたけど、朝日を浴びて白くも見えたわ」\n「結局は見た方の気の持ちようってね」\n「いいこと言った？」");
		case 14:Game.mainTextArea.setText("「やー、今日は宿題見せてくれてどうも！」\n「危うく致命傷で済むところだったから助かったわ」");
		case 15:Game.mainTextArea.setText("「そろそろ卒業と思うとなんだか胸にこみ上げてくるものがあるわよね」\n「はっ、もしかしてこれが逆流性食道炎ってやつなのかしら」");
		case 16:Game.mainTextArea.setText("「スタバでバイトしてる。この言葉を言えたら一目置かれる風潮あると思わない？」\n「何でスタバだけ･･･コメダ珈琲はダメなの？！」\n「やっぱりstarbucksっていう響きがいいのか！どうなんだ！？」");

		}
	}

}
