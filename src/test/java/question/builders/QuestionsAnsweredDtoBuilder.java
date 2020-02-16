package com.lumesse.soap.model.candidatewebservice;

import dto.QuestionAnsweredDto;
import dto.QuestionsAnsweredDto;

import java.util.ArrayList;
import java.util.List;

public class QuestionsAnsweredDtoBuilder {

    private List<QuestionAnsweredDto> questionAnswered = new ArrayList<>();

    public static QuestionsAnsweredDtoBuilder builder() {
        return new QuestionsAnsweredDtoBuilder();
    }

    public QuestionsAnsweredDtoBuilder withQuestionAnsweredValue(QuestionAnsweredDto questionAnsweredValue) {
        questionAnswered.add(questionAnsweredValue);
        return this;
    }

    public QuestionsAnsweredDto build() {
        QuestionsAnsweredDto newQuestionsAnsweredDto = new QuestionsAnsweredDto();
        newQuestionsAnsweredDto.getQuestionAnswered().addAll(questionAnswered);

        return newQuestionsAnsweredDto;
    }
}
