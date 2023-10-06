package vn.edu.fit.iuh.enities;

import lombok.*;

import java.util.UUID;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Job {
    private UUID iob_id;
    private String job_desc;
    private String job_name;
    private Company company;
}
