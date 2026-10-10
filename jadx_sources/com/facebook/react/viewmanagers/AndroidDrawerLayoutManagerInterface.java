package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes45.dex */
public interface AndroidDrawerLayoutManagerInterface<T extends View> {
    void closeDrawer(T t11);

    void openDrawer(T t11);

    void setDrawerBackgroundColor(T t11, @Nullable Integer num);

    void setDrawerLockMode(T t11, @Nullable String str);

    void setDrawerPosition(T t11, @Nullable String str);

    void setDrawerWidth(T t11, @Nullable Float f11);

    void setKeyboardDismissMode(T t11, @Nullable String str);

    void setStatusBarBackgroundColor(T t11, @Nullable Integer num);
}
