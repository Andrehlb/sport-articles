package br.com.rsfot.sportarticles.error.handler;

public class NotFoundException extends RuntimeException{
    public NotFoundException(String message) {
        super(message);
    }
}