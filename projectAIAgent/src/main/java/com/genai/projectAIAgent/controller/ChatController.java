package com.genai.projectAIAgent.controller;

import com.genai.chatbotAI.service.SummarizeService;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class ChatController {

    private SummarizeService summarizeService;

    public ChatController(SummarizeService summarizeService) {
        this.summarizeService = summarizeService;
    }

    @PostMapping("/chat")
    public String chat(@RequestBody String message)
    {
        return summarizeService.chat(message);
    }
}
