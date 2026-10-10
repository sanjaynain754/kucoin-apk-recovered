package p400kc;

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

/* JADX INFO: renamed from: kc.d */
/* JADX INFO: compiled from: ICrossSocketApi.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J6\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0016\b\u0003\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00040\bH'J\u0098\u0001\u0010\n\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000bj\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r`\u000e0\u00032.\b\u0001\u0010\u0005\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000bj\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r`\u000e0\u000628\b\u0003\u0010\u0007\u001a2\u0012\u0004\u0012\u00020\t\u0012(\u0012&\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\u000bj\u0012\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u0001`\u000e0\bH'J\u0018\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\b\b\u0003\u0010\u0010\u001a\u00020\fH'J\u0018\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\b\b\u0003\u0010\u0010\u001a\u00020\fH'J8\u0010\u0012\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000bj\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r`\u000e0\u00062\b\b\u0003\u0010\u0010\u001a\u00020\fH'J8\u0010\u0013\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000bj\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r`\u000e0\u00062\b\b\u0003\u0010\u0010\u001a\u00020\fH'J\u0014\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u0006H'J\u0014\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u0006H'J<\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u00062\u0016\b\u0001\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00160\bH'J<\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u00062\u0016\b\u0001\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00160\bH'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001aÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/copytrading/copytd/cross/ICrossSocketApi;", "", "observeCrossLeverages", "Lio/reactivex/Observable;", "Lcom/kubi/kumex/data/trade/model/SymbolsCrossLeverage;", "periodFlow", "Lcom/kubi/network/api/subscribe/annotations/PeriodFlow;", "convert", "Lcom/kubi/network/restful/core/IConverter;", "Lcom/kubi/network/api/subscribe/model/SubscribeMessage;", "observeMarginModes", "Ljava/util/HashMap;", "", "Lcom/kubi/kumex/data/platform/model/MarginModeInfoEntity;", "Lkotlin/collections/HashMap;", "fetchCrossLeverage", "symbol", "fetchTrialCrossLeverage", "fetchMarginMode", "fetchTrialMarginMode", "getSelfOccupancyBalances", "", "Lcom/kubi/kumex/data/assets/model/SimpleBalanceEntity;", "getTrialOccupancyBalances", "observeSelfOccupancyBalance", "observeTrialOccupancyBalance", "CopyTradingLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC40976d {
    @GET("v1/copyTrading/exchange/position/queryMarginModeV2")
    @NotNull
    /* JADX INFO: renamed from: a */
    C38293f<HashMap<String, MarginModeInfoEntity>> m89744a(@NotNull @Query("symbol") String str) throws Throwable;

    @GET("v1/copyTrading/exchange/position/queryTrialMarginModeV2")
    @NotNull
    /* JADX INFO: renamed from: d */
    C38293f<HashMap<String, MarginModeInfoEntity>> m89745d(@NotNull @Query("symbol") String str) throws Throwable;

    @InterfaceC38291d(topic = "/contract/marginModeV2")
    @NotNull
    /* JADX INFO: renamed from: e */
    Observable<HashMap<String, MarginModeInfoEntity>> m89746e(@InterfaceC38289b(connectedPeriod = 30, waitPeriodResult = true) @NotNull C38293f<HashMap<String, MarginModeInfoEntity>> c38293f, @InterfaceC38292e @NotNull InterfaceC41975c<SubscribeMessage, HashMap<String, MarginModeInfoEntity>> interfaceC41975c);

    @GET("v1/copyTrading/exchange/account/cross-account-overviews")
    @NotNull
    /* JADX INFO: renamed from: f */
    C38293f<List<SimpleBalanceEntity>> m89747f() throws Throwable;

    @InterfaceC38291d(topic = "/contract/crossLeverage")
    @NotNull
    /* JADX INFO: renamed from: g */
    Observable<SymbolsCrossLeverage> m89748g(@InterfaceC38289b(connectedPeriod = 30, waitPeriodResult = true) @NotNull C38293f<SymbolsCrossLeverage> c38293f, @InterfaceC38292e @NotNull InterfaceC41975c<SubscribeMessage, SymbolsCrossLeverage> interfaceC41975c);

    @GET("v1/copyTrading/exchange/trade/configs/getTrialCrossUserLeverage")
    @NotNull
    /* JADX INFO: renamed from: h */
    C38293f<SymbolsCrossLeverage> m89749h(@NotNull @Query("symbol") String str) throws Throwable;

    @InterfaceC38291d(topic = "/futuresTrial/wallet")
    @NotNull
    /* JADX INFO: renamed from: i */
    Observable<Object> m89750i(@InterfaceC38289b(connectedPeriod = 30, waitPeriodResult = true) @NotNull C38293f<List<SimpleBalanceEntity>> c38293f, @InterfaceC38292e @NotNull InterfaceC41975c<SubscribeMessage, SimpleBalanceEntity> interfaceC41975c);

    @GET("v1/copyTrading/exchange/account/cross-account-overviews-trial")
    @NotNull
    /* JADX INFO: renamed from: j */
    C38293f<List<SimpleBalanceEntity>> m89751j() throws Throwable;

    @InterfaceC38291d(topic = "/contractAccount/wallet")
    @NotNull
    /* JADX INFO: renamed from: k */
    Observable<Object> m89752k(@InterfaceC38289b(connectedPeriod = 30, waitPeriodResult = true) @NotNull C38293f<List<SimpleBalanceEntity>> c38293f, @InterfaceC38292e @NotNull InterfaceC41975c<SubscribeMessage, SimpleBalanceEntity> interfaceC41975c);

    @GET("v1/copyTrading/exchange/trade/configs/getCrossUserLeverage")
    @NotNull
    /* JADX INFO: renamed from: l */
    C38293f<SymbolsCrossLeverage> m89753l(@NotNull @Query("symbol") String str) throws Throwable;

    /* JADX INFO: renamed from: b */
    static /* synthetic */ C38293f m89738b(InterfaceC40976d interfaceC40976d, String str, int i11, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchMarginMode");
        }
        if ((i11 & 1) != 0) {
            str = "ALL";
        }
        return interfaceC40976d.m89744a(str);
    }

    /* JADX INFO: renamed from: c */
    static /* synthetic */ C38293f m89739c(InterfaceC40976d interfaceC40976d, String str, int i11, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchCrossLeverage");
        }
        if ((i11 & 1) != 0) {
            str = TtmlNode.COMBINE_ALL;
        }
        return interfaceC40976d.m89753l(str);
    }

    /* JADX INFO: renamed from: m */
    static /* synthetic */ C38293f m89740m(InterfaceC40976d interfaceC40976d, String str, int i11, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchTrialCrossLeverage");
        }
        if ((i11 & 1) != 0) {
            str = TtmlNode.COMBINE_ALL;
        }
        return interfaceC40976d.m89749h(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    static /* synthetic */ Observable m89741n(InterfaceC40976d interfaceC40976d, C38293f c38293f, InterfaceC41975c interfaceC41975c, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: observeMarginModes");
        }
        if ((i11 & 2) != 0) {
            interfaceC41975c = new C40982j();
        }
        return interfaceC40976d.m89746e(c38293f, interfaceC41975c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o */
    static /* synthetic */ Observable m89742o(InterfaceC40976d interfaceC40976d, C38293f c38293f, InterfaceC41975c interfaceC41975c, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: observeCrossLeverages");
        }
        if ((i11 & 2) != 0) {
            interfaceC41975c = new C40981i();
        }
        return interfaceC40976d.m89748g(c38293f, interfaceC41975c);
    }

    /* JADX INFO: renamed from: p */
    static /* synthetic */ C38293f m89743p(InterfaceC40976d interfaceC40976d, String str, int i11, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchTrialMarginMode");
        }
        if ((i11 & 1) != 0) {
            str = "ALL";
        }
        return interfaceC40976d.m89745d(str);
    }
}
