package question.builders;

import dto.FormAnsweredDto;
import dto.QuestionsAnsweredDto;

public class FormAnsweredDtoBuilder {
    //private List<QuestionAnsweredDto> questionAnswered = new ArrayList<>();
    private FormAnsweredDto formAnsweredDto;
    private QuestionsAnsweredDto questionsAnsweredDto;

    public static FormAnsweredDtoBuilder builder() {
        return new FormAnsweredDtoBuilder();
    }

    public FormAnsweredDtoBuilder withQuestionsAnswer(QuestionsAnsweredDto questionsAnsweredDto) {
        formAnsweredDto.setQuestionsAnswered(questionsAnsweredDto);
        return this;
    }

    public FormAnsweredDto build() {
//        QuestionsAnsweredDto questionsAnswered = new QuestionsAnsweredDto();
//        questionsAnswered.getQuestionAnswered().addAll(this.questionAnswered);

        FormAnsweredDto newFormAnsweredDto = new FormAnsweredDto();
//        formAnsweredDto.setQuestionsAnswered(questionsAnswered);
        newFormAnsweredDto.setQuestionsAnswered(questionsAnsweredDto);
        return newFormAnsweredDto;
    }
}