package com.lumesse.soap.model.candidatewebservice;


import dto.FormAnsweredDto;
import dto.QuestionsAnsweredDto;

public class FormAnsweredDtoBuilder {
    private QuestionsAnsweredDto questionsAnswered = new QuestionsAnsweredDto();

    public static FormAnsweredDtoBuilder builder() {
        return new FormAnsweredDtoBuilder();
    }

    public FormAnsweredDtoBuilder withQuestionsAnswer(QuestionsAnsweredDto questionsAnsweredDto) {
        questionsAnswered.getQuestionAnswered().addAll(questionsAnsweredDto);
        return this;
    }

    public FormAnsweredDto build() {
        FormAnsweredDto newFormAnsweredDto = new FormAnsweredDto();
        newFormAnsweredDto.setQuestionsAnswered(questionsAnswered);
        return newFormAnsweredDto;
    }
}
