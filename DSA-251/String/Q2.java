import java.util.* ;
import java.io.*; 
class Q2 {
	public static String encode(String message) {
            StringBuilder sb = new StringBuilder("");
            for (int i = 0; i < message.length(); i++) {
                  Integer count = 1;
                  while (i < message.length() - 1 && message.charAt(i) == message.charAt(i + 1)) {
                        count++;
                        i++;
                  }
                  sb.append(message.charAt(i));
                  sb.append(count);

            }

            return sb.toString();
	}
}