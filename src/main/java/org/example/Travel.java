package org.example;

import java.util.ArrayList;
import java.util.List;

public class Travel {
    private List<Step> stepsList = new ArrayList<>();

    public List<Step> getStepsList() {
        return stepsList;
    }

    public void addToStepList(final Step step) {
        stepsList.add(step);
    }

    public double getTotalDistance() {
        return stepsList.stream().mapToDouble(Step::getDistance).sum();
    }
}
