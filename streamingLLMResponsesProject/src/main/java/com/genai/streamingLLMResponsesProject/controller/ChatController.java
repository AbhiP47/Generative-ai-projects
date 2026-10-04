package com.genai.streamingLLMResponsesProject.controller;

import com.genai.streamingLLMResponsesProject.service.ChatService;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RequestMapping("/api")
@RestController
public class ChatController {

    private ChatService chatService;

    public ChatController(ChatService chatService) {
        this.chatService = chatService;
    }

    @PostMapping("/chat")
    public Flux<String> chat(@RequestBody String message)
    {
        return chatService.chat(message);
    }
}
