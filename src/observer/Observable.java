package observer;

public interface Observable {
  void addElfToBoard(Elf elf);

  void removeElf(Elf elf);

  void notifyElves(String toyName);

  String prepareToy();
}
