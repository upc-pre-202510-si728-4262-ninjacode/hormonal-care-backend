package com.backend.hormonalcare.profile.domain.model.commands;

import java.util.Date;

public record UpdateProfileCommand(
        Long id,
        String firstName,
        String lastName,
        String gender,
        String phoneNumber,
        String image,
        Date birthday
) {
}
