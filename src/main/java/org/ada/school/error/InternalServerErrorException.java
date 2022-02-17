package org.ada.school.error;

import org.ada.school.exception.ServerErrorResponseDto;
import org.springframework.http.HttpStatus;

public class InternalServerErrorException extends RuntimeException {
	private static final long serialVersionUID = 637702001919137924L;

	private final ServerErrorResponseDto serverErrorResponseDto;

	private final HttpStatus httpStatus;

	public InternalServerErrorException(ServerErrorResponseDto serverErrorResponseDto, HttpStatus httpStatus) {
		this.serverErrorResponseDto = serverErrorResponseDto;
		this.httpStatus = httpStatus;
	}

	public ServerErrorResponseDto getServerErrorResponseDto() {
		return serverErrorResponseDto;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}
}
