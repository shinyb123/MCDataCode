package MCDataCode.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.PropertySupport;
import java.util.Iterator;
import jetbrains.mps.internal.collections.runtime.ListSequence;

public class GameMode_PropertySupport extends PropertySupport {
  public boolean canSetValue(String value) {
    if (value == null) {
      return true;
    }
    Iterator<GameMode> constants = ListSequence.fromList(GameMode.getConstants()).iterator();
    while (constants.hasNext()) {
      GameMode constant = constants.next();
      if (value.equals(constant.getName())) {
        return true;
      }
    }
    return false;
  }
  public String toInternalValue(String value) {
    if (value == null) {
      return null;
    }
    Iterator<GameMode> constants = ListSequence.fromList(GameMode.getConstants()).iterator();
    while (constants.hasNext()) {
      GameMode constant = constants.next();
      if (value.equals(constant.getName())) {
        return constant.getValueAsString();
      }
    }
    return null;
  }
  public String fromInternalValue(String value) {
    GameMode constant = GameMode.parseValue(value);
    if (constant != null) {
      return constant.getName();
    }
    return "";
  }
}