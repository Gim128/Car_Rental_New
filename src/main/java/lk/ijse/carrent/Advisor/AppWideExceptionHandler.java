package lk.ijse.carrent.Advisor;


import lk.ijse.carrent.exception.NotFoundException;
import lk.ijse.carrent.exception.ValidateException;
import lk.ijse.carrent.util.StandardResponce;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@CrossOrigin
public class AppWideExceptionHandler {
    @ExceptionHandler(Exception.class)
    public ResponseEntity handleException(Exception e) {
        return new ResponseEntity(new StandardResponce("500", "Error", e.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity handleNotFoundException(NotFoundException e) {
        return new ResponseEntity(new StandardResponce("404", "Error", e.getMessage()), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(ValidateException.class)
    public ResponseEntity handleValidationException(ValidateException e) {
        return new ResponseEntity(new StandardResponce("400", "Error", e.getMessage()), HttpStatus.BAD_REQUEST);
    }
}
