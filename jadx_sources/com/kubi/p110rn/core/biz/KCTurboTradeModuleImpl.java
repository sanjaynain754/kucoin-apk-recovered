package com.kubi.p110rn.core.biz;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.google.auto.service.AutoService;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.data.entity.AlphaCurrencyInfoEntity;
import com.kubi.kumex.api.IKuMexService;
import com.kubi.loan.api.ILoanService;
import com.kubi.loan.api.entity.LeverCoinConfig;
import com.kubi.margin.api.IMarginService;
import com.kubi.margin.api.entity.IsolatedMarginBridgeConfig;
import com.kubi.p110rn.core.turbo.AlphaCurrencyInfo;
import com.kubi.p110rn.core.turbo.IsolatedMarginConfig;
import com.kubi.p110rn.core.turbo.MarginConfig;
import com.kubi.p110rn.core.turbo.MarginCurrency;
import com.kubi.p110rn.core.turbo.NativeTradeTurboModuleAbs;
import com.kubi.router.core.Router;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.unify.api.IUnifyAccountService;
import com.tencent.qcloud.tuicore.TUIConstants;
import d00.InterfaceC36569e0;
import gf.C37890n;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.SerialDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: KCTurboTradeModuleImpl.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\n\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002J>\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0014\u0010\u0013\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\r0\u0014H\u0016JF\u0010\u0016\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u000f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0014\u0010\u0013\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\r0\u0014H\u0016J\n\u0010\u001c\u001a\u0004\u0018\u00010\u000fH\u0016J\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0015H\u0016J$\u0010\"\u001a\u00020\r2\u001a\u0010\u0013\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010#\u0012\u0004\u0012\u00020\r0\u0014H\u0016J\u0012\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J$\u0010&\u001a\u00020\r2\u001a\u0010\u0013\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020%\u0018\u00010#\u0012\u0004\u0012\u00020\r0\u0014H\u0016J$\u0010'\u001a\u00020\r2\u001a\u0010\u0013\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020(\u0018\u00010#\u0012\u0004\u0012\u00020\r0\u0014H\u0016J\u001e\u0010)\u001a\u00020\r2\u0014\u0010\u0013\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010*\u0012\u0004\u0012\u00020\r0\u0014H\u0016J\u0012\u0010+\u001a\u0004\u0018\u00010(2\u0006\u0010,\u001a\u00020\u000fH\u0016J&\u0010-\u001a\u00020\r2\u0006\u0010,\u001a\u00020\u000f2\u0014\u0010\u0013\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010(\u0012\u0004\u0012\u00020\r0\u0014H\u0016J\f\u0010.\u001a\u00020\u001e*\u00020/H\u0002J\r\u00100\u001a\u00020\u0015H\u0016¢\u0006\u0002\u00101J\u000f\u00102\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0002\u00101J\b\u00103\u001a\u00020\rH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00064"}, m90084d2 = {"Lcom/kubi/rn/core/biz/KCTurboTradeModuleImpl;", "Lcom/kubi/rn/core/turbo/NativeTradeTurboModuleAbs;", "ctx", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "marginCurrencyListDisposable", "Lio/reactivex/disposables/SerialDisposable;", "coinBridge", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiTradeModule;", "openOrderDetail", "", "orderId", "", "symbol", "bussinesType", "content", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "", "openNativeMarketsSymbolDialog", "level1", "level2", "level3", "data", "Lcom/facebook/react/bridge/ReadableMap;", "getContractTradeUnit", "getAlphaCurrencyInfo", "Lcom/kubi/rn/core/turbo/AlphaCurrencyInfo;", "currencySeq", "", "quoteCurrency", "getAlphaCurrencyInfoBatch", "", "getIsolatedMarginConfig", "Lcom/kubi/rn/core/turbo/IsolatedMarginConfig;", "getIsolatedMarginConfigBatch", "getMarginCurrencyList", "Lcom/kubi/rn/core/turbo/MarginCurrency;", "getMarginConfig", "Lcom/kubi/rn/core/turbo/MarginConfig;", "getMarginCurrency", FirebaseAnalytics.Param.CURRENCY, "fetchMarginCurrency", "toAlphaCurrencyInfo", "Lcom/kubi/data/entity/AlphaCurrencyInfoEntity;", "isUtaGray", "()Ljava/lang/Boolean;", "isUtaHasOpend", "invalidate", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@AutoService({NativeTradeTurboModuleAbs.class})
@SourceDebugExtension({"SMAP\nKCTurboTradeModuleImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCTurboTradeModuleImpl.kt\ncom/kubi/rn/core/biz/KCTurboTradeModuleImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,220:1\n1563#2:221\n1634#2,3:222\n1563#2:225\n1634#2,3:226\n1563#2:230\n1634#2,3:231\n1#3:229\n*S KotlinDebug\n*F\n+ 1 KCTurboTradeModuleImpl.kt\ncom/kubi/rn/core/biz/KCTurboTradeModuleImpl\n*L\n104#1:221\n104#1:222,3\n126#1:225\n126#1:226,3\n137#1:230\n137#1:231,3\n*E\n"})
public final class KCTurboTradeModuleImpl extends NativeTradeTurboModuleAbs {

    @NotNull
    private final CompositeDisposable compositeDisposable;

    @NotNull
    private final SerialDisposable marginCurrencyListDisposable;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getMarginCurrencyList$lambda$21(Function1 function1, Throwable th2) {
        function1.invoke(null);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.p110rn.core.turbo.NativeTradeTurboModuleAbs
    @Nullable
    public AlphaCurrencyInfo getAlphaCurrencyInfo(double currencySeq, boolean quoteCurrency) {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            AlphaCurrencyInfoEntity alphaCurrencyInfoEntityM85611s = C37890n.f85269a.m85611s(Long.valueOf((long) currencySeq), Boolean.valueOf(quoteCurrency));
            objM103844constructorimpl = Result.m103844constructorimpl(alphaCurrencyInfoEntityM85611s != null ? toAlphaCurrencyInfo(alphaCurrencyInfoEntityM85611s) : null);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        return (AlphaCurrencyInfo) (Result.m103850isFailureimpl(objM103844constructorimpl) ? null : objM103844constructorimpl);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KCTurboTradeModuleImpl(@NotNull ReactApplicationContext ctx) {
        super(ctx);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        this.compositeDisposable = compositeDisposable;
        SerialDisposable serialDisposable = new SerialDisposable();
        this.marginCurrencyListDisposable = serialDisposable;
        compositeDisposable.add(serialDisposable);
    }

    private final InterfaceC36569e0 coinBridge() {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl((InterfaceC36569e0) Router.f46192a.m56192n(InterfaceC36569e0.class));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        return (InterfaceC36569e0) objM103844constructorimpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getMarginCurrencyList$lambda$17(List list) {
        Intrinsics.checkNotNullParameter(list, "list");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            LeverCoinConfig leverCoinConfig = (LeverCoinConfig) it.next();
            arrayList.add(TradeTurboBridgeMapper.INSTANCE.toTurboMarginCurrency(leverCoinConfig, C37890n.f85269a.m85613u(leverCoinConfig.getCurrency()), ""));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getMarginCurrencyList$lambda$18(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (List) function1.invoke(p11);
    }

    private final AlphaCurrencyInfo toAlphaCurrencyInfo(AlphaCurrencyInfoEntity alphaCurrencyInfoEntity) {
        Double dValueOf;
        Double d11;
        Long currencySeq = alphaCurrencyInfoEntity.getCurrencySeq();
        if (currencySeq != null) {
            dValueOf = Double.valueOf(currencySeq.longValue());
            d11 = null;
        } else {
            dValueOf = null;
            d11 = null;
        }
        String siteType = alphaCurrencyInfoEntity.getSiteType();
        Long chainSeq = alphaCurrencyInfoEntity.getChainSeq();
        Double dValueOf2 = chainSeq != null ? Double.valueOf(chainSeq.longValue()) : d11;
        String chainLogo = alphaCurrencyInfoEntity.getChainLogo();
        Double d12 = d11;
        Double d13 = dValueOf2;
        String tokenIcon = alphaCurrencyInfoEntity.getTokenIcon();
        String tokenName = alphaCurrencyInfoEntity.getTokenName();
        String tokenFullName = alphaCurrencyInfoEntity.getTokenFullName();
        Integer tokenDecimal = alphaCurrencyInfoEntity.getTokenDecimal();
        Double dValueOf3 = tokenDecimal != null ? Double.valueOf(tokenDecimal.intValue()) : d12;
        String tokenAddress = alphaCurrencyInfoEntity.getTokenAddress();
        Long tokenBridgeId = alphaCurrencyInfoEntity.getTokenBridgeId();
        Double dValueOf4 = tokenBridgeId != null ? Double.valueOf(tokenBridgeId.longValue()) : d12;
        Boolean boolIsQuoteCurrency = alphaCurrencyInfoEntity.isQuoteCurrency();
        Long openingTime = alphaCurrencyInfoEntity.getOpeningTime();
        Double dValueOf5 = openingTime != null ? Double.valueOf(openingTime.longValue()) : d12;
        Long createdAt = alphaCurrencyInfoEntity.getCreatedAt();
        Double dValueOf6 = createdAt != null ? Double.valueOf(createdAt.longValue()) : d12;
        Integer upgradeStatus = alphaCurrencyInfoEntity.getUpgradeStatus();
        return new AlphaCurrencyInfo(dValueOf, siteType, d13, chainLogo, tokenIcon, tokenName, tokenFullName, dValueOf3, tokenAddress, dValueOf4, boolIsQuoteCurrency, dValueOf5, dValueOf6, upgradeStatus != null ? Double.valueOf(upgradeStatus.intValue()) : d12, alphaCurrencyInfoEntity.getChainId());
    }

    @Override // com.kubi.p110rn.core.turbo.NativeTradeTurboModuleAbs
    public void fetchMarginCurrency(@NotNull String currency, @NotNull Function1<? super MarginCurrency, Unit> callback) {
        Object objM103844constructorimpl;
        String currency2;
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            Result.Companion companion = Result.INSTANCE;
            LeverCoinConfig leverCoinConfigMo37707f = ILoanService.f32363a.get().mo37707f(currency, true);
            TradeTurboBridgeMapper tradeTurboBridgeMapper = TradeTurboBridgeMapper.INSTANCE;
            C37890n c37890n = C37890n.f85269a;
            if (leverCoinConfigMo37707f == null || (currency2 = leverCoinConfigMo37707f.getCurrency()) == null) {
                currency2 = currency;
            }
            objM103844constructorimpl = Result.m103844constructorimpl(tradeTurboBridgeMapper.toTurboMarginCurrency(leverCoinConfigMo37707f, c37890n.m85613u(currency2), currency));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103851isSuccessimpl(objM103844constructorimpl)) {
            callback.invoke(objM103844constructorimpl);
        }
        if (Result.m103847exceptionOrNullimpl(objM103844constructorimpl) != null) {
            callback.invoke(null);
        }
    }

    @Override // com.kubi.p110rn.core.turbo.NativeTradeTurboModuleAbs
    public void getAlphaCurrencyInfoBatch(@NotNull Function1<? super List<AlphaCurrencyInfo>, Unit> callback) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            Result.Companion companion = Result.INSTANCE;
            List<AlphaCurrencyInfoEntity> listM85612t = C37890n.f85269a.m85612t();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM85612t, 10));
            Iterator<T> it = listM85612t.iterator();
            while (it.hasNext()) {
                arrayList.add(toAlphaCurrencyInfo((AlphaCurrencyInfoEntity) it.next()));
            }
            objM103844constructorimpl = Result.m103844constructorimpl(arrayList);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103851isSuccessimpl(objM103844constructorimpl)) {
            callback.invoke((List) objM103844constructorimpl);
        }
        if (Result.m103847exceptionOrNullimpl(objM103844constructorimpl) != null) {
            callback.invoke(null);
        }
    }

    @Override // com.kubi.p110rn.core.turbo.NativeTradeTurboModuleAbs
    @Nullable
    public String getContractTradeUnit() {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(IKuMexService.f28731a.get().mo33288r());
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        return (String) objM103844constructorimpl;
    }

    @Override // com.kubi.p110rn.core.turbo.NativeTradeTurboModuleAbs
    @Nullable
    public IsolatedMarginConfig getIsolatedMarginConfig(@NotNull String symbol) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(TradeTurboBridgeMapper.INSTANCE.toTurboIsolatedMarginConfig(IMarginService.f32724a.get().mo37919S(symbol), symbol));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103847exceptionOrNullimpl(objM103844constructorimpl) != null) {
            objM103844constructorimpl = TradeTurboBridgeMapper.INSTANCE.toTurboIsolatedMarginConfig(null, symbol);
        }
        return (IsolatedMarginConfig) objM103844constructorimpl;
    }

    @Override // com.kubi.p110rn.core.turbo.NativeTradeTurboModuleAbs
    public void getIsolatedMarginConfigBatch(@NotNull Function1<? super List<IsolatedMarginConfig>, Unit> callback) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            Result.Companion companion = Result.INSTANCE;
            List<IsolatedMarginBridgeConfig> listMo37903A = IMarginService.f32724a.get().mo37903A();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listMo37903A, 10));
            for (IsolatedMarginBridgeConfig isolatedMarginBridgeConfig : listMo37903A) {
                TradeTurboBridgeMapper tradeTurboBridgeMapper = TradeTurboBridgeMapper.INSTANCE;
                String symbol = isolatedMarginBridgeConfig.getSymbol();
                if (symbol == null) {
                    symbol = "";
                }
                arrayList.add(tradeTurboBridgeMapper.toTurboIsolatedMarginConfig(isolatedMarginBridgeConfig, symbol));
            }
            objM103844constructorimpl = Result.m103844constructorimpl(arrayList);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103851isSuccessimpl(objM103844constructorimpl)) {
            callback.invoke(objM103844constructorimpl);
        }
        if (Result.m103847exceptionOrNullimpl(objM103844constructorimpl) != null) {
            callback.invoke(null);
        }
    }

    @Override // com.kubi.p110rn.core.turbo.NativeTradeTurboModuleAbs
    public void getMarginConfig(@NotNull Function1<? super MarginConfig, Unit> callback) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(TradeTurboBridgeMapper.INSTANCE.toTurboMarginConfig(IMarginService.f32724a.get().mo37906E()));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103851isSuccessimpl(objM103844constructorimpl)) {
            callback.invoke(objM103844constructorimpl);
        }
        if (Result.m103847exceptionOrNullimpl(objM103844constructorimpl) != null) {
            callback.invoke(null);
        }
    }

    @Override // com.kubi.p110rn.core.turbo.NativeTradeTurboModuleAbs
    @Nullable
    public MarginCurrency getMarginCurrency(@NotNull String currency) {
        Object objM103844constructorimpl;
        String currency2;
        Intrinsics.checkNotNullParameter(currency, "currency");
        try {
            Result.Companion companion = Result.INSTANCE;
            LeverCoinConfig leverCoinConfigMo37707f = ILoanService.f32363a.get().mo37707f(currency, false);
            TradeTurboBridgeMapper tradeTurboBridgeMapper = TradeTurboBridgeMapper.INSTANCE;
            C37890n c37890n = C37890n.f85269a;
            if (leverCoinConfigMo37707f == null || (currency2 = leverCoinConfigMo37707f.getCurrency()) == null) {
                currency2 = currency;
            }
            objM103844constructorimpl = Result.m103844constructorimpl(tradeTurboBridgeMapper.toTurboMarginCurrency(leverCoinConfigMo37707f, c37890n.m85613u(currency2), currency));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103847exceptionOrNullimpl(objM103844constructorimpl) != null) {
            objM103844constructorimpl = TradeTurboBridgeMapper.INSTANCE.toTurboMarginCurrency(null, null, currency);
        }
        return (MarginCurrency) objM103844constructorimpl;
    }

    @Override // com.kubi.p110rn.core.turbo.NativeTradeTurboModuleAbs
    public void getMarginCurrencyList(@NotNull final Function1<? super List<MarginCurrency>, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        SerialDisposable serialDisposable = this.marginCurrencyListDisposable;
        Observable observableM37702d = ILoanService.m37702d(ILoanService.f32363a.get(), false, 1, null);
        final Function1 function1 = new Function1() { // from class: com.kubi.rn.core.biz.l1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KCTurboTradeModuleImpl.getMarginCurrencyList$lambda$17((List) obj);
            }
        };
        Observable observableObserveOn = observableM37702d.map(new Function() { // from class: com.kubi.rn.core.biz.m1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return KCTurboTradeModuleImpl.getMarginCurrencyList$lambda$18(function1, obj);
            }
        }).observeOn(AndroidSchedulers.mainThread());
        final Function1 function2 = new Function1() { // from class: com.kubi.rn.core.biz.n1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KCTurboTradeModuleImpl.getMarginCurrencyList$lambda$19(callback, (List) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.rn.core.biz.o1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        };
        final Function1 function3 = new Function1() { // from class: com.kubi.rn.core.biz.p1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KCTurboTradeModuleImpl.getMarginCurrencyList$lambda$21(callback, (Throwable) obj);
            }
        };
        serialDisposable.set(observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.rn.core.biz.q1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                function3.invoke(obj);
            }
        }));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        this.compositeDisposable.dispose();
        super.invalidate();
    }

    @Override // com.kubi.p110rn.core.turbo.NativeTradeTurboModuleAbs
    @NotNull
    public Boolean isUtaGray() {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(Boolean.valueOf(IUnifyAccountService.f53155a.get().mo65008x()));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Boolean bool = Boolean.FALSE;
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = bool;
        }
        return (Boolean) objM103844constructorimpl;
    }

    @Override // com.kubi.p110rn.core.turbo.NativeTradeTurboModuleAbs
    @Nullable
    public Boolean isUtaHasOpend() {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(Boolean.valueOf(IUnifyAccountService.f53155a.get().mo64991e()));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Boolean bool = Boolean.FALSE;
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = bool;
        }
        return (Boolean) objM103844constructorimpl;
    }

    @Override // com.kubi.p110rn.core.turbo.NativeTradeTurboModuleAbs
    public void openNativeMarketsSymbolDialog(@Nullable String level1, @Nullable String level2, @Nullable String level3, @Nullable ReadableMap data, @NotNull final Function1<? super String, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        InterfaceC36569e0 interfaceC36569e0CoinBridge = coinBridge();
        if (interfaceC36569e0CoinBridge == null) {
            callback.invoke(null);
            return;
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        interfaceC36569e0CoinBridge.mo31590j(reactApplicationContext, null, KCTurboFileModuleImpl.SOURCE_RN, level1, level2, level3, data != null ? data.toHashMap() : null, new Function2() { // from class: com.kubi.rn.core.biz.k1
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KCTurboTradeModuleImpl.openNativeMarketsSymbolDialog$lambda$4(callback, (String) obj, (ProtocolException) obj2);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeTradeTurboModuleAbs
    public void openOrderDetail(@NotNull String orderId, @NotNull String symbol, @NotNull String bussinesType, @NotNull String content, @NotNull final Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(bussinesType, "bussinesType");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(callback, "callback");
        InterfaceC36569e0 interfaceC36569e0CoinBridge = coinBridge();
        if (interfaceC36569e0CoinBridge == null) {
            callback.invoke(null);
            return;
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        interfaceC36569e0CoinBridge.mo31587g(reactApplicationContext, null, KCTurboFileModuleImpl.SOURCE_RN, orderId, symbol, bussinesType, content, new Function2() { // from class: com.kubi.rn.core.biz.r1
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KCTurboTradeModuleImpl.openOrderDetail$lambda$2(callback, (Boolean) obj, (ProtocolException) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getMarginCurrencyList$lambda$19(Function1 function1, List list) {
        function1.invoke(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit openNativeMarketsSymbolDialog$lambda$4(Function1 function1, String str, ProtocolException protocolException) {
        function1.invoke(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit openOrderDetail$lambda$2(Function1 function1, Boolean bool, ProtocolException protocolException) {
        function1.invoke(bool);
        return Unit.INSTANCE;
    }
}
