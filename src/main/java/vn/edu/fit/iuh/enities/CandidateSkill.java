package vn.edu.fit.iuh.enities;

import lombok.*;
import vn.edu.fit.iuh.enums.SkillLevel;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class CandidateSkill {
    private String more_infos;
    private SkillLevel skill_level;
    private Candidate candidate;
    private Skill skill;

    public UUID getIdSkill() {
        return skill.getSkill_id();
    }

    public void setIdSkill(UUID skillID) {
        this.skill = new Skill(skillID);
    }
    public UUID getIdCandidate() {
        return candidate.getId();
    }

    public void setIdCandidate(UUID candidateID) {
        this.candidate = new Candidate(candidateID);
    }
}
