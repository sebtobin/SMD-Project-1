package snakeladder.game;

import ch.aplu.jgamegrid.Location;

public abstract class Connection
{
  int cellStart;
  int cellEnd;

  Location locStart;
  Location locEnd;

  String imagePath;

  Connection(int cellStart, int cellEnd)
  {
    this.cellStart = cellStart;
    this.cellEnd = cellEnd;
    locStart = GamePane.cellToLocation(cellStart);
    locEnd = GamePane.cellToLocation(cellEnd);
  }

  void reverseStartEnd() {
    int tmpCell = cellStart;
    cellStart = cellEnd;
    cellEnd = tmpCell;

    Location tmpLocation = locStart;
    locStart = locEnd;
    locEnd = tmpLocation;
  }

  int getCellStart() {
    return cellStart;
  }

  int getCellEnd() {
    return cellEnd;
  }

  public Location getLocStart() {
    return locStart;
  }

  public Location getLocEnd() {
    return locEnd;
  }

  public String getImagePath() {
    return imagePath;
  }

  public void setImagePath(String imagePath) {
    this.imagePath = imagePath;
  }

  public double xLocationPercent(int locationCell) {
    return (double) locationCell / GamePane.NUMBER_HORIZONTAL_CELLS;
  }
  public double yLocationPercent(int locationCell) {
    return (double) locationCell / GamePane.NUMBER_VERTICAL_CELLS;
  }
}
