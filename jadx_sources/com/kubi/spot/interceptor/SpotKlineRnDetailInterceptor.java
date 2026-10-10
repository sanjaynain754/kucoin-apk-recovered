package com.kubi.spot.interceptor;

import com.kubi.quotefacade.api.IQuoteFacadeService;
import com.kubi.search.searchresult.SearchCategory$Companion;
import org.jetbrains.annotations.NotNull;
import p026ay.C4400a;
import p846zx.InterfaceC46935a;
import p846zx.InterfaceC46936b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.spot.interceptor.b, reason: from Kotlin metadata */
/* JADX INFO: compiled from: SpotKlineRnDetailInterceptor.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"Lcom/kubi/spot/interceptor/SpotKlineRnDetailInterceptor;", "Lcom/kubi/router/interceptor/IInterceptor;", "<init>", "()V", "intercept", "", "chain", "Lcom/kubi/router/interceptor/IChain;", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SpotKlineRnDetailInterceptor implements InterfaceC46936b {
    @Override // p846zx.InterfaceC46936b
    /* JADX INFO: renamed from: b */
    public boolean mo4304b(@NotNull InterfaceC46935a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        C4400a postcard = chain.getPostcard();
        if (IQuoteFacadeService.m50675t(IQuoteFacadeService.f41383a.get(), postcard.getBundle().getString("symbol"), SearchCategory$Companion.SPOT, null, 4, null)) {
            return true;
        }
        return chain.mo103413a(postcard);
    }
}
