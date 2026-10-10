package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes45.dex */
public interface RNGestureHandlerButtonManagerInterface<T extends View> {
    void setBorderColor(T t11, @Nullable Integer num);

    void setBorderStyle(T t11, @Nullable String str);

    void setBorderWidth(T t11, float f11);

    void setBorderless(T t11, boolean z11);

    void setEnabled(T t11, boolean z11);

    void setExclusive(T t11, boolean z11);

    void setForeground(T t11, boolean z11);

    void setRippleColor(T t11, @Nullable Integer num);

    void setRippleRadius(T t11, int i11);

    void setTouchSoundDisabled(T t11, boolean z11);
}
