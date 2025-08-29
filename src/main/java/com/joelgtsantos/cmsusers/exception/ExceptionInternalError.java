package com.joelgtsantos.cmsusers.exception;


public class ExceptionInternalError extends Exception {
	
	private static final long serialVersionUID = -7539901274547128652L;
	
	public static final String NOT_FOUND="Entity not found {} something else";
	public static final String CONFLICT="Entity conflict";

	public ExceptionInternalError() {
        super();
    }

	public ExceptionInternalError(final String Mensaje) {
        super(Mensaje);
    }

}
