package by.ad.les10_1.logic;

import by.ad.les10_1.bean.Sentence;
import by.ad.les10_1.bean.Text;

public class TextLogic {

	public void addZagolovok(Text text, Sentence sentence) {

		text.addIndexSent(0, sentence);
	}

	public Sentence getZagolovok(Text text, int index) {

		return text.getIndexSent(index);
	}

}
