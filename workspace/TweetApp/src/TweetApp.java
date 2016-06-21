import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

public class TweetApp {

	/**
	 * Variables de identificaci�n ante twitter de tractores Berrio.
	 */
	static final String ConsumerKey = "LW5r5nVMG3L9bp84J2NEn1duC";
	static final String ConsumerSecret = "CoBE0j5mY5yfSDsRM7eXlWZzEFfYDOxzDwhZue2zr9xDADPESr";
	static final String UserID = "3107411981";
	static final String token = UserID + "-rZmkQTPmSqE9x2o12mB0Qcll3sgLPkZpR2OaPrD";
	static final String tokenSecret = "6FyBVOj5XQbQxrzMtwqblxl3EB0SkST3nuHaZ1POnRHLb";
	static Twitter asyncTwitter;

	/**
	 * Instancia de Twitter, se usará la variable asíncrona tal como especifica
	 * el proyecto
	 */
	public static void init() {
		asyncTwitter = new TwitterFactory().getInstance();
		asyncTwitter.setOAuthConsumer(ConsumerKey, ConsumerSecret);
		asyncTwitter.setOAuthAccessToken(new AccessToken(token, tokenSecret));
	}

	/**
	 * Actualiza el estado del proveedor al mensaje pasado como argumento.
	 *
	 * @param message
	 * @throws TwitterException
	 */
	public void setStatus(String message) throws TwitterException {
		init();
		if (message.length() > 140) {
			System.err.println("Message too long, max:{140 characters}");
			return;
		}
		asyncTwitter.updateStatus(message);
	}

}