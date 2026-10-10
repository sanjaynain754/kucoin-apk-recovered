package com.revolut.revolutpay.p123ui.controller;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import com.tencent.qcloud.tuicore.TUIConstants;
import ha0.InterfaceC38153a;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.revolut.revolutpay.ui.controller.a */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m90084d2 = {"Lcom/revolut/revolutpay/ui/controller/a;", "Lcom/revolut/revolutpay/ui/controller/RevolutPayController;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "orderToken", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "Lha0/a;", TUIConstants.TUIChat.CALL_BACK, "", "n", "(Ljava/lang/String;Landroidx/lifecycle/Lifecycle;Lha0/a;)V", "revolut_pay_sdk_2_0_release"}, m90085k = 1, m90086mv = {1, 7, 1}, m90088xi = 48)
public final class C27546a extends RevolutPayController {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27546a(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: n */
    public final void m68316n(@NotNull String orderToken, @NotNull Lifecycle lifecycle, @NotNull InterfaceC38153a callback) {
        Intrinsics.checkNotNullParameter(orderToken, "orderToken");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(callback, "callback");
        m68313k(orderToken);
        m68308f(lifecycle);
        m68312j(callback);
        m68309g();
    }
}
