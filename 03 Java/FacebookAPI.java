package jp.com.-----

// TODO つくりかけ...
public class FacebookAPI {

    /** 認証URL **/
    private String DIALOG_URL = "https://www.facebook.com/dialog/oauth";

    /** アクセストークンURL **/
    private String ACCESS_TOKEN_URL = "https://graph.facebook.com/oauth/access_token";

    /** ユーザURL **/
    private String ME_URL = "https://graph.facebook.com/me";

    /** url **/
    private final String URL = "";

    /** redirect_uri**/
    private final String REDIRECT_URI = "";

    /** client_id **/
    private final String APP_ID = "facebook.app.id";

    /** client_secret **/
    private final String APP_SECRET = "facebook.app.secret";

    /**
     * OAuth認証用のURLを返却します
     */
    public String getOAuthURL() {
        StringBuilder sb = new StringBuilder();
        sb.append(URL);
        sb.append("?client_id=");
        sb.append(APP_ID);
        sb.append("&redirect_uri=");
        sb.append(REDIRECT_URI);
        sb.append("&scope=publish_stream,user_status,read_stream,status_update,manage_pages");
        return sb.toString();
    }

    public String getAccessToken() {

        // compile source

        // HTTPリクエスト
        // レスポンスからアクセストークンを取得して返却
        return "access_token";
    }
}