package life.melon.community.dto;

import lombok.Data;

@Data
public class GiteeUser {
    private String name;
    private Long id;
    private String bio;
}