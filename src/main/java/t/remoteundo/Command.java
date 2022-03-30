package t.remoteundo;

public interface Command {
	public void execute();
	public void undo();
}
