package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes45.dex */
public interface AndroidProgressBarManagerInterface<T extends View> {
    void setAnimating(T t11, boolean z11);

    void setColor(T t11, @Nullable Integer num);

    void setIndeterminate(T t11, boolean z11);

    void setProgress(T t11, double d11);

    void setStyleAttr(T t11, @Nullable String str);

    void setTestID(T t11, @Nullable String str);

    void setTypeAttr(T t11, @Nullable String str);
}
