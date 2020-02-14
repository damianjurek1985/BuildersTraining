package dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "formAnsweredDto",
        propOrder = {"questionsAnswered"}
)
public class FormAnsweredDto {
    protected QuestionsAnsweredDto questionsAnswered;

    public FormAnsweredDto() {
    }

    public QuestionsAnsweredDto getQuestionsAnswered() {
        return this.questionsAnswered;
    }

    public void setQuestionsAnswered(QuestionsAnsweredDto value) {
        this.questionsAnswered = value;
    }
}
