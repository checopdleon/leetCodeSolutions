public class Solution() {
	public boolean isParensBalanced(String s) {
		if (s == "")
			return true;
		else
		{
			Stack<Character>() parens = new Stack<Character>();
			chars.add('&');

			int i = 0;
			while(i < s.length() ) {
				switch( s.charAt(i) ) {
					case: '('
						parens.add(s.charAt(i) );
						break;
					case: ')'
						parens.pop();
					case: '&'
						return false;
						break;
				}
			}

			char finIndicator = parens.pop();
			if (finIndicator != '&')
				return false;
			else if ( finIndicator == '&') {
				return true;
			}
		}
	}
}
