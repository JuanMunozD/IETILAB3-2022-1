package org.ada.school.exception;

import org.ada.school.error.ErrorCodeEnum;
import org.ada.school.error.InternalServerErrorException;
import org.springframework.http.HttpStatus;

public class UserNotFoundException extends InternalServerErrorException {

	private static final long serialVersionUID = -7402817328818161642L;

	public UserNotFoundException() {
		super(new ServerErrorResponseDto("User not found", ErrorCodeEnum.USER_NOT_FOUND, HttpStatus.NOT_FOUND),
				HttpStatus.NOT_FOUND);
	}
}
