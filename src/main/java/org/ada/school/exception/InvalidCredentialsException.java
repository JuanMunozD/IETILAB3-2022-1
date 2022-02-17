package org.ada.school.exception;

import org.ada.school.error.ErrorCodeEnum;
import org.ada.school.error.InternalServerErrorException;
import org.springframework.http.HttpStatus;

public class InvalidCredentialsException extends InternalServerErrorException {

	private static final long serialVersionUID = 5367416436232474148L;

	public InvalidCredentialsException() {
		super(new ServerErrorResponseDto("Invalid username or password", ErrorCodeEnum.INVALID_USER_CREDENTIALS,
				HttpStatus.UNAUTHORIZED), HttpStatus.UNAUTHORIZED);
	}
}
