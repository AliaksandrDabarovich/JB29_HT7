package by.ad.les10_1.bean;

import java.util.ArrayList;
import java.util.List;

public class Text {
	private List<Sentence> text;

	public Text(List<Sentence> text) {

		this.text = text;
	}

	public Text() {

		text = new ArrayList<Sentence>();

	}

	public void addSent(Sentence sentence) {

		text.add(sentence);
	}

	public List<Sentence> getText() {
		return text;
	}

	public void setText(List<Sentence> text) {
		this.text = text;
	}

	public void addIndexSent(int index, Sentence sentence) {

		text.add(index, sentence);
	}

	public Sentence getIndexSent(int index) {

		return text.get(index);
	}

	@Override
	public String toString() {
		return "" + text;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((text == null) ? 0 : text.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Text other = (Text) obj;
		if (text == null) {
			if (other.text != null)
				return false;
		} else if (!text.equals(other.text))
			return false;
		return true;
	}
	

}
