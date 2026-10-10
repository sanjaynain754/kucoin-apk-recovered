package com.kubi.kumex.service;

import com.kubi.copytrading.ICopyTradingService;
import com.kubi.mine.api.service.IMineService;
import com.kubi.otc.api.IOtcService;
import com.kubi.quotefacade.api.IQuoteFacadeService;
import com.kubi.share.api.IShareService;
import com.kubi.tradingbotkit.api.ITradingBotService;
import com.kubi.user.api.IUserService;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.kumex.service.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: KuMexDepend.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0015¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/kumex/service/KuMexDepend;", "", "<init>", "()V", "getUserService", "Lcom/kubi/user/api/IUserService;", "getShareService", "Lcom/kubi/share/api/IShareService;", "getOtcService", "Lcom/kubi/otc/api/IOtcService;", "isHasOpenContract", "", "getMineService", "Lcom/kubi/mine/api/service/IMineService;", "getCopyTradingService", "Lcom/kubi/copytrading/ICopyTradingService;", "getQuoteFacadeService", "Lcom/kubi/quotefacade/api/IQuoteFacadeService;", "getBotService", "Lcom/kubi/tradingbotkit/api/ITradingBotService;", "getRnService", "Lcom/kubi/rn/api/IReactNativeService;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KuMexDepend {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final KuMexDepend f30378a = new KuMexDepend();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final ITradingBotService m35899a() {
        return ITradingBotService.f52126a.get();
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final ICopyTradingService m35900b() {
        return ICopyTradingService.f19723a.get();
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final IMineService m35901c() {
        return IMineService.f35025a.get();
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final IOtcService m35902d() {
        return IOtcService.f37164a.get();
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final IQuoteFacadeService m35903e() {
        return IQuoteFacadeService.f41383a.get();
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final IShareService m35904f() {
        return IShareService.f49268a.get();
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final IUserService m35905g() {
        return IUserService.a.get();
    }

    /* JADX INFO: renamed from: h */
    public final boolean m35906h() {
        return m35905g().d0().isHasOpenContract();
    }
}
