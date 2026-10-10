package sg;

import ci.InterfaceC4984e;
import cm.FuturesStreamsData;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.kumex.data.assets.model.SimpleBalanceEntity;
import com.kubi.kumex.data.platform.model.MarginModeInfoEntity;
import com.kubi.kumex.data.trade.model.PositionEntity;
import com.kubi.kumex.data.trade.model.SymbolsCrossLeverage;
import io.reactivex.Observable;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import p559qg.InterfaceC43729a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: sg.c */
/* JADX INFO: compiled from: ICrossBizInterface.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00040\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0005H&J\u001c\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0018\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00132\u0006\u0010\u0007\u001a\u00020\bH&J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00132\u0006\u0010\u0007\u001a\u00020\bH&J\u001c\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\r0\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u001e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0019À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/function/cross/IMultiCrossService;", "Lcom/kubi/function/IMultiFunction;", "observeMarginMode", "Lio/reactivex/Observable;", "", "", "Lcom/kubi/kumex/data/platform/model/MarginModeInfoEntity;", "isTrial", "", "observeOccupiedBalance", "Lcom/kubi/kumex/data/assets/model/SimpleBalanceEntity;", FirebaseAnalytics.Param.CURRENCY, "observePositions", "", "Lcom/kubi/kumex/data/trade/model/PositionEntity;", "observeOccupancyAccount", "observeCrossLeverage", "Lcom/kubi/kumex/data/trade/model/SymbolsCrossLeverage;", "observeStreamOnError", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kubi/futures/exception/IFuturesCoreApiException;", "observeStreamKeyData", "Lcom/kubi/kumex/data/trade/model/FuturesStreamsData;", "observeOccupancyBalance", "observeWalletBalance", "KumexApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC44406c extends InterfaceC43729a {
    @NotNull
    /* JADX INFO: renamed from: C */
    Observable<SymbolsCrossLeverage> mo24472C(boolean z11);

    @NotNull
    /* JADX INFO: renamed from: E */
    Observable<Map<String, MarginModeInfoEntity>> mo24474E(boolean z11);

    @NotNull
    /* JADX INFO: renamed from: G */
    Observable<List<PositionEntity>> mo24475G(boolean z11);

    @NotNull
    /* JADX INFO: renamed from: P0 */
    InterfaceC41634e<FuturesStreamsData> mo24479P0(boolean z11);

    @NotNull
    /* JADX INFO: renamed from: X */
    InterfaceC41634e<InterfaceC4984e> mo24480X(boolean z11);

    @NotNull
    /* JADX INFO: renamed from: f1 */
    Observable<SimpleBalanceEntity> mo24482f1(boolean z11, @NotNull String str);

    @NotNull
    /* JADX INFO: renamed from: p */
    Observable<List<SimpleBalanceEntity>> mo24486p(boolean z11);

    @NotNull
    /* JADX INFO: renamed from: q0 */
    Observable<Boolean> mo24487q0(boolean z11);

    @NotNull
    /* JADX INFO: renamed from: b1 */
    default Observable<SimpleBalanceEntity> mo65456b1(@NotNull String currency, boolean z11) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Observable<SimpleBalanceEntity> observableEmpty = Observable.empty();
        Intrinsics.checkNotNullExpressionValue(observableEmpty, "empty(...)");
        return observableEmpty;
    }
}
