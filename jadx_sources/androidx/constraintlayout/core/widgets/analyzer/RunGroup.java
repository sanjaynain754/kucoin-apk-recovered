package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes23.dex */
class RunGroup {
    public static final int BASELINE = 2;
    public static final int END = 1;
    public static final int START = 0;
    public static int index;
    int mDirection;
    WidgetRun mFirstRun;
    int mGroupIndex;
    WidgetRun mLastRun;
    public int position = 0;
    public boolean dual = false;
    ArrayList<WidgetRun> mRuns = new ArrayList<>();

    private boolean defineTerminalWidget(WidgetRun widgetRun, int i11) {
        DependencyNode dependencyNode;
        WidgetRun widgetRun2;
        DependencyNode dependencyNode2;
        WidgetRun widgetRun3;
        if (!widgetRun.mWidget.isTerminalWidget[i11]) {
            return false;
        }
        for (Dependency dependency : widgetRun.start.mDependencies) {
            if ((dependency instanceof DependencyNode) && (widgetRun3 = (dependencyNode2 = (DependencyNode) dependency).mRun) != widgetRun && dependencyNode2 == widgetRun3.start) {
                if (widgetRun instanceof ChainRun) {
                    Iterator<WidgetRun> it = ((ChainRun) widgetRun).mWidgets.iterator();
                    while (it.hasNext()) {
                        defineTerminalWidget(it.next(), i11);
                    }
                } else if (!(widgetRun instanceof HelperReferences)) {
                    widgetRun.mWidget.isTerminalWidget[i11] = false;
                }
                defineTerminalWidget(dependencyNode2.mRun, i11);
            }
        }
        for (Dependency dependency2 : widgetRun.end.mDependencies) {
            if ((dependency2 instanceof DependencyNode) && (widgetRun2 = (dependencyNode = (DependencyNode) dependency2).mRun) != widgetRun && dependencyNode == widgetRun2.start) {
                if (widgetRun instanceof ChainRun) {
                    Iterator<WidgetRun> it2 = ((ChainRun) widgetRun).mWidgets.iterator();
                    while (it2.hasNext()) {
                        defineTerminalWidget(it2.next(), i11);
                    }
                } else if (!(widgetRun instanceof HelperReferences)) {
                    widgetRun.mWidget.isTerminalWidget[i11] = false;
                }
                defineTerminalWidget(dependencyNode.mRun, i11);
            }
        }
        return false;
    }

    private long traverseEnd(DependencyNode dependencyNode, long j11) {
        WidgetRun widgetRun = dependencyNode.mRun;
        if (widgetRun instanceof HelperReferences) {
            return j11;
        }
        int size = dependencyNode.mDependencies.size();
        long jMin = j11;
        for (int i11 = 0; i11 < size; i11++) {
            Dependency dependency = dependencyNode.mDependencies.get(i11);
            if (dependency instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) dependency;
                if (dependencyNode2.mRun != widgetRun) {
                    jMin = Math.min(jMin, traverseEnd(dependencyNode2, ((long) dependencyNode2.mMargin) + j11));
                }
            }
        }
        if (dependencyNode != widgetRun.end) {
            return jMin;
        }
        long wrapDimension = j11 - widgetRun.getWrapDimension();
        return Math.min(Math.min(jMin, traverseEnd(widgetRun.start, wrapDimension)), wrapDimension - ((long) widgetRun.start.mMargin));
    }

    private long traverseStart(DependencyNode dependencyNode, long j11) {
        WidgetRun widgetRun = dependencyNode.mRun;
        if (widgetRun instanceof HelperReferences) {
            return j11;
        }
        int size = dependencyNode.mDependencies.size();
        long jMax = j11;
        for (int i11 = 0; i11 < size; i11++) {
            Dependency dependency = dependencyNode.mDependencies.get(i11);
            if (dependency instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) dependency;
                if (dependencyNode2.mRun != widgetRun) {
                    jMax = Math.max(jMax, traverseStart(dependencyNode2, ((long) dependencyNode2.mMargin) + j11));
                }
            }
        }
        if (dependencyNode != widgetRun.start) {
            return jMax;
        }
        long wrapDimension = j11 + widgetRun.getWrapDimension();
        return Math.max(Math.max(jMax, traverseStart(widgetRun.end, wrapDimension)), wrapDimension - ((long) widgetRun.end.mMargin));
    }

    public void add(WidgetRun widgetRun) {
        this.mRuns.add(widgetRun);
        this.mLastRun = widgetRun;
    }

    public long computeWrapSize(ConstraintWidgetContainer constraintWidgetContainer, int i11) {
        long wrapDimension;
        int i12;
        WidgetRun widgetRun = this.mFirstRun;
        if (widgetRun instanceof ChainRun) {
            if (((ChainRun) widgetRun).orientation != i11) {
                return 0L;
            }
        } else if (i11 == 0) {
            if (!(widgetRun instanceof HorizontalWidgetRun)) {
                return 0L;
            }
        } else if (!(widgetRun instanceof VerticalWidgetRun)) {
            return 0L;
        }
        DependencyNode dependencyNode = (i11 == 0 ? constraintWidgetContainer.mHorizontalRun : constraintWidgetContainer.mVerticalRun).start;
        DependencyNode dependencyNode2 = (i11 == 0 ? constraintWidgetContainer.mHorizontalRun : constraintWidgetContainer.mVerticalRun).end;
        boolean zContains = widgetRun.start.mTargets.contains(dependencyNode);
        boolean zContains2 = this.mFirstRun.end.mTargets.contains(dependencyNode2);
        long wrapDimension2 = this.mFirstRun.getWrapDimension();
        if (zContains && zContains2) {
            long jTraverseStart = traverseStart(this.mFirstRun.start, 0L);
            long jTraverseEnd = traverseEnd(this.mFirstRun.end, 0L);
            long j11 = jTraverseStart - wrapDimension2;
            WidgetRun widgetRun2 = this.mFirstRun;
            int i13 = widgetRun2.end.mMargin;
            if (j11 >= (-i13)) {
                j11 += (long) i13;
            }
            int i14 = widgetRun2.start.mMargin;
            long j12 = ((-jTraverseEnd) - wrapDimension2) - ((long) i14);
            if (j12 >= i14) {
                j12 -= (long) i14;
            }
            float biasPercent = widgetRun2.mWidget.getBiasPercent(i11);
            float f11 = biasPercent > 0.0f ? (long) ((j12 / biasPercent) + (j11 / (1.0f - biasPercent))) : 0L;
            long j13 = ((long) ((f11 * biasPercent) + 0.5f)) + wrapDimension2 + ((long) ((f11 * (1.0f - biasPercent)) + 0.5f));
            WidgetRun widgetRun3 = this.mFirstRun;
            wrapDimension = ((long) widgetRun3.start.mMargin) + j13;
            i12 = widgetRun3.end.mMargin;
        } else {
            if (zContains) {
                DependencyNode dependencyNode3 = this.mFirstRun.start;
                return Math.max(traverseStart(dependencyNode3, dependencyNode3.mMargin), ((long) this.mFirstRun.start.mMargin) + wrapDimension2);
            }
            if (zContains2) {
                DependencyNode dependencyNode4 = this.mFirstRun.end;
                return Math.max(-traverseEnd(dependencyNode4, dependencyNode4.mMargin), ((long) (-this.mFirstRun.end.mMargin)) + wrapDimension2);
            }
            WidgetRun widgetRun4 = this.mFirstRun;
            wrapDimension = ((long) widgetRun4.start.mMargin) + widgetRun4.getWrapDimension();
            i12 = this.mFirstRun.end.mMargin;
        }
        return wrapDimension - ((long) i12);
    }

    public void defineTerminalWidgets(boolean z11, boolean z12) {
        if (z11) {
            WidgetRun widgetRun = this.mFirstRun;
            if (widgetRun instanceof HorizontalWidgetRun) {
                defineTerminalWidget(widgetRun, 0);
            }
        }
        if (z12) {
            WidgetRun widgetRun2 = this.mFirstRun;
            if (widgetRun2 instanceof VerticalWidgetRun) {
                defineTerminalWidget(widgetRun2, 1);
            }
        }
    }

    public RunGroup(WidgetRun widgetRun, int i11) {
        this.mFirstRun = null;
        this.mLastRun = null;
        int i12 = index;
        this.mGroupIndex = i12;
        index = i12 + 1;
        this.mFirstRun = widgetRun;
        this.mLastRun = widgetRun;
        this.mDirection = i11;
    }
}
