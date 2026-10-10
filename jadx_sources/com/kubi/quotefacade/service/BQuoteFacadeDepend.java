package com.kubi.quotefacade.service;

import com.kubi.copytrading.ICopyTradingService;
import com.kubi.home.api.IHomeService;
import com.kubi.kumex.api.IKuMexService;
import com.kubi.spot.api.ISpotService;
import com.kubi.user.api.IUserService;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.quotefacade.service.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: BQuoteFacadeDepend.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\u000f¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/quotefacade/service/BQuoteFacadeDepend;", "", "<init>", "()V", "getSpotService", "Lcom/kubi/spot/api/ISpotService;", "getKuMexService", "Lcom/kubi/kumex/api/IKuMexService;", "getCopyTradingService", "Lcom/kubi/copytrading/ICopyTradingService;", "getUserService", "Lcom/kubi/user/api/IUserService;", "getMarginService", "Lcom/kubi/margin/api/IMarginService;", "getHomeService", "Lcom/kubi/home/api/IHomeService;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class BQuoteFacadeDepend {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final BQuoteFacadeDepend f42592a = new BQuoteFacadeDepend();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final ICopyTradingService m53021a() {
        return ICopyTradingService.f19723a.get();
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final IHomeService m53022b() {
        return IHomeService.f25434a.get();
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final IKuMexService m53023c() {
        return IKuMexService.f28731a.get();
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final ISpotService m53024d() {
        return ISpotService.f49646a.get();
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final IUserService m53025e() {
        return IUserService.a.get();
    }
}
