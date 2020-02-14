package question.builders;

import dto.QuestionAnsweredDto;

import java.util.Arrays;
import java.util.List;

public class QuestionAnsweredChildBuilder {

    private List<QuestionAnsweredDto> questionAnsweredChild;

    private QuestionAnsweredChildBuilder(QuestionAnsweredDto questionAnsweredDto) {
        this.questionAnsweredChild = Arrays.asList(questionAnsweredDto);
    }

    public static QuestionAnsweredChildBuilder builder(QuestionAnsweredDto questionAnsweredDto) {
        return new QuestionAnsweredChildBuilder(questionAnsweredDto);
    }

    public QuestionAnsweredDto.Children build() {
        QuestionAnsweredDto.Children newQuestionAnswerChild = new QuestionAnsweredDto.Children();
        newQuestionAnswerChild.getChildQuestionAnswered().addAll(this.questionAnsweredChild);
        return newQuestionAnswerChild;
    }
}
