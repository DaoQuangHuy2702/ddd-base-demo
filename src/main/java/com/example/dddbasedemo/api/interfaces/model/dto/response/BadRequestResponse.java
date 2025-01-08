package com.example.dddbasedemo.api.interfaces.model.dto.response;

import jakarta.servlet.http.HttpServletRequest;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class BadRequestResponse {
    private String message;
    private String path;
    private int status;
    private String traceId;

    public BadRequestResponse(Exception ex, HttpServletRequest request) {
        this.message = ex.getMessage();
        this.path = request.getRequestURI();
        this.status = HttpStatus.BAD_REQUEST.value();
    }
}
