package MCDataCode.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConceptPresentationAspectBase;
import jetbrains.mps.smodel.runtime.ConceptPresentation;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.runtime.ConceptPresentationBuilder;

public class ConceptPresentationAspectImpl extends ConceptPresentationAspectBase {
  private ConceptPresentation props_Command;
  private ConceptPresentation props_CommandGamemode;
  private ConceptPresentation props_CommandSay;
  private ConceptPresentation props_Function;
  private ConceptPresentation props_MainStructure;

  @Override
  @Nullable
  public ConceptPresentation getDescriptor(SAbstractConcept c) {
    StructureAspectDescriptor structureDescriptor = (StructureAspectDescriptor) myLanguageRuntime.getAspect(jetbrains.mps.smodel.runtime.StructureAspectDescriptor.class);
    switch (structureDescriptor.internalIndex(c)) {
      case LanguageConceptSwitch.Command:
        if (props_Command == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          props_Command = cpb.create();
        }
        return props_Command;
      case LanguageConceptSwitch.CommandGamemode:
        if (props_CommandGamemode == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("gamemode");
          props_CommandGamemode = cpb.create();
        }
        return props_CommandGamemode;
      case LanguageConceptSwitch.CommandSay:
        if (props_CommandSay == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("say");
          props_CommandSay = cpb.create();
        }
        return props_CommandSay;
      case LanguageConceptSwitch.Function:
        if (props_Function == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_Function = cpb.create();
        }
        return props_Function;
      case LanguageConceptSwitch.MainStructure:
        if (props_MainStructure == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("main");
          props_MainStructure = cpb.create();
        }
        return props_MainStructure;
    }
    return null;
  }
}
