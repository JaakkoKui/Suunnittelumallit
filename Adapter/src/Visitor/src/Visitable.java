import java.nio.channels.AcceptPendingException;

public interface Visitable {

	public void attack();
	public void accept(PlayerVisitor visitor, int points);
}
