package com.kubi.tradingbotkit.service;

import com.kubi.assets.api.IAssetsCenterService;
import com.kubi.kumex.api.IKuMexService;
import com.kubi.margin.api.IMarginService;
import com.kubi.quotefacade.api.IQuoteFacadeService;
import com.kubi.user.api.IUserService;
import org.jetbrains.annotations.NotNull;
import p765xl.InterfaceC46261b;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;

/* JADX INFO: renamed from: com.kubi.tradingbotkit.service.b, reason: from Kotlin metadata */
/* JADX INFO: compiled from: TradingBotKitDepend.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0007J\u0006\u0010\b\u001a\u00020\tJ\b\u0010\n\u001a\u00020\u000bH\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u0011J\b\u0010\u0012\u001a\u00020\u0013H\u0007¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/tradingbotkit/service/TradingBotKitDepend;", "", "<init>", "()V", "getKuCoinService", "Lcom/kubi/kucoin/api/IKuFacadeService;", "getUserService", "Lcom/kubi/user/api/IUserService;", "getMarginService", "Lcom/kubi/margin/api/IMarginService;", "getSpotService", "Lcom/kubi/spot/api/ISpotService;", "getKuMexService", "Lcom/kubi/kumex/api/IKuMexService;", "getFuturesService", "Lcom/kubi/kumex/api/IFuturesGridService;", "getAssetsCenterService", "Lcom/kubi/assets/api/IAssetsCenterService;", "getQuoteFacadeService", "Lcom/kubi/quotefacade/api/IQuoteFacadeService;", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class TradingBotKitDepend {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final TradingBotKitDepend f52488a = new TradingBotKitDepend();

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: e */
    public static final IQuoteFacadeService m64272e() {
        return IQuoteFacadeService.f41383a.get();
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: f */
    public static final IUserService m64273f() {
        return IUserService.a.get();
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final IAssetsCenterService m64274a() {
        return IAssetsCenterService.f16464a.get();
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final InterfaceC46261b m64275b() {
        return IKuMexService.f28731a.get().mo33285n();
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final IKuMexService m64276c() {
        return IKuMexService.f28731a.get();
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final IMarginService m64277d() {
        return IMarginService.f32724a.get();
    }
}
