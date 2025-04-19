package com.backend.hormonalcare.iam.interfaces.rest.transform;

import com.backend.hormonalcare.iam.domain.model.commands.SignInCommand;
import com.backend.hormonalcare.iam.interfaces.rest.resources.SignInResource;

public class SignInCommandFromResourceAssembler {
    public static SignInCommand toCommandFromResource(SignInResource resource) {
        return new SignInCommand(resource.username(), resource.password());
    }
}
