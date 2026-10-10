package com.facebook.react.views.scroll;

import android.view.View;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.BackgroundStyleApplicator;
import com.facebook.react.uimanager.LengthPercentage;
import com.facebook.react.uimanager.LengthPercentageType;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.PointerEvents;
import com.facebook.react.uimanager.ReactClippingViewGroupHelper;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import com.facebook.react.uimanager.style.BorderRadiusProp;
import com.facebook.react.uimanager.style.BorderStyle;
import com.facebook.react.uimanager.style.LogicalEdge;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p852kotlin.jvm.internal.FloatCompanionObject;

/* JADX INFO: loaded from: classes45.dex */
@ReactModule(name = ReactScrollViewManager.REACT_CLASS)
public class ReactScrollViewManager extends ViewGroupManager<ReactScrollView> implements ReactScrollViewCommandHelper.ScrollCommandHandler<ReactScrollView> {
    public static final String REACT_CLASS = "RCTScrollView";
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3};

    @Nullable
    private FpsListener mFpsListener;

    public ReactScrollViewManager() {
        this(null);
    }

    public ReactScrollViewManager(@Nullable FpsListener fpsListener) {
        this.mFpsListener = fpsListener;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ReactScrollView createViewInstance(ThemedReactContext themedReactContext) {
        return new ReactScrollView(themedReactContext, this.mFpsListener);
    }

    @Override // com.facebook.react.views.scroll.ReactScrollViewCommandHelper.ScrollCommandHandler
    public void flashScrollIndicators(ReactScrollView reactScrollView) {
        reactScrollView.flashScrollIndicators();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.views.scroll.ReactScrollViewCommandHelper.ScrollCommandHandler
    public void scrollTo(ReactScrollView reactScrollView, ReactScrollViewCommandHelper.ScrollToCommandData scrollToCommandData) {
        reactScrollView.abortAnimation();
        if (scrollToCommandData.mAnimated) {
            reactScrollView.reactSmoothScrollTo(scrollToCommandData.mDestX, scrollToCommandData.mDestY);
        } else {
            reactScrollView.scrollTo(scrollToCommandData.mDestX, scrollToCommandData.mDestY);
        }
    }

    @Override // com.facebook.react.views.scroll.ReactScrollViewCommandHelper.ScrollCommandHandler
    public void scrollToEnd(ReactScrollView reactScrollView, ReactScrollViewCommandHelper.ScrollToEndCommandData scrollToEndCommandData) {
        View childAt = reactScrollView.getChildAt(0);
        if (childAt == null) {
            throw new RetryableMountingLayerException("scrollToEnd called on ScrollView without child");
        }
        int height = childAt.getHeight() + reactScrollView.getPaddingBottom();
        reactScrollView.abortAnimation();
        if (scrollToEndCommandData.mAnimated) {
            reactScrollView.reactSmoothScrollTo(reactScrollView.getScrollX(), height);
        } else {
            reactScrollView.scrollTo(reactScrollView.getScrollX(), height);
        }
    }

    @ReactPropGroup(customType = "Color", names = {ViewProps.BORDER_COLOR, ViewProps.BORDER_LEFT_COLOR, ViewProps.BORDER_RIGHT_COLOR, ViewProps.BORDER_TOP_COLOR, ViewProps.BORDER_BOTTOM_COLOR})
    public void setBorderColor(ReactScrollView reactScrollView, int i11, @Nullable Integer num) {
        BackgroundStyleApplicator.setBorderColor(reactScrollView, LogicalEdge.ALL, num);
    }

    @ReactProp(name = "borderStyle")
    public void setBorderStyle(ReactScrollView reactScrollView, @Nullable String str) {
        BackgroundStyleApplicator.setBorderStyle(reactScrollView, str == null ? null : BorderStyle.fromString(str));
    }

    @ReactProp(name = "fadingEdgeLength")
    public void setFadingEdgeLength(ReactScrollView reactScrollView, int i11) {
        if (i11 > 0) {
            reactScrollView.setVerticalFadingEdgeEnabled(true);
            reactScrollView.setFadingEdgeLength(i11);
        } else {
            reactScrollView.setVerticalFadingEdgeEnabled(false);
            reactScrollView.setFadingEdgeLength(0);
        }
    }

    @ReactProp(name = "isInvertedVirtualizedList")
    public void setIsInvertedVirtualizedList(ReactScrollView reactScrollView, boolean z11) {
        if (z11) {
            reactScrollView.setVerticalScrollbarPosition(1);
        } else {
            reactScrollView.setVerticalScrollbarPosition(0);
        }
    }

    @ReactProp(name = "maintainVisibleContentPosition")
    public void setMaintainVisibleContentPosition(ReactScrollView reactScrollView, ReadableMap readableMap) {
        if (readableMap != null) {
            reactScrollView.setMaintainVisibleContentPosition(MaintainVisibleScrollPositionHelper.Config.fromReadableMap(readableMap));
        } else {
            reactScrollView.setMaintainVisibleContentPosition(null);
        }
    }

    @ReactProp(name = "persistentScrollbar")
    public void setPersistentScrollbar(ReactScrollView reactScrollView, boolean z11) {
        reactScrollView.setScrollbarFadingEnabled(!z11);
    }

    @ReactProp(name = "snapToOffsets")
    public void setSnapToOffsets(ReactScrollView reactScrollView, @Nullable ReadableArray readableArray) {
        if (readableArray == null || readableArray.size() == 0) {
            reactScrollView.setSnapOffsets(null);
            return;
        }
        float displayMetricDensity = PixelUtil.getDisplayMetricDensity();
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < readableArray.size(); i11++) {
            arrayList.add(Integer.valueOf((int) (readableArray.getDouble(i11) * ((double) displayMetricDensity))));
        }
        reactScrollView.setSnapOffsets(arrayList);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @Nullable
    public Object updateState(ReactScrollView reactScrollView, ReactStylesDiffMap reactStylesDiffMap, StateWrapper stateWrapper) {
        reactScrollView.setStateWrapper(stateWrapper);
        return null;
    }

    public static Map<String, Object> createExportedCustomDirectEventTypeConstants() {
        return MapBuilder.builder().put(ScrollEventType.getJSEventName(ScrollEventType.SCROLL), MapBuilder.m10222of("registrationName", "onScroll")).put(ScrollEventType.getJSEventName(ScrollEventType.BEGIN_DRAG), MapBuilder.m10222of("registrationName", "onScrollBeginDrag")).put(ScrollEventType.getJSEventName(ScrollEventType.END_DRAG), MapBuilder.m10222of("registrationName", "onScrollEndDrag")).put(ScrollEventType.getJSEventName(ScrollEventType.MOMENTUM_BEGIN), MapBuilder.m10222of("registrationName", "onMomentumScrollBegin")).put(ScrollEventType.getJSEventName(ScrollEventType.MOMENTUM_END), MapBuilder.m10222of("registrationName", "onMomentumScrollEnd")).build();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @Nullable
    public Map<String, Integer> getCommandsMap() {
        return ReactScrollViewCommandHelper.getCommandsMap();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @Nullable
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        exportedCustomDirectEventTypeConstants.putAll(createExportedCustomDirectEventTypeConstants());
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(ReactScrollView reactScrollView, int i11, @Nullable ReadableArray readableArray) {
        ReactScrollViewCommandHelper.receiveCommand(this, reactScrollView, i11, readableArray);
    }

    @ReactPropGroup(defaultFloat = FloatCompanionObject.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public void setBorderRadius(ReactScrollView reactScrollView, int i11, float f11) {
        LengthPercentage lengthPercentage;
        if (Float.isNaN(f11)) {
            lengthPercentage = null;
        } else {
            lengthPercentage = new LengthPercentage(f11, LengthPercentageType.POINT);
        }
        BackgroundStyleApplicator.setBorderRadius(reactScrollView, BorderRadiusProp.values()[i11], lengthPercentage);
    }

    @ReactPropGroup(defaultFloat = FloatCompanionObject.NaN, names = {ViewProps.BORDER_WIDTH, ViewProps.BORDER_LEFT_WIDTH, ViewProps.BORDER_RIGHT_WIDTH, ViewProps.BORDER_TOP_WIDTH, ViewProps.BORDER_BOTTOM_WIDTH})
    public void setBorderWidth(ReactScrollView reactScrollView, int i11, float f11) {
        BackgroundStyleApplicator.setBorderWidth(reactScrollView, LogicalEdge.values()[i11], Float.valueOf(f11));
    }

    @ReactProp(customType = "Color", defaultInt = 0, name = "endFillColor")
    public void setBottomFillColor(ReactScrollView reactScrollView, int i11) {
        reactScrollView.setEndFillColor(i11);
    }

    @ReactProp(customType = "Point", name = "contentOffset")
    public void setContentOffset(ReactScrollView reactScrollView, ReadableMap readableMap) {
        reactScrollView.setContentOffset(readableMap);
    }

    @ReactProp(name = "decelerationRate")
    public void setDecelerationRate(ReactScrollView reactScrollView, float f11) {
        reactScrollView.setDecelerationRate(f11);
    }

    @ReactProp(name = "disableIntervalMomentum")
    public void setDisableIntervalMomentum(ReactScrollView reactScrollView, boolean z11) {
        reactScrollView.setDisableIntervalMomentum(z11);
    }

    @ReactProp(name = "nestedScrollEnabled")
    public void setNestedScrollEnabled(ReactScrollView reactScrollView, boolean z11) {
        ViewCompat.setNestedScrollingEnabled(reactScrollView, z11);
    }

    @ReactProp(name = "overScrollMode")
    public void setOverScrollMode(ReactScrollView reactScrollView, String str) {
        reactScrollView.setOverScrollMode(ReactScrollViewHelper.parseOverScrollMode(str));
    }

    @ReactProp(name = ViewProps.OVERFLOW)
    public void setOverflow(ReactScrollView reactScrollView, @Nullable String str) {
        reactScrollView.setOverflow(str);
    }

    @ReactProp(name = "pagingEnabled")
    public void setPagingEnabled(ReactScrollView reactScrollView, boolean z11) {
        reactScrollView.setPagingEnabled(z11);
    }

    @ReactProp(name = ViewProps.POINTER_EVENTS)
    public void setPointerEvents(ReactScrollView reactScrollView, @Nullable String str) {
        reactScrollView.setPointerEvents(PointerEvents.parsePointerEvents(str));
    }

    @ReactProp(name = ReactClippingViewGroupHelper.PROP_REMOVE_CLIPPED_SUBVIEWS)
    public void setRemoveClippedSubviews(ReactScrollView reactScrollView, boolean z11) {
        reactScrollView.setRemoveClippedSubviews(z11);
    }

    @ReactProp(defaultBoolean = true, name = "scrollEnabled")
    public void setScrollEnabled(ReactScrollView reactScrollView, boolean z11) {
        reactScrollView.setScrollEnabled(z11);
        reactScrollView.setFocusable(z11);
    }

    @ReactProp(name = "scrollEventThrottle")
    public void setScrollEventThrottle(ReactScrollView reactScrollView, int i11) {
        reactScrollView.setScrollEventThrottle(i11);
    }

    @ReactProp(name = "scrollPerfTag")
    public void setScrollPerfTag(ReactScrollView reactScrollView, @Nullable String str) {
        reactScrollView.setScrollPerfTag(str);
    }

    @ReactProp(name = "sendMomentumEvents")
    public void setSendMomentumEvents(ReactScrollView reactScrollView, boolean z11) {
        reactScrollView.setSendMomentumEvents(z11);
    }

    @ReactProp(defaultBoolean = true, name = "showsVerticalScrollIndicator")
    public void setShowsVerticalScrollIndicator(ReactScrollView reactScrollView, boolean z11) {
        reactScrollView.setVerticalScrollBarEnabled(z11);
    }

    @ReactProp(name = "snapToAlignment")
    public void setSnapToAlignment(ReactScrollView reactScrollView, String str) {
        reactScrollView.setSnapToAlignment(ReactScrollViewHelper.parseSnapToAlignment(str));
    }

    @ReactProp(name = "snapToEnd")
    public void setSnapToEnd(ReactScrollView reactScrollView, boolean z11) {
        reactScrollView.setSnapToEnd(z11);
    }

    @ReactProp(name = "snapToInterval")
    public void setSnapToInterval(ReactScrollView reactScrollView, float f11) {
        reactScrollView.setSnapInterval((int) (f11 * PixelUtil.getDisplayMetricDensity()));
    }

    @ReactProp(name = "snapToStart")
    public void setSnapToStart(ReactScrollView reactScrollView, boolean z11) {
        reactScrollView.setSnapToStart(z11);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(ReactScrollView reactScrollView, String str, @Nullable ReadableArray readableArray) {
        ReactScrollViewCommandHelper.receiveCommand(this, reactScrollView, str, readableArray);
    }

    @ReactProp(name = "horizontal")
    public void setHorizontal(ReactScrollView reactScrollView, boolean z11) {
    }
}
