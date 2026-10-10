package com.facebook.react.uimanager;

import androidx.annotation.Nullable;
import com.facebook.react.uimanager.ReactShadowNode;
import com.facebook.yoga.YogaAlign;
import com.facebook.yoga.YogaDirection;
import com.facebook.yoga.YogaDisplay;
import com.facebook.yoga.YogaFlexDirection;
import com.facebook.yoga.YogaJustify;
import com.facebook.yoga.YogaOverflow;
import com.facebook.yoga.YogaPositionType;
import com.facebook.yoga.YogaValue;
import com.facebook.yoga.YogaWrap;
import p193d7.InterfaceC36628a;
import p193d7.InterfaceC36634g;

/* JADX INFO: loaded from: classes45.dex */
public interface ReactShadowNode<T extends ReactShadowNode> {
    void addChildAt(T t11, int i11);

    void addNativeChildAt(T t11, int i11);

    void calculateLayout();

    void calculateLayout(float f11, float f12);

    Iterable<? extends ReactShadowNode> calculateLayoutOnChildren();

    void dirty();

    void dispatchUpdates(float f11, float f12, UIViewOperationQueue uIViewOperationQueue, NativeViewHierarchyOptimizer nativeViewHierarchyOptimizer);

    boolean dispatchUpdatesWillChangeLayout(float f11, float f12);

    void dispose();

    T getChildAt(int i11);

    int getChildCount();

    float getFlex();

    Integer getHeightMeasureSpec();

    String getHierarchyInfo();

    YogaDirection getLayoutDirection();

    float getLayoutHeight();

    @Nullable
    T getLayoutParent();

    float getLayoutWidth();

    float getLayoutX();

    float getLayoutY();

    int getNativeChildCount();

    NativeKind getNativeKind();

    int getNativeOffsetForChild(T t11);

    @Nullable
    T getNativeParent();

    float getPadding(int i11);

    @Nullable
    T getParent();

    int getReactTag();

    int getRootTag();

    int getScreenHeight();

    int getScreenWidth();

    int getScreenX();

    int getScreenY();

    YogaValue getStyleHeight();

    YogaValue getStylePadding(int i11);

    YogaValue getStyleWidth();

    ThemedReactContext getThemedContext();

    int getTotalNativeChildren();

    String getViewClass();

    Integer getWidthMeasureSpec();

    boolean hasNewLayout();

    boolean hasUnseenUpdates();

    boolean hasUpdates();

    boolean hoistNativeChildren();

    int indexOf(T t11);

    int indexOfNativeChild(T t11);

    boolean isDescendantOf(T t11);

    boolean isDirty();

    boolean isLayoutOnly();

    boolean isMeasureDefined();

    boolean isVirtual();

    boolean isVirtualAnchor();

    boolean isYogaLeafNode();

    void markLayoutSeen();

    void markUpdateSeen();

    void markUpdated();

    void onAfterUpdateTransaction();

    void onBeforeLayout(NativeViewHierarchyOptimizer nativeViewHierarchyOptimizer);

    void onCollectExtraUpdates(UIViewOperationQueue uIViewOperationQueue);

    void removeAllNativeChildren();

    void removeAndDisposeAllChildren();

    T removeChildAt(int i11);

    T removeNativeChildAt(int i11);

    void setAlignContent(YogaAlign yogaAlign);

    void setAlignItems(YogaAlign yogaAlign);

    void setAlignSelf(YogaAlign yogaAlign);

    void setBaselineFunction(InterfaceC36628a interfaceC36628a);

    void setBorder(int i11, float f11);

    void setColumnGap(float f11);

    void setColumnGapPercent(float f11);

    void setDefaultPadding(int i11, float f11);

    void setDisplay(YogaDisplay yogaDisplay);

    void setFlex(float f11);

    void setFlexBasis(float f11);

    void setFlexBasisAuto();

    void setFlexBasisPercent(float f11);

    void setFlexDirection(YogaFlexDirection yogaFlexDirection);

    void setFlexGrow(float f11);

    void setFlexShrink(float f11);

    void setFlexWrap(YogaWrap yogaWrap);

    void setGap(float f11);

    void setGapPercent(float f11);

    void setIsLayoutOnly(boolean z11);

    void setJustifyContent(YogaJustify yogaJustify);

    void setLayoutDirection(YogaDirection yogaDirection);

    void setLayoutParent(@Nullable T t11);

    void setLocalData(Object obj);

    void setMargin(int i11, float f11);

    void setMarginAuto(int i11);

    void setMarginPercent(int i11, float f11);

    void setMeasureFunction(InterfaceC36634g interfaceC36634g);

    void setMeasureSpecs(int i11, int i12);

    void setOverflow(YogaOverflow yogaOverflow);

    void setPadding(int i11, float f11);

    void setPaddingPercent(int i11, float f11);

    void setPosition(int i11, float f11);

    void setPositionPercent(int i11, float f11);

    void setPositionType(YogaPositionType yogaPositionType);

    void setReactTag(int i11);

    void setRootTag(int i11);

    void setRowGap(float f11);

    void setRowGapPercent(float f11);

    void setShouldNotifyOnLayout(boolean z11);

    void setStyleAspectRatio(float f11);

    void setStyleHeight(float f11);

    void setStyleHeightAuto();

    void setStyleHeightPercent(float f11);

    void setStyleMaxHeight(float f11);

    void setStyleMaxHeightPercent(float f11);

    void setStyleMaxWidth(float f11);

    void setStyleMaxWidthPercent(float f11);

    void setStyleMinHeight(float f11);

    void setStyleMinHeightPercent(float f11);

    void setStyleMinWidth(float f11);

    void setStyleMinWidthPercent(float f11);

    void setStyleWidth(float f11);

    void setStyleWidthAuto();

    void setStyleWidthPercent(float f11);

    void setThemedContext(ThemedReactContext themedReactContext);

    void setViewClassName(String str);

    boolean shouldNotifyOnLayout();

    void updateProperties(ReactStylesDiffMap reactStylesDiffMap);
}
