package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;

/* JADX INFO: loaded from: classes45.dex */
public interface RNSVGFeColorMatrixManagerInterface<T extends View> {
    void setHeight(T t11, Dynamic dynamic);

    void setIn1(T t11, @Nullable String str);

    void setResult(T t11, @Nullable String str);

    void setType(T t11, @Nullable String str);

    void setValues(T t11, @Nullable ReadableArray readableArray);

    void setWidth(T t11, Dynamic dynamic);

    void setX(T t11, Dynamic dynamic);

    void setY(T t11, Dynamic dynamic);
}
