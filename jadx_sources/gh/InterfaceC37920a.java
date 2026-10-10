package gh;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.kumex.data.assets.model.SimpleBalanceEntity;
import com.kubi.kumex.data.platform.model.MarginModeInfoEntity;
import com.kubi.kumex.data.trade.model.SymbolsCrossLeverage;
import com.kubi.network.api.subscribe.model.SubscribeMessage;
import hr.C38293f;
import hr.InterfaceC38289b;
import hr.InterfaceC38291d;
import hr.InterfaceC38292e;
import io.reactivex.Observable;
import java.util.HashMap;
import java.util.List;
import kr.InterfaceC41975c;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: renamed from: gh.a */
/* JADX INFO: compiled from: ICrossSocketApi.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J6\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0016\b\u0003\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00040\bH'J\u0098\u0001\u0010\n\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000bj\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r`\u000e0\u00032.\b\u0001\u0010\u0005\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000bj\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r`\u000e0\u000628\b\u0003\u0010\u0007\u001a2\u0012\u0004\u0012\u00020\t\u0012(\u0012&\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\u000bj\u0012\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u0001`\u000e0\bH'J6\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0016\b\u0003\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00040\bH'J\u0082\u0001\u0010\u0010\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000bj\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f`\u000e0\u00032 \b\u0001\u0010\u0005\u001a\u001a\u0012\u0016\b\u0001\u0012\u0012\u0012\u0004\u0012\u00020\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u000b0\u000624\b\u0003\u0010\u0007\u001a.\u0012\u0004\u0012\u00020\t\u0012$\u0012\"\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bj\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u0001`\u000e0\bH'JB\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00032\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00062\u0016\b\u0001\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00130\bH'JB\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00032\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00062\u0016\b\u0001\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00130\bH'J\u0018\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\b\b\u0003\u0010\u0016\u001a\u00020\fH'J8\u0010\u0017\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000bj\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r`\u000e0\u00062\b\b\u0003\u0010\u0016\u001a\u00020\fH'J\u0018\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\b\b\u0003\u0010\u0016\u001a\u00020\fH'J4\u0010\u0019\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000bj\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f`\u000e0\u00062\b\b\u0003\u0010\u0016\u001a\u00020\fH'J\u0014\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0006H'J\u0014\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0006H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001cÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/futures/classic/cross/api/ICrossSocketApi;", "", "observeCrossLeverages", "Lio/reactivex/Observable;", "Lcom/kubi/kumex/data/trade/model/SymbolsCrossLeverage;", "periodFlow", "Lcom/kubi/network/api/subscribe/annotations/PeriodFlow;", "convert", "Lcom/kubi/network/restful/core/IConverter;", "Lcom/kubi/network/api/subscribe/model/SubscribeMessage;", "observeMarginModes", "Ljava/util/HashMap;", "", "Lcom/kubi/kumex/data/platform/model/MarginModeInfoEntity;", "Lkotlin/collections/HashMap;", "observeTrialCrossLeverages", "observeTrialMarginModes", "observeSelfOccupancyBalance", "", "Lcom/kubi/kumex/data/assets/model/SimpleBalanceEntity;", "observeTrialOccupancyBalance", "fetchCrossLeverage", "symbol", "fetchMarginMode", "fetchTrialCrossLeverage", "fetchTrialMarginMode", "getSelfOccupancyBalances", "getTrialOccupancyBalances", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC37920a {
    @GET("v2/km/position/queryMarginModeV2")
    @NotNull
    /* JADX INFO: renamed from: a */
    C38293f<HashMap<String, MarginModeInfoEntity>> m85749a(@NotNull @Query("symbol") String str) throws Throwable;

    @GET("v2/km/trial/position/queryMarginMode")
    @NotNull
    /* JADX INFO: renamed from: d */
    C38293f<HashMap<String, String>> m85750d(@NotNull @Query("symbol") String str) throws Throwable;

    @InterfaceC38291d(topic = "/contract/marginModeV2")
    @NotNull
    /* JADX INFO: renamed from: e */
    Observable<HashMap<String, MarginModeInfoEntity>> m85751e(@InterfaceC38289b(connectedPeriod = 30, waitPeriodResult = true) @NotNull C38293f<HashMap<String, MarginModeInfoEntity>> c38293f, @InterfaceC38292e @NotNull InterfaceC41975c<SubscribeMessage, HashMap<String, MarginModeInfoEntity>> interfaceC41975c);

    @GET("v1/km/account/cross-account-overviews")
    @NotNull
    /* JADX INFO: renamed from: f */
    C38293f<List<SimpleBalanceEntity>> m85752f() throws Throwable;

    @InterfaceC38291d(topic = "/contract/crossLeverage")
    @NotNull
    /* JADX INFO: renamed from: g */
    Observable<SymbolsCrossLeverage> m85753g(@InterfaceC38289b(connectedPeriod = 30, waitPeriodResult = true) @NotNull C38293f<SymbolsCrossLeverage> c38293f, @InterfaceC38292e @NotNull InterfaceC41975c<SubscribeMessage, SymbolsCrossLeverage> interfaceC41975c);

    @GET("v2/km/trial/trade/configs/getCrossUserLeverage")
    @NotNull
    /* JADX INFO: renamed from: h */
    C38293f<SymbolsCrossLeverage> m85754h(@NotNull @Query("symbol") String str) throws Throwable;

    @InterfaceC38291d(topic = "/futuresTrial/wallet")
    @NotNull
    /* JADX INFO: renamed from: i */
    Observable<List<SimpleBalanceEntity>> m85755i(@InterfaceC38289b(connectedPeriod = 30, waitPeriodResult = true) @NotNull C38293f<List<SimpleBalanceEntity>> c38293f, @InterfaceC38292e @NotNull InterfaceC41975c<SubscribeMessage, SimpleBalanceEntity> interfaceC41975c);

    @GET("v1/km/account/trial/cross-account-overviews")
    @NotNull
    /* JADX INFO: renamed from: j */
    C38293f<List<SimpleBalanceEntity>> m85756j() throws Throwable;

    @InterfaceC38291d(topic = "/contractAccount/wallet")
    @NotNull
    /* JADX INFO: renamed from: k */
    Observable<List<SimpleBalanceEntity>> m85757k(@InterfaceC38289b(connectedPeriod = 30, waitPeriodResult = true) @NotNull C38293f<List<SimpleBalanceEntity>> c38293f, @InterfaceC38292e @NotNull InterfaceC41975c<SubscribeMessage, SimpleBalanceEntity> interfaceC41975c);

    @GET("v2/km/trade/configs/getCrossUserLeverage")
    @NotNull
    /* JADX INFO: renamed from: l */
    C38293f<SymbolsCrossLeverage> m85758l(@NotNull @Query("symbol") String str) throws Throwable;

    @InterfaceC38291d(topic = "/futuresTrial/crossLeverage")
    @NotNull
    /* JADX INFO: renamed from: s */
    Observable<SymbolsCrossLeverage> m85759s(@InterfaceC38289b(connectedPeriod = 30, waitPeriodResult = true) @NotNull C38293f<SymbolsCrossLeverage> c38293f, @InterfaceC38292e @NotNull InterfaceC41975c<SubscribeMessage, SymbolsCrossLeverage> interfaceC41975c);

    @InterfaceC38291d(topic = "/futuresTrial/marginMode")
    @NotNull
    /* JADX INFO: renamed from: u */
    Observable<HashMap<String, String>> m85760u(@InterfaceC38289b(connectedPeriod = 30, waitPeriodResult = true) @NotNull C38293f<? extends HashMap<String, ? extends Object>> c38293f, @InterfaceC38292e @NotNull InterfaceC41975c<SubscribeMessage, HashMap<String, String>> interfaceC41975c);

    /* JADX INFO: renamed from: m */
    static /* synthetic */ C38293f m85741m(InterfaceC37920a interfaceC37920a, String str, int i11, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchTrialCrossLeverage");
        }
        if ((i11 & 1) != 0) {
            str = TtmlNode.COMBINE_ALL;
        }
        return interfaceC37920a.m85754h(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    static /* synthetic */ Observable m85742n(InterfaceC37920a interfaceC37920a, C38293f c38293f, InterfaceC41975c interfaceC41975c, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: observeMarginModes");
        }
        if ((i11 & 2) != 0) {
            interfaceC41975c = new C37924e();
        }
        return interfaceC37920a.m85751e(c38293f, interfaceC41975c);
    }

    /* JADX INFO: renamed from: o */
    static /* synthetic */ C38293f m85743o(InterfaceC37920a interfaceC37920a, String str, int i11, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchTrialMarginMode");
        }
        if ((i11 & 1) != 0) {
            str = "ALL";
        }
        return interfaceC37920a.m85750d(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    static /* synthetic */ Observable m85744p(InterfaceC37920a interfaceC37920a, C38293f c38293f, InterfaceC41975c interfaceC41975c, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: observeCrossLeverages");
        }
        if ((i11 & 2) != 0) {
            interfaceC41975c = new C37923d();
        }
        return interfaceC37920a.m85753g(c38293f, interfaceC41975c);
    }

    /* JADX INFO: renamed from: q */
    static /* synthetic */ C38293f m85745q(InterfaceC37920a interfaceC37920a, String str, int i11, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchCrossLeverage");
        }
        if ((i11 & 1) != 0) {
            str = TtmlNode.COMBINE_ALL;
        }
        return interfaceC37920a.m85758l(str);
    }

    /* JADX INFO: renamed from: r */
    static /* synthetic */ C38293f m85746r(InterfaceC37920a interfaceC37920a, String str, int i11, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchMarginMode");
        }
        if ((i11 & 1) != 0) {
            str = "ALL";
        }
        return interfaceC37920a.m85749a(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t */
    static /* synthetic */ Observable m85747t(InterfaceC37920a interfaceC37920a, C38293f c38293f, InterfaceC41975c interfaceC41975c, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: observeTrialMarginModes");
        }
        if ((i11 & 2) != 0) {
            interfaceC41975c = new C37926g();
        }
        return interfaceC37920a.m85760u(c38293f, interfaceC41975c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v */
    static /* synthetic */ Observable m85748v(InterfaceC37920a interfaceC37920a, C38293f c38293f, InterfaceC41975c interfaceC41975c, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: observeTrialCrossLeverages");
        }
        if ((i11 & 2) != 0) {
            interfaceC41975c = new C37925f();
        }
        return interfaceC37920a.m85759s(c38293f, interfaceC41975c);
    }
}
