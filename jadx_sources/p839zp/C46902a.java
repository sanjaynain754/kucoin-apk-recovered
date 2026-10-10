package p839zp;

import com.kubi.margin.api.IMarginService;
import com.kubi.spot.api.ISpotService;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: zp.a */
/* JADX INFO: compiled from: MarketMonitorDepend.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/market/monitor/lib/service/MarketMonitorDepend;", "", "<init>", "()V", "getMarginService", "Lcom/kubi/margin/api/IMarginService;", "getSpotService", "Lcom/kubi/spot/api/ISpotService;", "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C46902a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C46902a f104768a = new C46902a();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final IMarginService m103311a() {
        return IMarginService.f32724a.get();
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final ISpotService m103312b() {
        return ISpotService.f49646a.get();
    }
}
