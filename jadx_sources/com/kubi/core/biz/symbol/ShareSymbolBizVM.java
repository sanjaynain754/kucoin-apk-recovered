package com.kubi.core.biz.symbol;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.kubi.core.base.quote.ITradeSymbolQuoteDataRepo;
import com.kubi.core.spot.helper.TradeManagerProxy;
import com.kubi.core.utils.FlowExtKt;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.data.entity.WsMarketSnapshotEntity;
import com.kubi.data.regulations.FinancialRegulationsEx;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseFragment;
import com.kubi.spot.api.ISpotCommonService;
import gd.C37869b;
import gf.C37890n;
import id.C38519a;
import io.reactivex.disposables.CompositeDisposable;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.C41674s;
import kotlinx.coroutines.flow.InterfaceC41668m;
import kotlinx.coroutines.flow.InterfaceC41673r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p260fd.ChangeRateData;
import p311hf.C38184b;
import p756xc.Request;
import p756xc.SymbolConfigResponse;
import p756xc.SymbolQuoteResponse;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: compiled from: ShareSymbolBizVM.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010#\u001a\u00020\u001aJ\b\u0010$\u001a\u0004\u0018\u00010 J\u0010\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(J\u000e\u0010)\u001a\u00020&2\u0006\u0010*\u001a\u00020+J\u0006\u0010,\u001a\u00020&J\u000e\u0010-\u001a\u00020&2\u0006\u0010\u000e\u001a\u00020\u0006J\b\u0010.\u001a\u00020&H\u0014J\b\u0010/\u001a\u00020\u0006H\u0002J\u001a\u00100\u001a\u00020&2\u0006\u0010\u000e\u001a\u00020\u00062\b\u00101\u001a\u0004\u0018\u000102H\u0002J\u000e\u00103\u001a\u00020\u0006*\u0004\u0018\u000102H\u0002J\u0010\u00104\u001a\u00020&2\u0006\u0010\u000e\u001a\u00020\u0006H\u0002J\u0010\u00105\u001a\u00020&2\u0006\u0010\u000e\u001a\u00020\u0006H\u0002J\u0010\u00106\u001a\u00020&2\u0006\u0010\u000e\u001a\u00020\u0006H\u0002J\u0018\u00107\u001a\u00020&2\u0006\u0010*\u001a\u00020+2\u0006\u0010\u000e\u001a\u00020\u0006H\u0002J\"\u00108\u001a\u00020&2\u0017\u00109\u001a\u0013\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a0:¢\u0006\u0002\b;H\u0082\bJ\b\u0010<\u001a\u0004\u0018\u00010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001c¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001c¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001e¨\u0006="}, m90084d2 = {"Lcom/kubi/core/biz/symbol/ShareSymbolBizVM;", "Landroidx/lifecycle/ViewModel;", "symbolRepo", "Lcom/kubi/core/base/quote/ITradeSymbolQuoteDataRepo;", "lastSymbolKey", "Lcom/kubi/utils/storage/StorageId;", "", "<init>", "(Lcom/kubi/core/base/quote/ITradeSymbolQuoteDataRepo;Lcom/kubi/utils/storage/StorageId;)V", "getLastSymbolKey", "()Lcom/kubi/utils/storage/StorageId;", "isMargin", "", "()Z", "symbol", "symbolInfo", "Lcom/kubi/data/entity/SymbolInfoEntity;", "tradeItemBean", "Lcom/kubi/data/entity/TradeItemBean;", "symbolDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "symbolJobs", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lkotlinx/coroutines/Job;", "_symbolDataFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/kubi/core/biz/symbol/SymbolBizUiState;", "symbolDataFlow", "Lkotlinx/coroutines/flow/SharedFlow;", "getSymbolDataFlow", "()Lkotlinx/coroutines/flow/SharedFlow;", "_symbolChangeRateFlow", "Lcom/kubi/core/base/quote/data/ChangeRateData;", "symbolChangeRateFlow", "getSymbolChangeRateFlow", "getLatestSymbolData", "getLatestChangeRateData", "reloadSymbolFromArguments", "", "arguments", "Landroid/os/Bundle;", "startFetchAndCollectData", "fragment", "Lcom/kubi/sdk/BaseFragment;", "stopCollectData", "saveLastSymbol", "onCleared", "getDefaultSymbol", "onChangeRate", "changeRate", "Ljava/math/BigDecimal;", "getFormatChangeRateV2", "startCollectQuoteData", "startCollectConfigData", "startSubQuoteSnapshotFlow", "startSubMaintenanceState", "updateSymbolUiState", "update", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "getCurrentTradeItemBean", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nShareSymbolBizVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShareSymbolBizVM.kt\ncom/kubi/core/biz/symbol/ShareSymbolBizVM\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,272:1\n265#1,3:280\n23#2,2:273\n23#2,2:277\n32#2:279\n1869#3,2:275\n*S KotlinDebug\n*F\n+ 1 ShareSymbolBizVM.kt\ncom/kubi/core/biz/symbol/ShareSymbolBizVM\n*L\n214#1:280,3\n101#1:273,2\n151#1:277,2\n161#1:279\n145#1:275,2\n*E\n"})
public final class ShareSymbolBizVM extends ViewModel {

    /* JADX INFO: renamed from: V */
    @NotNull
    public final ITradeSymbolQuoteDataRepo f20864V;

    /* JADX INFO: renamed from: W */
    @NotNull
    public final StorageId<String> f20865W;

    /* JADX INFO: renamed from: X */
    @Nullable
    public String f20866X;

    /* JADX INFO: renamed from: Y */
    @Nullable
    public SymbolInfoEntity f20867Y;

    /* JADX INFO: renamed from: Z */
    @Nullable
    public TradeItemBean f20868Z;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final CompositeDisposable f20869a0;

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final CopyOnWriteArrayList<InterfaceC41775x1> f20870b0;

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final InterfaceC41668m<SymbolBizUiState> f20871c0;

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public final InterfaceC41673r<SymbolBizUiState> f20872d0;

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public final InterfaceC41668m<ChangeRateData> f20873e0;

    /* JADX INFO: renamed from: f0 */
    @NotNull
    public final InterfaceC41673r<ChangeRateData> f20874f0;

    /* JADX INFO: renamed from: com.kubi.core.biz.symbol.ShareSymbolBizVM$1 */
    /* JADX INFO: compiled from: ShareSymbolBizVM.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.symbol.ShareSymbolBizVM$1", m90122f = "ShareSymbolBizVM.kt", m90123i = {}, m90124l = {82}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C122401 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        public C122401(Continuation<? super C122401> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ShareSymbolBizVM.this.new C122401(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C122401) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                InterfaceC41668m interfaceC41668m = ShareSymbolBizVM.this.f20871c0;
                SymbolBizUiState symbolBizUiState = new SymbolBizUiState(null, null, null, false, false, ShareSymbolBizVM.this.m22743w(), 31, null);
                this.label = 1;
                if (interfaceC41668m.emit(symbolBizUiState, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public ShareSymbolBizVM(@NotNull ITradeSymbolQuoteDataRepo symbolRepo, @NotNull StorageId<String> lastSymbolKey) {
        Intrinsics.checkNotNullParameter(symbolRepo, "symbolRepo");
        Intrinsics.checkNotNullParameter(lastSymbolKey, "lastSymbolKey");
        this.f20864V = symbolRepo;
        this.f20865W = lastSymbolKey;
        this.f20869a0 = new CompositeDisposable();
        this.f20870b0 = new CopyOnWriteArrayList<>();
        InterfaceC41668m<SymbolBizUiState> interfaceC41668mM91001b = C41674s.m91001b(1, 1, null, 4, null);
        this.f20871c0 = interfaceC41668mM91001b;
        this.f20872d0 = interfaceC41668mM91001b;
        InterfaceC41668m<ChangeRateData> interfaceC41668mM91001b2 = C41674s.m91001b(1, 1, null, 4, null);
        this.f20873e0 = interfaceC41668mM91001b2;
        this.f20874f0 = interfaceC41668mM91001b2;
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C122401(null), 3, null);
    }

    /* JADX INFO: renamed from: B */
    public static final Unit m22717B(ShareSymbolBizVM shareSymbolBizVM, String str, SymbolConfigResponse it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.areEqual(shareSymbolBizVM.f20866X, str)) {
            SymbolInfoEntity configData = it.getConfigData();
            SymbolBizUiState symbolBizUiState = (SymbolBizUiState) CollectionsKt.lastOrNull((List) shareSymbolBizVM.f20871c0.mo86421a());
            if (symbolBizUiState != null) {
                shareSymbolBizVM.f20871c0.mo90855d(SymbolBizUiState.copy$default(symbolBizUiState, null, null, configData, false, false, false, 59, null));
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D */
    public static final Unit m22718D(ShareSymbolBizVM shareSymbolBizVM, String str, SymbolQuoteResponse it) {
        Intrinsics.checkNotNullParameter(it, "it");
        TradeItemBean quoteData = it.getQuoteData();
        SymbolBizUiState symbolBizUiState = (SymbolBizUiState) CollectionsKt.lastOrNull((List) shareSymbolBizVM.f20871c0.mo86421a());
        if (symbolBizUiState == null) {
            return Unit.INSTANCE;
        }
        if (Intrinsics.areEqual(quoteData.getSymbol(), shareSymbolBizVM.f20866X)) {
            TradeItemBean tradeItemBean = symbolBizUiState.getTradeItemBean();
            if (tradeItemBean != null) {
                tradeItemBean.setChangeRate(quoteData.getChangeRate());
            }
            TradeItemBean tradeItemBean2 = symbolBizUiState.getTradeItemBean();
            if (tradeItemBean2 != null) {
                tradeItemBean2.setFavor(C37869b.m85487a(quoteData));
            }
            TradeItemBean tradeItemBean3 = symbolBizUiState.getTradeItemBean();
            if (tradeItemBean3 != null) {
                tradeItemBean3.setAlarm(quoteData.isAlarm());
            }
            shareSymbolBizVM.f20871c0.mo90855d(SymbolBizUiState.copy$default(symbolBizUiState, null, shareSymbolBizVM.f20868Z, null, false, false, false, 61, null));
            Double changeRate = quoteData.getChangeRate();
            shareSymbolBizVM.m22744x(str, changeRate != null ? new BigDecimal(String.valueOf(changeRate.doubleValue())) : null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final void m22729A(final String str) {
        this.f20864V.mo21125a().mo21152a(new Request(str), this.f20869a0, new Function1() { // from class: com.kubi.core.biz.symbol.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ShareSymbolBizVM.m22717B(this.f20875b, str, (SymbolConfigResponse) obj);
            }
        });
    }

    /* JADX INFO: renamed from: C */
    public final void m22730C(final String str) {
        this.f20864V.mo21127c().mo21152a(new Request(str), this.f20869a0, new Function1() { // from class: com.kubi.core.biz.symbol.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ShareSymbolBizVM.m22718D(this.f20877b, str, (SymbolQuoteResponse) obj);
            }
        });
    }

    /* JADX INFO: renamed from: E */
    public final void m22731E(@NotNull BaseFragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        m22734J();
        String str = this.f20866X;
        if (str != null) {
            m22730C(str);
            m22729A(str);
            m22733H(str);
            m22732F(fragment, str);
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m22732F(BaseFragment baseFragment, String str) {
        this.f20870b0.add(FlowExtKt.m23401b(C41636g.m90941x(this.f20864V.mo21128d(baseFragment, str), new Function1() { // from class: com.kubi.core.biz.symbol.d
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(ShareSymbolBizVM.m22719G(((Boolean) obj).booleanValue()));
            }
        }), ViewModelKt.getViewModelScope(this), new ShareSymbolBizVM$startSubMaintenanceState$subJob$2(this, str, null)));
    }

    /* JADX INFO: renamed from: H */
    public final void m22733H(String str) {
        this.f20870b0.add(FlowExtKt.m23401b(C41636g.m90941x(this.f20864V.mo21126b(str), new Function1() { // from class: com.kubi.core.biz.symbol.f
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ShareSymbolBizVM.m22720I((WsMarketSnapshotEntity) obj);
            }
        }), ViewModelKt.getViewModelScope(this), new ShareSymbolBizVM$startSubQuoteSnapshotFlow$subJob$2(this, str, null)));
    }

    /* JADX INFO: renamed from: J */
    public final void m22734J() {
        Iterator it = CollectionsKt.toList(this.f20870b0).iterator();
        while (it.hasNext()) {
            InterfaceC41775x1.a.m91377a((InterfaceC41775x1) it.next(), null, 1, null);
        }
        this.f20870b0.clear();
    }

    @Nullable
    /* JADX INFO: renamed from: o */
    public final TradeItemBean m22735o() {
        SymbolBizUiState symbolBizUiState = (SymbolBizUiState) CollectionsKt.lastOrNull((List) this.f20872d0.mo86421a());
        if (symbolBizUiState != null) {
            return symbolBizUiState.getTradeItemBean();
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    public final String m22736p() {
        String strM102326h = C46392a.m102326h(this.f20865W, "");
        if (!TextUtils.isEmpty(strM102326h)) {
            return strM102326h;
        }
        return "BTC-" + C38184b.f85884a.m86147b();
    }

    /* JADX INFO: renamed from: q */
    public final String m22737q(BigDecimal bigDecimal) {
        return bigDecimal == null ? "--" : FinancialRegulationsEx.f21492a.formatPercentRegular(new BigDecimal(bigDecimal.toString()), true);
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public final StorageId<String> m22738r() {
        return this.f20865W;
    }

    @Nullable
    /* JADX INFO: renamed from: s */
    public final ChangeRateData m22739s() {
        return (ChangeRateData) CollectionsKt.lastOrNull((List) this.f20874f0.mo86421a());
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public final SymbolBizUiState m22740t() {
        SymbolBizUiState symbolBizUiState = (SymbolBizUiState) CollectionsKt.lastOrNull((List) this.f20872d0.mo86421a());
        return symbolBizUiState == null ? new SymbolBizUiState(null, null, null, false, false, m22743w(), 31, null) : symbolBizUiState;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final InterfaceC41673r<ChangeRateData> m22741u() {
        return this.f20874f0;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final InterfaceC41673r<SymbolBizUiState> m22742v() {
        return this.f20872d0;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m22743w() {
        return Intrinsics.areEqual(this.f20865W, C38519a.f86479a.m87131f());
    }

    /* JADX INFO: renamed from: x */
    public final void m22744x(String str, BigDecimal bigDecimal) {
        if (Intrinsics.areEqual(this.f20866X, str)) {
            this.f20873e0.mo90855d(new ChangeRateData(str, bigDecimal, m22737q(bigDecimal)));
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m22745y(@Nullable Bundle bundle) {
        String strM22736p;
        SymbolInfoEntity symbolInfoEntityM85601B;
        if (bundle == null || (strM22736p = RouteExKt.m56284y(bundle, "symbol")) == null) {
            strM22736p = m22736p();
        }
        String strMo59958b = ISpotCommonService.f49644a.get().mo59958b(strM22736p);
        if (strMo59958b == null || strMo59958b.length() == 0 || (symbolInfoEntityM85601B = C37890n.f85269a.m85601B(strMo59958b)) == null) {
            return;
        }
        C46392a.m102333p(this.f20865W, strM22736p);
        m22734J();
        this.f20866X = strMo59958b;
        this.f20867Y = symbolInfoEntityM85601B;
        TradeItemBean tradeItemBean = new TradeItemBean(strMo59958b);
        this.f20868Z = tradeItemBean;
        tradeItemBean.setSymbolInfoEntity(this.f20867Y);
        this.f20871c0.mo90855d(new SymbolBizUiState(strMo59958b, this.f20868Z, this.f20867Y, false, TradeManagerProxy.f21264a.m23362b(strM22736p), m22743w(), 8, null));
        this.f20873e0.mo90855d(new ChangeRateData(strMo59958b, null, null));
    }

    /* JADX INFO: renamed from: z */
    public final void m22746z(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        C46392a.m102333p(this.f20865W, symbol);
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        m22734J();
        this.f20869a0.clear();
    }

    /* JADX INFO: renamed from: G */
    public static final boolean m22719G(boolean z11) {
        return z11;
    }

    /* JADX INFO: renamed from: I */
    public static final WsMarketSnapshotEntity m22720I(WsMarketSnapshotEntity wsMarketSnapshotEntity) {
        return wsMarketSnapshotEntity;
    }
}
