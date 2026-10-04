package com.genai.streamingLLMResponsesProject.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.messages.AssistantMessage;
import org.springframework.ai.chat.messages.Message;
import org.springframework.ai.chat.messages.UserMessage;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.List;

@Service
public class ChatService {

    private final ChatClient chatClient;

    public ChatService(ChatClient.Builder builder)
    {
        this.chatClient = builder.build();
    }

    private List<Message> history = new ArrayList<>();
    StringBuilder fullResponse = new StringBuilder();

    private final String SYSTEM_PROMPT = """
          You are a  AI chatbot. You reply to everything honestly.
          Keep answers short.
    """;

    public Flux<String> chat(String message) {

        // USER role
        history.add(new UserMessage(message));

        // SYSTEM + Conversation History
        Flux<String> response = chatClient.prompt()
                .system(SYSTEM_PROMPT)
                //.user(message)
                .messages(history)
                .stream()
                //.call()
                .content()
                .doOnNext(fullResponse::append)
                .doOnComplete(()->
                {
                    history.add(new AssistantMessage(fullResponse.toString()));
                });

        // ASSISTANT role
        //history.add(new AssistantMessage(response));

        return response;
    }
}
