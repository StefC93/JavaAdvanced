package opdracht5;

public interface TextUtil {
	public static String quote(String s) {
		return String.format("<<%s>>", s);
	}

	public static String reverse(String s) {
		char[] zin = s.toCharArray();
		int begin = 0;
		int end = s.length() - 1;
		char temp;
		while (end > begin) {
			temp = zin[begin];
			zin[begin] = zin[end];
			zin[end] = temp;
			end--;
			begin++;
		}

		/*
		 * for (char tekst : zin) { temp = zin[begin]; zin[begin]=zin[end];
		 * zin[end]=temp; end--; begin++; }
		 */

		return zin.toString();
	}
}
