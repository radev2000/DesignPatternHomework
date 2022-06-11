package observer;

public interface Observer {
  void setBoard(Observable Board);

  void removeBoard();

  void receiveUpdate();
}
