package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes45.dex */
public interface RNSScreenManagerInterface<T extends View> {
    void setActivityState(T t11, float f11);

    void setCustomAnimationOnSwipe(T t11, boolean z11);

    void setFullScreenSwipeEnabled(T t11, boolean z11);

    void setFullScreenSwipeShadowEnabled(T t11, boolean z11);

    void setGestureEnabled(T t11, boolean z11);

    void setGestureResponseDistance(T t11, @Nullable ReadableMap readableMap);

    void setHideKeyboardOnSwipe(T t11, boolean z11);

    void setHomeIndicatorHidden(T t11, boolean z11);

    void setNativeBackButtonDismissalEnabled(T t11, boolean z11);

    void setNavigationBarColor(T t11, @Nullable Integer num);

    void setNavigationBarHidden(T t11, boolean z11);

    void setNavigationBarTranslucent(T t11, boolean z11);

    void setPreventNativeDismiss(T t11, boolean z11);

    void setReplaceAnimation(T t11, @Nullable String str);

    void setScreenOrientation(T t11, @Nullable String str);

    void setSheetAllowedDetents(T t11, @Nullable ReadableArray readableArray);

    void setSheetCornerRadius(T t11, float f11);

    void setSheetElevation(T t11, int i11);

    void setSheetExpandsWhenScrolledToEdge(T t11, boolean z11);

    void setSheetGrabberVisible(T t11, boolean z11);

    void setSheetInitialDetent(T t11, int i11);

    void setSheetLargestUndimmedDetent(T t11, int i11);

    void setStackAnimation(T t11, @Nullable String str);

    void setStackPresentation(T t11, @Nullable String str);

    void setStatusBarAnimation(T t11, @Nullable String str);

    void setStatusBarColor(T t11, @Nullable Integer num);

    void setStatusBarHidden(T t11, boolean z11);

    void setStatusBarStyle(T t11, @Nullable String str);

    void setStatusBarTranslucent(T t11, boolean z11);

    void setSwipeDirection(T t11, @Nullable String str);

    void setTransitionDuration(T t11, int i11);
}
