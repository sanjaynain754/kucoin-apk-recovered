package com.kubi.sdk.site.knb;

import android.content.Context;
import c00.InterfaceC4768o;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.site.config.SiteConfigManager;
import com.kubi.sdk.site.config.data.SiteConfigEntity;
import com.kubi.utils.extensions.core.C27029c;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.sdk.site.knb.c, reason: from Kotlin metadata */
/* JADX INFO: compiled from: KCHybridBridgeSiteConfigCallImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u001c\u0010\n\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00050\u000bH\u0016¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/sdk/site/knb/KCHybridBridgeSiteConfigCallImpl;", "Lcom/kubi/sdk/protocol/hybrid/protocol/KCHybridBridgeSiteConfigCall;", "<init>", "()V", "getSiteConfig", "", "ctx", "Landroid/content/Context;", "obj", "Ljava/lang/Object;", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "", "Lcom/kubi/sdk/protocol/ProtocolException;", "LSiteConfig_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KCHybridBridgeSiteConfigCallImpl implements InterfaceC4768o {
    @Override // c00.InterfaceC4768o
    /* JADX INFO: renamed from: a */
    public void mo4821a(@NotNull Context ctx, @Nullable Object obj, @NotNull Function2<? super String, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        SiteConfigEntity siteConfigEntityM58039f = SiteConfigManager.f47884a.m58039f();
        if (siteConfigEntityM58039f != null) {
            callback.invoke(C27029c.m66606i(siteConfigEntityM58039f), null);
        } else {
            callback.invoke("{}", new ProtocolException("get site config error", null, null, false, 14, null));
        }
    }
}
