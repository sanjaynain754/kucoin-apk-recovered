package androidx.constraintlayout.core.widgets.analyzer;

/* JADX INFO: loaded from: classes23.dex */
class BaselineDimensionDependency extends DimensionDependency {
    public void update(DependencyNode dependencyNode) {
        WidgetRun widgetRun = this.mRun;
        ((VerticalWidgetRun) widgetRun).baseline.mMargin = widgetRun.mWidget.getBaselineDistance();
        this.resolved = true;
    }

    public BaselineDimensionDependency(WidgetRun widgetRun) {
        super(widgetRun);
    }
}
