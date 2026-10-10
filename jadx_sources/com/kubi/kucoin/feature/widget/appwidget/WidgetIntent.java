package com.kubi.kucoin.feature.widget.appwidget;

import android.content.Intent;
import com.kubi.sdk.BaseApplication;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WidgetIntent.kt */
/* JADX INFO: loaded from: classes18.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/kucoin/feature/widget/appwidget/WidgetIntent;", "Landroid/content/Intent;", TUIConstants.TIMPush.NOTIFICATION.ACTION, "", "<init>", "(Ljava/lang/String;)V", "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class WidgetIntent extends Intent {
    public WidgetIntent(@NotNull String action) {
        Intrinsics.checkNotNullParameter(action, "action");
        setAction(action);
        setPackage(BaseApplication.INSTANCE.get().getPackageName());
    }
}
