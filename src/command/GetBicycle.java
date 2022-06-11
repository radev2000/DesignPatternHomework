package command;

import observer.Board;

public class GetBicycle implements Command {

  public Board Board;

  public GetBicycle(Board Board) {
    this.Board = Board;
  }

  @Override
  public void execute() {
    Board.orderBike();
  }
}
