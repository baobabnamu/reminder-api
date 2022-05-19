package kr.ac.tukorea.reminder.controller.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//    ERROR
@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "badError")
public class BadRequestException extends RuntimeException {

}
