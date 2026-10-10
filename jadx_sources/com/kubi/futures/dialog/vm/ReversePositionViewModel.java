package com.kubi.futures.dialog.vm;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import androidx.media3.common.C2711C;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.broker.MultiBizFacadeManager;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.data.constance.ValidationBizEnum;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.market.model.TickerEntity;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.data.platform.model.SymbolConfig;
import com.kubi.kumex.data.trade.model.PositionEntity;
import com.kubi.kumex.data.trade.model.SubmitReversePositionEntity;
import com.kubi.kumex.helper.TradePwdHelperKt;
import com.kubi.kumex.utils.C17058m0;
import com.kubi.kumex.utils.C17060n0;
import com.kubi.mine.lib.jsapi.KCTurboSystemSettingsModuleImpl;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.sdk.BaseViewModel;
import com.kubi.unify.api.IUnifyAccountService;
import com.kubi.utils.C27017c;
import com.kubi.utils.FlowableCompat;
import com.kubi.utils.extensions.C27041f;
import com.tencent.bugly.proguard.C33556b3;
import com.trtc.uikit.livekit.p180kc.data.entity.SharedPositionInfo;
import fm.C37567b;
import fm.C37569d;
import fm.C37570e;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.math.BigDecimal;
import java.util.Map;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.CoroutineExceptionHandler;
import o00.C42911a;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p236em.C37214b;
import p402kf.C41014a;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.coroutines.AbstractCoroutineContextElement;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import th.InterfaceC44980d;

/* JADX INFO: compiled from: ReversePositionViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\rJ \u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\rJ\u0016\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\u0010\u0010 \u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u000e\u0010\"\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u0010\u0010#\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J$\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\r2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0012\u0010'\u001a\u00020\u00172\b\u0010(\u001a\u0004\u0018\u00010\u0017H\u0002J\u0006\u0010)\u001a\u00020\u0015J\b\u0010*\u001a\u00020\u0015H\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR%\u0010\u000b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\nR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\nR\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, m90084d2 = {"Lcom/kubi/futures/dialog/vm/ReversePositionViewModel;", "Lcom/kubi/sdk/BaseViewModel;", "<init>", "()V", "visibleDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "tickerLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/kubi/kumex/data/market/model/TickerEntity;", "getTickerLiveData", "()Landroidx/lifecycle/MutableLiveData;", "submitResult", "Lkotlin/Pair;", "", "", "getSubmitResult", "isolatedLeverage", "Ljava/math/BigDecimal;", "getIsolatedLeverage", "userIsolateMaxLeverage", "fetchUserRiskLimit", "", "symbol", "", "isTrial", "submitOfReverseDialog", "fragment", "Landroidx/fragment/app/Fragment;", ViewProps.POSITION, "Lcom/kubi/kumex/data/trade/model/PositionEntity;", "isShowLoadingDialog", "submitOfPositionFragment", "createSubmitEntity", "Lcom/kubi/kumex/data/trade/model/SubmitReversePositionEntity;", "subscribe", "getLeverage", "trackReversePositionResult", "success", "failReason", "toTrackPositionMode", "positionSide", "unSubscribe", "onCleared", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nReversePositionViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReversePositionViewModel.kt\ncom/kubi/futures/dialog/vm/ReversePositionViewModel\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,253:1\n47#2,4:254\n*S KotlinDebug\n*F\n+ 1 ReversePositionViewModel.kt\ncom/kubi/futures/dialog/vm/ReversePositionViewModel\n*L\n68#1:254,4\n*E\n"})
public final class ReversePositionViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: X */
    @NotNull
    public final CompositeDisposable f22951X = new CompositeDisposable();

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final MutableLiveData<TickerEntity> f22952Y = new MutableLiveData<>();

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final MutableLiveData<Pair<Boolean, Throwable>> f22953Z = new MutableLiveData<>();

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final MutableLiveData<BigDecimal> f22954a0 = new MutableLiveData<>();

    /* JADX INFO: renamed from: b0 */
    @Nullable
    public volatile BigDecimal f22955b0;

    /* JADX INFO: renamed from: com.kubi.futures.dialog.vm.ReversePositionViewModel$a */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 ReversePositionViewModel.kt\ncom/kubi/futures/dialog/vm/ReversePositionViewModel\n*L\n1#1,49:1\n69#2,3:50\n*E\n"})
    public static final class C13140a extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ReversePositionViewModel f22956b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ BigDecimal f22957c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f22958d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13140a(CoroutineExceptionHandler.Companion companion, ReversePositionViewModel reversePositionViewModel, BigDecimal bigDecimal, String str) {
            super(companion);
            this.f22956b = reversePositionViewModel;
            this.f22957c = bigDecimal;
            this.f22958d = str;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext context, Throwable exception) {
            this.f22956b.f22955b0 = this.f22957c;
            this.f22956b.m25467G().postValue(this.f22956b.m25468H(this.f22958d));
        }
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ void m25440M(ReversePositionViewModel reversePositionViewModel, Fragment fragment, PositionEntity positionEntity, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        reversePositionViewModel.m25472L(fragment, positionEntity, z11);
    }

    /* JADX INFO: renamed from: N */
    public static final void m25441N(Fragment fragment, ReversePositionViewModel reversePositionViewModel, PositionEntity positionEntity, Object obj) throws JSONException {
        C17058m0.m36549d(fragment, C27017c.f54310a.m66516f(R$string.order_submit_success, new Object[0]));
        reversePositionViewModel.f22953Z.postValue(new Pair<>(Boolean.TRUE, null));
        reversePositionViewModel.m25475c0(true, null, positionEntity);
    }

    /* JADX INFO: renamed from: O */
    public static final void m25442O(ReversePositionViewModel reversePositionViewModel, Fragment fragment, PositionEntity positionEntity, Throwable th2) throws JSONException {
        String message;
        reversePositionViewModel.f22953Z.postValue(new Pair<>(Boolean.FALSE, th2));
        C17058m0.m36550e(fragment, th2);
        if (th2 instanceof ApiException) {
            StringBuilder sb2 = new StringBuilder();
            ApiException apiException = (ApiException) th2;
            sb2.append(apiException.code);
            sb2.append(": ");
            sb2.append(apiException.getMessage());
            message = sb2.toString();
        } else {
            message = th2.getMessage();
        }
        reversePositionViewModel.m25475c0(false, message, positionEntity);
    }

    /* JADX INFO: renamed from: P */
    public static final Observable m25443P(final ReversePositionViewModel reversePositionViewModel, final PositionEntity positionEntity, String str) {
        Observable<Object> observable = FlowableCompat.f54248a.m66386c(new Function0() { // from class: com.kubi.futures.dialog.vm.j
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ReversePositionViewModel.m25444Q(this.f22969b, positionEntity);
            }
        }).subscribeOn(C42916f.m94127f()).observeOn(C42916f.m94128g()).toObservable();
        Intrinsics.checkNotNullExpressionValue(observable, "toObservable(...)");
        return observable;
    }

    /* JADX INFO: renamed from: Q */
    public static final Unit m25444Q(ReversePositionViewModel reversePositionViewModel, PositionEntity positionEntity) {
        MultiBizFacadeManager.m20260s(MultiBizFacadeManager.f19232a, null, 1, null).mo4509k(reversePositionViewModel.m25465E(positionEntity));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: R */
    public static final Unit m25445R(ReversePositionViewModel reversePositionViewModel) {
        reversePositionViewModel.f22953Z.postValue(new Pair<>(Boolean.FALSE, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: T */
    public static final Unit m25446T(ReversePositionViewModel reversePositionViewModel, String str, Map map) {
        reversePositionViewModel.f22954a0.postValue(reversePositionViewModel.m25468H(str));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: X */
    public static final Unit m25450X(ReversePositionViewModel reversePositionViewModel, TickerEntity tickerEntity) {
        reversePositionViewModel.f22952Y.postValue(tickerEntity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F */
    public final void m25466F(@NotNull String symbol, boolean z11) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        ContractEntity contractEntityM99529O = InterfaceC44980d.m99529O(RepositoryServiceLocator.f19236a.m20288g(), symbol, false, 2, null);
        BigDecimal bigDecimalM89921F = C41014a.m89921F(contractEntityM99529O != null ? contractEntityM99529O.getMaxLeverage() : null, C33556b3.f68995S);
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b().plus(new C13140a(CoroutineExceptionHandler.INSTANCE, this, bigDecimalM89921F, symbol)), null, new ReversePositionViewModel$fetchUserRiskLimit$1(z11, symbol, this, bigDecimalM89921F, null), 2, null);
    }

    @NotNull
    /* JADX INFO: renamed from: G */
    public final MutableLiveData<BigDecimal> m25467G() {
        return this.f22954a0;
    }

    /* JADX INFO: renamed from: H */
    public final BigDecimal m25468H(String str) {
        RepositoryServiceLocator repositoryServiceLocator = RepositoryServiceLocator.f19236a;
        SymbolConfig symbolConfig = repositoryServiceLocator.m20288g().mo24980G().get(str);
        Double dM84688c = C37570e.m84688c(symbolConfig);
        BigDecimal bigDecimalValueOf = null;
        BigDecimal bigDecimal = dM84688c != null ? new BigDecimal(String.valueOf(dM84688c.doubleValue())) : null;
        ContractEntity contractEntityM99529O = InterfaceC44980d.m99529O(repositoryServiceLocator.m20288g(), str, false, 2, null);
        if (contractEntityM99529O != null) {
            bigDecimalValueOf = BigDecimal.valueOf(C37567b.m84615e(contractEntityM99529O, false, 1, null));
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        }
        BigDecimal bigDecimalM89921F = C41014a.m89921F(bigDecimalValueOf, C33556b3.f68995S);
        if (bigDecimal == null) {
            BigDecimal bigDecimalMin = new BigDecimal(5).min(C37570e.m84687b(symbolConfig).min(bigDecimalM89921F));
            Intrinsics.checkNotNull(bigDecimalMin);
            return bigDecimalMin;
        }
        BigDecimal bigDecimalMin2 = bigDecimal.min(bigDecimalM89921F);
        BigDecimal bigDecimal2 = this.f22955b0;
        if (bigDecimal2 != null) {
            bigDecimalMin2 = bigDecimal2.min(bigDecimalMin2);
        }
        Intrinsics.checkNotNull(bigDecimalMin2);
        return bigDecimalMin2;
    }

    @NotNull
    /* JADX INFO: renamed from: I */
    public final MutableLiveData<Pair<Boolean, Throwable>> m25469I() {
        return this.f22953Z;
    }

    @NotNull
    /* JADX INFO: renamed from: J */
    public final MutableLiveData<TickerEntity> m25470J() {
        return this.f22952Y;
    }

    /* JADX INFO: renamed from: K */
    public final void m25471K(@NotNull Fragment fragment, @NotNull PositionEntity position) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(position, "position");
        PositionEntity positionEntityCopy = position.copy(((-1) & 1) != 0 ? position.id : null, ((-1) & 2) != 0 ? position.symbol : null, ((-1) & 4) != 0 ? position.isOpen : null, ((-1) & 8) != 0 ? position.autoDeposit : null, ((-1) & 16) != 0 ? position.avgEntryPrice : null, ((-1) & 32) != 0 ? position.currentCost : null, ((-1) & 64) != 0 ? position.currentQty : null, ((-1) & 128) != 0 ? position.delevPercentage : null, ((-1) & 256) != 0 ? position.liquidationPrice : null, ((-1) & 512) != 0 ? position.maintMargin : null, ((-1) & 1024) != 0 ? position.markPrice : null, ((-1) & 2048) != 0 ? position.markValue : null, ((-1) & 4096) != 0 ? position.openingTimestamp : null, ((-1) & 8192) != 0 ? position.posComm : null, ((-1) & 16384) != 0 ? position.posCost : null, ((-1) & 32768) != 0 ? position.posCross : null, ((-1) & 65536) != 0 ? position.posInit : null, ((-1) & 131072) != 0 ? position.posLoss : null, ((-1) & 262144) != 0 ? position.posMaint : null, ((-1) & 524288) != 0 ? position.aggRate : null, ((-1) & 1048576) != 0 ? position.posMargin : null, ((-1) & 2097152) != 0 ? position.realLeverage : null, ((-1) & 4194304) != 0 ? position.realisedGrossCost : null, ((-1) & 8388608) != 0 ? position.realisedGrossPnl : null, ((-1) & 16777216) != 0 ? position.realisedPnl : null, ((-1) & 33554432) != 0 ? position.riskLimit : null, ((-1) & 67108864) != 0 ? position.unrealisedPnl : null, ((-1) & C2711C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? position.unrealisedRoePcnt : null, ((-1) & 268435456) != 0 ? position.settleCurrency : null, ((-1) & C2711C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? position.isTrialFunds : false, ((-1) & 1073741824) != 0 ? position.prizeType : null, ((-1) & Integer.MIN_VALUE) != 0 ? position.trialCoupon : null, (131071 & 1) != 0 ? position.userJoinChallenge : null, (131071 & 2) != 0 ? position.marginMode : null, (131071 & 4) != 0 ? position.riskRatio : null, (131071 & 8) != 0 ? position.crossIMR : null, (131071 & 16) != 0 ? position.crossMMR : null, (131071 & 32) != 0 ? position.adjustCrossIMR : null, (131071 & 64) != 0 ? position.adjustCrossMMR : null, (131071 & 128) != 0 ? position.latestPrice : null, (131071 & 256) != 0 ? position.latestUnrealisedPnl : null, (131071 & 512) != 0 ? position.latestUnrealisedRoePcnt : null, (131071 & 1024) != 0 ? position.withdrawPnl : null, (131071 & 2048) != 0 ? position.dealComm : null, (131071 & 4096) != 0 ? position.fundingFee : null, (131071 & 8192) != 0 ? position.tax : null, (131071 & 16384) != 0 ? position.positionSide : null, (131071 & 32768) != 0 ? position.bestAskPrice : null, (131071 & 65536) != 0 ? position.bestBidPrice : null);
        String strM66668h = C27041f.m66668h(positionEntityCopy.getSymbol());
        this.f22955b0 = null;
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b(), null, new ReversePositionViewModel$submitOfPositionFragment$1(positionEntityCopy, this, strM66668h, fragment, null), 2, null);
    }

    /* JADX INFO: renamed from: L */
    public final void m25472L(@NotNull final Fragment fragment, @NotNull final PositionEntity position, boolean z11) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(position, "position");
        final PositionEntity positionEntityCopy = position.copy(((-1) & 1) != 0 ? position.id : null, ((-1) & 2) != 0 ? position.symbol : null, ((-1) & 4) != 0 ? position.isOpen : null, ((-1) & 8) != 0 ? position.autoDeposit : null, ((-1) & 16) != 0 ? position.avgEntryPrice : null, ((-1) & 32) != 0 ? position.currentCost : null, ((-1) & 64) != 0 ? position.currentQty : null, ((-1) & 128) != 0 ? position.delevPercentage : null, ((-1) & 256) != 0 ? position.liquidationPrice : null, ((-1) & 512) != 0 ? position.maintMargin : null, ((-1) & 1024) != 0 ? position.markPrice : null, ((-1) & 2048) != 0 ? position.markValue : null, ((-1) & 4096) != 0 ? position.openingTimestamp : null, ((-1) & 8192) != 0 ? position.posComm : null, ((-1) & 16384) != 0 ? position.posCost : null, ((-1) & 32768) != 0 ? position.posCross : null, ((-1) & 65536) != 0 ? position.posInit : null, ((-1) & 131072) != 0 ? position.posLoss : null, ((-1) & 262144) != 0 ? position.posMaint : null, ((-1) & 524288) != 0 ? position.aggRate : null, ((-1) & 1048576) != 0 ? position.posMargin : null, ((-1) & 2097152) != 0 ? position.realLeverage : null, ((-1) & 4194304) != 0 ? position.realisedGrossCost : null, ((-1) & 8388608) != 0 ? position.realisedGrossPnl : null, ((-1) & 16777216) != 0 ? position.realisedPnl : null, ((-1) & 33554432) != 0 ? position.riskLimit : null, ((-1) & 67108864) != 0 ? position.unrealisedPnl : null, ((-1) & C2711C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? position.unrealisedRoePcnt : null, ((-1) & 268435456) != 0 ? position.settleCurrency : null, ((-1) & C2711C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? position.isTrialFunds : false, ((-1) & 1073741824) != 0 ? position.prizeType : null, ((-1) & Integer.MIN_VALUE) != 0 ? position.trialCoupon : null, (131071 & 1) != 0 ? position.userJoinChallenge : null, (131071 & 2) != 0 ? position.marginMode : null, (131071 & 4) != 0 ? position.riskRatio : null, (131071 & 8) != 0 ? position.crossIMR : null, (131071 & 16) != 0 ? position.crossMMR : null, (131071 & 32) != 0 ? position.adjustCrossIMR : null, (131071 & 64) != 0 ? position.adjustCrossMMR : null, (131071 & 128) != 0 ? position.latestPrice : null, (131071 & 256) != 0 ? position.latestUnrealisedPnl : null, (131071 & 512) != 0 ? position.latestUnrealisedRoePcnt : null, (131071 & 1024) != 0 ? position.withdrawPnl : null, (131071 & 2048) != 0 ? position.dealComm : null, (131071 & 4096) != 0 ? position.fundingFee : null, (131071 & 8192) != 0 ? position.tax : null, (131071 & 16384) != 0 ? position.positionSide : null, (131071 & 32768) != 0 ? position.bestAskPrice : null, (131071 & 65536) != 0 ? position.bestBidPrice : null);
        TradePwdHelperKt.m33943w(fragment, z11, ValidationBizEnum.CONTRACT_TRADE, new Function1() { // from class: com.kubi.futures.dialog.vm.h
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReversePositionViewModel.m25443P(this.f22966b, positionEntityCopy, (String) obj);
            }
        }, new Consumer() { // from class: com.kubi.futures.dialog.vm.r
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws JSONException {
                ReversePositionViewModel.m25441N(fragment, this, position, obj);
            }
        }, new Consumer() { // from class: com.kubi.futures.dialog.vm.s
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws JSONException {
                ReversePositionViewModel.m25442O(this.f22980b, fragment, position, (Throwable) obj);
            }
        }, true, (128 & 128) != 0 ? "" : null, (128 & 256) != 0 ? 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x008d: INVOKE 
              (r56v0 'fragment' androidx.fragment.app.Fragment)
              (r58v0 'z11' boolean)
              (wrap com.kubi.data.constance.ValidationBizEnum:0x0070: SGET  A[WRAPPED] (LINE:114) com.kubi.data.constance.ValidationBizEnum.CONTRACT_TRADE com.kubi.data.constance.ValidationBizEnum)
              (wrap kotlin.jvm.functions.Function1:0x007f: CONSTRUCTOR 
              (r55v0 'this' com.kubi.futures.dialog.vm.ReversePositionViewModel A[DONT_INLINE, IMMUTABLE_TYPE, THIS])
              (r3v3 'positionEntityCopy' com.kubi.kumex.data.trade.model.PositionEntity A[DONT_INLINE])
             A[MD:(com.kubi.futures.dialog.vm.ReversePositionViewModel, com.kubi.kumex.data.trade.model.PositionEntity):void (m), WRAPPED] (LINE:130) call: com.kubi.futures.dialog.vm.h.<init>(com.kubi.futures.dialog.vm.ReversePositionViewModel, com.kubi.kumex.data.trade.model.PositionEntity):void type: CONSTRUCTOR)
              (wrap io.reactivex.functions.Consumer:0x0074: CONSTRUCTOR 
              (r56v0 'fragment' androidx.fragment.app.Fragment A[DONT_INLINE])
              (r55v0 'this' com.kubi.futures.dialog.vm.ReversePositionViewModel A[DONT_INLINE, IMMUTABLE_TYPE, THIS])
              (r57v0 'position' com.kubi.kumex.data.trade.model.PositionEntity A[DONT_INLINE])
             A[MD:(androidx.fragment.app.Fragment, com.kubi.futures.dialog.vm.ReversePositionViewModel, com.kubi.kumex.data.trade.model.PositionEntity):void (m), WRAPPED] (LINE:119) call: com.kubi.futures.dialog.vm.r.<init>(androidx.fragment.app.Fragment, com.kubi.futures.dialog.vm.ReversePositionViewModel, com.kubi.kumex.data.trade.model.PositionEntity):void type: CONSTRUCTOR)
              (wrap io.reactivex.functions.Consumer:0x0079: CONSTRUCTOR 
              (r55v0 'this' com.kubi.futures.dialog.vm.ReversePositionViewModel A[DONT_INLINE, IMMUTABLE_TYPE, THIS])
              (r56v0 'fragment' androidx.fragment.app.Fragment A[DONT_INLINE])
              (r57v0 'position' com.kubi.kumex.data.trade.model.PositionEntity A[DONT_INLINE])
             A[MD:(com.kubi.futures.dialog.vm.ReversePositionViewModel, androidx.fragment.app.Fragment, com.kubi.kumex.data.trade.model.PositionEntity):void (m), WRAPPED] (LINE:124) call: com.kubi.futures.dialog.vm.s.<init>(com.kubi.futures.dialog.vm.ReversePositionViewModel, androidx.fragment.app.Fragment, com.kubi.kumex.data.trade.model.PositionEntity):void type: CONSTRUCTOR)
              true
              (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0002: ARITH (128 int) & (128 int) A[WRAPPED] (LINE:4)) != (0 int)) ? ("") : (null java.lang.String))
              (wrap kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap int:0x000c: ARITH (128 int) & (256 int) A[WRAPPED] (LINE:14)) != (0 int)) ? (wrap ??:0x0015: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:21) call: com.kubi.kumex.helper.y0.<init>():void type: CONSTRUCTOR) : (wrap kotlin.jvm.functions.Function0:0x0084: CONSTRUCTOR (r55v0 'this' com.kubi.futures.dialog.vm.ReversePositionViewModel A[DONT_INLINE, IMMUTABLE_TYPE, THIS]) A[MD:(com.kubi.futures.dialog.vm.ReversePositionViewModel):void (m), WRAPPED] (LINE:135) call: com.kubi.futures.dialog.vm.i.<init>(com.kubi.futures.dialog.vm.ReversePositionViewModel):void type: CONSTRUCTOR))
             STATIC call: com.kubi.kumex.helper.TradePwdHelperKt.w(androidx.fragment.app.Fragment, boolean, com.kubi.data.constance.ValidationBizEnum, kotlin.jvm.functions.Function1, io.reactivex.functions.Consumer, io.reactivex.functions.Consumer, boolean, java.lang.String, kotlin.jvm.functions.Function0):void A[MD:(androidx.fragment.app.Fragment, boolean, com.kubi.data.constance.ValidationBizEnum, kotlin.jvm.functions.Function1<? super java.lang.String, ? extends io.reactivex.Observable<java.lang.Object>>, io.reactivex.functions.Consumer<java.lang.Object>, io.reactivex.functions.Consumer<java.lang.Throwable>, boolean, java.lang.String, kotlin.jvm.functions.Function0<kotlin.Unit>):void (m)] (LINE:38) in method: com.kubi.futures.dialog.vm.ReversePositionViewModel.L(androidx.fragment.app.Fragment, com.kubi.kumex.data.trade.model.PositionEntity, boolean):void, file: classes13.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.kubi.kumex.helper.y0, state: NOT_LOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
            	at jadx.core.codegen.InsnGen.makeTernary(InsnGen.java:1187)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:536)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
            	... 15 more
            */
        /*
            this = this;
            r0 = r55
            r1 = r56
            r2 = r57
            java.lang.String r3 = "fragment"
            p852kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3)
            java.lang.String r3 = "position"
            p852kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            r53 = 131071(0x1ffff, float:1.8367E-40)
            r54 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r46 = 0
            r47 = 0
            r48 = 0
            r49 = 0
            r50 = 0
            r51 = 0
            r52 = -1
            com.kubi.kumex.data.trade.model.PositionEntity r3 = com.kubi.kumex.data.trade.model.PositionEntity.copy$default(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54)
            com.kubi.data.constance.ValidationBizEnum r4 = com.kubi.data.constance.ValidationBizEnum.CONTRACT_TRADE
            com.kubi.futures.dialog.vm.r r5 = new com.kubi.futures.dialog.vm.r
            r5.<init>()
            com.kubi.futures.dialog.vm.s r6 = new com.kubi.futures.dialog.vm.s
            r6.<init>()
            r2 = r4
            com.kubi.futures.dialog.vm.h r4 = new com.kubi.futures.dialog.vm.h
            r4.<init>()
            com.kubi.futures.dialog.vm.i r9 = new com.kubi.futures.dialog.vm.i
            r9.<init>()
            r10 = 128(0x80, float:1.8E-43)
            r7 = 1
            r3 = r2
            r2 = r58
            com.kubi.kumex.helper.TradePwdHelperKt.m33944x(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kubi.futures.dialog.vm.ReversePositionViewModel.m25472L(androidx.fragment.app.Fragment, com.kubi.kumex.data.trade.model.PositionEntity, boolean):void");
    }

    /* JADX INFO: renamed from: S */
    public final void m25473S(@NotNull final String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        this.f22951X.clear();
        RepositoryServiceLocator repositoryServiceLocator = RepositoryServiceLocator.f19236a;
        Observable<TickerEntity> observableSubscribeOn = repositoryServiceLocator.m20286e().mo24802b(C27041f.m66668h(symbol)).subscribeOn(C42916f.m94127f());
        final Function1 function1 = new Function1() { // from class: com.kubi.futures.dialog.vm.g
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReversePositionViewModel.m25450X(this.f22965b, (TickerEntity) obj);
            }
        };
        Consumer<? super TickerEntity> consumer = new Consumer() { // from class: com.kubi.futures.dialog.vm.k
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ReversePositionViewModel.m25451Y(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.futures.dialog.vm.l
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReversePositionViewModel.m25452Z((Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableSubscribeOn.subscribe(consumer, new Consumer() { // from class: com.kubi.futures.dialog.vm.m
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ReversePositionViewModel.m25453a0(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, this.f22951X);
        Flowable<Map<String, SymbolConfig>> flowableObserveOn = repositoryServiceLocator.m20288g().mo24988P().subscribeOn(C42916f.m94127f()).observeOn(C42916f.m94128g());
        final Function1 function3 = new Function1() { // from class: com.kubi.futures.dialog.vm.n
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReversePositionViewModel.m25446T(this.f22973b, symbol, (Map) obj);
            }
        };
        Consumer<? super Map<String, SymbolConfig>> consumer2 = new Consumer() { // from class: com.kubi.futures.dialog.vm.o
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ReversePositionViewModel.m25447U(function3, obj);
            }
        };
        final Function1 function4 = new Function1() { // from class: com.kubi.futures.dialog.vm.p
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReversePositionViewModel.m25448V((Throwable) obj);
            }
        };
        Disposable disposableSubscribe2 = flowableObserveOn.subscribe(consumer2, new Consumer() { // from class: com.kubi.futures.dialog.vm.q
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ReversePositionViewModel.m25449W(function4, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe2, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe2, this.f22951X);
    }

    /* JADX INFO: renamed from: b0 */
    public final String m25474b0(String str) {
        if (str == null) {
            return "none";
        }
        int iHashCode = str.hashCode();
        if (iHashCode == 2044801) {
            return !str.equals("BOTH") ? "none" : "1";
        }
        if (iHashCode != 2342524) {
            return (iHashCode == 78875740 && str.equals(SharedPositionInfo.SIDE_SHORT)) ? "2" : "none";
        }
        return !str.equals(SharedPositionInfo.SIDE_LONG) ? "none" : "2";
    }

    /* JADX INFO: renamed from: m */
    public final void m25476m() {
        this.f22951X.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final void m25447U(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: V */
    public static final Unit m25448V(Throwable th2) {
        Intrinsics.checkNotNull(th2);
        C37214b.m83255a(th2, "ReversePositionViewModel-observeSymbolConfig");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: W */
    public static final void m25449W(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Y */
    public static final void m25451Y(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Z */
    public static final Unit m25452Z(Throwable th2) {
        Intrinsics.checkNotNull(th2);
        C37214b.m83255a(th2, "ReversePositionViewModel-subscribe");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public static final void m25453a0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: E */
    public final SubmitReversePositionEntity m25465E(PositionEntity positionEntity) {
        BigDecimal realLeverage;
        String str;
        String str2;
        if (!C37569d.m84649A(positionEntity) && !IUnifyAccountService.f53155a.get().mo64979C()) {
            realLeverage = m25468H(C27041f.m66668h(positionEntity.getSymbol()));
        } else {
            realLeverage = positionEntity.getRealLeverage();
            if (realLeverage == null) {
                realLeverage = new BigDecimal(3);
            }
        }
        BigDecimal bigDecimal = realLeverage;
        String strM66668h = C27041f.m66668h(positionEntity.getSymbol());
        String strM66668h2 = C27041f.m66668h(positionEntity.getPositionSide());
        if (positionEntity.isTrialFunds()) {
            str = "trialFunds";
        } else {
            str = "selfFunds";
        }
        String str3 = str;
        if (C37569d.m84685z(positionEntity)) {
            str2 = "sell";
        } else {
            str2 = "buy";
        }
        return new SubmitReversePositionEntity(strM66668h, strM66668h2, bigDecimal, str3, null, str2, positionEntity.getCurrentQty(), positionEntity.getMarginMode(), 16, null);
    }

    /* JADX INFO: renamed from: c0 */
    public final void m25475c0(boolean z11, String str, PositionEntity positionEntity) throws JSONException {
        String str2;
        String strM36555e = C17060n0.m36555e();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("order_type", "ReversePosition");
        jSONObject.put("is_success", z11);
        if (str == null) {
            str = "none";
        }
        jSONObject.put("fail_reason", str);
        jSONObject.put("trade_pair", C27041f.m66668h(positionEntity.getSymbol()));
        if (C37569d.m84685z(positionEntity)) {
            str2 = "sell";
        } else {
            str2 = "buy";
        }
        jSONObject.put("trade_type", str2);
        jSONObject.put("platform_type", KCTurboSystemSettingsModuleImpl.PLATFORM_ANDROID);
        jSONObject.put("positionMode", m25474b0(positionEntity.getPositionSide()));
        C43852m.m96605q(strM36555e, jSONObject);
    }

    @Override // com.kubi.sdk.BaseViewModel, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        this.f22951X.clear();
    }
}
