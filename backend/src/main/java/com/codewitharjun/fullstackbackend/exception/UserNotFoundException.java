package com.codewitharjun.fullstackbackend.exception;

public class UserNotFoundException extends RuntimeException{
    private static final long serialVersionUID = -4470839335650162534L;

	public UserNotFoundException(Long id){
        super("Could not found the user with id "+ id);
    }
}
