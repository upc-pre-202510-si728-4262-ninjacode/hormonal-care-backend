package com.backend.hormonalcare.iam.interfaces.rest.resources;

public record AuthenticatedUserResource(Long id, String username, String token, String role) {
}
