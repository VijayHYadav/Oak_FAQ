package com.basicsstrong.enumcoding;

/*
 * You can also create enum inside of class, outside of class and inside class
 * both.
 */
enum Colors {
	Red, Green, Blue, White, Black;
}

enum Week {
	Sun("Holiday"), Mon, Tue, Wed, Thu, Fri, Sat;

	int a = 0;
	private String val;

	Week() {
		this.val = "Working";
	}

	Week(String value) {
		this.val = value;
	}

	public String getDetails() {
		return val;
	}
}

public class EnumDemo {

	/*
	 * You can also create enum inside of class, outside of class and inside class
	 * both.
	 */
	public enum Color {
		Red, Green, Blue, White, Black;
	}

	public static void main(String[] args) {

		Color[] colors = Color.values();

		for (Color c : colors) {
			System.out.println(c);
		}

		System.out.println();

		System.out.println(Color.valueOf("White"));

		System.out.println();

		Week day = Week.Wed;
		System.out.println(day);
		
		System.out.println();
		
		Week[] w = Week.values();
		for (Week week : w) {
			System.out.println(week + " - " + week.getDetails() + " " + week.toString() + " " + week.ordinal());
		}
	}

}
