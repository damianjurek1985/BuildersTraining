package dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "questionAnsweredDto",
        propOrder = {"answerTextValue", "children", "competencyOption", "index", "lovValue", "questionId", "selectedAssignedOptionIds"}
)
public class QuestionAnsweredDto {
    protected String answerTextValue;
    protected QuestionAnsweredDto.Children children;
    protected Long competencyOption;
    protected Integer index;
    protected String lovValue;
    protected Long questionId;
    protected QuestionAnsweredDto.SelectedAssignedOptionIds selectedAssignedOptionIds;

    public QuestionAnsweredDto() {
    }

    public String getAnswerTextValue() {
        return this.answerTextValue;
    }

    public void setAnswerTextValue(String value) {
        this.answerTextValue = value;
    }

    public QuestionAnsweredDto.Children getChildren() {
        return this.children;
    }

    public void setChildren(QuestionAnsweredDto.Children value) {
        this.children = value;
    }

    public Long getCompetencyOption() {
        return this.competencyOption;
    }

    public void setCompetencyOption(Long value) {
        this.competencyOption = value;
    }

    public Integer getIndex() {
        return this.index;
    }

    public void setIndex(Integer value) {
        this.index = value;
    }

    public String getLovValue() {
        return this.lovValue;
    }

    public void setLovValue(String value) {
        this.lovValue = value;
    }

    public Long getQuestionId() {
        return this.questionId;
    }

    public void setQuestionId(Long value) {
        this.questionId = value;
    }

    public QuestionAnsweredDto.SelectedAssignedOptionIds getSelectedAssignedOptionIds() {
        return this.selectedAssignedOptionIds;
    }

    public void setSelectedAssignedOptionIds(QuestionAnsweredDto.SelectedAssignedOptionIds value) {
        this.selectedAssignedOptionIds = value;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
            name = "",
            propOrder = {"assignedOptionId"}
    )
    public static class SelectedAssignedOptionIds {
        @XmlElement(
                type = Long.class
        )
        protected List<Long> assignedOptionId;

        public SelectedAssignedOptionIds() {
        }

        public List<Long> getAssignedOptionId() {
            if (this.assignedOptionId == null) {
                this.assignedOptionId = new ArrayList();
            }

            return this.assignedOptionId;
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
            name = "",
            propOrder = {"childQuestionAnswered"}
    )
    public static class Children {
        protected List<QuestionAnsweredDto> childQuestionAnswered;

        public Children() {
        }

        public List<QuestionAnsweredDto> getChildQuestionAnswered() {
            if (this.childQuestionAnswered == null) {
                this.childQuestionAnswered = new ArrayList();
            }

            return this.childQuestionAnswered;
        }
    }
}
