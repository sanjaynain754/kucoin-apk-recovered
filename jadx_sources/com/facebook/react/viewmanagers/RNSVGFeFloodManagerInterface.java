package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.Dynamic;

/* JADX INFO: loaded from: classes45.dex */
public interface RNSVGFeFloodManagerInterface<T extends View> {
    void setFloodColor(T t11, Dynamic dynamic);

    void setFloodOpacity(T t11, float f11);

    void setHeight(T t11, Dynamic dynamic);

    void setResult(T t11, @Nullable String str);

    void setWidth(T t11, Dynamic dynamic);

    void setX(T t11, Dynamic dynamic);

    void setY(T t11, Dynamic dynamic);
}
