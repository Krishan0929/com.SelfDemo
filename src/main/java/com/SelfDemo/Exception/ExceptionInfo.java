package com.SelfDemo.Exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.time.ZonedDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExceptionInfo
{
  private String message;

  private HttpStatus httpStatus;

  private ZonedDateTime zonedDateTime;
}
