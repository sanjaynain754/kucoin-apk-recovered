package com.kubi.sdk.site.knb;

import android.content.Context;
import b00.InterfaceC4419e0;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.site.SiteBizConfigKey;
import com.kubi.sdk.site.SiteExtConfigKey;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.sdk.site.config.SiteConfigManager;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.sdk.site.knb.b, reason: from Kotlin metadata */
/* JADX INFO: compiled from: KCFlutterBridgeSiteCallImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u001c\u0010\n\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u00050\u000bH\u0016J>\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\u001c\u0010\n\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u00050\u000bH\u0016J6\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u001c\u0010\n\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u00050\u000bH\u0016¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/sdk/site/knb/KCFlutterBridgeSiteCallImpl;", "Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeSiteCall;", "<init>", "()V", "querySiteBizConfig", "", "ctx", "Landroid/content/Context;", "configKey", "", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "Lcom/kubi/sdk/protocol/ProtocolException;", "querySiteExtConfig", "configType", "querySiteVisibleConfig", "", "LSiteConfig_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KCFlutterBridgeSiteCallImpl implements InterfaceC4419e0 {
    @Override // b00.InterfaceC4419e0
    /* JADX INFO: renamed from: a */
    public void mo4116a(@NotNull Context ctx, @NotNull String configKey, @NotNull Function2<? super String, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(configKey, "configKey");
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.invoke(SiteConfigManager.f47884a.m58046m(SiteBizConfigKey.INSTANCE.tryParse(configKey)), null);
    }

    @Override // b00.InterfaceC4419e0
    /* JADX INFO: renamed from: b */
    public void mo4117b(@NotNull Context ctx, @NotNull String configKey, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(configKey, "configKey");
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.invoke(Boolean.valueOf(SiteConfigManager.f47884a.m58042i(SiteVisibleConfigKey.INSTANCE.tryParse(configKey))), null);
    }

    @Override // b00.InterfaceC4419e0
    /* JADX INFO: renamed from: c */
    public void mo4118c(@NotNull Context ctx, @NotNull String configType, @NotNull String configKey, @NotNull Function2<? super String, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(configType, "configType");
        Intrinsics.checkNotNullParameter(configKey, "configKey");
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.invoke(SiteConfigManager.f47884a.m58044k(SiteExtConfigKey.INSTANCE.tryParse(configType, configKey)), null);
    }
}
