package MCDataCode.structure;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.LinkedList;

public enum GameMode {
  creative("creative", "CREATIVE"),
  survival("survival", "SURVIVAL"),
  spectator("spectator", "SPECTATOR"),
  adventure("adventure", "ADVENTURE");

  private final String myName;
  public String getName() {
    return myName;
  }
  private final String myValue;
  private GameMode(String name, String value) {
    myName = name;
    myValue = value;
  }
  public String getValue() {
    return myValue;
  }
  public String getValueAsString() {
    return myValue;
  }
  public static List<GameMode> getConstants() {
    List<GameMode> list = ListSequence.fromList(new LinkedList<GameMode>());
    ListSequence.fromList(list).addElement(GameMode.creative);
    ListSequence.fromList(list).addElement(GameMode.survival);
    ListSequence.fromList(list).addElement(GameMode.spectator);
    ListSequence.fromList(list).addElement(GameMode.adventure);
    return list;
  }
  public static GameMode getDefault() {
    return null;
  }
  public static GameMode parseValue(String value) {
    if (value == null) {
      return GameMode.getDefault();
    }
    if (value.equals(GameMode.creative.getValueAsString())) {
      return GameMode.creative;
    }
    if (value.equals(GameMode.survival.getValueAsString())) {
      return GameMode.survival;
    }
    if (value.equals(GameMode.spectator.getValueAsString())) {
      return GameMode.spectator;
    }
    if (value.equals(GameMode.adventure.getValueAsString())) {
      return GameMode.adventure;
    }
    return GameMode.getDefault();
  }
}