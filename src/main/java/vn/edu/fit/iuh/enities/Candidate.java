package vn.edu.fit.iuh.enities;

import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Candidate {
    private UUID id;
    private LocalDateTime dob;
    private String email;
    private String fullName;
    private String phone;
    private Adress adress;

    public Candidate(UUID id) {
        this.id = id;
    }

    public UUID getIdAdress() {
        return adress.getId();
    }
    public void setAdress(UUID adressId) {
        this.adress = new Adress(adressId);
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "id=" + id +
                ", dob=" + dob +
                ", email='" + email + '\'' +
                ", fullName='" + fullName + '\'' +
                ", phone='" + phone + '\'' +
                ", adress=" +adress.getId()+
                '}';
    }
}
