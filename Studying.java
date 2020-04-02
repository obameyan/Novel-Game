import java.util.Random;
public class Studying {
	public Studying() {
		Random ra = new Random();
		int b = ra.nextInt(10);

		switch(b) {
		case 0:Game.mainTextArea.setText("「クローン技術でもう一人つくれたらそっちに勉強やらせるのにー」\n「え、どっちが勉強するかでけんかになりそうって？」\n「言い返せないのが悔しいところね」");break;
		case 1:Game.mainTextArea.setText("「『学而不思則罔　思而不学則殆』という言葉を知ってるかしら？」\n「よく考え、よく学びなさいという意味のありがたーい言葉よ」\n「さっ、勉強に戻りましょ」");break;
		case 2:Game.mainTextArea.setText("「化学ってやってみると案外楽しいねえ」\n「実験を実際にやりながら出来たらもっと楽しいのに」");break;
		case 3:Game.mainTextArea.setText("「『学然後知不足　教然後知困』という言葉を知ってるかしら？」\n「自分自身で学んではじめて自分に足りないところがわかって、人に教えることではじめてその難しさがわかるという意味よ」\n「という訳で少し数学教えて！」");break;
		case 4:Game.mainTextArea.setText("「勉強するぞー」\n(気合は十分のようだ)\n「まずは勉強するために勉強の仕方を勉強するぞー」\n（・・・）\n「･･･勉強しなきゃダメ？」");break;
		case 5:Game.mainTextArea.setText("「こうやって一緒に勉強してると昔あんたの家で一緒に宿題やったの思い出すなぁ」\n「あの頃は若かったのぅ･･･」");break;
		case 6:Game.mainTextArea.setText("「何勉強してんの？え、古文？」\n「教えてあげよっか、このAさんが」");break;
		case 7:Game.mainTextArea.setText("「数学全然わかんないよー、もう3年だっていうのに」\n「今のままじゃ部分点すら怪しいかも･･･」\nいつになくAは深刻な表情だ\n「得意なんだったらちょっと聞きたいことあるんだけど、いい？」");break;
		case 8:Game.mainTextArea.setText("「アウステルリッツの三帝会戦、神聖ローマ帝国、マニフェストデスティニー･･････」\n「何で世界史の用語ってこう一々かっこいいんだろ、この魅力が私を狂わせる･･･」\n「別に得意教科でもないだろって？それは言っちゃダメ」");break;
		case 9:Game.mainTextArea.setText("「英語を教えて欲しい？ふふ、やっと日本は自分にとって狭すぎると気付いたのね？」\nそう言うとおもむろに立ち上がり、何やら腕を振り上げてこう叫んだ。\n「世界を獲りに行くぞ！」\n「じゃあまずは単語からね！」");break;


		}


	}

}
