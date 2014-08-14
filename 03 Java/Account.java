/**
 * Account class
 * @author pollseed
 */
public class Account {

    /**
     * WAccount class
     */
    public class WAccount {

        /** Account ID **/
        String id;

        /** full name **/
        String name;
    }

    /**
     * Whether or not the specified argument is not null
     */
    public static <T> T checkNotNull(T reference) {
        if (reference == null) {
            throw new NullPointerException();
        }
        return reference;
    }

    /**
     * The supplied argument is correct?
     */
    public static void checkArgument(boolean expression) {
        if (!expression) {
            throw new IllegalArgumentException();
        }
    }

    /**
     * Gets the main account
     */
    public WAccount getUser(String credentialId) {
        Moc moc = Moc.get(credentialId);
        if (moc == null)
            return null;

        WAccount account = new WAccount();
        account.id = moc.id;
        account name = moc.name;
        return account;
    }

    /**
     * Gets the sub account
     */
    public WAccount getSubUser(WAccount account) {
        Moc moc = Moc.sub(account);
        if (moc == null)
            return null;

        account.id = moc.id;
        account.name = moc.name;
        return account;
    }

    /**
     * this account is green it.<br>
     * Because that, check that's sub account.
     */
    public static void main(WAccount account) {
        checkNotNull(account.id);
        WAccount subAccount = getSubUser(account);
        checkArgument(subAccount != null)
    }
}
