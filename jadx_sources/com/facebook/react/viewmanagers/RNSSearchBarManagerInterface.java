package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes45.dex */
public interface RNSSearchBarManagerInterface<T extends View> {
    void blur(T t11);

    void cancelSearch(T t11);

    void clearText(T t11);

    void focus(T t11);

    void setAutoCapitalize(T t11, @Nullable String str);

    void setBarTintColor(T t11, @Nullable Integer num);

    void setCancelButtonText(T t11, @Nullable String str);

    void setDisableBackButtonOverride(T t11, boolean z11);

    void setHeaderIconColor(T t11, @Nullable Integer num);

    void setHideNavigationBar(T t11, boolean z11);

    void setHideWhenScrolling(T t11, boolean z11);

    void setHintTextColor(T t11, @Nullable Integer num);

    void setInputType(T t11, @Nullable String str);

    void setObscureBackground(T t11, boolean z11);

    void setPlaceholder(T t11, @Nullable String str);

    void setPlacement(T t11, @Nullable String str);

    void setShouldShowHintSearchIcon(T t11, boolean z11);

    void setText(T t11, String str);

    void setTextColor(T t11, @Nullable Integer num);

    void setTintColor(T t11, @Nullable Integer num);

    void toggleCancelButton(T t11, boolean z11);
}
