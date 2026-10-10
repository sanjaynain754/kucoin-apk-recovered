package com.th3rdwave.safeareacontext;

import android.content.Context;
import android.view.View;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UIManagerHelperCompat.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"getReactContext", "Lcom/facebook/react/bridge/ReactContext;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "getSurfaceId", "", "context", "Landroid/content/Context;", "react-native-safe-area-context_release"}, m90085k = 2, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class UIManagerHelperCompatKt {
    @NotNull
    public static final ReactContext getReactContext(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ReactContext reactContext = UIManagerHelper.getReactContext(view);
        Intrinsics.checkNotNullExpressionValue(reactContext, "getReactContext(...)");
        return reactContext;
    }

    public static final int getSurfaceId(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return UIManagerHelper.getSurfaceId(context);
    }
}
