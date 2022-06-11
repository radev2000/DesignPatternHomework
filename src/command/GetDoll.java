package command;

import observer.Board;

public class GetDoll implements Command {

  public Board Board;

  public GetDoll(Board Board) {
    this.Board = Board;
  }

  @Override
  public void execute() {
    Board.orderDoll();
  }
}
