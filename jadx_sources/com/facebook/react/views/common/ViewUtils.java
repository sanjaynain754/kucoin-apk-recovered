package com.facebook.react.views.common;

import android.view.View;
import com.facebook.react.C5771R;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;

/* JADX INFO: compiled from: ViewUtils.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007¨\u0006\b"}, m90084d2 = {"Lcom/facebook/react/views/common/ViewUtils;", "", "<init>", "()V", "getTestId", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class ViewUtils {

    @NotNull
    public static final ViewUtils INSTANCE = new ViewUtils();

    @JvmStatic
    @Nullable
    public static final String getTestId(@Nullable View view) {
        Object tag = view != null ? view.getTag(C5771R.id.react_test_id) : null;
        if (tag instanceof String) {
            return (String) tag;
        }
        return null;
    }

    private ViewUtils() {
    }
}
