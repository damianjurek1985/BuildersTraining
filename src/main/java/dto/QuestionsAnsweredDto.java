package dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "questionsAnsweredDto",
        propOrder = {"questionAnswered"}
)
public class QuestionsAnsweredDto {
    protected List<QuestionAnsweredDto> questionAnswered;

    public QuestionsAnsweredDto() {
    }

    public List<QuestionAnsweredDto> getQuestionAnswered() {
        if (this.questionAnswered == null) {
            this.questionAnswered = new ArrayList();
        }

        return this.questionAnswered;
    }
}