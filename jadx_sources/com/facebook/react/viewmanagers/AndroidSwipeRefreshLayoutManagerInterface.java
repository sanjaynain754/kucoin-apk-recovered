package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ReadableArray;

/* JADX INFO: loaded from: classes45.dex */
public interface AndroidSwipeRefreshLayoutManagerInterface<T extends View> {
    void setColors(T t11, @Nullable ReadableArray readableArray);

    void setEnabled(T t11, boolean z11);

    void setNativeRefreshing(T t11, boolean z11);

    void setProgressBackgroundColor(T t11, @Nullable Integer num);

    void setProgressViewOffset(T t11, float f11);

    void setRefreshing(T t11, boolean z11);

    void setSize(T t11, @Nullable String str);
}
