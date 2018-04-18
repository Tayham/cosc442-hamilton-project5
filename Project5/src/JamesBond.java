import java.util.regex.*;

public class JamesBond {
	private static final String regex = "(\\d|\\))*\\((\\d|\\)|\\()*007(\\d|\\)|\\()*\\)(\\d|\\(|\\))*";

	public Boolean bondRegex(String input) {
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		return matcher.find();
	}
}
