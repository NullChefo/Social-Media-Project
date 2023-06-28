package com.nullchefo.socialmediaservice.DTO.retrieve;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MediaRetrieveDTO {
    private Long id;
    private String path;
    private Long creator;
}
