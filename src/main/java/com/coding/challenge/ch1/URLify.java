package com.coding.challenge.ch1;

class URLify {
	URLify() {
		throw new AssertionError();
	}

	public static void main(String[] args) {
		System.out.println(urlify("Mr John Smith    ", 13));
	}

	static String urlify(String s, int length) {
		final char[] chars = s.toCharArray();
		final int n = s.length();
		// two-pointer technique.
		for (int i = length - 1, j = n - 1; i >= 0; i--) {
			if (s.charAt(i) == ' ') {
				chars[j] = '0';
				chars[j - 1] = '2';
				chars[j - 2] = '%';
				j = j - 3;
			} else {
				chars[j] = chars[i];
				j = j - 1;
			}
		}
		return String.valueOf(chars);
	}
}
