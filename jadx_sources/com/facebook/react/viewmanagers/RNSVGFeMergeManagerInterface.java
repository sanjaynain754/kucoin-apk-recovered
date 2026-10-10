package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;

/* JADX INFO: loaded from: classes45.dex */
public interface RNSVGFeMergeManagerInterface<T extends View> {
    void setHeight(T t11, Dynamic dynamic);

    void setNodes(T t11, @Nullable ReadableArray readableArray);

    void setResult(T t11, @Nullable String str);

    void setWidth(T t11, Dynamic dynamic);

    void setX(T t11, Dynamic dynamic);

    void setY(T t11, Dynamic dynamic);
}
