package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes45.dex */
public interface AndroidSwitchManagerInterface<T extends View> {
    void setDisabled(T t11, boolean z11);

    void setEnabled(T t11, boolean z11);

    void setNativeValue(T t11, boolean z11);

    void setOn(T t11, boolean z11);

    void setThumbColor(T t11, @Nullable Integer num);

    void setThumbTintColor(T t11, @Nullable Integer num);

    void setTrackColorForFalse(T t11, @Nullable Integer num);

    void setTrackColorForTrue(T t11, @Nullable Integer num);

    void setTrackTintColor(T t11, @Nullable Integer num);

    void setValue(T t11, boolean z11);
}
