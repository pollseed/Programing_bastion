package jp.com.pollseed

public class TwitterAuthErrorHandling {
  public Boolean getToken() {
    get();
  }
  static void get() {
    // compilecode
  }

    private TwitterException throwErrorHandling(Exception e) {
        if (e == null || e.getCause() == null || e.getMessage() == null) {
            throw new Exception(e);
        }
        TwitterException te = (TwitterException)e;
    }

    public static Boolean tooManyAccess(Access a) {
        if (a == null || a.isMessage() == null) {
            return false;
        }
        return a.isToo() || a.isSingleAccessLevel4 || a.statusAvailableLevel4;
    }
  }
}
