package question.builders;

import dto.QuestionAnsweredDto;
import dto.QuestionsAnsweredDto;

import java.util.List;
public class QuestionsAnsweredDtoBuilder {

    private List<QuestionAnsweredDto> questionAnswered;
    private QuestionsAnsweredDto questionsAnsweredDto;

//    private QuestionsAnsweredDtoBuilder(QuestionAnsweredDto... questionAnsweredDtos) {
//        questionAnswered = Arrays.asList(questionAnsweredDtos);
//    }

    public QuestionsAnsweredDtoBuilder() {
        questionsAnsweredDto = new QuestionsAnsweredDto();
    }

    public static QuestionsAnsweredDtoBuilder builder() {
        return new QuestionsAnsweredDtoBuilder(questionAnswered);
    }

    public QuestionsAnsweredDtoBuilder withQuestionAnsweredValue(QuestionAnsweredDto questionAnsweredValue) {
        questionsAnsweredDto.getQuestionAnswered().add(questionAnsweredValue);
        return this;
    }

    public QuestionsAnsweredDto build() {
        QuestionsAnsweredDto newQuestionsAnsweredDto = new QuestionsAnsweredDto();
        newQuestionsAnsweredDto.getQuestionAnswered().addAll(questionAnswered);  //<---null ?

        return newQuestionsAnsweredDto;
    }
}
