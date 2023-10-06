package vn.edu.fit.iuh.enities;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class JobSkill {
    private String more_infos;
    private int skill_level;
    private Job job;
    private Skill skill;
}
