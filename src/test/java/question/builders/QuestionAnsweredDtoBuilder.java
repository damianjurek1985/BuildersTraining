package question.builders;

import dto.QuestionAnsweredDto;

import java.util.Optional;

public class QuestionAnsweredDtoBuilder {

    private String answerTextValue;
    private QuestionAnsweredDto.Children children;
    private Long competencyOption;
    private Integer index;
    private String lovValue;
    private Long questionId;
    private QuestionAnsweredDto.SelectedAssignedOptionIds selectedAssignedOptionIds;

    private QuestionAnsweredDto questionAnsweredDto;

    public QuestionAnsweredDtoBuilder() {
        questionAnsweredDto = new QuestionAnsweredDto();
    }

    public static QuestionAnsweredDtoBuilder builder() {
        return new QuestionAnsweredDtoBuilder();
    }

    public QuestionAnsweredDtoBuilder withAnswerTextValue(String value) {
        questionAnsweredDto.setAnswerTextValue(value);
        return this;
    }

    public QuestionAnsweredDtoBuilder withAnswerChild(QuestionAnsweredDto.Children value) {
        questionAnsweredDto.setChildren(value);
        return this;
    }

    public QuestionAnsweredDtoBuilder withAnswerCompetencyOption(Long value) {
        questionAnsweredDto.setCompetencyOption(value);
        return this;
    }

    public QuestionAnsweredDtoBuilder withAnswerIndex(Integer value) {
        questionAnsweredDto.setIndex(value);
        return this;
    }

    public QuestionAnsweredDtoBuilder withAnswerLoveValue(String value) {
        questionAnsweredDto.setLovValue(value);
        return this;
    }

    public QuestionAnsweredDtoBuilder withAnswerQuestionId(Long value) {
        questionAnsweredDto.setQuestionId(value);
        return this;
    }

    public QuestionAnsweredDtoBuilder withAnswerSelectedAssignedOptionId(QuestionAnsweredDto.SelectedAssignedOptionIds value) {
        questionAnsweredDto.setSelectedAssignedOptionIds(value);
        return this;
    }

    public QuestionAnsweredDto build() {
        QuestionAnsweredDto newQuestionAnswerDto = new QuestionAnsweredDto();
        newQuestionAnswerDto.setQuestionId(Optional.ofNullable(questionAnsweredDto.getQuestionId()).orElse(new Faker(Locale.ENGLISH).number().randomNumber()));
        newQuestionAnswerDto.setSelectedAssignedOptionIds(Optional.ofNullable(questionAnsweredDto.getSelectedAssignedOptionIds()).orElse(SelectedAssignedOptionIdsBuilder.builder(-1L).build()));
        newQuestionAnswerDto.setAnswerTextValue(Optional.ofNullable(questionAnsweredDto.getAnswerTextValue()).orElse("textValue"));
        newQuestionAnswerDto.setLovValue(Optional.ofNullable(questionAnsweredDto.getLovValue()).orElse("LoveVale"));
        newQuestionAnswerDto.setIndex(Optional.ofNullable(questionAnsweredDto.getIndex()).orElse(1234));
        newQuestionAnswerDto.setCompetencyOption(Optional.ofNullable(questionAnsweredDto.getCompetencyOption()).orElse(123L));
        newQuestionAnswerDto.setChildren(children);
        return newQuestionAnswerDto;
    }
}
