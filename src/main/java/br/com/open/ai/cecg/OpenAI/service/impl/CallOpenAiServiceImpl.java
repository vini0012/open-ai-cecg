package br.com.open.ai.cecg.OpenAI.service.impl;

import br.com.open.ai.cecg.OpenAI.component.ChatStreamComponent;
import br.com.open.ai.cecg.OpenAI.http.data.request.ScienceFictionRequestDTO;
import br.com.open.ai.cecg.OpenAI.service.CallOpenAiService;

public record CallOpenAiServiceImpl(ChatStreamComponent streamComponent)
    implements CallOpenAiService {
    @Override
    public String generateScienceFiction(ScienceFictionRequestDTO requestDTO) {
        return null;
    }
}
