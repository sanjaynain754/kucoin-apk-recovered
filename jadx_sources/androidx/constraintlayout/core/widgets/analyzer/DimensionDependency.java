package androidx.constraintlayout.core.widgets.analyzer;

/* JADX INFO: loaded from: classes23.dex */
class DimensionDependency extends DependencyNode {
    public int wrapValue;

    @Override // androidx.constraintlayout.core.widgets.analyzer.DependencyNode
    public void resolve(int i11) {
        if (this.resolved) {
            return;
        }
        this.resolved = true;
        this.value = i11;
        for (Dependency dependency : this.mDependencies) {
            dependency.update(dependency);
        }
    }

    public DimensionDependency(WidgetRun widgetRun) {
        super(widgetRun);
        if (widgetRun instanceof HorizontalWidgetRun) {
            this.mType = DependencyNode.Type.HORIZONTAL_DIMENSION;
        } else {
            this.mType = DependencyNode.Type.VERTICAL_DIMENSION;
        }
    }
}
