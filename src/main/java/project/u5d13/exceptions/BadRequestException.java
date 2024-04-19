package project.u5d13.exceptions;

import lombok.Getter;
import org.springframework.validation.ObjectError;

import java.util.List;

@Getter
public class BadRequestException extends RuntimeException {
    private List<ObjectError> errorList;

    public BadRequestException(String msg) {
        super(msg);
    }

    public BadRequestException(List<ObjectError> errorList) {
        super("errore di validazione nel payload.");
        this.errorList = errorList;
    }
}