/*
 * Copyright 2010 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.drools.planner.core.localsearch;

import java.util.Comparator;

import org.drools.planner.core.move.Move;
import org.drools.planner.core.score.Score;
import org.drools.planner.core.solver.AbstractSolverScope;
import org.drools.planner.core.solver.AbstractStepScope;

public class LocalSearchStepScope extends AbstractStepScope {

    private final LocalSearchSolverScope localSearchSolverScope;

    private double timeGradient = Double.NaN;
    private Comparator<Score> deciderScoreComparator;
    private Move step = null;
    private Move undoStep = null;

    public LocalSearchStepScope(LocalSearchSolverScope localSearchSolverScope) {
        this.localSearchSolverScope = localSearchSolverScope;
    }

    public LocalSearchSolverScope getLocalSearchSolverScope() {
        return localSearchSolverScope;
    }

    @Override
    public AbstractSolverScope getAbstractSolverScope() {
        return localSearchSolverScope;
    }

    public double getTimeGradient() {
        return timeGradient;
    }

    public void setTimeGradient(double timeGradient) {
        this.timeGradient = timeGradient;
    }

    public Comparator<Score> getDeciderScoreComparator() {
        return deciderScoreComparator;
    }

    public void setDeciderScoreComparator(Comparator<Score> deciderScoreComparator) {
        this.deciderScoreComparator = deciderScoreComparator;
    }

    public Move getStep() {
        return step;
    }

    public void setStep(Move step) {
        this.step = step;
    }

    public Move getUndoStep() {
        return undoStep;
    }

    public void setUndoStep(Move undoStep) {
        this.undoStep = undoStep;
    }

    // ************************************************************************
    // Calculated methods
    // ************************************************************************

}
