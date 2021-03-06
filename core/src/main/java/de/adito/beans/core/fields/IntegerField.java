package de.adito.beans.core.fields;

import de.adito.beans.core.annotations.TypeDefaultField;
import org.jetbrains.annotations.NotNull;

import java.lang.annotation.Annotation;
import java.util.Collection;

/**
 * Beschreibt ein Bean-Feld, welches eine Ganzzahl beinhaltet.
 *
 * @author s.danner, 27.01.2017
 */
@TypeDefaultField(types = Integer.class)
public class IntegerField extends AbstractField<Integer>
{
  public IntegerField(@NotNull String pName, @NotNull Collection<Annotation> pAnnotations)
  {
    super(Integer.class, pName, pAnnotations);
  }

  @Override
  public Integer getDefaultValue()
  {
    return 0;
  }
}
