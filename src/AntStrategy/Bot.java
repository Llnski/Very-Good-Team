package AntStrategy;
/*
 * Specifies the actions of some specific bot.
 */
enum strategy {
  LEADER,
  FOLLOWER
}
public interface Bot extends Runnable {
    public abstract void run();

    public void setStrategy(strategy strat);
}