package com.truckdepot.service.impl.exceptions;

import javax.ws.rs.NotFoundException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class BadURIExceptionMapper implements
		ExceptionMapper<NotFoundException> {

	public Response toResponse(NotFoundException exception) {

		return Response.status(Response.Status.NOT_FOUND)
				.entity(exception.getMessage()).build();
	}
}
