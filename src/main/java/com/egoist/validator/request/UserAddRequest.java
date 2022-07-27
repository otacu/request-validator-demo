package com.egoist.validator.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Data
public class UserAddRequest implements Serializable {
    @NotBlank(message = "userId不能为空")
    private String userId;
    @NotBlank(message = "userName不能为空")
    private String userName;
}
