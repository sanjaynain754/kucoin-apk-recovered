package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.Dynamic;

/* JADX INFO: loaded from: classes45.dex */
public interface RNSVGFeCompositeManagerInterface<T extends View> {
    void setHeight(T t11, Dynamic dynamic);

    void setIn1(T t11, @Nullable String str);

    void setIn2(T t11, @Nullable String str);

    void setK1(T t11, float f11);

    void setK2(T t11, float f11);

    void setK3(T t11, float f11);

    void setK4(T t11, float f11);

    void setOperator1(T t11, @Nullable String str);

    void setResult(T t11, @Nullable String str);

    void setWidth(T t11, Dynamic dynamic);

    void setX(T t11, Dynamic dynamic);

    void setY(T t11, Dynamic dynamic);
}
