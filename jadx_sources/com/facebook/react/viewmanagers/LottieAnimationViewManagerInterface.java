package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes45.dex */
public interface LottieAnimationViewManagerInterface<T extends View> {
    void pause(T t11);

    void play(T t11, int i11, int i12);

    void reset(T t11);

    void resume(T t11);

    void setAutoPlay(T t11, boolean z11);

    void setCacheComposition(T t11, boolean z11);

    void setColorFilters(T t11, @Nullable ReadableArray readableArray);

    void setDummy(T t11, @Nullable ReadableMap readableMap);

    void setEnableMergePathsAndroidForKitKatAndAbove(T t11, boolean z11);

    void setEnableSafeModeAndroid(T t11, boolean z11);

    void setHardwareAccelerationAndroid(T t11, boolean z11);

    void setImageAssetsFolder(T t11, @Nullable String str);

    void setLoop(T t11, boolean z11);

    void setProgress(T t11, float f11);

    void setRenderMode(T t11, @Nullable String str);

    void setResizeMode(T t11, @Nullable String str);

    void setSourceDotLottieURI(T t11, @Nullable String str);

    void setSourceJson(T t11, @Nullable String str);

    void setSourceName(T t11, @Nullable String str);

    void setSourceURL(T t11, @Nullable String str);

    void setSpeed(T t11, double d11);

    void setTextFiltersAndroid(T t11, @Nullable ReadableArray readableArray);

    void setTextFiltersIOS(T t11, @Nullable ReadableArray readableArray);
}
