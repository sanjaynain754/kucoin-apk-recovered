package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes45.dex */
public interface RNCSafeAreaViewManagerInterface<T extends View> {
    void setEdges(T t11, @Nullable ReadableMap readableMap);

    void setMode(T t11, @Nullable String str);
}
