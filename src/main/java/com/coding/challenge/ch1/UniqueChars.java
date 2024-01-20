package com.coding.challenge.ch1;

class UniqueChars {
	private static final char FIRST_LETTER = 'a';

	UniqueChars() {
		throw new AssertionError();
	}

	public static void main(String[] args) {
		System.out.println(isUnique("hello"));
		System.out.println(isUnique("dynamic"));
	}

	static boolean isUnique(String s) {
		final int[] freq = new int[26];
		for (char ch : s.toCharArray())
			freq[ch - FIRST_LETTER] = freq[ch - FIRST_LETTER] + 1;

		for (int i = 0; i < 26; i++)
			if (freq[i] > 1)
				return false;

		return true;
	}
}
