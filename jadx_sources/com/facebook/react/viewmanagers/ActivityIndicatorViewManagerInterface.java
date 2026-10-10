package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes45.dex */
public interface ActivityIndicatorViewManagerInterface<T extends View> {
    void setAnimating(T t11, boolean z11);

    void setColor(T t11, @Nullable Integer num);

    void setHidesWhenStopped(T t11, boolean z11);

    void setSize(T t11, @Nullable String str);
}
