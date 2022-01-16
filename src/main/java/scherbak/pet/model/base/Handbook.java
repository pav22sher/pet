package scherbak.pet.model.base;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@EqualsAndHashCode(callSuper = true)
@MappedSuperclass
@Getter
@Setter
public class Handbook extends Model{
    @Column(name = "name")
    protected String name;
}