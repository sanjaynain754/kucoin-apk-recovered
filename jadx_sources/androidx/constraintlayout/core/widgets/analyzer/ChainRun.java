package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes23.dex */
public class ChainRun extends WidgetRun {
    private int mChainStyle;
    ArrayList<WidgetRun> mWidgets;

    private ConstraintWidget getFirstVisibleWidget() {
        for (int i11 = 0; i11 < this.mWidgets.size(); i11++) {
            WidgetRun widgetRun = this.mWidgets.get(i11);
            if (widgetRun.mWidget.getVisibility() != 8) {
                return widgetRun.mWidget;
            }
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void applyToWidget() {
        for (int i11 = 0; i11 < this.mWidgets.size(); i11++) {
            this.mWidgets.get(i11).applyToWidget();
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void clear() {
        this.mRunGroup = null;
        Iterator<WidgetRun> it = this.mWidgets.iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
    }

    private void build() {
        ConstraintWidget constraintWidget;
        ConstraintWidget constraintWidget2 = this.mWidget;
        ConstraintWidget previousChainMember = constraintWidget2.getPreviousChainMember(this.orientation);
        while (true) {
            ConstraintWidget constraintWidget3 = previousChainMember;
            constraintWidget = constraintWidget2;
            constraintWidget2 = constraintWidget3;
            if (constraintWidget2 == null) {
                break;
            } else {
                previousChainMember = constraintWidget2.getPreviousChainMember(this.orientation);
            }
        }
        this.mWidget = constraintWidget;
        this.mWidgets.add(constraintWidget.getRun(this.orientation));
        ConstraintWidget nextChainMember = constraintWidget.getNextChainMember(this.orientation);
        while (nextChainMember != null) {
            this.mWidgets.add(nextChainMember.getRun(this.orientation));
            nextChainMember = nextChainMember.getNextChainMember(this.orientation);
        }
        for (WidgetRun widgetRun : this.mWidgets) {
            int i11 = this.orientation;
            if (i11 == 0) {
                widgetRun.mWidget.horizontalChainRun = this;
            } else if (i11 == 1) {
                widgetRun.mWidget.verticalChainRun = this;
            }
        }
        if (this.orientation == 0 && ((ConstraintWidgetContainer) this.mWidget.getParent()).isRtl() && this.mWidgets.size() > 1) {
            ArrayList<WidgetRun> arrayList = this.mWidgets;
            this.mWidget = arrayList.get(arrayList.size() - 1).mWidget;
        }
        this.mChainStyle = this.orientation == 0 ? this.mWidget.getHorizontalChainStyle() : this.mWidget.getVerticalChainStyle();
    }

    private ConstraintWidget getLastVisibleWidget() {
        for (int size = this.mWidgets.size() - 1; size >= 0; size--) {
            WidgetRun widgetRun = this.mWidgets.get(size);
            if (widgetRun.mWidget.getVisibility() != 8) {
                return widgetRun.mWidget;
            }
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void apply() {
        Iterator<WidgetRun> it = this.mWidgets.iterator();
        while (it.hasNext()) {
            it.next().apply();
        }
        int size = this.mWidgets.size();
        if (size < 1) {
            return;
        }
        ConstraintWidget constraintWidget = this.mWidgets.get(0).mWidget;
        ConstraintWidget constraintWidget2 = this.mWidgets.get(size - 1).mWidget;
        if (this.orientation == 0) {
            ConstraintAnchor constraintAnchor = constraintWidget.mLeft;
            ConstraintAnchor constraintAnchor2 = constraintWidget2.mRight;
            DependencyNode target = getTarget(constraintAnchor, 0);
            int margin = constraintAnchor.getMargin();
            ConstraintWidget firstVisibleWidget = getFirstVisibleWidget();
            if (firstVisibleWidget != null) {
                margin = firstVisibleWidget.mLeft.getMargin();
            }
            if (target != null) {
                addTarget(this.start, target, margin);
            }
            DependencyNode target2 = getTarget(constraintAnchor2, 0);
            int margin2 = constraintAnchor2.getMargin();
            ConstraintWidget lastVisibleWidget = getLastVisibleWidget();
            if (lastVisibleWidget != null) {
                margin2 = lastVisibleWidget.mRight.getMargin();
            }
            if (target2 != null) {
                addTarget(this.end, target2, -margin2);
            }
        } else {
            ConstraintAnchor constraintAnchor3 = constraintWidget.mTop;
            ConstraintAnchor constraintAnchor4 = constraintWidget2.mBottom;
            DependencyNode target3 = getTarget(constraintAnchor3, 1);
            int margin3 = constraintAnchor3.getMargin();
            ConstraintWidget firstVisibleWidget2 = getFirstVisibleWidget();
            if (firstVisibleWidget2 != null) {
                margin3 = firstVisibleWidget2.mTop.getMargin();
            }
            if (target3 != null) {
                addTarget(this.start, target3, margin3);
            }
            DependencyNode target4 = getTarget(constraintAnchor4, 1);
            int margin4 = constraintAnchor4.getMargin();
            ConstraintWidget lastVisibleWidget2 = getLastVisibleWidget();
            if (lastVisibleWidget2 != null) {
                margin4 = lastVisibleWidget2.mBottom.getMargin();
            }
            if (target4 != null) {
                addTarget(this.end, target4, -margin4);
            }
        }
        this.start.updateDelegate = this;
        this.end.updateDelegate = this;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public long getWrapDimension() {
        int size = this.mWidgets.size();
        long wrapDimension = 0;
        for (int i11 = 0; i11 < size; i11++) {
            WidgetRun widgetRun = this.mWidgets.get(i11);
            wrapDimension = wrapDimension + ((long) widgetRun.start.mMargin) + widgetRun.getWrapDimension() + ((long) widgetRun.end.mMargin);
        }
        return wrapDimension;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void reset() {
        this.start.resolved = false;
        this.end.resolved = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public boolean supportsWrapComputation() {
        int size = this.mWidgets.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (!this.mWidgets.get(i11).supportsWrapComputation()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ChainRun ");
        sb2.append(this.orientation == 0 ? "horizontal : " : "vertical : ");
        for (WidgetRun widgetRun : this.mWidgets) {
            sb2.append("<");
            sb2.append(widgetRun);
            sb2.append("> ");
        }
        return sb2.toString();
    }

    /* JADX WARN: Code duplicated, block: B:90:0x0160  */
    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, androidx.constraintlayout.core.widgets.analyzer.Dependency
    public void update(Dependency dependency) {
        int i11;
        int i12;
        boolean z11;
        float f11;
        float f12;
        int i13;
        int i14;
        int i15;
        int i16;
        float f13;
        int i17;
        int i18;
        int i19;
        int i21;
        boolean z12;
        if (this.start.resolved && this.end.resolved) {
            ConstraintWidget parent = this.mWidget.getParent();
            boolean zIsRtl = parent instanceof ConstraintWidgetContainer ? ((ConstraintWidgetContainer) parent).isRtl() : false;
            int i22 = this.end.value - this.start.value;
            int size = this.mWidgets.size();
            int i23 = 0;
            while (true) {
                i11 = -1;
                i12 = 8;
                if (i23 >= size) {
                    i23 = -1;
                    break;
                } else if (this.mWidgets.get(i23).mWidget.getVisibility() != 8) {
                    break;
                } else {
                    i23++;
                }
            }
            int i24 = size - 1;
            for (int i25 = i24; i25 >= 0; i25--) {
                if (this.mWidgets.get(i25).mWidget.getVisibility() != 8) {
                    i11 = i25;
                    break;
                }
            }
            int i26 = 0;
            while (true) {
                if (i26 >= 2) {
                    z11 = zIsRtl;
                    f11 = 0.0f;
                    f12 = 0.0f;
                    i13 = 0;
                    i14 = 0;
                    i15 = 0;
                    break;
                }
                int i27 = 0;
                i14 = 0;
                i15 = 0;
                int i28 = 0;
                f12 = 0.0f;
                while (i27 < size) {
                    WidgetRun widgetRun = this.mWidgets.get(i27);
                    if (widgetRun.mWidget.getVisibility() == i12) {
                        z12 = zIsRtl;
                    } else {
                        i28++;
                        if (i27 > 0 && i27 >= i23) {
                            i14 += widgetRun.start.mMargin;
                        }
                        DimensionDependency dimensionDependency = widgetRun.mDimension;
                        int i29 = dimensionDependency.value;
                        boolean z13 = widgetRun.mDimensionBehavior != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                        if (z13) {
                            int i31 = this.orientation;
                            if (i31 == 0 && !widgetRun.mWidget.mHorizontalRun.mDimension.resolved) {
                                return;
                            }
                            if (i31 == 1 && !widgetRun.mWidget.mVerticalRun.mDimension.resolved) {
                                return;
                            } else {
                                z12 = zIsRtl;
                            }
                        } else {
                            z12 = zIsRtl;
                            if (widgetRun.matchConstraintsType == 1 && i26 == 0) {
                                i29 = dimensionDependency.wrapValue;
                                i15++;
                            } else if (dimensionDependency.resolved) {
                            }
                            z13 = true;
                        }
                        if (z13) {
                            i14 += i29;
                        } else {
                            i15++;
                            float f14 = widgetRun.mWidget.mWeight[this.orientation];
                            if (f14 >= 0.0f) {
                                f12 += f14;
                            }
                        }
                        if (i27 < i24 && i27 < i11) {
                            i14 += -widgetRun.end.mMargin;
                        }
                    }
                    i27++;
                    zIsRtl = z12;
                    i12 = 8;
                }
                z11 = zIsRtl;
                f11 = 0.0f;
                if (i14 < i22 || i15 == 0) {
                    i13 = i28;
                    break;
                } else {
                    i26++;
                    zIsRtl = z11;
                    i12 = 8;
                }
            }
            int i32 = this.start.value;
            if (z11) {
                i32 = this.end.value;
            }
            float f15 = 0.5f;
            if (i14 > i22) {
                i32 = z11 ? i32 + ((int) (((i14 - i22) / 2.0f) + 0.5f)) : i32 - ((int) (((i14 - i22) / 2.0f) + 0.5f));
            }
            if (i15 > 0) {
                float f16 = i22 - i14;
                int i33 = (int) ((f16 / i15) + 0.5f);
                int i34 = 0;
                int i35 = 0;
                while (i34 < size) {
                    WidgetRun widgetRun2 = this.mWidgets.get(i34);
                    float f17 = f15;
                    int i36 = i32;
                    if (widgetRun2.mWidget.getVisibility() != 8 && widgetRun2.mDimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        DimensionDependency dimensionDependency2 = widgetRun2.mDimension;
                        if (dimensionDependency2.resolved) {
                            i33 = i33;
                            i35 = i35;
                        } else {
                            int i37 = f12 > f11 ? (int) (((widgetRun2.mWidget.mWeight[this.orientation] * f16) / f12) + f17) : i33;
                            if (this.orientation == 0) {
                                ConstraintWidget constraintWidget = widgetRun2.mWidget;
                                i19 = constraintWidget.mMatchConstraintMaxWidth;
                                i21 = constraintWidget.mMatchConstraintMinWidth;
                            } else {
                                ConstraintWidget constraintWidget2 = widgetRun2.mWidget;
                                i19 = constraintWidget2.mMatchConstraintMaxHeight;
                                i21 = constraintWidget2.mMatchConstraintMinHeight;
                            }
                            int i38 = i35;
                            int iMax = Math.max(i21, widgetRun2.matchConstraintsType == 1 ? Math.min(i37, dimensionDependency2.wrapValue) : i37);
                            if (i19 > 0) {
                                iMax = Math.min(i19, iMax);
                            }
                            if (iMax != i37) {
                                i35 = i38 + 1;
                                i37 = iMax;
                            } else {
                                i35 = i38;
                            }
                            widgetRun2.mDimension.resolve(i37);
                        }
                    } else {
                        i33 = i33;
                        i35 = i35;
                    }
                    i34++;
                    f15 = f17;
                    i32 = i36;
                    f16 = f16;
                    i33 = i33;
                }
                i16 = i32;
                f13 = f15;
                int i39 = i35;
                if (i39 > 0) {
                    i15 -= i39;
                    i14 = 0;
                    for (int i41 = 0; i41 < size; i41++) {
                        WidgetRun widgetRun3 = this.mWidgets.get(i41);
                        if (widgetRun3.mWidget.getVisibility() != 8) {
                            if (i41 > 0 && i41 >= i23) {
                                i14 += widgetRun3.start.mMargin;
                            }
                            i14 += widgetRun3.mDimension.value;
                            if (i41 < i24 && i41 < i11) {
                                i14 += -widgetRun3.end.mMargin;
                            }
                        }
                    }
                }
                i18 = 2;
                if (this.mChainStyle == 2 && i39 == 0) {
                    i17 = 0;
                    this.mChainStyle = 0;
                } else {
                    i17 = 0;
                }
            } else {
                i16 = i32;
                f13 = 0.5f;
                i17 = 0;
                i18 = 2;
            }
            if (i14 > i22) {
                this.mChainStyle = i18;
            }
            if (i13 > 0 && i15 == 0 && i23 == i11) {
                this.mChainStyle = i18;
            }
            int i42 = this.mChainStyle;
            if (i42 == 1) {
                int i43 = i13 > 1 ? (i22 - i14) / (i13 - 1) : i13 == 1 ? (i22 - i14) / 2 : i17;
                if (i15 > 0) {
                    i43 = i17;
                }
                int i44 = i16;
                while (i17 < size) {
                    WidgetRun widgetRun4 = this.mWidgets.get(z11 ? size - (i17 + 1) : i17);
                    if (widgetRun4.mWidget.getVisibility() == 8) {
                        widgetRun4.start.resolve(i44);
                        widgetRun4.end.resolve(i44);
                    } else {
                        if (i17 > 0) {
                            i44 = z11 ? i44 - i43 : i44 + i43;
                        }
                        if (i17 > 0 && i17 >= i23) {
                            i44 = z11 ? i44 - widgetRun4.start.mMargin : i44 + widgetRun4.start.mMargin;
                        }
                        if (z11) {
                            widgetRun4.end.resolve(i44);
                        } else {
                            widgetRun4.start.resolve(i44);
                        }
                        DimensionDependency dimensionDependency3 = widgetRun4.mDimension;
                        int i45 = dimensionDependency3.value;
                        if (widgetRun4.mDimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && widgetRun4.matchConstraintsType == 1) {
                            i45 = dimensionDependency3.wrapValue;
                        }
                        i44 = z11 ? i44 - i45 : i44 + i45;
                        if (z11) {
                            widgetRun4.start.resolve(i44);
                        } else {
                            widgetRun4.end.resolve(i44);
                        }
                        widgetRun4.mResolved = true;
                        if (i17 < i24 && i17 < i11) {
                            i44 = z11 ? i44 - (-widgetRun4.end.mMargin) : i44 + (-widgetRun4.end.mMargin);
                        }
                    }
                    i17++;
                }
                return;
            }
            if (i42 == 0) {
                int i46 = (i22 - i14) / (i13 + 1);
                if (i15 > 0) {
                    i46 = i17;
                }
                int i47 = i16;
                while (i17 < size) {
                    WidgetRun widgetRun5 = this.mWidgets.get(z11 ? size - (i17 + 1) : i17);
                    if (widgetRun5.mWidget.getVisibility() == 8) {
                        widgetRun5.start.resolve(i47);
                        widgetRun5.end.resolve(i47);
                    } else {
                        int i48 = z11 ? i47 - i46 : i47 + i46;
                        if (i17 > 0 && i17 >= i23) {
                            i48 = z11 ? i48 - widgetRun5.start.mMargin : i48 + widgetRun5.start.mMargin;
                        }
                        if (z11) {
                            widgetRun5.end.resolve(i48);
                        } else {
                            widgetRun5.start.resolve(i48);
                        }
                        DimensionDependency dimensionDependency4 = widgetRun5.mDimension;
                        int iMin = dimensionDependency4.value;
                        if (widgetRun5.mDimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && widgetRun5.matchConstraintsType == 1) {
                            iMin = Math.min(iMin, dimensionDependency4.wrapValue);
                        }
                        i47 = z11 ? i48 - iMin : i48 + iMin;
                        if (z11) {
                            widgetRun5.start.resolve(i47);
                        } else {
                            widgetRun5.end.resolve(i47);
                        }
                        if (i17 < i24 && i17 < i11) {
                            i47 = z11 ? i47 - (-widgetRun5.end.mMargin) : i47 + (-widgetRun5.end.mMargin);
                        }
                    }
                    i17++;
                }
                return;
            }
            if (i42 == 2) {
                float horizontalBiasPercent = this.orientation == 0 ? this.mWidget.getHorizontalBiasPercent() : this.mWidget.getVerticalBiasPercent();
                if (z11) {
                    horizontalBiasPercent = 1.0f - horizontalBiasPercent;
                }
                int i49 = (int) (((i22 - i14) * horizontalBiasPercent) + f13);
                if (i49 < 0 || i15 > 0) {
                    i49 = i17;
                }
                int i51 = z11 ? i16 - i49 : i16 + i49;
                while (i17 < size) {
                    WidgetRun widgetRun6 = this.mWidgets.get(z11 ? size - (i17 + 1) : i17);
                    if (widgetRun6.mWidget.getVisibility() == 8) {
                        widgetRun6.start.resolve(i51);
                        widgetRun6.end.resolve(i51);
                    } else {
                        if (i17 > 0 && i17 >= i23) {
                            i51 = z11 ? i51 - widgetRun6.start.mMargin : i51 + widgetRun6.start.mMargin;
                        }
                        if (z11) {
                            widgetRun6.end.resolve(i51);
                        } else {
                            widgetRun6.start.resolve(i51);
                        }
                        DimensionDependency dimensionDependency5 = widgetRun6.mDimension;
                        int i52 = dimensionDependency5.value;
                        if (widgetRun6.mDimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && widgetRun6.matchConstraintsType == 1) {
                            i52 = dimensionDependency5.wrapValue;
                        }
                        i51 = z11 ? i51 - i52 : i51 + i52;
                        if (z11) {
                            widgetRun6.start.resolve(i51);
                        } else {
                            widgetRun6.end.resolve(i51);
                        }
                        if (i17 < i24 && i17 < i11) {
                            i51 = z11 ? i51 - (-widgetRun6.end.mMargin) : i51 + (-widgetRun6.end.mMargin);
                        }
                    }
                    i17++;
                }
            }
        }
    }

    public ChainRun(ConstraintWidget constraintWidget, int i11) {
        super(constraintWidget);
        this.mWidgets = new ArrayList<>();
        this.orientation = i11;
        build();
    }
}
