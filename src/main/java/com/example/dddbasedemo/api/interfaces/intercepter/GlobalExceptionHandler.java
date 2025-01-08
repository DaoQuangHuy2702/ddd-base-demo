package com.example.dddbasedemo.api.interfaces.intercepter;

import com.example.dddbasedemo.api.interfaces.model.dto.response.BadRequestResponse;
import io.micrometer.tracing.Tracer;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContextException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Log4j2
@RestControllerAdvice
public class GlobalExceptionHandler {
    @Autowired
    protected HttpServletRequest httpServletRequest;

    @Autowired
    private Tracer tracer;

    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> handleException(Exception ex) {
        log.error("Exception: ", ex);

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }

    @ExceptionHandler(ApplicationContextException.class)
    public ResponseEntity<BadRequestResponse> handleApplicationException(ApplicationContextException ex) {
        log.error("ApplicationContextException: ", ex);

        BadRequestResponse responseData = new BadRequestResponse(ex, httpServletRequest);

        String traceId = tracer.currentTraceContext().context() == null ? Thread.currentThread().getName() : tracer.currentTraceContext().context().traceId();

        responseData.setTraceId(traceId);

        return new ResponseEntity<>(responseData, HttpStatus.BAD_REQUEST);
    }
}
