package com.kubi.sdk.site.jsapi;

import com.facebook.react.bridge.ReactApplicationContext;
import com.google.auto.service.AutoService;
import com.kubi.p110rn.core.turbo.NativeSiteConfigTurboModuleAbs;
import com.kubi.sdk.site.config.SiteConfigManager;
import com.kubi.sdk.site.config.data.SiteConfigEntity;
import com.kubi.utils.extensions.core.C27029c;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCTurboSiteConfigModuleImpl.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\u0006\u001a\u00020\u00072\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00070\tH\u0016¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/sdk/site/jsapi/KCTurboSiteConfigModuleImpl;", "Lcom/kubi/rn/core/turbo/NativeSiteConfigTurboModuleAbs;", "ctx", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getSiteConfig", "", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "", "LSiteConfig_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@AutoService({NativeSiteConfigTurboModuleAbs.class})
public final class KCTurboSiteConfigModuleImpl extends NativeSiteConfigTurboModuleAbs {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KCTurboSiteConfigModuleImpl(@NotNull ReactApplicationContext ctx) {
        super(ctx);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
    }

    @Override // com.kubi.p110rn.core.turbo.NativeSiteConfigTurboModuleAbs
    public void getSiteConfig(@NotNull Function1<? super String, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        SiteConfigEntity siteConfigEntityM58039f = SiteConfigManager.f47884a.m58039f();
        if (siteConfigEntityM58039f != null) {
            callback.invoke(C27029c.m66606i(siteConfigEntityM58039f));
        } else {
            callback.invoke("{}");
        }
    }
}
