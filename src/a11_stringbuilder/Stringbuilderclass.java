//stringbuilder class is use to append string and .tostring() is used to get the string from the object.
package a11_stringbuilder;

public class Stringbuilderclass {

	public static void main(String[] args) {
	  StringBuilder sb = new StringBuilder();
	  sb.append("I am abhishek ")
	  .append("and I am greatest")
	  .append(" with all luck following with me");
	  System.out.println(sb.toString());
	}

}
