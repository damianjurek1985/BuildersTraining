package question.builders;

import dto.QuestionAnsweredDto;

import java.util.Arrays;
import java.util.List;

public class SelectedAssignedOptionIdsBuilder {
    private List<Long> selectedAssignedOptionIds;

    private SelectedAssignedOptionIdsBuilder(Long... optionId) {
        this.selectedAssignedOptionIds = Arrays.asList(optionId);
    }

    public static SelectedAssignedOptionIdsBuilder builder(Long... optionId) {
        return new SelectedAssignedOptionIdsBuilder(optionId);
    }

    public QuestionAnsweredDto.SelectedAssignedOptionIds build() {
        QuestionAnsweredDto.SelectedAssignedOptionIds selectedAssignedOptionIds = new QuestionAnsweredDto.SelectedAssignedOptionIds();
        selectedAssignedOptionIds.getAssignedOptionId().addAll(this.selectedAssignedOptionIds);
        return selectedAssignedOptionIds;
    }
}
