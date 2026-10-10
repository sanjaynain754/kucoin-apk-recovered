package com.kubi.assets.service;

import com.kubi.copytrading.ICopyTradingService;
import com.kubi.home.api.IHomeService;
import com.kubi.kumex.api.IKuMexService;
import com.kubi.margin.api.IMarginService;
import com.kubi.otc.api.IOtcService;
import com.kubi.quotefacade.api.IQuoteFacadeService;
import com.kubi.safe.api.service.ISafeService;
import com.kubi.spot.api.ISpotService;
import com.kubi.tradingbotkit.api.ITradingBotService;
import com.kubi.user.api.IUserService;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;

/* JADX INFO: renamed from: com.kubi.assets.service.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: AssetsDepend.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0013J\b\u0010\u0014\u001a\u00020\u0015H\u0007J\u0006\u0010\u0016\u001a\u00020\u0017¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/assets/service/AssetsDepend;", "", "<init>", "()V", "userService", "Lcom/kubi/user/api/IUserService;", "tradingBotService", "Lcom/kubi/tradingbotkit/api/ITradingBotService;", "homeService", "Lcom/kubi/home/api/IHomeService;", "marginService", "Lcom/kubi/margin/api/IMarginService;", "otcService", "Lcom/kubi/otc/api/IOtcService;", "spotService", "Lcom/kubi/spot/api/ISpotService;", "copyTradingService", "Lcom/kubi/copytrading/ICopyTradingService;", "safeService", "Lcom/kubi/safe/api/service/ISafeService;", "kuMexService", "Lcom/kubi/kumex/api/IKuMexService;", "quoteFacadeService", "Lcom/kubi/quotefacade/api/IQuoteFacadeService;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AssetsDepend {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final AssetsDepend f18689a = new AssetsDepend();

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final IKuMexService m19180c() {
        return IKuMexService.f28731a.get();
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final ICopyTradingService m19181a() {
        return ICopyTradingService.f19723a.get();
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final IHomeService m19182b() {
        return IHomeService.f25434a.get();
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final IMarginService m19183d() {
        return IMarginService.f32724a.get();
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final IOtcService m19184e() {
        return IOtcService.f37164a.get();
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final IQuoteFacadeService m19185f() {
        return IQuoteFacadeService.f41383a.get();
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final ISafeService m19186g() {
        return ISafeService.f46324a.get();
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final ISpotService m19187h() {
        return ISpotService.f49646a.get();
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final ITradingBotService m19188i() {
        return ITradingBotService.f52126a.get();
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final IUserService m19189j() {
        return IUserService.a.get();
    }
}
