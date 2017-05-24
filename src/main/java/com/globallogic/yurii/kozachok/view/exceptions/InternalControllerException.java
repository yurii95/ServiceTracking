package com.globallogic.yurii.kozachok.view.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR, reason="No such Order")
public class InternalControllerException extends RuntimeException{
	private static final long serialVersionUID = -6197652419767945798L;
}
