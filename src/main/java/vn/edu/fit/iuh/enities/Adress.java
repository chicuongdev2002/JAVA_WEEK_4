package vn.edu.fit.iuh.enities;

import lombok.*;

import java.util.UUID;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class Adress {
    private UUID id;
    private String street;
    private String city;
    private int country;
    private String number;
    private String zipcode;

    public Adress(UUID id) {
        this.id = id;
    }
}
