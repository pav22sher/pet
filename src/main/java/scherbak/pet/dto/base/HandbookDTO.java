package scherbak.pet.dto.base;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class HandbookDTO extends ModelDTO{
    protected String name;
}
