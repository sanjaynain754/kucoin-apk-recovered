package i60;

import com.kubi.kumex.data.platform.model.MarginModeInfoEntity;
import com.kubi.network.api.subscribe.model.SubscribeMessage;
import com.kubi.unify.entity.UnifyComposeEntity;
import com.kubi.unify.entity.UnifyCurrencyLeverageWsEntity;
import com.kubi.unify.entity.UnifyFundsInfoEntity;
import com.kubi.unify.entity.UnifyLeverageEntity;
import com.kubi.unify.entity.UnifyPositionEntity;
import com.kubi.unify.entity.UnifyPriceEntity;
import hr.C38293f;
import hr.InterfaceC38289b;
import hr.InterfaceC38291d;
import hr.InterfaceC38292e;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import k60.C40927a;
import k60.C40928b;
import k60.C40929c;
import k60.C40930d;
import k60.C40931e;
import k60.C40932f;
import k60.C40933g;
import k60.C40934h;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kr.InterfaceC41975c;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: i60.e */
/* JADX INFO: compiled from: UnifyWsApi.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0000\b`\u0018\u00002\u00020\u0001JH\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00072\u001c\b\u0003\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\tH'JF\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\b\b\u0001\u0010\r\u001a\u00020\u000e2\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00040\u00072\u0016\b\u0003\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\tH&J>\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00032\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00040\u00072\u0016\b\u0003\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\tH'J<\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00032\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00040\u00072\u0016\b\u0003\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\tH'J&\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\u0016\b\u0003\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\tH'J<\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00032\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00040\u00072\u0016\b\u0003\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\tH'J&\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00032\u0016\b\u0003\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\tH'J(\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00032\u0016\b\u0003\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\tH'J\u0084\u0001\u0010\u001a\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001bj\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u001c`\u001d0\u00032\u001a\b\u0001\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u001e0\u000728\b\u0003\u0010\b\u001a2\u0012\u0004\u0012\u00020\n\u0012(\u0012&\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0018\u00010\u001bj\u0012\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0018\u0001`\u001d0\tH'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001fÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/unify/api/UnifyWsApi;", "", "observerUnifyIndexPrices", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/kubi/unify/entity/UnifyPriceEntity;", "periodFlow", "Lcom/kubi/network/api/subscribe/annotations/PeriodFlow;", "convert", "Lcom/kubi/network/restful/core/IConverter;", "Lcom/kubi/network/api/subscribe/model/SubscribeMessage;", "observerFuturesLatestPrices", "Lcom/kubi/unify/entity/LatestPriceEntity;", "topic", "", "observerFuturesLeverageList", "Lcom/kubi/unify/entity/UnifyLeverageEntity;", "observerUnifyFundsInfo", "Lcom/kubi/unify/entity/UnifyFundsInfoEntity;", "observerAccountChanged", "observerFuturesPositionList", "Lcom/kubi/unify/entity/UnifyPositionEntity;", "observeComposeData", "Lcom/kubi/unify/entity/UnifyComposeEntity;", "observerMarginCurrencyLeverage", "Lcom/kubi/unify/entity/UnifyCurrencyLeverageWsEntity;", "observeMarginModes", "Ljava/util/HashMap;", "Lcom/kubi/kumex/data/platform/model/MarginModeInfoEntity;", "Lkotlin/collections/HashMap;", "", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC38462e {
    @InterfaceC38291d(topic = "/unifiedAccount/innerUserEquityDetail")
    @NotNull
    /* JADX INFO: renamed from: b */
    InterfaceC41634e<UnifyComposeEntity> m86767b(@InterfaceC38292e @NotNull InterfaceC41975c<SubscribeMessage, UnifyComposeEntity> interfaceC41975c);

    @InterfaceC38291d(topic = "/unifiedAccount/innerMarginMode")
    @NotNull
    /* JADX INFO: renamed from: e */
    InterfaceC41634e<HashMap<String, MarginModeInfoEntity>> m86768e(@InterfaceC38289b(connectedPeriod = 30, waitPeriodResult = true) @NotNull C38293f<Map<String, String>> c38293f, @InterfaceC38292e @NotNull InterfaceC41975c<SubscribeMessage, HashMap<String, MarginModeInfoEntity>> interfaceC41975c);

    @InterfaceC38291d(topic = "/unifiedAccount/innerLeverage")
    @NotNull
    /* JADX INFO: renamed from: f */
    InterfaceC41634e<UnifyLeverageEntity> m86769f(@InterfaceC38289b(connectedPeriod = 30, waitPeriodResult = true) @NotNull C38293f<List<UnifyLeverageEntity>> c38293f, @InterfaceC38292e @NotNull InterfaceC41975c<SubscribeMessage, UnifyLeverageEntity> interfaceC41975c);

    @InterfaceC38291d(topic = "/unifiedAccount/innerWallet")
    @NotNull
    /* JADX INFO: renamed from: i */
    InterfaceC41634e<UnifyFundsInfoEntity> m86770i(@InterfaceC38289b(connectedPeriod = 30, waitPeriodResult = true) @NotNull C38293f<List<UnifyFundsInfoEntity>> c38293f, @InterfaceC38292e @NotNull InterfaceC41975c<SubscribeMessage, UnifyFundsInfoEntity> interfaceC41975c);

    @InterfaceC38291d(topic = "/unifiedAccount/innerAccountType")
    @NotNull
    /* JADX INFO: renamed from: j */
    InterfaceC41634e<String> m86771j(@InterfaceC38292e @NotNull InterfaceC41975c<SubscribeMessage, String> interfaceC41975c);

    @InterfaceC38291d(topic = "/unifiedAccount/innerIndexPrice")
    @NotNull
    /* JADX INFO: renamed from: k */
    InterfaceC41634e<List<UnifyPriceEntity>> m86772k(@InterfaceC38289b(connectedPeriod = 30, waitPeriodResult = true) @NotNull C38293f<List<UnifyPriceEntity>> c38293f, @InterfaceC38292e @NotNull InterfaceC41975c<SubscribeMessage, List<UnifyPriceEntity>> interfaceC41975c);

    @InterfaceC38291d(topic = "/unifiedAccount/innerCurrencyLeverage")
    @NotNull
    /* JADX INFO: renamed from: m */
    InterfaceC41634e<UnifyCurrencyLeverageWsEntity> m86773m(@InterfaceC38292e @NotNull InterfaceC41975c<SubscribeMessage, UnifyCurrencyLeverageWsEntity> interfaceC41975c);

    @InterfaceC38291d(topic = "/unifiedAccount/innerPositionAll")
    @NotNull
    /* JADX INFO: renamed from: o */
    InterfaceC41634e<UnifyPositionEntity> m86774o(@InterfaceC38289b(connectedPeriod = 30, waitPeriodResult = false) @NotNull C38293f<List<UnifyPositionEntity>> c38293f, @InterfaceC38292e @NotNull InterfaceC41975c<SubscribeMessage, UnifyPositionEntity> interfaceC41975c);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    static /* synthetic */ InterfaceC41634e m86759a(InterfaceC38462e interfaceC38462e, C38293f c38293f, InterfaceC41975c interfaceC41975c, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: observerFuturesPositionList");
        }
        if ((i11 & 2) != 0) {
            interfaceC41975c = new C40934h();
        }
        return interfaceC38462e.m86774o(c38293f, interfaceC41975c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    static /* synthetic */ InterfaceC41634e m86760c(InterfaceC38462e interfaceC38462e, C38293f c38293f, InterfaceC41975c interfaceC41975c, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: observerUnifyIndexPrices");
        }
        if ((i11 & 2) != 0) {
            interfaceC41975c = new C40931e();
        }
        return interfaceC38462e.m86772k(c38293f, interfaceC41975c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    static /* synthetic */ InterfaceC41634e m86761d(InterfaceC38462e interfaceC38462e, C38293f c38293f, InterfaceC41975c interfaceC41975c, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: observerUnifyFundsInfo");
        }
        if ((i11 & 2) != 0) {
            interfaceC41975c = new C40930d();
        }
        return interfaceC38462e.m86770i(c38293f, interfaceC41975c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    static /* synthetic */ InterfaceC41634e m86762g(InterfaceC38462e interfaceC38462e, InterfaceC41975c interfaceC41975c, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: observerMarginCurrencyLeverage");
        }
        if ((i11 & 1) != 0) {
            interfaceC41975c = new C40929c();
        }
        return interfaceC38462e.m86773m(interfaceC41975c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    static /* synthetic */ InterfaceC41634e m86763h(InterfaceC38462e interfaceC38462e, InterfaceC41975c interfaceC41975c, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: observerAccountChanged");
        }
        if ((i11 & 1) != 0) {
            interfaceC41975c = new C40927a();
        }
        return interfaceC38462e.m86771j(interfaceC41975c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    static /* synthetic */ InterfaceC41634e m86764l(InterfaceC38462e interfaceC38462e, InterfaceC41975c interfaceC41975c, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: observeComposeData");
        }
        if ((i11 & 1) != 0) {
            interfaceC41975c = new C40928b();
        }
        return interfaceC38462e.m86767b(interfaceC41975c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    static /* synthetic */ InterfaceC41634e m86765n(InterfaceC38462e interfaceC38462e, C38293f c38293f, InterfaceC41975c interfaceC41975c, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: observeMarginModes");
        }
        if ((i11 & 2) != 0) {
            interfaceC41975c = new C40933g();
        }
        return interfaceC38462e.m86768e(c38293f, interfaceC41975c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    static /* synthetic */ InterfaceC41634e m86766p(InterfaceC38462e interfaceC38462e, C38293f c38293f, InterfaceC41975c interfaceC41975c, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: observerFuturesLeverageList");
        }
        if ((i11 & 2) != 0) {
            interfaceC41975c = new C40932f();
        }
        return interfaceC38462e.m86769f(c38293f, interfaceC41975c);
    }
}
