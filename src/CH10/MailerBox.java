package CH10;

/**
 * Created by Nikhil on 1/14/2016.
 */
public class MailerBox implements Box,Mailer {
    private Box box;
    @Override
    public void pack() {
        box.pack();
    }

    @Override
    public void seal() {
        box.seal();
    }

    @Override
    public void addPostage() {
        System.out.println("Affix the stamp");
    }

    @Override
    public void ship() {
        System.out.println("Pack in Mailbox");
    }
}
