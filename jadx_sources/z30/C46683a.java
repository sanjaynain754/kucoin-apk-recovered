package z30;

import com.kubi.margin.api.IMarginService;
import com.kubi.otc.api.IOtcService;
import com.kubi.spot.api.ISpotService;
import com.kubi.tradingbotkit.api.ITradingBotService;
import com.kubi.unify.api.IUnifyAccountService;
import com.kubi.utaspot.api.IUtaSpotService;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: z30.a */
/* JADX INFO: compiled from: BTradeFacadeDepend.kt */
/* JADX INFO: loaded from: classes50.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\u000f¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/tradefacade/service/BTradeFacadeDepend;", "", "<init>", "()V", "getSpotService", "Lcom/kubi/spot/api/ISpotService;", "getUtaSpotService", "Lcom/kubi/utaspot/api/IUtaSpotService;", "getUnifyAccountService", "Lcom/kubi/unify/api/IUnifyAccountService;", "getTradingBotService", "Lcom/kubi/tradingbotkit/api/ITradingBotService;", "getMarginService", "Lcom/kubi/margin/api/IMarginService;", "getOtcService", "Lcom/kubi/otc/api/IOtcService;", "TradeFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C46683a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C46683a f104520a = new C46683a();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final IMarginService m102902a() {
        return IMarginService.f32724a.get();
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final IOtcService m102903b() {
        return IOtcService.f37164a.get();
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final ISpotService m102904c() {
        return ISpotService.f49646a.get();
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final ITradingBotService m102905d() {
        return ITradingBotService.f52126a.get();
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final IUnifyAccountService m102906e() {
        return IUnifyAccountService.f53155a.get();
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final IUtaSpotService m102907f() {
        return IUtaSpotService.f54014a.get();
    }
}
