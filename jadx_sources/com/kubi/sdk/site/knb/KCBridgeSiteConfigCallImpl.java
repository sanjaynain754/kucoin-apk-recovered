package com.kubi.sdk.site.knb;

import android.content.Context;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.site.config.SiteConfigManager;
import com.kubi.sdk.site.config.data.SiteConfigEntity;
import com.kubi.utils.extensions.core.C27029c;
import com.tencent.qcloud.tuicore.TUIConstants;
import e00.InterfaceC37018j;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.sdk.site.knb.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: KCBridgeSiteConfigCallImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u001c\u0010\b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00050\tH\u0016¨\u0006\f"}, m90084d2 = {"Lcom/kubi/sdk/site/knb/KCBridgeSiteConfigCallImpl;", "Lcom/kubi/sdk/protocol/rn/protocol/KCBridgeSiteConfigCall;", "<init>", "()V", "getSiteConfig", "", "ctx", "Landroid/content/Context;", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "", "Lcom/kubi/sdk/protocol/ProtocolException;", "LSiteConfig_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KCBridgeSiteConfigCallImpl implements InterfaceC37018j {
    @Override // e00.InterfaceC37018j
    /* JADX INFO: renamed from: a */
    public void mo58129a(@NotNull Context ctx, @NotNull Function2<? super String, ? super ProtocolException, Unit> callback) {
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
