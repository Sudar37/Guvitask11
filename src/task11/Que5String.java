package task11;

public class Que5String {

public static void main(String[] args) {
	// TODO Auto-generated method stub

	String str = "My String";
		
        System.out.println(str.charAt(9));
    }
}
------------------------------------------------------------------------------------------------------------
OUTPUT:
Exception in thread "main" java.lang.StringIndexOutOfBoundsException: Index 9 out of bounds for length 9
	at java.base/jdk.internal.util.Preconditions$1.apply(Preconditions.java:55)
	at java.base/jdk.internal.util.Preconditions$1.apply(Preconditions.java:52)
	at java.base/jdk.internal.util.Preconditions$4.apply(Preconditions.java:213)
	at java.base/jdk.internal.util.Preconditions$4.apply(Preconditions.java:210)
	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:98)
	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
	at java.base/java.lang.String.checkIndex(String.java:4828)
	at java.base/java.lang.StringLatin1.charAt(StringLatin1.java:46)
	at java.base/java.lang.String.charAt(String.java:1555)
	at guvitask11/task11.Que5String.main(Que5String.java:10)
