package jp.com.api.twitter.sample;

import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;
import twitter4j.auth.RequestToken;

public class TwitterAPI {

    private static Twitter twitter = null;

    private static RequestToken requestToken = null;

    private static final String CONSUMER_KEY = "twitter.consumerKey";

    private static final String CONSUMER_SECRET = "twitter.consumerSecret";

    /**
     * new instance twitter4j
     */
    private static Twitter getTwitter() {
        if (twitter == null) {
            twitter = new TwitterFactory().getInstance();
            twitter.setOAuthConsumer(CONSUMER_KEY, CONSUMER_SECRET);
        }
        return twitter;
    }

    /**
     * get Request token
     */
    public static RequestToken getRequestToken() {
        if (requestToken == null) {
            Twitter twitter = getTwitter();
            try {
                requestToken = twitter.getOAuthRequestToken("/");
            } catch (TwitterException e) {
                System.out.println(e);
            }
        }
        return requestToken;
    }

    /**
     * get Access token
     * @param requestToken RequestToken
     * @param oauthVerifier oauth_verifier
     */
    public static AccessToken getOAuthAccessToken(RequestToken requestToken, String oauthVerifier) {
        Twitter twitter = getTwitter();
        try {
            AccessToken accessToken = twitter.getOAuthAccessToken(requestToken, oauthVerifier);
            return accessToken;
        } catch (TwitterException e) {
            System.out.println(e);
        }
    }
}