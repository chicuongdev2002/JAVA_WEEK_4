package vn.edu.fit.iuh.enities;

import lombok.*;
import vn.edu.fit.iuh.enums.SkillType;

import java.util.UUID;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Skill {

    private UUID skill_id;

    private String skill_description;

    private String skill_name;

    private SkillType type;

    public Skill(UUID skill_id) {
        this.skill_id = skill_id;
    }

}
