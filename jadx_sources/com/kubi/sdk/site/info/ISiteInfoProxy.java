package com.kubi.sdk.site.info;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.sdk.site.info.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: ISiteInfoProxy.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\n\u001a\u00020\u0003H&J\u0016\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\rJ\u000e\u0010\u000e\u001a\u00020\u0007H¦@¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0003H&R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/sdk/site/info/ISiteInfoProxy;", "", "defaultSiteType", "", "getDefaultSiteType", "()Ljava/lang/String;", "forceRedirect", "", "getForceRedirect", "()Z", "loadSiteType", "fetchSiteType", "defaultValue", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchSupportSiteConfig", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveSiteType", "", "siteType", "LSiteConfig_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface ISiteInfoProxy {
    @NotNull
    /* JADX INFO: renamed from: a */
    default String m58116a() {
        return "global";
    }
}
