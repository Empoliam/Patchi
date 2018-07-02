package patchi.components;

import java.util.regex.Pattern;

import javafx.scene.control.TextField;

// TODO: Auto-generated Javadoc
/**
 * A textfield that only allows integer input, and can return an int rather than a String.
 */
public class IntegerField extends TextField {

	/**  Regex pattern. */
	private static Pattern intPattern = Pattern.compile("[0-9]*");
	
	/**
	 * Create a new IntegerField.
	 */
	public IntegerField() {
		super();
	}

	/**
	 * Create a new IntegerField, with the specified default value.
	 *
	 * @param default the default value
	 */
	public IntegerField(int def) {
		super(Integer.toString(def));
		
	}
	
	/* (non-Javadoc)
	 * @see javafx.scene.control.TextInputControl#replaceText(javafx.scene.control.IndexRange, java.lang.String)
	 */
	@Override
	public void replaceText(int start, int end, String text) {
		if(intPattern.matcher(text).matches()) super.replaceText(start, end, text);
	}
	
	/* (non-Javadoc)
	 * @see javafx.scene.control.TextInputControl#replaceSelection(java.lang.String)
	 */
	@Override
	public void replaceSelection(String replacement) {	
		if(intPattern.matcher(replacement).matches()) super.replaceSelection(replacement);
	}
	
	
	/**
	 * Returns the contents of the IntegerField as an integer
	 *
	 * @return contents
	 */
	public int getInteger() {
		return Integer.parseInt(super.getText());
	}
	
}
