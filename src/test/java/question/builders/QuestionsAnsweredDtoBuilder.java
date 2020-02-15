package question.builders;

import dto.QuestionAnsweredDto;
import dto.QuestionsAnsweredDto;

import java.util.List;
public class QuestionsAnsweredDtoBuilder {

    private static List<QuestionAnsweredDto> questionAnswered; // To nie powinno być static i MUSI być zainicjalizowane w jakiś sposób
    // czy to w konstruktorze czu tutaj po prostu w ten sposób: = new ArrayList();
    private QuestionsAnsweredDto questionsAnsweredDto; // to jest zbędne, do usunięcia, robisz podobnie jak koledzy :P

    // ten komentarz do usunięcia
//    private QuestionsAnsweredDtoBuilder(QuestionAnsweredDto... questionAnsweredDtos) {
//        questionAnswered = Arrays.asList(questionAnsweredDtos);
//    }
 // to też do usunięcia
    public QuestionsAnsweredDtoBuilder(List<QuestionAnsweredDto> questionAnswered) {
        questionsAnsweredDto = new QuestionsAnsweredDto();
    }

    // tutaj ok, ale argument questionAnswered w return do usunięcia
    public static QuestionsAnsweredDtoBuilder builder() {
        return new QuestionsAnsweredDtoBuilder(questionAnswered);
    }

    public QuestionsAnsweredDtoBuilder withQuestionAnsweredValue(QuestionAnsweredDto questionAnsweredValue) {
        questionsAnsweredDto.getQuestionAnswered().add(questionAnsweredValue); // wtedy tutaj będziesz miał: questionAnswered.add(questionAnsweredValue); zamiast obecnej linii
        return this;
    }

    public QuestionsAnsweredDto build() {
        QuestionsAnsweredDto newQuestionsAnsweredDto = new QuestionsAnsweredDto();
        newQuestionsAnsweredDto.getQuestionAnswered().addAll(questionAnswered);  //<---null ? // i tutaj wtedy powinno być ok

        return newQuestionsAnsweredDto;
    }
}
