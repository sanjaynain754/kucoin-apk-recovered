package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.Dynamic;

/* JADX INFO: loaded from: classes45.dex */
public interface RNSVGFilterManagerInterface<T extends View> {
    void setFilterUnits(T t11, @Nullable String str);

    void setHeight(T t11, Dynamic dynamic);

    void setName(T t11, @Nullable String str);

    void setPrimitiveUnits(T t11, @Nullable String str);

    void setWidth(T t11, Dynamic dynamic);

    void setX(T t11, Dynamic dynamic);

    void setY(T t11, Dynamic dynamic);
}
