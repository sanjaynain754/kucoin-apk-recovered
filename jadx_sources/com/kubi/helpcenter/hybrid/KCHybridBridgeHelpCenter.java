package com.kubi.helpcenter.hybrid;

import android.content.Context;
import androidx.lifecycle.LifecycleOwnerKt;
import c00.InterfaceC4757d;
import com.appsflyer.AppsFlyerProperties;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.protocol.ProtocolException;
import com.tencent.qcloud.tuicore.TUIConstants;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCHybridBridgeHelpCenter.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JJ\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u001c\u0010\r\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00050\u000eH\u0016¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/helpcenter/hybrid/KCHybridBridgeHelpCenter;", "Lcom/kubi/sdk/protocol/hybrid/protocol/KCHybridBridgeHelpCenterCall;", "<init>", "()V", "staffService", "", "ctx", "Landroid/content/Context;", "obj", "Ljava/lang/Object;", AppsFlyerProperties.CHANNEL, "", "source", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "", "Lcom/kubi/sdk/protocol/ProtocolException;", "Companion", "HelpCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KCHybridBridgeHelpCenter implements InterfaceC4757d {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f25328a = new Companion(null);

    /* JADX INFO: compiled from: KCHybridBridgeHelpCenter.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/helpcenter/hybrid/KCHybridBridgeHelpCenter$Companion;", "", "<init>", "()V", "TAG", "", "HelpCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Override // c00.InterfaceC4757d
    /* JADX INFO: renamed from: a */
    public void mo4803a(@NotNull Context ctx, @Nullable Object obj, @NotNull String channel, @Nullable String str, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!Intrinsics.areEqual(channel, "ada")) {
            callback.invoke(Boolean.FALSE, new ProtocolException("channel not allow", null, null, false, 14, null));
            return;
        }
        BaseActivity baseActivity = ctx instanceof BaseActivity ? (BaseActivity) ctx : null;
        if (baseActivity == null) {
            callback.invoke(Boolean.FALSE, null);
        } else {
            C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(baseActivity), null, null, new KCHybridBridgeHelpCenter$staffService$1(str, baseActivity, callback, null), 3, null);
        }
    }
}
