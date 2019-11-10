package by.ad.les10_1.main;

/*
 * 1. Создать объект класса Текст, используя классы Предложение, Слово. 
 * Методы: дополнить текст, вывести на консоль текст, заголовок текста.  
 */
import by.ad.les10_1.bean.Sentence;
import by.ad.les10_1.bean.Text;
import by.ad.les10_1.bean.Word;
import by.ad.les10_1.logic.Printer;
import by.ad.les10_1.logic.TextLogic;

public class Runner1 {

	public static void main(String[] args) {

		Word word1 = new Word("Привет");
		Word word2 = new Word("меня");
		Word word3 = new Word("зовут");
		Word word4 = new Word("Алекс!");
		Word word5 = new Word("Завтра");
		Word word6 = new Word("выходной!");
		Word word7 = new Word("Заголовок");
		Sentence sent1 = new Sentence();
		Sentence sent2 = new Sentence();
		Sentence sent3 = new Sentence();

		sent1.addWord(word1);
		sent1.addWord(word2);
		sent1.addWord(word3);
		sent1.addWord(word4);
		sent2.addWord(word5);
		sent2.addWord(word6);
		sent3.addWord(word7);
		Text text1 = new Text();

		text1.addSent(sent1);
		text1.addSent(sent2);

		TextLogic textLogic = new TextLogic();
		textLogic.addZagolovok(text1, sent3);

		Printer.printText(text1);
		Printer.printSentence(textLogic.getZagolovok(text1, 0));
		
		/*
		 * text1.addZagolovok(sent2); System.out.println(text1.getZagolovok());
		 */
	}
}
