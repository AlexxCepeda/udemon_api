package org.udemon.udemon.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorDTO {

    private String code;
    private String message;
    private Object details;

}
