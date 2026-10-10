package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes45.dex */
public interface AndroidBlurViewManagerInterface<T extends View> {
    void setAutoUpdate(T t11, boolean z11);

    void setBlurAmount(T t11, int i11);

    void setBlurRadius(T t11, int i11);

    void setBlurType(T t11, @Nullable String str);

    void setDownsampleFactor(T t11, int i11);

    void setEnabled(T t11, boolean z11);

    void setOverlayColor(T t11, @Nullable Integer num);
}
