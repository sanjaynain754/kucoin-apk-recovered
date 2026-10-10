package ee;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.kubi.core.biz.bottomtab.RnOrderCenterFragment;
import com.kubi.sdk.BaseFragment;
import com.kubi.trade.core.biz.api.ITradeCoreService;
import ge.InterfaceC37872b;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: ee.c */
/* JADX INFO: compiled from: TradeCoreService.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0012\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0012\u0010\u0010\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0012H\u0016J\u0016\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0012H\u0016J\u0010\u0010\u0017\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0016H\u0016J\u001c\u0010\u001a\u001a\u00020\u00142\u0012\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00120\u001cH\u0017J\b\u0010\u001d\u001a\u00020\u001eH\u0016J.\u0010\u001f\u001a\u00020 2\u0014\u0010!\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u0014\u0018\u00010\"2\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010%H\u0016J\u001e\u0010&\u001a\u00020 2\u0014\u0010!\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u0014\u0018\u00010\"H\u0016J\u0012\u0010'\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010(\u001a\u00020\u000fH\u0016J\b\u0010)\u001a\u00020\u000fH\u0016J\u0010\u0010*\u001a\u00020\u00142\u0006\u0010+\u001a\u00020,H\u0016J\u0010\u0010-\u001a\u00020\f2\u0006\u0010.\u001a\u00020,H\u0016J,\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020201002\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u00103\u001a\u00020\u000f2\u0006\u00104\u001a\u00020\u000fH\u0016J$\u00105\u001a\u00020\u00142\u0006\u00106\u001a\u0002072\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00140\"H\u0016J\u0018\u00109\u001a\u00020,2\u0006\u0010:\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020\u000fH\u0016R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006<"}, m90084d2 = {"Lcom/kubi/core/service/TradeCoreService;", "Lcom/kubi/trade/core/biz/api/ITradeCoreService;", "<init>", "()V", "marketApi", "Lcom/kubi/core/spot/api/MarketApi;", "kotlin.jvm.PlatformType", "getMarketApi", "()Lcom/kubi/core/spot/api/MarketApi;", "marketApi$delegate", "Lkotlin/Lazy;", "isUtaMode", "", "isMaintenance", "symbol", "", "allowCancelOrder", "getFavor", "", "saveNewFavor", "", "list", "Lcom/kubi/data/entity/TradeItemBean;", "isNativeFavor", "changedFavor", "tradeBean", "getMarkets", "consumer", "Lio/reactivex/functions/Consumer;", "getSpotType", "", "getMaintenanceStatus", "Lio/reactivex/disposables/Disposable;", "complete", "Lkotlin/Function1;", "Lcom/kubi/data/entity/MaintenanceEntity;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lkotlin/Function0;", "getCDNMaintenanceStatus", "getMaintenance", "getMarketsSpotPageId", "getTradingPageId", "baseTradeFragmentScrollToTop", "fragment", "Lcom/kubi/sdk/BaseFragment;", "isBaseTradeFragment", "currentFragment", "getPreviewInfo", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BaseEntity;", "Lcom/kubi/data/entity/SymbolPreviewEntity;", FirebaseAnalytics.Param.CURRENCY, "lang", "bindFlowEvent", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "block", "getRnOrderCenterFragment", "tradeType", "currentSymbol", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTradeCoreService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeCoreService.kt\ncom/kubi/core/service/TradeCoreService\n+ 2 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n*L\n1#1,127:1\n81#2,2:128\n*S KotlinDebug\n*F\n+ 1 TradeCoreService.kt\ncom/kubi/core/service/TradeCoreService\n*L\n120#1:128,2\n*E\n"})
public final class C37138c implements ITradeCoreService {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Lazy f82408b = LazyKt.lazy(new Function0() { // from class: ee.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C37138c.m83066c();
        }
    });

    /* JADX INFO: renamed from: c */
    public static final InterfaceC37872b m83066c() {
        return (InterfaceC37872b) C42597a.m93386b().create(InterfaceC37872b.class);
    }

    @Override // com.kubi.trade.core.biz.api.ITradeCoreService
    @NotNull
    /* JADX INFO: renamed from: a */
    public BaseFragment mo63102a(@NotNull String tradeType, @NotNull String currentSymbol) {
        Intrinsics.checkNotNullParameter(tradeType, "tradeType");
        Intrinsics.checkNotNullParameter(currentSymbol, "currentSymbol");
        return RnOrderCenterFragment.f20166V.newInstance(tradeType, currentSymbol);
    }
}
