package vn.edu.fit.iuh.enities;

import lombok.*;

import java.util.UUID;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Company {
    private UUID comp_id;
    private String about;
    private String email;
    private String comp_name;
    private String phone;
    private String web_url;
    private String address;
}
