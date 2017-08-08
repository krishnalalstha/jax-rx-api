package com.krish.web.exception;

import com.krish.web.model.ErrorMessage;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 * Created by krishna on 6/21/17.
 */
@Provider
public class DataNotFoundExceptionMapper implements ExceptionMapper<DataNotFoundException> {
    @Override
    public Response toResponse(DataNotFoundException exception) {
        Response response = Response.status(Response.Status.NOT_FOUND)
                .entity(new ErrorMessage("No Data",404,"some url")).build();

        return response;
    }
}
