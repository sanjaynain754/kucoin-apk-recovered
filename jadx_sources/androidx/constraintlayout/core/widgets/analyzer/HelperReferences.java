package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.Barrier;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.Iterator;

/* JADX INFO: loaded from: classes23.dex */
class HelperReferences extends WidgetRun {
    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void clear() {
        this.mRunGroup = null;
        this.start.clear();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public boolean supportsWrapComputation() {
        return false;
    }

    private void addDependency(DependencyNode dependencyNode) {
        this.start.mDependencies.add(dependencyNode);
        dependencyNode.mTargets.add(this.start);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void apply() {
        ConstraintWidget constraintWidget = this.mWidget;
        if (constraintWidget instanceof Barrier) {
            this.start.delegateToWidgetRun = true;
            Barrier barrier = (Barrier) constraintWidget;
            int barrierType = barrier.getBarrierType();
            boolean allowsGoneWidget = barrier.getAllowsGoneWidget();
            int i11 = 0;
            if (barrierType == 0) {
                this.start.mType = DependencyNode.Type.LEFT;
                while (i11 < barrier.mWidgetsCount) {
                    ConstraintWidget constraintWidget2 = barrier.mWidgets[i11];
                    if (allowsGoneWidget || constraintWidget2.getVisibility() != 8) {
                        DependencyNode dependencyNode = constraintWidget2.mHorizontalRun.start;
                        dependencyNode.mDependencies.add(this.start);
                        this.start.mTargets.add(dependencyNode);
                    }
                    i11++;
                }
                addDependency(this.mWidget.mHorizontalRun.start);
                addDependency(this.mWidget.mHorizontalRun.end);
                return;
            }
            if (barrierType == 1) {
                this.start.mType = DependencyNode.Type.RIGHT;
                while (i11 < barrier.mWidgetsCount) {
                    ConstraintWidget constraintWidget3 = barrier.mWidgets[i11];
                    if (allowsGoneWidget || constraintWidget3.getVisibility() != 8) {
                        DependencyNode dependencyNode2 = constraintWidget3.mHorizontalRun.end;
                        dependencyNode2.mDependencies.add(this.start);
                        this.start.mTargets.add(dependencyNode2);
                    }
                    i11++;
                }
                addDependency(this.mWidget.mHorizontalRun.start);
                addDependency(this.mWidget.mHorizontalRun.end);
                return;
            }
            if (barrierType == 2) {
                this.start.mType = DependencyNode.Type.TOP;
                while (i11 < barrier.mWidgetsCount) {
                    ConstraintWidget constraintWidget4 = barrier.mWidgets[i11];
                    if (allowsGoneWidget || constraintWidget4.getVisibility() != 8) {
                        DependencyNode dependencyNode3 = constraintWidget4.mVerticalRun.start;
                        dependencyNode3.mDependencies.add(this.start);
                        this.start.mTargets.add(dependencyNode3);
                    }
                    i11++;
                }
                addDependency(this.mWidget.mVerticalRun.start);
                addDependency(this.mWidget.mVerticalRun.end);
                return;
            }
            if (barrierType != 3) {
                return;
            }
            this.start.mType = DependencyNode.Type.BOTTOM;
            while (i11 < barrier.mWidgetsCount) {
                ConstraintWidget constraintWidget5 = barrier.mWidgets[i11];
                if (allowsGoneWidget || constraintWidget5.getVisibility() != 8) {
                    DependencyNode dependencyNode4 = constraintWidget5.mVerticalRun.end;
                    dependencyNode4.mDependencies.add(this.start);
                    this.start.mTargets.add(dependencyNode4);
                }
                i11++;
            }
            addDependency(this.mWidget.mVerticalRun.start);
            addDependency(this.mWidget.mVerticalRun.end);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void applyToWidget() {
        ConstraintWidget constraintWidget = this.mWidget;
        if (constraintWidget instanceof Barrier) {
            int barrierType = ((Barrier) constraintWidget).getBarrierType();
            if (barrierType == 0 || barrierType == 1) {
                this.mWidget.setX(this.start.value);
            } else {
                this.mWidget.setY(this.start.value);
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void reset() {
        this.start.resolved = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, androidx.constraintlayout.core.widgets.analyzer.Dependency
    public void update(Dependency dependency) {
        Barrier barrier = (Barrier) this.mWidget;
        int barrierType = barrier.getBarrierType();
        Iterator<DependencyNode> it = this.start.mTargets.iterator();
        int i11 = 0;
        int i12 = -1;
        while (it.hasNext()) {
            int i13 = it.next().value;
            if (i12 == -1 || i13 < i12) {
                i12 = i13;
            }
            if (i11 < i13) {
                i11 = i13;
            }
        }
        if (barrierType == 0 || barrierType == 2) {
            this.start.resolve(i12 + barrier.getMargin());
        } else {
            this.start.resolve(i11 + barrier.getMargin());
        }
    }

    public HelperReferences(ConstraintWidget constraintWidget) {
        super(constraintWidget);
    }
}
