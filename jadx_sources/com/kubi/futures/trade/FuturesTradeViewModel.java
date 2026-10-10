package com.kubi.futures.trade;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import bm.C4634g;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.reflect.TypeToken;
import com.kubi.broker.BrokerConfig;
import com.kubi.broker.MultiBizType;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.futures.data.platform.FuturesSpreadConfigService;
import com.kubi.kumex.data.market.model.FundingRateEntity;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.data.platform.model.PreferencesEntity;
import com.kubi.kumex.data.platform.model.SymbolConfig;
import com.kubi.kumex.data.platform.model.TradingNoticeEntity;
import com.kubi.kumex.data.platform.model.UserConfig;
import com.kubi.kumex.service.KuMexDepend;
import com.kubi.kumex.trade.FuturesFragment;
import com.kubi.kumex.utils.Log;
import com.kubi.mvi.p102vm.BaseVM;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.user.model.LoginUserEntity;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.tencent.qcloud.tuicore.TUIConstants;
import fm.C37567b;
import fm.C37571f;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.BiPredicate;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import ki.C41050b;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41727q2;
import kotlinx.coroutines.C41783z1;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.JobKt__JobKt;
import o00.C42911a;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p236em.C37213a;
import p236em.C37214b;
import p314hi.C38214b;
import p314hi.InterfaceC38213a;
import p314hi.InterfaceC38215c;
import p314hi.InterfaceC38216d;
import p314hi.InterfaceC38217e;
import p314hi.InterfaceC38218f;
import p314hi.InterfaceC38220h;
import p343ii.C38645a;
import p343ii.C38646b;
import p343ii.C38647c;
import p343ii.C38648d;
import p343ii.C38650f;
import p343ii.C38651g;
import p569qq.C43846g;
import p801yl.C46527h0;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Triple;
import p852kotlin.Unit;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import sh.EuropeComplianceSymbolDocEntity;
import sh0.InterfaceC44416b;

/* JADX INFO: compiled from: FuturesTradeViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010A\u001a\u00020BH\u0002J\b\u0010C\u001a\u00020BH\u0016J\b\u0010D\u001a\u00020BH\u0002J\b\u0010E\u001a\u00020BH\u0002J\b\u0010F\u001a\u00020BH\u0016J\b\u0010G\u001a\u00020BH\u0002J\u0010\u0010H\u001a\u00020B2\u0006\u0010I\u001a\u00020JH\u0002J\u0010\u0010K\u001a\u00020B2\u0006\u0010L\u001a\u00020\u0005H\u0002J\u0006\u0010K\u001a\u00020BJ\b\u0010M\u001a\u00020BH\u0002J\u0010\u0010N\u001a\u00020B2\u0006\u0010O\u001a\u00020PH\u0002J\u0010\u0010Q\u001a\u00020B2\u0006\u0010R\u001a\u00020SH\u0002J\u0010\u0010T\u001a\u00020B2\u0006\u0010U\u001a\u00020VH\u0002J\u0010\u0010W\u001a\u00020B2\u0006\u0010I\u001a\u00020JH\u0002J\r\u0010%\u001a\t\u0018\u00010$¢\u0006\u0002\bXJ\r\u0010\u0013\u001a\t\u0018\u00010\u0012¢\u0006\u0002\bXJ\u0006\u0010Y\u001a\u00020*J\r\u0010Z\u001a\t\u0018\u00010\u001c¢\u0006\u0002\bXJ\r\u0010 \u001a\t\u0018\u00010\u001f¢\u0006\u0002\bXJ\r\u0010[\u001a\t\u0018\u00010\u0019¢\u0006\u0002\bXJ\b\u0010(\u001a\u0004\u0018\u00010'J\r\u0010\\\u001a\t\u0018\u00010\u0016¢\u0006\u0002\bXJ\u0006\u0010]\u001a\u000205J\u0006\u00106\u001a\u000205J\u0016\u0010^\u001a\u00020B2\u0006\u0010L\u001a\u00020\u00052\u0006\u0010_\u001a\u00020\u0005J\u0016\u0010`\u001a\u00020B2\u0006\u0010L\u001a\u00020\u00052\u0006\u0010_\u001a\u00020\u0005J\u000e\u0010a\u001a\u00020B2\u0006\u0010L\u001a\u00020\u0005J\u0010\u0010b\u001a\u00020B2\b\u0010c\u001a\u0004\u0018\u00010\u0005J\b\u0010d\u001a\u00020BH\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0011¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00050\u0011¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0014R\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u0011¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0014R\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u0011¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0014R\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u0011¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0014R#\u0010,\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020/0-0\u0011¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u0014R\u0017\u00101\u001a\b\u0012\u0004\u0012\u0002020\u0011¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u0014R\u0017\u00104\u001a\b\u0012\u0004\u0012\u0002050\u0011¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\u0014R\u0010\u00107\u001a\u0004\u0018\u000108X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u00109\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\u0005\u0018\u00010:X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020/X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010=\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010\u000f\u001a\u0004\b>\u0010?¨\u0006e"}, m90084d2 = {"Lcom/kubi/futures/trade/FuturesTradeViewModel;", "Lcom/kubi/mvi/vm/BaseVM;", "<init>", "()V", "tag", "", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "settleContractDisposable", "Lio/reactivex/disposables/Disposable;", "frequentlyScope", "Lkotlinx/coroutines/CoroutineScope;", "getFrequentlyScope", "()Lkotlinx/coroutines/CoroutineScope;", "frequentlyScope$delegate", "Lkotlin/Lazy;", "contractConfig", "Landroidx/lifecycle/MutableLiveData;", "Lcom/kubi/futures/trade/config/IFuturesContractConfig;", "getContractConfig", "()Landroidx/lifecycle/MutableLiveData;", "envConfig", "Lcom/kubi/futures/trade/config/IFuturesEnvironmentConfig;", "getEnvConfig", "preferencesSetting", "Lcom/kubi/futures/trade/config/IFuturesPreferencesSetting;", "getPreferencesSetting", "noticeSetting", "Lcom/kubi/futures/trade/config/IFuturesNoticeSetting;", "getNoticeSetting", "priceConfig", "Lcom/kubi/futures/trade/config/IFuturesPriceConfig;", "getPriceConfig", "quickOrderPriceLiveData", "getQuickOrderPriceLiveData", "userConfig", "Lcom/kubi/futures/trade/config/IFuturesUserConfig;", "getUserConfig", "symbolConfig", "Lcom/kubi/futures/trade/config/IFuturesSymbolConfig;", "getSymbolConfig", "bookItemCount", "", "getBookItemCount", "settleContract", "Lkotlin/Pair;", "", "", "getSettleContract", "europeComplianceDoc", "Lcom/kubi/futures/data/compliance/entity/EuropeComplianceSymbolDocEntity;", "getEuropeComplianceDoc", "estimatePriceSpread", "Ljava/math/BigDecimal;", "getEstimatePriceSpread", "spreadConfigJob", "Lkotlinx/coroutines/Job;", "spreadRequestKey", "Lkotlin/Triple;", "Lcom/kubi/broker/MultiBizType;", "spreadRequestId", "crossMaxQtyBufferCache", "getCrossMaxQtyBufferCache", "()Ljava/math/BigDecimal;", "crossMaxQtyBufferCache$delegate", "bindContractStatus", "", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "unBindFrequentlyScope", "bindFrequentlyScope", RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "initConfigs", "onContractChanged", "contract", "Lcom/kubi/kumex/data/platform/model/ContractEntity;", "refreshEstimatePriceSpread", "symbol", "onEnvironmentConfigChanged", "onPreferencesSettingsChanged", "preferences", "Lcom/kubi/kumex/data/platform/model/PreferencesEntity;", "onNoticeSettingsChanged", TUIConstants.TUIChat.NOTICE, "Lcom/kubi/kumex/data/platform/model/TradingNoticeEntity;", "onUserConfigChanged", "config", "Lcom/kubi/kumex/data/platform/model/UserConfig;", "handleSettleContract", "Lorg/jspecify/annotations/Nullable;", "getAvailableBalancePrecision", "getNoticeSettings", "getPreferencesSettings", "getEnvironmentConfig", "getCrossMaxQtyBuffer", "submitLeverage", "leverage", "modifyLeverageByMarginMode", "fetchEuropeComplianceDoc", "postQuickOrderPrice", FirebaseAnalytics.Param.PRICE, "onCleared", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFuturesTradeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FuturesTradeViewModel.kt\ncom/kubi/futures/trade/FuturesTradeViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 4 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,596:1\n1#2:597\n35#3,4:598\n39#3:604\n44#4,2:602\n*S KotlinDebug\n*F\n+ 1 FuturesTradeViewModel.kt\ncom/kubi/futures/trade/FuturesTradeViewModel\n*L\n166#1:598,4\n166#1:604\n166#1:602,2\n*E\n"})
public final class FuturesTradeViewModel extends BaseVM {

    /* JADX INFO: renamed from: V */
    @NotNull
    public final String f23612V = "FuturesTradeViewModel";

    /* JADX INFO: renamed from: W */
    @NotNull
    public final CompositeDisposable f23613W;

    /* JADX INFO: renamed from: X */
    @Nullable
    public Disposable f23614X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f23615Y;

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final MutableLiveData<InterfaceC38213a> f23616Z;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final MutableLiveData<InterfaceC38215c> f23617a0;

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final MutableLiveData<InterfaceC38217e> f23618b0;

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final MutableLiveData<InterfaceC38216d> f23619c0;

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public final MutableLiveData<InterfaceC38218f> f23620d0;

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public final MutableLiveData<String> f23621e0;

    /* JADX INFO: renamed from: f0 */
    @NotNull
    public final MutableLiveData<InterfaceC38220h> f23622f0;

    /* JADX INFO: renamed from: g0 */
    @NotNull
    public final MutableLiveData<Object> f23623g0;

    /* JADX INFO: renamed from: h0 */
    @NotNull
    public final MutableLiveData<Integer> f23624h0;

    /* JADX INFO: renamed from: i0 */
    @NotNull
    public final MutableLiveData<Pair<Boolean, Long>> f23625i0;

    /* JADX INFO: renamed from: j0 */
    @NotNull
    public final MutableLiveData<EuropeComplianceSymbolDocEntity> f23626j0;

    /* JADX INFO: renamed from: k0 */
    @NotNull
    public final MutableLiveData<BigDecimal> f23627k0;

    /* JADX INFO: renamed from: l0 */
    @Nullable
    public InterfaceC41775x1 f23628l0;

    /* JADX INFO: renamed from: m0 */
    @Nullable
    public Triple<String, ? extends MultiBizType, String> f23629m0;

    /* JADX INFO: renamed from: n0 */
    public long f23630n0;

    /* JADX INFO: renamed from: o0 */
    @NotNull
    public final Lazy f23631o0;

    /* JADX INFO: renamed from: com.kubi.futures.trade.FuturesTradeViewModel$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C13606a extends TypeToken<BigDecimal> {
    }

    /* JADX INFO: renamed from: U0 */
    public static final InterfaceC41709m0 m26620U0() {
        return C41713n0.m91125a(C41727q2.m91192b(null, 1, null));
    }

    /* JADX INFO: renamed from: A0 */
    public static final boolean m26583A0(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: B0 */
    public static final SymbolConfig m26585B0(Map.Entry it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (SymbolConfig) it.getValue();
    }

    /* JADX INFO: renamed from: C0 */
    public static final SymbolConfig m26587C0(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (SymbolConfig) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: D0 */
    public static final Unit m26589D0(FuturesTradeViewModel futuresTradeViewModel, SymbolConfig symbolConfig) {
        MutableLiveData<Object> mutableLiveData = futuresTradeViewModel.f23623g0;
        Intrinsics.checkNotNull(symbolConfig);
        mutableLiveData.setValue(new C38650f(symbolConfig));
        Log.f30813a.m36617c(futuresTradeViewModel.f23612V, "onSymbolConfigChanged:" + symbolConfig);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F0 */
    public static final Unit m26593F0(FuturesTradeViewModel futuresTradeViewModel, Throwable th2) {
        Log log = Log.f30813a;
        String str = futuresTradeViewModel.f23612V + "-observeSymbolConfig";
        Intrinsics.checkNotNull(th2);
        log.m36616b(str, th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J0 */
    public static final Unit m26601J0(FuturesTradeViewModel futuresTradeViewModel, Throwable th2) {
        Log log = Log.f30813a;
        String str = futuresTradeViewModel.f23612V + "-observeContract";
        Intrinsics.checkNotNull(th2);
        log.m36616b(str, th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: S0 */
    public static final BigDecimal m26617S0() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new C13606a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("futures_android_cross_max_qty_buffer", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        BigDecimal bigDecimal = (BigDecimal) objM20457a;
        return bigDecimal == null ? BigDecimal.ONE : bigDecimal;
    }

    /* JADX INFO: renamed from: W */
    public static final Unit m26622W(FuturesTradeViewModel futuresTradeViewModel, Throwable th2) {
        Log log = Log.f30813a;
        String str = futuresTradeViewModel.f23612V + "-observeSpreadRefresh";
        Intrinsics.checkNotNull(th2);
        log.m36616b(str, th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a0 */
    public static final Unit m26626a0(FuturesTradeViewModel futuresTradeViewModel, Throwable th2) {
        Log log = Log.f30813a;
        String str = futuresTradeViewModel.f23612V + "-getUserInfoObs";
        Intrinsics.checkNotNull(th2);
        log.m36616b(str, th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e0 */
    public static final Unit m26633e0(FuturesTradeViewModel futuresTradeViewModel, Throwable th2) {
        Log log = Log.f30813a;
        String str = futuresTradeViewModel.f23612V + "-observePreferencesSettings";
        Intrinsics.checkNotNull(th2);
        log.m36616b(str, th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g0 */
    public static final boolean m26637g0(ContractEntity last, ContractEntity current) {
        Intrinsics.checkNotNullParameter(last, "last");
        Intrinsics.checkNotNullParameter(current, "current");
        return Intrinsics.areEqual(last, current);
    }

    /* JADX INFO: renamed from: j0 */
    public static final Unit m26643j0(FuturesTradeViewModel futuresTradeViewModel, Throwable th2) {
        Log log = Log.f30813a;
        String str = futuresTradeViewModel.f23612V + "-observePreferencesSettings";
        Intrinsics.checkNotNull(th2);
        log.m36616b(str, th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o0 */
    public static final Unit m26650o0(FuturesTradeViewModel futuresTradeViewModel, Throwable th2) {
        Log log = Log.f30813a;
        String str = futuresTradeViewModel.f23612V + "-observeLot";
        Intrinsics.checkNotNull(th2);
        log.m36616b(str, th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q0 */
    public static final InterfaceC44416b m26654q0(Map it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Flowable.fromIterable(it.entrySet());
    }

    /* JADX INFO: renamed from: q1 */
    public static final boolean m26655q1(long j11, Long it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.longValue() < j11 / 1000;
    }

    /* JADX INFO: renamed from: r1 */
    public static final boolean m26657r1(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: s1 */
    public static final Unit m26659s1(FuturesTradeViewModel futuresTradeViewModel, ContractEntity contractEntity, Long l11) {
        futuresTradeViewModel.f23625i0.postValue(new Pair<>(Boolean.TRUE, Long.valueOf(C27039d.m66652l(contractEntity.getSettleDate()) - RepositoryServiceLocator.f19236a.m20288g().mo25031v())));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x0 */
    public static final InterfaceC44416b m26668x0(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (InterfaceC44416b) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: y0 */
    public static final boolean m26670y0(Function2 function2, Object p11, Object p12) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        Intrinsics.checkNotNullParameter(p12, "p1");
        return ((Boolean) function2.invoke(p11, p12)).booleanValue();
    }

    /* JADX INFO: renamed from: z0 */
    public static final boolean m26672z0(FuturesTradeViewModel futuresTradeViewModel, Map.Entry it) {
        Intrinsics.checkNotNullParameter(it, "it");
        InterfaceC38220h value = futuresTradeViewModel.f23622f0.getValue();
        return Intrinsics.areEqual(C27041f.m66669i(value != null ? value.mo86284a() : null, C4634g.m4564a()), it.getKey());
    }

    /* JADX INFO: renamed from: A1 */
    public final void m26673A1(TradingNoticeEntity tradingNoticeEntity) {
        this.f23619c0.setValue(new C38647c(tradingNoticeEntity));
        Log.f30813a.m36617c(this.f23612V, "onNoticeSettingsChanged:" + tradingNoticeEntity);
    }

    /* JADX INFO: renamed from: B1 */
    public final void m26674B1(PreferencesEntity preferencesEntity) {
        this.f23618b0.setValue(new C38648d(preferencesEntity));
        Log.f30813a.m36617c(this.f23612V, "onPreferencesSettingsChanged:" + preferencesEntity);
    }

    /* JADX INFO: renamed from: C1 */
    public final void m26675C1(UserConfig userConfig) {
        C41050b.f91264a.m90025h(C37571f.m84698e(userConfig));
        this.f23622f0.setValue(new C38651g(userConfig));
        Log.f30813a.m36617c(this.f23612V, "onUserConfigChanged:" + userConfig);
    }

    /* JADX INFO: renamed from: D1 */
    public final void m26676D1(@Nullable String str) {
        if (str != null) {
            if (StringsKt.isBlank(str)) {
                str = null;
            }
            if (str == null) {
                return;
            }
            this.f23621e0.postValue(str);
        }
    }

    /* JADX INFO: renamed from: E1 */
    public final void m26677E1() {
        String symbol;
        InterfaceC38213a value = this.f23616Z.getValue();
        if (value == null || (symbol = value.getSymbol()) == null) {
            return;
        }
        if (StringsKt.isBlank(symbol)) {
            symbol = null;
        }
        if (symbol != null) {
            m26678F1(symbol);
        }
    }

    /* JADX INFO: renamed from: F1 */
    public final void m26678F1(String str) {
        InterfaceC41775x1 interfaceC41775x1;
        MultiBizType multiBizTypeMo4515x = BrokerConfig.f19211a.m20201d().mo4515x();
        Triple<String, ? extends MultiBizType, String> triple = new Triple<>(str, multiBizTypeMo4515x, KuMexDepend.f30378a.m35905g().d());
        if (Intrinsics.areEqual(this.f23629m0, triple) && (interfaceC41775x1 = this.f23628l0) != null && interfaceC41775x1.isActive()) {
            Log.f30813a.m36617c(this.f23612V, "spread refresh reuse requestId=" + this.f23630n0 + " symbol=" + str + " bizType=" + multiBizTypeMo4515x.getValue() + "; request already in flight");
            return;
        }
        long j11 = this.f23630n0 + 1;
        this.f23630n0 = j11;
        BigDecimal bigDecimalM24884b = FuturesSpreadConfigService.f22739a.m24884b(str, multiBizTypeMo4515x);
        this.f23627k0.setValue(bigDecimalM24884b);
        Log.f30813a.m36617c(this.f23612V, "spread refresh start requestId=" + j11 + " symbol=" + str + " bizType=" + multiBizTypeMo4515x.getValue() + " cached=" + bigDecimalM24884b);
        InterfaceC41775x1 interfaceC41775x2 = this.f23628l0;
        if (interfaceC41775x2 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x2, null, 1, null);
        }
        this.f23629m0 = triple;
        this.f23628l0 = C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b(), null, new FuturesTradeViewModel$refreshEstimatePriceSpread$1(str, multiBizTypeMo4515x, this, j11, null), 2, null);
    }

    /* JADX INFO: renamed from: G1 */
    public final void m26679G1(@NotNull String symbol, @NotNull String leverage) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(leverage, "leverage");
        HashMap map = new HashMap();
        map.put("leverage", leverage);
        map.put("symbol", symbol);
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C37213a.m83254d().plus(C42911a.m94120b()), null, new FuturesTradeViewModel$submitLeverage$1(map, null), 2, null);
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m26681Q0() {
        Log.f30813a.m36617c(this.f23612V, "bindContractStatus");
        C41696j.m91104d(m26694f1(), C37213a.m83254d(), null, new FuturesTradeViewModel$bindContractStatus$1(this, null), 2, null);
    }

    /* JADX INFO: renamed from: T0 */
    public final void m26683T0(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        InterfaceC38215c value = this.f23617a0.getValue();
        if (C27025c.m66566d(value != null ? Boolean.valueOf(value.mo86268m()) : null)) {
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), C37213a.m83254d(), null, new FuturesTradeViewModel$fetchEuropeComplianceDoc$1(symbol, this, null), 2, null);
        } else {
            this.f23626j0.postValue(new EuropeComplianceSymbolDocEntity(null, null, null, null, null, null, null, null, null, null, 1023, null));
        }
    }

    /* JADX INFO: renamed from: V0 */
    public final int m26684V0() {
        InterfaceC38213a value = this.f23616Z.getValue();
        return C27039d.m66651k(value != null ? Integer.valueOf(C38214b.m86264m(value)) : null, 2);
    }

    @NotNull
    /* JADX INFO: renamed from: W0 */
    public final MutableLiveData<Integer> m26685W0() {
        return this.f23624h0;
    }

    @NotNull
    /* JADX INFO: renamed from: X0 */
    public final MutableLiveData<InterfaceC38213a> m26686X0() {
        return this.f23616Z;
    }

    @Nullable
    /* JADX INFO: renamed from: Y0 */
    public final InterfaceC38213a m26687Y0() {
        return this.f23616Z.getValue();
    }

    /* JADX INFO: renamed from: a1 */
    public final BigDecimal m26689a1() {
        Object value = this.f23631o0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (BigDecimal) value;
    }

    @NotNull
    /* JADX INFO: renamed from: b1 */
    public final MutableLiveData<InterfaceC38215c> m26690b1() {
        return this.f23617a0;
    }

    @NotNull
    /* JADX INFO: renamed from: c1 */
    public final MutableLiveData<BigDecimal> m26691c1() {
        return this.f23627k0;
    }

    @NotNull
    /* JADX INFO: renamed from: d1 */
    public final BigDecimal m26692d1() {
        BigDecimal value = this.f23627k0.getValue();
        return value == null ? FuturesSpreadConfigService.f22739a.m24887e() : value;
    }

    @NotNull
    /* JADX INFO: renamed from: e1 */
    public final MutableLiveData<EuropeComplianceSymbolDocEntity> m26693e1() {
        return this.f23626j0;
    }

    /* JADX INFO: renamed from: f1 */
    public final InterfaceC41709m0 m26694f1() {
        return (InterfaceC41709m0) this.f23615Y.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: g1 */
    public final InterfaceC38216d m26695g1() {
        return this.f23619c0.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: h1 */
    public final MutableLiveData<InterfaceC38217e> m26696h1() {
        return this.f23618b0;
    }

    @Nullable
    /* JADX INFO: renamed from: i1 */
    public final InterfaceC38217e m26697i1() {
        return this.f23618b0.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: j1 */
    public final MutableLiveData<InterfaceC38218f> m26698j1() {
        return this.f23620d0;
    }

    @Nullable
    /* JADX INFO: renamed from: k1 */
    public final InterfaceC38218f m26699k1() {
        return this.f23620d0.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: l1 */
    public final MutableLiveData<String> m26700l1() {
        return this.f23621e0;
    }

    @NotNull
    /* JADX INFO: renamed from: m1 */
    public final MutableLiveData<Pair<Boolean, Long>> m26701m1() {
        return this.f23625i0;
    }

    @NotNull
    /* JADX INFO: renamed from: n1 */
    public final MutableLiveData<InterfaceC38220h> m26702n1() {
        return this.f23622f0;
    }

    @Nullable
    /* JADX INFO: renamed from: o1 */
    public final InterfaceC38220h m26703o1() {
        return this.f23622f0.getValue();
    }

    /* JADX INFO: renamed from: w1 */
    public final void m26705w1() {
        this.f23617a0.setValue(new C38646b());
        MutableLiveData<InterfaceC38217e> mutableLiveData = this.f23618b0;
        RepositoryServiceLocator repositoryServiceLocator = RepositoryServiceLocator.f19236a;
        mutableLiveData.setValue(new C38648d(repositoryServiceLocator.m20290i().mo99988m()));
        this.f23619c0.setValue(new C38647c(repositoryServiceLocator.m20290i().mo99985g()));
        this.f23622f0.setValue(new C38651g(repositoryServiceLocator.m20290i().mo99981F0()));
    }

    /* JADX INFO: renamed from: x1 */
    public final void m26706x1(@NotNull String symbol, @NotNull String leverage) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(leverage, "leverage");
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C37213a.m83254d().plus(C42911a.m94120b()), null, new FuturesTradeViewModel$modifyLeverageByMarginMode$1(symbol, this, leverage, null), 2, null);
    }

    /* JADX INFO: renamed from: y1 */
    public final void m26707y1(ContractEntity contractEntity) {
        C38645a c38645a = new C38645a(contractEntity);
        C41050b.f91264a.m90024g(c38645a);
        this.f23616Z.setValue(c38645a);
        MutableLiveData<Object> mutableLiveData = this.f23623g0;
        SymbolConfig symbolConfigMo24996X = RepositoryServiceLocator.f19236a.m20288g().mo24996X(C27041f.m66668h(contractEntity.getSymbol()));
        if (symbolConfigMo24996X == null) {
            symbolConfigMo24996X = new SymbolConfig();
        }
        mutableLiveData.setValue(new C38650f(symbolConfigMo24996X));
        m26682R0();
        m26704p1(contractEntity);
        m26683T0(C27041f.m66668h(contractEntity.getSymbol()));
        m26678F1(C27041f.m66668h(contractEntity.getSymbol()));
        Log.f30813a.m36617c(this.f23612V, "onContractChanged:" + contractEntity.getSymbol());
    }

    /* JADX INFO: renamed from: z1 */
    public final void m26708z1() {
        String symbol;
        this.f23617a0.postValue(new C38646b());
        InterfaceC38213a value = this.f23616Z.getValue();
        if (value != null && (symbol = value.getSymbol()) != null) {
            if (StringsKt.isBlank(symbol)) {
                symbol = null;
            }
            if (symbol != null) {
                m26678F1(symbol);
            }
        }
        Log.f30813a.m36617c(this.f23612V, "onEnvironmentConfigChanged:用户信息发生变更");
    }

    public FuturesTradeViewModel() {
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        this.f23613W = compositeDisposable;
        this.f23615Y = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.trade.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FuturesTradeViewModel.m26620U0();
            }
        });
        this.f23616Z = new MutableLiveData<>();
        this.f23617a0 = new MutableLiveData<>();
        this.f23618b0 = new MutableLiveData<>();
        this.f23619c0 = new MutableLiveData<>();
        this.f23620d0 = new MutableLiveData<>();
        this.f23621e0 = new MutableLiveData<>();
        this.f23622f0 = new MutableLiveData<>();
        this.f23623g0 = new MutableLiveData<>();
        this.f23624h0 = new MutableLiveData<>();
        this.f23625i0 = new MutableLiveData<>();
        this.f23626j0 = new MutableLiveData<>();
        this.f23627k0 = new MutableLiveData<>(FuturesSpreadConfigService.f22739a.m24887e());
        this.f23631o0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.trade.i
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FuturesTradeViewModel.m26617S0();
            }
        });
        m26705w1();
        C46527h0 c46527h0 = C46527h0.f104291a;
        Flowable<ContractEntity> flowableM102687W = c46527h0.m102687W();
        FuturesFragment.Companion companion = FuturesFragment.f30411o0;
        Flowable flowableMerge = Flowable.merge(flowableM102687W, companion.observeRefresh(), c46527h0.m102689m0());
        final Function2 function2 = new Function2() { // from class: com.kubi.futures.trade.u
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(FuturesTradeViewModel.m26637g0((ContractEntity) obj, (ContractEntity) obj2));
            }
        };
        Flowable flowableObserveOn = flowableMerge.distinctUntilChanged(new BiPredicate() { // from class: com.kubi.futures.trade.e0
            @Override // io.reactivex.functions.BiPredicate
            public final boolean test(Object obj, Object obj2) {
                return FuturesTradeViewModel.m26670y0(function2, obj, obj2);
            }
        }).subscribeOn(C42916f.m94127f()).observeOn(C42916f.m94128g());
        final Function1 function1 = new Function1() { // from class: com.kubi.futures.trade.f0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesTradeViewModel.m26597H0(this.f23774b, (ContractEntity) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.futures.trade.g0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FuturesTradeViewModel.m26599I0(function1, obj);
            }
        };
        final Function1 function3 = new Function1() { // from class: com.kubi.futures.trade.h0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesTradeViewModel.m26601J0(this.f23777b, (Throwable) obj);
            }
        };
        compositeDisposable.add(flowableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.futures.trade.i0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FuturesTradeViewModel.m26603K0(function3, obj);
            }
        }));
        Flowable<ContractEntity> flowableObserveOn2 = companion.observeRefresh().observeOn(C42916f.m94128g());
        final Function1 function4 = new Function1() { // from class: com.kubi.futures.trade.j0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesTradeViewModel.m26605L0(this.f23780b, (ContractEntity) obj);
            }
        };
        Consumer<? super ContractEntity> consumer2 = new Consumer() { // from class: com.kubi.futures.trade.k0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FuturesTradeViewModel.m26607M0(function4, obj);
            }
        };
        final Function1 function5 = new Function1() { // from class: com.kubi.futures.trade.r
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesTradeViewModel.m26622W(this.f24456b, (Throwable) obj);
            }
        };
        compositeDisposable.add(flowableObserveOn2.subscribe(consumer2, new Consumer() { // from class: com.kubi.futures.trade.c0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FuturesTradeViewModel.m26623X(function5, obj);
            }
        }));
        Observable observableObserveOn = KuMexDepend.f30378a.m35905g().m().observeOn(C42916f.m94128g());
        final Function1 function6 = new Function1() { // from class: com.kubi.futures.trade.n0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesTradeViewModel.m26624Y(this.f23875b, (LoginUserEntity) obj);
            }
        };
        Consumer consumer3 = new Consumer() { // from class: com.kubi.futures.trade.s0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FuturesTradeViewModel.m26625Z(function6, obj);
            }
        };
        final Function1 function7 = new Function1() { // from class: com.kubi.futures.trade.t0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesTradeViewModel.m26626a0(this.f24460b, (Throwable) obj);
            }
        };
        compositeDisposable.add(observableObserveOn.subscribe(consumer3, new Consumer() { // from class: com.kubi.futures.trade.u0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FuturesTradeViewModel.m26628b0(function7, obj);
            }
        }));
        RepositoryServiceLocator repositoryServiceLocator = RepositoryServiceLocator.f19236a;
        Observable<PreferencesEntity> observableObserveOn2 = repositoryServiceLocator.m20290i().mo99990p().subscribeOn(C42916f.m94127f()).observeOn(C42916f.m94128g());
        final Function1 function8 = new Function1() { // from class: com.kubi.futures.trade.v0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesTradeViewModel.m26629c0(this.f24466b, (PreferencesEntity) obj);
            }
        };
        Consumer<? super PreferencesEntity> consumer4 = new Consumer() { // from class: com.kubi.futures.trade.w0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FuturesTradeViewModel.m26631d0(function8, obj);
            }
        };
        final Function1 function9 = new Function1() { // from class: com.kubi.futures.trade.x0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesTradeViewModel.m26633e0(this.f24966b, (Throwable) obj);
            }
        };
        compositeDisposable.add(observableObserveOn2.subscribe(consumer4, new Consumer() { // from class: com.kubi.futures.trade.h
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FuturesTradeViewModel.m26635f0(function9, obj);
            }
        }));
        Observable<TradingNoticeEntity> observableObserveOn3 = repositoryServiceLocator.m20290i().mo99994t().subscribeOn(C42916f.m94127f()).observeOn(C42916f.m94128g());
        final Function1 function10 = new Function1() { // from class: com.kubi.futures.trade.j
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesTradeViewModel.m26639h0(this.f23779b, (TradingNoticeEntity) obj);
            }
        };
        Consumer<? super TradingNoticeEntity> consumer5 = new Consumer() { // from class: com.kubi.futures.trade.k
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FuturesTradeViewModel.m26641i0(function10, obj);
            }
        };
        final Function1 function11 = new Function1() { // from class: com.kubi.futures.trade.l
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesTradeViewModel.m26643j0(this.f23783b, (Throwable) obj);
            }
        };
        compositeDisposable.add(observableObserveOn3.subscribe(consumer5, new Consumer() { // from class: com.kubi.futures.trade.m
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FuturesTradeViewModel.m26645l0(function11, obj);
            }
        }));
        Flowable<UserConfig> flowableObserveOn3 = repositoryServiceLocator.m20290i().mo99989o().subscribeOn(C42916f.m94127f()).observeOn(C42916f.m94128g());
        final Function1 function12 = new Function1() { // from class: com.kubi.futures.trade.n
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesTradeViewModel.m26646m0(this.f23874b, (UserConfig) obj);
            }
        };
        Consumer<? super UserConfig> consumer6 = new Consumer() { // from class: com.kubi.futures.trade.o
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FuturesTradeViewModel.m26648n0(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: com.kubi.futures.trade.p
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesTradeViewModel.m26650o0(this.f24050b, (Throwable) obj);
            }
        };
        compositeDisposable.add(flowableObserveOn3.subscribe(consumer6, new Consumer() { // from class: com.kubi.futures.trade.q
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FuturesTradeViewModel.m26652p0(function13, obj);
            }
        }));
        Flowable<Map<String, SymbolConfig>> flowableMo24988P = repositoryServiceLocator.m20288g().mo24988P();
        final Function1 function14 = new Function1() { // from class: com.kubi.futures.trade.s
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesTradeViewModel.m26654q0((Map) obj);
            }
        };
        Flowable<R> flowableFlatMap = flowableMo24988P.flatMap(new Function() { // from class: com.kubi.futures.trade.t
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return FuturesTradeViewModel.m26668x0(function14, obj);
            }
        });
        final Function1 function15 = new Function1() { // from class: com.kubi.futures.trade.v
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(FuturesTradeViewModel.m26672z0(this.f24465b, (Map.Entry) obj));
            }
        };
        Flowable flowableFilter = flowableFlatMap.filter(new Predicate() { // from class: com.kubi.futures.trade.w
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return FuturesTradeViewModel.m26583A0(function15, obj);
            }
        });
        final Function1 function16 = new Function1() { // from class: com.kubi.futures.trade.x
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesTradeViewModel.m26585B0((Map.Entry) obj);
            }
        };
        Flowable flowableObserveOn4 = flowableFilter.map(new Function() { // from class: com.kubi.futures.trade.y
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return FuturesTradeViewModel.m26587C0(function16, obj);
            }
        }).subscribeOn(C42916f.m94127f()).observeOn(C42916f.m94128g());
        final Function1 function17 = new Function1() { // from class: com.kubi.futures.trade.z
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesTradeViewModel.m26589D0(this.f24968b, (SymbolConfig) obj);
            }
        };
        Consumer consumer7 = new Consumer() { // from class: com.kubi.futures.trade.a0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FuturesTradeViewModel.m26591E0(function17, obj);
            }
        };
        final Function1 function18 = new Function1() { // from class: com.kubi.futures.trade.b0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesTradeViewModel.m26593F0(this.f23647b, (Throwable) obj);
            }
        };
        compositeDisposable.add(flowableObserveOn4.subscribe(consumer7, new Consumer() { // from class: com.kubi.futures.trade.d0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FuturesTradeViewModel.m26595G0(function18, obj);
            }
        }));
    }

    /* JADX INFO: renamed from: E0 */
    public static final void m26591E0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: G0 */
    public static final void m26595G0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: H0 */
    public static final Unit m26597H0(FuturesTradeViewModel futuresTradeViewModel, ContractEntity contractEntity) {
        Intrinsics.checkNotNull(contractEntity);
        futuresTradeViewModel.m26707y1(contractEntity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I0 */
    public static final void m26599I0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: K0 */
    public static final void m26603K0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: L0 */
    public static final Unit m26605L0(FuturesTradeViewModel futuresTradeViewModel, ContractEntity contractEntity) {
        String strM66668h = C27041f.m66668h(contractEntity.getSymbol());
        Log.f30813a.m36617c(futuresTradeViewModel.f23612V, "spread refresh triggered by page refresh symbol=" + strM66668h);
        futuresTradeViewModel.m26678F1(strM66668h);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: M0 */
    public static final void m26607M0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: X */
    public static final void m26623X(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Y */
    public static final Unit m26624Y(FuturesTradeViewModel futuresTradeViewModel, LoginUserEntity loginUserEntity) {
        futuresTradeViewModel.m26708z1();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Z */
    public static final void m26625Z(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: b0 */
    public static final void m26628b0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: c0 */
    public static final Unit m26629c0(FuturesTradeViewModel futuresTradeViewModel, PreferencesEntity preferencesEntity) {
        Intrinsics.checkNotNull(preferencesEntity);
        futuresTradeViewModel.m26674B1(preferencesEntity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d0 */
    public static final void m26631d0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: f0 */
    public static final void m26635f0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: h0 */
    public static final Unit m26639h0(FuturesTradeViewModel futuresTradeViewModel, TradingNoticeEntity tradingNoticeEntity) {
        Intrinsics.checkNotNull(tradingNoticeEntity);
        futuresTradeViewModel.m26673A1(tradingNoticeEntity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i0 */
    public static final void m26641i0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: l0 */
    public static final void m26645l0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: m0 */
    public static final Unit m26646m0(FuturesTradeViewModel futuresTradeViewModel, UserConfig userConfig) {
        Intrinsics.checkNotNull(userConfig);
        futuresTradeViewModel.m26675C1(userConfig);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n0 */
    public static final void m26648n0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: p0 */
    public static final void m26652p0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: t1 */
    public static final void m26661t1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: u1 */
    public static final Unit m26663u1(Throwable th2) {
        Intrinsics.checkNotNull(th2);
        C37214b.m83255a(th2, "FuturesTradeViewModel-handleSettleContract");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v1 */
    public static final void m26665v1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: H1 */
    public final void m26680H1() {
        CoroutineContext f41940b = m26694f1().getF50326b();
        if (C41783z1.m91411q(f41940b)) {
            JobKt__JobKt.m90365i(f41940b, null, 1, null);
        }
    }

    /* JADX INFO: renamed from: R0 */
    public final void m26682R0() {
        m26680H1();
        m26681Q0();
    }

    @NotNull
    /* JADX INFO: renamed from: Z0 */
    public final BigDecimal m26688Z0() {
        return m26689a1();
    }

    @Override // com.kubi.mvi.p102vm.BaseVM, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        this.f23613W.clear();
    }

    @Override // com.kubi.mvi.p102vm.BaseVM
    public void onHide() {
        super.onHide();
        m26680H1();
    }

    @Override // com.kubi.mvi.p102vm.BaseVM
    public void onShow() throws Throwable {
        super.onShow();
        m26682R0();
    }

    /* JADX INFO: renamed from: p1 */
    public final void m26704p1(final ContractEntity contractEntity) {
        if (C37567b.m84625o(contractEntity)) {
            this.f23625i0.postValue(new Pair<>(Boolean.FALSE, 0L));
            Disposable disposable = this.f23614X;
            if (disposable != null) {
                disposable.dispose();
                return;
            }
            return;
        }
        final long jM66652l = C27039d.m66652l(contractEntity.getSettleDate()) - RepositoryServiceLocator.f19236a.m20288g().mo25031v();
        if (!C37567b.m84627q(contractEntity) && jM66652l < FundingRateEntity.MILLIS_PER_HOUR) {
            Disposable disposable2 = this.f23614X;
            if (disposable2 != null) {
                disposable2.dispose();
            }
            Observable<Long> observableInterval = Observable.interval(1L, TimeUnit.SECONDS);
            final Function1 function1 = new Function1() { // from class: com.kubi.futures.trade.l0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(FuturesTradeViewModel.m26655q1(jM66652l, (Long) obj));
                }
            };
            Observable<Long> observableTakeUntil = observableInterval.takeUntil(new Predicate() { // from class: com.kubi.futures.trade.m0
                @Override // io.reactivex.functions.Predicate
                public final boolean test(Object obj) {
                    return FuturesTradeViewModel.m26657r1(function1, obj);
                }
            });
            final Function1 function2 = new Function1() { // from class: com.kubi.futures.trade.o0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FuturesTradeViewModel.m26659s1(this.f23877b, contractEntity, (Long) obj);
                }
            };
            Consumer<? super Long> consumer = new Consumer() { // from class: com.kubi.futures.trade.p0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    FuturesTradeViewModel.m26661t1(function2, obj);
                }
            };
            final Function1 function3 = new Function1() { // from class: com.kubi.futures.trade.q0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FuturesTradeViewModel.m26663u1((Throwable) obj);
                }
            };
            this.f23614X = observableTakeUntil.subscribe(consumer, new Consumer() { // from class: com.kubi.futures.trade.r0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    FuturesTradeViewModel.m26665v1(function3, obj);
                }
            });
            return;
        }
        this.f23625i0.postValue(new Pair<>(Boolean.TRUE, Long.valueOf(jM66652l)));
        Disposable disposable3 = this.f23614X;
        if (disposable3 != null) {
            disposable3.dispose();
        }
    }
}
