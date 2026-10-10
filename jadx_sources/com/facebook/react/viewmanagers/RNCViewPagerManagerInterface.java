package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes45.dex */
public interface RNCViewPagerManagerInterface<T extends View> {
    void setInitialPage(T t11, int i11);

    void setKeyboardDismissMode(T t11, @Nullable String str);

    void setLayoutDirection(T t11, @Nullable String str);

    void setOffscreenPageLimit(T t11, int i11);

    void setOrientation(T t11, @Nullable String str);

    void setOverScrollMode(T t11, @Nullable String str);

    void setOverdrag(T t11, boolean z11);

    void setPage(T t11, int i11);

    void setPageMargin(T t11, int i11);

    void setPageWithoutAnimation(T t11, int i11);

    void setScrollEnabled(T t11, boolean z11);

    void setScrollEnabledImperatively(T t11, boolean z11);
}
