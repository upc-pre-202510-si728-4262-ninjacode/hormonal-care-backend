package com.backend.hormonalcare.communication.domain.model.queries;

public record GetMessagesByConversationIdQuery(
    String conversationId
) {
}