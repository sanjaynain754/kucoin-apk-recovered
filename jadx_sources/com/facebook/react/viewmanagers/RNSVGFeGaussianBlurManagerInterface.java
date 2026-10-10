package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.Dynamic;

/* JADX INFO: loaded from: classes45.dex */
public interface RNSVGFeGaussianBlurManagerInterface<T extends View> {
    void setEdgeMode(T t11, @Nullable String str);

    void setHeight(T t11, Dynamic dynamic);

    void setIn1(T t11, @Nullable String str);

    void setResult(T t11, @Nullable String str);

    void setStdDeviationX(T t11, float f11);

    void setStdDeviationY(T t11, float f11);

    void setWidth(T t11, Dynamic dynamic);

    void setX(T t11, Dynamic dynamic);

    void setY(T t11, Dynamic dynamic);
}
