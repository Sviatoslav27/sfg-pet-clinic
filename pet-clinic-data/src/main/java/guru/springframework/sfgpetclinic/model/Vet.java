package guru.springframework.sfgpetclinic.model;

import java.util.HashSet;
import java.util.Set;

public class Vet extends Person{
    private Set<Speciality> specialitys = new HashSet<>();

    public Set<Speciality> getSpecialitys() {
        return specialitys;
    }

    public void setSpecialitys(Set<Speciality> specialitys) {
        this.specialitys = specialitys;
    }
}
