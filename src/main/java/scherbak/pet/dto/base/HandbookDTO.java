package scherbak.pet.dto.base;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
public class HandbookDTO extends ModelDTO{
    protected String name;
}
