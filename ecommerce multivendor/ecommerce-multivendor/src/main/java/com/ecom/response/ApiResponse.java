package com.ecom.response;

import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ApiResponse {
    private String message;

    public void setMessage(String s) {
        this.message = s;
    }
}
