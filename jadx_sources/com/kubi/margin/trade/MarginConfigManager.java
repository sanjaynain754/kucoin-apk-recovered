package com.kubi.margin.trade;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.kubi.data.entity.MarginSymbolInfo;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.loan.api.ILoanService;
import com.kubi.loan.api.entity.LeverCoinConfig;
import com.kubi.margin.R$string;
import com.kubi.margin.api.entity.CouponsOverview;
import com.kubi.margin.api.entity.FeeEntity;
import com.kubi.margin.api.entity.FundsInfo;
import com.kubi.margin.api.entity.IsolateMarginPosition;
import com.kubi.margin.api.entity.LeverBalance;
import com.kubi.margin.api.entity.MarginPosition;
import com.kubi.margin.entity.IsolateMarginPositionConfig;
import com.kubi.margin.entity.LeverConfig;
import com.kubi.margin.entity.MarginAsset;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.router.model.IRedirect;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.base.entity.BaseEntity;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.util.C24217a1;
import com.kubi.tradebase.entity.CurrencyBalance;
import com.kubi.user.api.IUserService;
import com.kubi.user.config.UserInfo;
import com.kubi.user.model.LoginUserEntity;
import com.kubi.utils.C27099x;
import com.kubi.utils.FlowableCompatKt;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37756h;
import gf.C37890n;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import mp.C42579a;
import mr.C42597a;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p670up.C45289g;
import p698vp.C45618h;
import p768xo.InterfaceC46300a;
import p768xo.InterfaceC46305f;
import p838zo.C46897a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;
import ro.C44128b;
import y70.C46392a;
import y70.C46396e;

/* JADX INFO: compiled from: MarginConfigManager.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000ö\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u001f\u001a\u00020 H\u0007J\u0018\u0010!\u001a\u0004\u0018\u00010\"2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020 0$H\u0002J\b\u0010%\u001a\u00020 H\u0003J\n\u0010&\u001a\u0004\u0018\u00010\"H\u0002J\u0006\u0010'\u001a\u00020\u001eJ\u0012\u0010(\u001a\u0004\u0018\u00010)2\b\u0010*\u001a\u0004\u0018\u00010\u0005J\u0014\u0010+\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-J\u0006\u0010.\u001a\u00020\u001cJ\n\u0010/\u001a\u0004\u0018\u00010\"H\u0002J\u001e\u00100\u001a\b\u0012\u0004\u0012\u00020\u001a012\u0006\u00102\u001a\u00020\u00052\b\b\u0002\u00103\u001a\u000204J\u0010\u00105\u001a\u0004\u0018\u00010\u00182\u0006\u0010*\u001a\u00020\u0005J\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u001807J)\u00108\u001a\n\u0012\u0004\u0012\u000209\u0018\u0001012\b\b\u0002\u0010:\u001a\u00020;2\n\b\u0002\u0010<\u001a\u0004\u0018\u000104¢\u0006\u0002\u0010=J\u0010\u0010>\u001a\u0004\u0018\u00010\u001a2\u0006\u0010*\u001a\u00020\u0005J$\u0010?\u001a\b\u0012\u0004\u0012\u00020\u0001012\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u0005J\u0016\u0010C\u001a\u00020D2\u0006\u0010@\u001a\u00020A2\u0006\u00102\u001a\u00020\u0005J\u0016\u0010E\u001a\u00020D2\u0006\u0010@\u001a\u00020A2\u0006\u00102\u001a\u00020\u0005J<\u0010F\u001a\u0004\u0018\u00010\"2\u0006\u0010@\u001a\u00020A2\u0006\u0010*\u001a\u00020\u00052\u0006\u0010G\u001a\u0002042\f\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00010I2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020K0IJ,\u0010L\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010N\u0012\u0006\u0012\u0004\u0018\u00010N0M012\u0006\u0010@\u001a\u00020A2\u0006\u0010O\u001a\u00020PJ\u001a\u0010Q\u001a\u0004\u0018\u00010\"2\u0006\u0010R\u001a\u00020S2\b\b\u0002\u0010T\u001a\u000204J\"\u0010V\u001a\u00020 2\u0006\u0010W\u001a\u00020\u00052\u0012\b\u0002\u0010H\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010IJ\u000e\u0010X\u001a\u00020D2\u0006\u0010O\u001a\u00020PJ\u000e\u0010Y\u001a\u00020D2\u0006\u0010O\u001a\u00020PJ\u0010\u0010Z\u001a\u0004\u0018\u00010\u00152\u0006\u0010O\u001a\u00020PJ/\u0010]\u001a\u00020D*\u00020N2\b\u0010^\u001a\u0004\u0018\u00010D2\b\u0010_\u001a\u0004\u0018\u0001042\b\u0010*\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0002\u0010`J\u0018\u0010a\u001a\u00020 *\u00020b2\f\u0010c\u001a\b\u0012\u0004\u0012\u00020 0$J\u000e\u0010d\u001a\u00020 2\u0006\u0010e\u001a\u00020bJ\u000e\u0010f\u001a\u00020D2\u0006\u0010g\u001a\u00020SJ\u0016\u0010h\u001a\u00020D2\u0006\u0010g\u001a\u00020S2\u0006\u0010@\u001a\u00020AJ\u001c\u0010i\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020k0jj\b\u0012\u0004\u0012\u00020k`l01J(\u0010m\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020o\u0012\u0004\u0012\u00020o0M0n2\u0006\u0010p\u001a\u00020\u00052\u0006\u0010O\u001a\u00020PR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\u0013\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00150\u0014j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0015`\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\u0017\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00180\u0014j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0018`\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\u0019\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001a0\u0014j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001a`\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R.\u0010U\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0014j\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005`\u0016X\u0082\u0004¢\u0006\u0002\n\u0000RF\u0010[\u001a:\u0012\u0004\u0012\u00020\u0005\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020;\u0012\u0006\u0012\u0004\u0018\u00010\\0M0\u0014j\u001c\u0012\u0004\u0012\u00020\u0005\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020;\u0012\u0006\u0012\u0004\u0018\u00010\\0M`\u0016X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006q"}, m90084d2 = {"Lcom/kubi/margin/trade/MarginConfigManager;", "", "<init>", "()V", "TAG", "", "marginApi", "Lcom/kubi/margin/api/MarginApi;", "getMarginApi", "()Lcom/kubi/margin/api/MarginApi;", "marginApi$delegate", "Lkotlin/Lazy;", "couponApi", "Lcom/kubi/margin/api/CouponApi;", "getCouponApi", "()Lcom/kubi/margin/api/CouponApi;", "couponApi$delegate", "marginSymbolsInfoManager", "Lcom/kubi/margin/trade/symbols/MarginSymbolsInfoManager;", "tradeFeeMap", "Ljava/util/HashMap;", "Lcom/kubi/margin/api/entity/FeeEntity;", "Lkotlin/collections/HashMap;", "isolateConfigMap", "Lcom/kubi/margin/entity/IsolateMarginPositionConfig;", "isolatePositionMap", "Lcom/kubi/margin/api/entity/MarginPosition;", "marginPosition", "Lcom/kubi/margin/api/entity/LeverBalance;", "marginConfig", "Lcom/kubi/margin/entity/LeverConfig;", "fetchMarginData", "", "asyncConfigFromLocal", "Lio/reactivex/disposables/Disposable;", "onComplete", "Lkotlin/Function0;", "initMarginDataAndConfig", "fetchMarginConfig", "getMarginConfig", "getMarginSymbolInfo", "Lcom/kubi/data/entity/MarginSymbolInfo;", "symbol", "fetchMarginPosition", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lio/reactivex/functions/Action;", "getMarginPosition", "fetchAllIsolateConfigList", "fetchIsolatePosition", "Lio/reactivex/Observable;", "code", "withCache", "", "getIsolateConfigBySymbol", "getAllIsolateConfigs", "", "fetchAllIsolatePositionList", "Lcom/kubi/margin/api/entity/IsolateMarginPosition;", "delay", "", "filterNotLoan", "(JLjava/lang/Boolean;)Lio/reactivex/Observable;", "getIsolatePositionBySymbol", "modifyUserLeverage", "tradeType", "", "leverage", "fetchUserLeverage", "Ljava/math/BigDecimal;", "fetchActualLever", "setAutoReturn", "isOpen", "consumer", "Lio/reactivex/functions/Consumer;", "errorCallBack", "", "getBaseAndQuoteBalance", "Lkotlin/Pair;", "Lcom/kubi/tradebase/entity/CurrencyBalance;", "symbolInfo", "Lcom/kubi/data/entity/SymbolInfoEntity;", "getTradeFeeData", "tradeItemBean", "Lcom/kubi/data/entity/TradeItemBean;", "isRefresh", "taxTipsMap", "getTaxTipsContent", "bizType", "getTakerFee", "getMakerFee", "getFeeInfo", "leverConfigCache", "Lcom/kubi/loan/api/entity/LeverCoinConfig;", "getMaxBorrowAmount", "lever", "isIsolate", "(Lcom/kubi/tradebase/entity/CurrencyBalance;Ljava/math/BigDecimal;Ljava/lang/Boolean;Ljava/lang/String;)Ljava/math/BigDecimal;", "checkOpenMarginWithRedirect", "Lcom/kubi/sdk/BaseFragment;", "f", "profitIllegalDialog", "fragment", "getMarginMaxLever", "item", "getMaxLeverByType", "fetchLeverDetail", "Ljava/util/ArrayList;", "Lcom/kubi/margin/api/entity/FundsInfo;", "Lkotlin/collections/ArrayList;", "fetchMarginCoupons", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kubi/margin/api/entity/CouponsOverview;", "positionType", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarginConfigManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarginConfigManager.kt\ncom/kubi/margin/trade/MarginConfigManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 4 KVStore.kt\ncom/kubi/utils/storage/KVStore\n+ 5 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,657:1\n1#2:658\n153#3,2:659\n32#3:662\n23#3,2:667\n178#4:661\n160#5,4:663\n1869#6,2:669\n*S KotlinDebug\n*F\n+ 1 MarginConfigManager.kt\ncom/kubi/margin/trade/MarginConfigManager\n*L\n119#1:659,2\n123#1:662\n224#1:667,2\n119#1:661\n124#1:663,4\n274#1:669,2\n*E\n"})
public final class MarginConfigManager {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final MarginConfigManager f33681a = new MarginConfigManager();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f33682b = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.trade.e3
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarginConfigManager.m39851t1();
        }
    });

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Lazy f33683c = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.trade.p3
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarginConfigManager.m39807b0();
        }
    });

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final C45289g f33684d = new C45289g();

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final HashMap<String, FeeEntity> f33685e = new HashMap<>();

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final HashMap<String, IsolateMarginPositionConfig> f33686f = new HashMap<>();

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final HashMap<String, MarginPosition> f33687g = new HashMap<>();

    /* JADX INFO: renamed from: h */
    @NotNull
    public static LeverBalance f33688h = new LeverBalance();

    /* JADX INFO: renamed from: i */
    @NotNull
    public static LeverConfig f33689i = new LeverConfig(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);

    /* JADX INFO: renamed from: j */
    @NotNull
    public static final HashMap<String, String> f33690j = new HashMap<>();

    /* JADX INFO: renamed from: k */
    @NotNull
    public static final HashMap<String, Pair<Long, LeverCoinConfig>> f33691k = new HashMap<>();

    /* JADX INFO: renamed from: com.kubi.margin.trade.MarginConfigManager$a */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJSONOrNull$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJSONOrNull$1\n*L\n1#1,300:1\n*E\n"})
    public static final class C18169a extends TypeToken<Map<String, ? extends IsolateMarginPositionConfig>> {
    }

    /* JADX WARN: Code duplicated, block: B:119:0x0235  */
    @SuppressLint({"KCCyclomaticComplexityCheck"})
    @NotNull
    /* JADX INFO: renamed from: a1 */
    public final BigDecimal m39882a1(@NotNull CurrencyBalance currencyBalance, @Nullable BigDecimal bigDecimal, @Nullable Boolean bool, @Nullable String str) {
        boolean zM66566d;
        IsolateMarginPositionConfig isolateMarginPositionConfigM39872S0;
        BigDecimal totalLiability;
        MarginPosition marginPositionM39874T0;
        BigDecimal crossCoefficientTotalAsset;
        BigDecimal bigDecimalSubtract;
        BigDecimal bigDecimalM89921F;
        BigDecimal bigDecimalMultiply;
        BigDecimal bigDecimalMultiply2;
        BigDecimal bigDecimalSubtract2;
        BigDecimal bigDecimalDivide;
        BigDecimal bigDecimalM89922G;
        BigDecimal quoteMaxBorrowAmount;
        CurrencyBalance quoteAsset;
        CurrencyBalance baseAsset;
        Intrinsics.checkNotNullParameter(currencyBalance, "<this>");
        SymbolInfoEntity symbolInfoEntityM85601B = C37890n.f85269a.m85601B(str);
        String str2 = null;
        boolean zAreEqual = Intrinsics.areEqual(symbolInfoEntityM85601B != null ? symbolInfoEntityM85601B.getBaseCurrency() : null, currencyBalance.getCurrency());
        HashMap<String, Pair<Long, LeverCoinConfig>> map = f33691k;
        String currency = currencyBalance.getCurrency();
        if (currency == null) {
            currency = "";
        }
        Pair<Long, LeverCoinConfig> pair = map.get(currency);
        if (System.currentTimeMillis() - C27039d.m66652l(pair != null ? pair.getFirst() : null) > 1000) {
            String currency2 = currencyBalance.getCurrency();
            if (currency2 == null) {
                currency2 = "";
            }
            Long lValueOf = Long.valueOf(System.currentTimeMillis());
            ILoanService iLoanServiceM93343c = C42579a.f94275a.m93343c();
            String currency3 = currencyBalance.getCurrency();
            if (currency3 == null) {
                currency3 = "";
            }
            map.put(currency2, new Pair<>(lValueOf, iLoanServiceM93343c.mo37708g(currency3)));
        }
        String currency4 = currencyBalance.getCurrency();
        if (currency4 == null) {
            currency4 = "";
        }
        Pair<Long, LeverCoinConfig> pair2 = map.get(currency4);
        LeverCoinConfig second = pair2 != null ? pair2.getSecond() : null;
        int i11 = 1;
        if (C27025c.m66566d(bool)) {
            isolateMarginPositionConfigM39872S0 = m39872S0(str != null ? str : "");
            if (isolateMarginPositionConfigM39872S0 == null) {
                zM66566d = false;
            } else if (zAreEqual) {
                zM66566d = C27025c.m66566d(isolateMarginPositionConfigM39872S0.getBaseBorrowEnable());
            } else {
                if (zAreEqual) {
                    throw new NoWhenBranchMatchedException();
                }
                zM66566d = C27025c.m66566d(isolateMarginPositionConfigM39872S0.getQuoteBorrowEnable());
            }
        } else {
            zM66566d = C27025c.m66566d(second != null ? Boolean.valueOf(second.isBorrow()) : null);
            isolateMarginPositionConfigM39872S0 = null;
        }
        if (!zM66566d) {
            BigDecimal ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            return ZERO;
        }
        BigDecimal bigDecimalM89922G2 = C41014a.m89922G(second != null ? second.getBorrowMaxAmount() : null, null, 1, null);
        BigDecimal bigDecimalM89922G3 = C41014a.m89922G(second != null ? second.getBorrowMinAmount() : null, null, 1, null);
        BigDecimal bigDecimalM89922G4 = C41014a.m89922G(second != null ? second.getCurrencyLoanMinUnit() : null, null, 1, null);
        if (C27025c.m66566d(bool)) {
            marginPositionM39874T0 = m39874T0(C27041f.m66668h(str));
            totalLiability = marginPositionM39874T0 != null ? marginPositionM39874T0.liabilityConversionCompat() : null;
        } else {
            totalLiability = f33688h.getTotalLiability();
            marginPositionM39874T0 = null;
        }
        if (C27025c.m66566d(bool)) {
            crossCoefficientTotalAsset = marginPositionM39874T0 != null ? marginPositionM39874T0.totalConversionCoefficient() : null;
        } else {
            crossCoefficientTotalAsset = f33688h.getCrossCoefficientTotalAsset();
        }
        if (crossCoefficientTotalAsset != null) {
            C44128b.m97259c("MarginConfigManager", "总资产: " + crossCoefficientTotalAsset + ", 总负债: " + totalLiability);
            str2 = null;
            i11 = 1;
            bigDecimalSubtract = crossCoefficientTotalAsset.subtract(C41014a.m89922G(totalLiability, null, 1, null));
        } else {
            bigDecimalSubtract = null;
        }
        BigDecimal bigDecimalM89922G5 = C41014a.m89922G(bigDecimalSubtract, str2, i11, str2);
        C44128b.m97259c("MarginConfigManager", "净资产: " + bigDecimalM89922G5);
        if (!C27025c.m66566d(bool)) {
            bigDecimalM89921F = C41014a.m89921F(second != null ? second.getBorrowCoefficient() : null, "1");
        } else if (zAreEqual == i11) {
            bigDecimalM89921F = C41014a.m89921F((marginPositionM39874T0 == null || (baseAsset = marginPositionM39874T0.getBaseAsset()) == null) ? null : baseAsset.getBorrowCoefficient(), "1");
        } else {
            if (zAreEqual) {
                throw new NoWhenBranchMatchedException();
            }
            bigDecimalM89921F = C41014a.m89921F((marginPositionM39874T0 == null || (quoteAsset = marginPositionM39874T0.getQuoteAsset()) == null) ? null : quoteAsset.getBorrowCoefficient(), "1");
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("公式: (");
        sb2.append(bigDecimal != null ? bigDecimal.subtract(BigDecimal.ONE) : null);
        sb2.append(" * ");
        sb2.append(bigDecimalM89922G5);
        sb2.append(" * ");
        sb2.append(bigDecimalM89921F);
        sb2.append(" - ");
        sb2.append(C41014a.m89922G(totalLiability, null, 1, null));
        sb2.append(") / ");
        sb2.append(C46897a.m103292d(currencyBalance));
        C44128b.m97259c("MarginConfigManager", sb2.toString());
        if (bigDecimal != null) {
            try {
                BigDecimal bigDecimalSubtract3 = bigDecimal.subtract(BigDecimal.ONE);
                if (bigDecimalSubtract3 == null || (bigDecimalMultiply = bigDecimalSubtract3.multiply(bigDecimalM89922G5)) == null || (bigDecimalMultiply2 = bigDecimalMultiply.multiply(bigDecimalM89921F)) == null || (bigDecimalSubtract2 = bigDecimalMultiply2.subtract(C41014a.m89922G(totalLiability, null, 1, null))) == null) {
                    bigDecimalDivide = null;
                } else {
                    bigDecimalDivide = bigDecimalSubtract2.divide(C41014a.m89921F(C46897a.m103292d(currencyBalance), "1"), 12, RoundingMode.DOWN);
                }
                bigDecimalM89922G = C41014a.m89922G(bigDecimalDivide, null, 1, null);
            } catch (Exception e11) {
                C44128b.m97264h(e11);
                bigDecimalM89922G = BigDecimal.ZERO;
            }
        } else {
            bigDecimalDivide = null;
            bigDecimalM89922G = C41014a.m89922G(bigDecimalDivide, null, 1, null);
        }
        C44128b.m97259c("MarginConfigManager", "cacValue: " + bigDecimalM89922G);
        if (C27025c.m66566d(bool)) {
            if (isolateMarginPositionConfigM39872S0 != null) {
                if (zAreEqual) {
                    quoteMaxBorrowAmount = isolateMarginPositionConfigM39872S0.getBaseMaxBorrowAmount();
                } else {
                    if (zAreEqual) {
                        throw new NoWhenBranchMatchedException();
                    }
                    quoteMaxBorrowAmount = isolateMarginPositionConfigM39872S0.getQuoteMaxBorrowAmount();
                }
                bigDecimalM89922G2 = quoteMaxBorrowAmount;
            } else {
                bigDecimalM89922G2 = null;
            }
        }
        BigDecimal bigDecimal2 = (BigDecimal) RangesKt.coerceAtMost(bigDecimalM89922G, C41014a.m89922G(bigDecimalM89922G2 != null ? bigDecimalM89922G2.subtract(C41014a.m89922G(C46897a.m103299k(currencyBalance), null, 1, null)) : null, null, 1, null));
        Intrinsics.checkNotNullExpressionValue(bigDecimal2, "run(...)");
        BigDecimal bigDecimalM89926K = C41014a.m89926K(bigDecimal2, bigDecimalM89922G4, false, 2, null);
        if (bigDecimalM89926K.compareTo(bigDecimalM89922G3) >= 0) {
            return bigDecimalM89926K;
        }
        BigDecimal ZERO2 = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO2, "ZERO");
        return ZERO2;
    }

    /* JADX INFO: renamed from: C0 */
    public static final Unit m39773C0() {
        f33681a.m39891o1();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E0 */
    public static /* synthetic */ Disposable m39776E0(MarginConfigManager marginConfigManager, Action action, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            action = null;
        }
        return marginConfigManager.m39866D0(action);
    }

    /* JADX INFO: renamed from: M0 */
    public static final ObservableSource m39789M0(SymbolInfoEntity symbolInfoEntity, MarginAsset it) {
        CurrencyBalance currencyBalance;
        Object next;
        Intrinsics.checkNotNullParameter(it, "it");
        List<CurrencyBalance> fundsInfoList = it.getFundsInfoList();
        Object obj = null;
        if (fundsInfoList != null) {
            Iterator<T> it2 = fundsInfoList.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!Intrinsics.areEqual(((CurrencyBalance) next).getCurrency(), symbolInfoEntity.getBaseCurrency()));
            currencyBalance = (CurrencyBalance) next;
        } else {
            currencyBalance = null;
        }
        List<CurrencyBalance> fundsInfoList2 = it.getFundsInfoList();
        if (fundsInfoList2 != null) {
            for (Object obj2 : fundsInfoList2) {
                if (Intrinsics.areEqual(((CurrencyBalance) obj2).getCurrency(), symbolInfoEntity.getQuoteCurrency())) {
                    obj = obj2;
                    break;
                }
            }
            obj = (CurrencyBalance) obj;
        }
        return Observable.just(new Pair(currencyBalance, obj));
    }

    /* JADX INFO: renamed from: N0 */
    public static final ObservableSource m39791N0(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (ObservableSource) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: O0 */
    public static final ObservableSource m39793O0(MarginPosition it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Observable.just(new Pair(it.getBaseAsset(), it.getQuoteAsset()));
    }

    /* JADX INFO: renamed from: P0 */
    public static final ObservableSource m39795P0(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (ObservableSource) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: U */
    public static final Pair m39799U() {
        Object map;
        C45618h c45618h = C45618h.f102740a;
        Object objM66914d = null;
        LeverConfig leverConfig = (LeverConfig) C46392a.f104043a.m102336j(c45618h.m100721i(), LeverConfig.class, null);
        if (leverConfig == null) {
            leverConfig = new LeverConfig(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
        }
        String strM102326h = C46392a.m102326h(c45618h.m100718f(), "");
        if (TextUtils.isEmpty(strM102326h)) {
            strM102326h = null;
        }
        if (strM102326h != null) {
            try {
                C27099x c27099x = C27099x.f54458a;
                objM66914d = C27099x.m66914d(strM102326h, new C18169a().getType());
            } catch (Throwable unused) {
            }
            map = (Map) objM66914d;
            if (map == null) {
                map = new HashMap();
            }
        } else {
            map = new HashMap();
        }
        return new Pair(leverConfig, map);
    }

    /* JADX INFO: renamed from: a0 */
    public static final Unit m39805a0(Function0 function0) {
        if (C42579a.f94275a.m93347g().d0().isHasOpenLever()) {
            function0.invoke();
        } else {
            InterfaceC37756h.a.m85147e(C37304a.f82764a, null, null, null, null, null, null, null, 127, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b0 */
    public static final InterfaceC46300a m39807b0() {
        return (InterfaceC46300a) RetrofitFlowExKt.m42820a(InterfaceC46300a.class);
    }

    /* JADX INFO: renamed from: e0 */
    public static final HashMap m39811e0(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        HashMap map = new HashMap();
        Iterator it2 = it.iterator();
        while (it2.hasNext()) {
            IsolateMarginPositionConfig isolateMarginPositionConfig = (IsolateMarginPositionConfig) it2.next();
            map.put(C27041f.m66668h(isolateMarginPositionConfig.getSymbol()), isolateMarginPositionConfig);
        }
        C46392a.m102333p(C45618h.f102740a.m100718f(), C27099x.m66919i(map, false, 2, null));
        return map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e1 */
    public static /* synthetic */ void m39812e1(MarginConfigManager marginConfigManager, String str, Consumer consumer, int i11, Object obj) throws Exception {
        if ((i11 & 2) != 0) {
            consumer = null;
        }
        marginConfigManager.m39887d1(str, consumer);
    }

    /* JADX INFO: renamed from: f0 */
    public static final HashMap m39814f0(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (HashMap) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: g0 */
    public static final Unit m39817g0(HashMap map) {
        HashMap<String, IsolateMarginPositionConfig> map2 = f33686f;
        map2.clear();
        map2.putAll(map);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h1 */
    public static final Unit m39821h1(Consumer consumer, Throwable th2) throws Exception {
        if (consumer != null) {
            consumer.accept(null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k1 */
    public static final Unit m39828k1(String str, FeeEntity feeEntity) {
        f33685e.put(str, feeEntity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ Observable m39830l0(MarginConfigManager marginConfigManager, long j11, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = 0;
        }
        if ((i11 & 2) != 0) {
            bool = null;
        }
        return marginConfigManager.m39889k0(j11, bool);
    }

    /* JADX INFO: renamed from: p0 */
    public static /* synthetic */ Observable m39840p0(MarginConfigManager marginConfigManager, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return marginConfigManager.m39890o0(str, z11);
    }

    /* JADX INFO: renamed from: p1 */
    public static final Unit m39841p1(LoginUserEntity loginUserEntity) {
        MarginConfigManager marginConfigManager = f33681a;
        m39776E0(marginConfigManager, null, 1, null);
        Observable observableM39830l0 = m39830l0(marginConfigManager, 0L, null, 3, null);
        if (observableM39830l0 != null) {
            FlowableCompatKt.m66389c(observableM39830l0);
        }
        marginConfigManager.m39886d0();
        marginConfigManager.m39893t0();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q0 */
    public static final Unit m39843q0(MarginPosition marginPosition) {
        if (marginPosition != null) {
            f33687g.put(C27041f.m66668h(marginPosition.getTag()), marginPosition);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r1 */
    public static final Unit m39847r1(Throwable th2) {
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: A0 */
    public final InterfaceC41634e<Pair<CouponsOverview, CouponsOverview>> m39864A0(@NotNull String positionType, @NotNull SymbolInfoEntity symbolInfo) {
        Intrinsics.checkNotNullParameter(positionType, "positionType");
        Intrinsics.checkNotNullParameter(symbolInfo, "symbolInfo");
        String code = Intrinsics.areEqual(positionType, "MARGIN") ? "DEFAULT" : symbolInfo.getCode();
        return C41636g.m90932o0(m39870Q0().m102054b(symbolInfo.getBaseCurrency(), positionType, code), m39870Q0().m102054b(symbolInfo.getQuoteCurrency(), positionType, code), new MarginConfigManager$fetchMarginCoupons$1(null));
    }

    @SuppressLint({"CheckResult"})
    /* JADX INFO: renamed from: B0 */
    public final void m39865B0() {
        m39873T(new Function0() { // from class: com.kubi.margin.trade.a4
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginConfigManager.m39773C0();
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: D0 */
    public final Disposable m39866D0(@Nullable final Action action) {
        C42579a c42579a = C42579a.f94275a;
        if (!c42579a.m93347g().c() || !c42579a.m93347g().d0().isHasOpenLever()) {
            return null;
        }
        Observable observableObserveOn = m39876V0().m102095f().compose(C24217a1.m58390n()).observeOn(AndroidSchedulers.mainThread());
        final Function1 function1 = new Function1() { // from class: com.kubi.margin.trade.c4
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginConfigManager.m39778F0(action, (LeverBalance) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.margin.trade.d4
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarginConfigManager.m39780G0(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.margin.trade.e4
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginConfigManager.m39782H0((Throwable) obj);
            }
        };
        return observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.margin.trade.f4
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarginConfigManager.m39784I0(function2, obj);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: J0 */
    public final BigDecimal m39867J0(int i11, @NotNull String code) {
        BigDecimal userLeverage;
        Intrinsics.checkNotNullParameter(code, "code");
        if (i11 == 1) {
            BigDecimal userLeverage2 = f33688h.getUserLeverage();
            if (userLeverage2 != null) {
                return userLeverage2;
            }
            BigDecimal defaultLeverage = f33689i.getDefaultLeverage();
            return defaultLeverage == null ? new BigDecimal(5) : defaultLeverage;
        }
        MarginPosition marginPositionM39874T0 = m39874T0(code);
        if (marginPositionM39874T0 != null && (userLeverage = marginPositionM39874T0.getUserLeverage()) != null) {
            return userLeverage;
        }
        IsolateMarginPositionConfig isolateMarginPositionConfigM39872S0 = m39872S0(code);
        BigDecimal defaultLeverage2 = isolateMarginPositionConfigM39872S0 != null ? isolateMarginPositionConfigM39872S0.getDefaultLeverage() : null;
        return defaultLeverage2 == null ? new BigDecimal(5) : defaultLeverage2;
    }

    @NotNull
    /* JADX INFO: renamed from: K0 */
    public final List<IsolateMarginPositionConfig> m39868K0() {
        HashMap<String, IsolateMarginPositionConfig> map = f33686f;
        if (map.isEmpty()) {
            m39886d0();
        }
        Collection<IsolateMarginPositionConfig> collectionValues = map.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
        return CollectionsKt.toList(collectionValues);
    }

    @NotNull
    /* JADX INFO: renamed from: L0 */
    public final Observable<Pair<CurrencyBalance, CurrencyBalance>> m39869L0(int i11, @NotNull final SymbolInfoEntity symbolInfo) {
        Intrinsics.checkNotNullParameter(symbolInfo, "symbolInfo");
        if (i11 != 1) {
            String code = symbolInfo.getCode();
            Intrinsics.checkNotNullExpressionValue(code, "getCode(...)");
            Observable<MarginPosition> observableM39890o0 = m39890o0(code, true);
            final Function1 function1 = new Function1() { // from class: com.kubi.margin.trade.p4
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarginConfigManager.m39793O0((MarginPosition) obj);
                }
            };
            Observable observableFlatMap = observableM39890o0.flatMap(new Function() { // from class: com.kubi.margin.trade.q4
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return MarginConfigManager.m39795P0(function1, obj);
                }
            });
            Intrinsics.checkNotNull(observableFlatMap);
            return observableFlatMap;
        }
        InterfaceC46305f interfaceC46305fM39876V0 = m39876V0();
        String baseCurrency = symbolInfo.getBaseCurrency();
        Intrinsics.checkNotNullExpressionValue(baseCurrency, "getBaseCurrency(...)");
        String quoteCurrency = symbolInfo.getQuoteCurrency();
        Intrinsics.checkNotNullExpressionValue(quoteCurrency, "getQuoteCurrency(...)");
        Observable observableObserveOn = interfaceC46305fM39876V0.m102071F(new String[]{baseCurrency, quoteCurrency}).compose(C24217a1.m58390n()).observeOn(AndroidSchedulers.mainThread());
        final Function1 function2 = new Function1() { // from class: com.kubi.margin.trade.n4
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginConfigManager.m39789M0(symbolInfo, (MarginAsset) obj);
            }
        };
        Observable<Pair<CurrencyBalance, CurrencyBalance>> observableFlatMap2 = observableObserveOn.flatMap(new Function() { // from class: com.kubi.margin.trade.o4
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return MarginConfigManager.m39791N0(function2, obj);
            }
        });
        Intrinsics.checkNotNull(observableFlatMap2);
        return observableFlatMap2;
    }

    /* JADX INFO: renamed from: Q0 */
    public final InterfaceC46300a m39870Q0() {
        return (InterfaceC46300a) f33683c.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: R0 */
    public final FeeEntity m39871R0(@NotNull SymbolInfoEntity symbolInfo) {
        Intrinsics.checkNotNullParameter(symbolInfo, "symbolInfo");
        return f33685e.get(symbolInfo.getCode() + C42579a.f94275a.m93347g().d0().id);
    }

    @Nullable
    /* JADX INFO: renamed from: S0 */
    public final IsolateMarginPositionConfig m39872S0(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        HashMap<String, IsolateMarginPositionConfig> map = f33686f;
        if (map.isEmpty()) {
            m39886d0();
        }
        return map.get(symbol);
    }

    /* JADX INFO: renamed from: T */
    public final Disposable m39873T(final Function0<Unit> function0) {
        Observable observableObserveOn = Observable.fromCallable(new Callable() { // from class: com.kubi.margin.trade.w3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return MarginConfigManager.m39799U();
            }
        }).subscribeOn(C42916f.m94127f()).observeOn(AndroidSchedulers.mainThread());
        final Function1 function1 = new Function1() { // from class: com.kubi.margin.trade.x3
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginConfigManager.m39800V(function0, (Pair) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.margin.trade.y3
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarginConfigManager.m39801W(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.margin.trade.z3
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginConfigManager.m39802X(function0, (Throwable) obj);
            }
        };
        return observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.margin.trade.b4
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarginConfigManager.m39803Y(function2, obj);
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: T0 */
    public final MarginPosition m39874T0(@NotNull String symbol) {
        Observable observableM39830l0;
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        HashMap<String, MarginPosition> map = f33687g;
        if (map.isEmpty() && (observableM39830l0 = m39830l0(this, 0L, null, 3, null)) != null) {
            FlowableCompatKt.m66389c(observableM39830l0);
        }
        return map.get(symbol);
    }

    @NotNull
    /* JADX INFO: renamed from: U0 */
    public final BigDecimal m39875U0(@NotNull SymbolInfoEntity symbolInfo) {
        BigDecimal makerFeeRate;
        Intrinsics.checkNotNullParameter(symbolInfo, "symbolInfo");
        FeeEntity feeEntity = f33685e.get(symbolInfo.getCode() + C42579a.f94275a.m93347g().d0().id);
        return (feeEntity == null || (makerFeeRate = feeEntity.getMakerFeeRate()) == null) ? new BigDecimal(String.valueOf(symbolInfo.getMakerFeeRate())) : makerFeeRate;
    }

    @NotNull
    /* JADX INFO: renamed from: V0 */
    public final InterfaceC46305f m39876V0() {
        Object value = f33682b.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (InterfaceC46305f) value;
    }

    @NotNull
    /* JADX INFO: renamed from: W0 */
    public final LeverConfig m39877W0() {
        return f33689i;
    }

    @NotNull
    /* JADX INFO: renamed from: X0 */
    public final BigDecimal m39878X0(@NotNull TradeItemBean item) {
        Intrinsics.checkNotNullParameter(item, "item");
        boolean zIsIsolatedMarginEnabled = item.getSymbolInfoEntity().isIsolatedMarginEnabled();
        if (item.getSymbolInfoEntity().isMarginEnabled() && zIsIsolatedMarginEnabled) {
            BigDecimal maxLeverage = f33689i.getMaxLeverage();
            IsolateMarginPositionConfig isolateMarginPositionConfig = f33686f.get(item.getSymbol());
            return (BigDecimal) RangesKt.coerceAtLeast(maxLeverage, C41014a.m89922G(isolateMarginPositionConfig != null ? isolateMarginPositionConfig.getMaxLeverage() : null, null, 1, null));
        }
        if (!zIsIsolatedMarginEnabled) {
            return f33689i.getMaxLeverage();
        }
        IsolateMarginPositionConfig isolateMarginPositionConfig2 = f33686f.get(item.getSymbol());
        return C41014a.m89921F(isolateMarginPositionConfig2 != null ? isolateMarginPositionConfig2.getMaxLeverage() : null, "5");
    }

    @NotNull
    /* JADX INFO: renamed from: Y0 */
    public final LeverBalance m39879Y0() {
        return f33688h;
    }

    /* JADX INFO: renamed from: Z */
    public final void m39880Z(@NotNull BaseFragment baseFragment, @NotNull final Function0<Unit> f11) {
        Intrinsics.checkNotNullParameter(baseFragment, "<this>");
        Intrinsics.checkNotNullParameter(f11, "f");
        IUserService.O(C42579a.f94275a.m93347g(), (Map) null, IRedirect.INSTANCE.obtain(new Function0() { // from class: com.kubi.margin.trade.r3
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginConfigManager.m39805a0(f11);
            }
        }), 1, (Object) null);
    }

    @Nullable
    /* JADX INFO: renamed from: Z0 */
    public final MarginSymbolInfo m39881Z0(@Nullable String str) {
        if (str == null) {
            return null;
        }
        return f33684d.m100099n(str);
    }

    @NotNull
    /* JADX INFO: renamed from: b1 */
    public final BigDecimal m39883b1(@NotNull TradeItemBean item, int i11) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (i11 == 1) {
            return f33689i.getMaxLeverage();
        }
        if (i11 != 2) {
            return new BigDecimal("5");
        }
        IsolateMarginPositionConfig isolateMarginPositionConfig = f33686f.get(item.getSymbol());
        return C41014a.m89921F(isolateMarginPositionConfig != null ? isolateMarginPositionConfig.getMaxLeverage() : null, "5");
    }

    @NotNull
    /* JADX INFO: renamed from: c0 */
    public final BigDecimal m39884c0(int i11, @NotNull String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        BigDecimal bigDecimalDivide = null;
        if (i11 == 2) {
            MarginPosition marginPositionM39874T0 = m39874T0(code);
            if (marginPositionM39874T0 != null) {
                BigDecimal bigDecimalSubtract = C41014a.m89922G(marginPositionM39874T0.totalMarginConversionCoefficient(), null, 1, null).subtract(C41014a.m89922G(marginPositionM39874T0.liabilityConversionCompat(), null, 1, null));
                Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
                bigDecimalDivide = bigDecimalSubtract.compareTo(BigDecimal.ZERO) <= 0 ? BigDecimal.ONE : marginPositionM39874T0.totalMarginConversionCoefficient().divide(bigDecimalSubtract, 1, RoundingMode.UP);
            }
            return C41014a.m89921F(bigDecimalDivide, "1");
        }
        LeverBalance leverBalanceM39879Y0 = m39879Y0();
        BigDecimal bigDecimalSubtract2 = C41014a.m89922G(leverBalanceM39879Y0.getCrossCoefficientTotalAsset(), null, 1, null).subtract(C41014a.m89922G(leverBalanceM39879Y0.getTotalLiability(), null, 1, null));
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract2, "subtract(...)");
        BigDecimal bigDecimalDivide2 = bigDecimalSubtract2.compareTo(BigDecimal.ZERO) <= 0 ? BigDecimal.ONE : C41014a.m89922G(leverBalanceM39879Y0.getCrossCoefficientTotalAsset(), null, 1, null).divide(bigDecimalSubtract2, 1, RoundingMode.UP);
        Intrinsics.checkNotNull(bigDecimalDivide2);
        return bigDecimalDivide2;
    }

    @NotNull
    /* JADX INFO: renamed from: c1 */
    public final BigDecimal m39885c1(@NotNull SymbolInfoEntity symbolInfo) {
        BigDecimal takerFeeRate;
        Intrinsics.checkNotNullParameter(symbolInfo, "symbolInfo");
        FeeEntity feeEntity = f33685e.get(symbolInfo.getCode() + C42579a.f94275a.m93347g().d0().id);
        return (feeEntity == null || (takerFeeRate = feeEntity.getTakerFeeRate()) == null) ? new BigDecimal(String.valueOf(symbolInfo.getTakerFeeRate())) : takerFeeRate;
    }

    /* JADX INFO: renamed from: d0 */
    public final Disposable m39886d0() {
        Observable<R> observableCompose = (C42579a.f94275a.m93347g().c() ? m39876V0().m102103o() : m39876V0().m102078N()).compose(C24217a1.m58390n());
        final Function1 function1 = new Function1() { // from class: com.kubi.margin.trade.i3
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginConfigManager.m39811e0((List) obj);
            }
        };
        Observable observableDelaySubscription = observableCompose.map(new Function() { // from class: com.kubi.margin.trade.j3
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return MarginConfigManager.m39814f0(function1, obj);
            }
        }).observeOn(AndroidSchedulers.mainThread()).delaySubscription(f33686f.isEmpty() ? 0L : 3L, TimeUnit.SECONDS);
        final Function1 function2 = new Function1() { // from class: com.kubi.margin.trade.k3
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginConfigManager.m39817g0((HashMap) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.margin.trade.l3
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarginConfigManager.m39820h0(function2, obj);
            }
        };
        final Function1 function3 = new Function1() { // from class: com.kubi.margin.trade.m3
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginConfigManager.m39823i0((Throwable) obj);
            }
        };
        return observableDelaySubscription.subscribe(consumer, new Consumer() { // from class: com.kubi.margin.trade.n3
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarginConfigManager.m39826j0(function3, obj);
            }
        });
    }

    /* JADX INFO: renamed from: d1 */
    public final void m39887d1(@NotNull String bizType, @Nullable final Consumer<String> consumer) throws Exception {
        Intrinsics.checkNotNullParameter(bizType, "bizType");
        final String str = UserInfo.a.i() + bizType + MultiLanguageManager.f46811g.getLocalString();
        HashMap<String, String> map = f33690j;
        if (map.get(str) != null) {
            if (consumer != null) {
                consumer.accept(map.get(str));
            }
        } else {
            Observable observableObserveOn = (Intrinsics.areEqual(bizType, "SPOT_TAX_TIPS") ? m39876V0().m102086V(bizType) : m39876V0().m102084T(bizType)).compose(C24217a1.m58390n()).observeOn(AndroidSchedulers.mainThread());
            final Function1 function1 = new Function1() { // from class: com.kubi.margin.trade.w4
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarginConfigManager.m39815f1(str, consumer, (String) obj);
                }
            };
            Consumer consumer2 = new Consumer() { // from class: com.kubi.margin.trade.f3
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    MarginConfigManager.m39818g1(function1, obj);
                }
            };
            final Function1 function2 = new Function1() { // from class: com.kubi.margin.trade.g3
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarginConfigManager.m39821h1(consumer, (Throwable) obj);
                }
            };
            observableObserveOn.subscribe(consumer2, new Consumer() { // from class: com.kubi.margin.trade.h3
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    MarginConfigManager.m39824i1(function2, obj);
                }
            });
        }
    }

    @Nullable
    /* JADX INFO: renamed from: j1 */
    public final Disposable m39888j1(@NotNull TradeItemBean tradeItemBean, boolean z11) {
        Intrinsics.checkNotNullParameter(tradeItemBean, "tradeItemBean");
        C42579a c42579a = C42579a.f94275a;
        if (!c42579a.m93347g().c()) {
            return null;
        }
        final String str = tradeItemBean.getSymbolInfoEntity().getCode() + c42579a.m93347g().d0().id;
        if (f33685e.get(str) != null && !z11) {
            return null;
        }
        InterfaceC46305f interfaceC46305fM39876V0 = m39876V0();
        String code = tradeItemBean.getSymbolInfoEntity().getCode();
        Intrinsics.checkNotNullExpressionValue(code, "getCode(...)");
        Observable observableObserveOn = interfaceC46305fM39876V0.m102082R(code).compose(C24217a1.m58390n()).observeOn(AndroidSchedulers.mainThread());
        final Function1 function1 = new Function1() { // from class: com.kubi.margin.trade.l4
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginConfigManager.m39828k1(str, (FeeEntity) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.margin.trade.r4
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarginConfigManager.m39831l1(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.margin.trade.s4
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginConfigManager.m39834m1((Throwable) obj);
            }
        };
        return observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.margin.trade.t4
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarginConfigManager.m39837n1(function2, obj);
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: k0 */
    public final Observable<IsolateMarginPosition> m39889k0(long j11, @Nullable Boolean bool) {
        C42579a c42579a = C42579a.f94275a;
        if (!c42579a.m93347g().c() || !c42579a.m93347g().d0().isHasOpenLever()) {
            return null;
        }
        Observable observableObserveOn = m39876V0().m102088X(bool).compose(C24217a1.m58390n()).observeOn(AndroidSchedulers.mainThread());
        final Function1 function1 = new Function1() { // from class: com.kubi.margin.trade.u4
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginConfigManager.m39833m0((IsolateMarginPosition) obj);
            }
        };
        return observableObserveOn.doOnNext(new Consumer() { // from class: com.kubi.margin.trade.v4
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarginConfigManager.m39836n0(function1, obj);
            }
        }).delaySubscription(j11, TimeUnit.SECONDS);
    }

    @NotNull
    /* JADX INFO: renamed from: o0 */
    public final Observable<MarginPosition> m39890o0(@NotNull String code, boolean z11) {
        Intrinsics.checkNotNullParameter(code, "code");
        Observable observableObserveOn = m39876V0().m102099j(code, Boolean.valueOf(z11)).compose(C24217a1.m58390n()).observeOn(AndroidSchedulers.mainThread());
        final Function1 function1 = new Function1() { // from class: com.kubi.margin.trade.o3
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginConfigManager.m39843q0((MarginPosition) obj);
            }
        };
        Observable<MarginPosition> observableDoOnNext = observableObserveOn.doOnNext(new Consumer() { // from class: com.kubi.margin.trade.q3
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarginConfigManager.m39846r0(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableDoOnNext, "doOnNext(...)");
        return observableDoOnNext;
    }

    /* JADX INFO: renamed from: t0 */
    public final Disposable m39893t0() {
        Observable<R> observableCompose = (C42579a.f94275a.m93347g().c() ? m39876V0().m102110w() : m39876V0().m102102m()).compose(C24217a1.m58390n());
        final Function1 function1 = new Function1() { // from class: com.kubi.margin.trade.g4
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginConfigManager.m39853u0((LeverConfig) obj);
            }
        };
        Observable observableObserveOn = observableCompose.doOnNext(new Consumer() { // from class: com.kubi.margin.trade.h4
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarginConfigManager.m39855v0(function1, obj);
            }
        }).observeOn(AndroidSchedulers.mainThread());
        final Function1 function2 = new Function1() { // from class: com.kubi.margin.trade.i4
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginConfigManager.m39857w0((LeverConfig) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.margin.trade.j4
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarginConfigManager.m39859x0(function2, obj);
            }
        };
        final Function1 function3 = new Function1() { // from class: com.kubi.margin.trade.k4
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginConfigManager.m39861y0((Throwable) obj);
            }
        };
        return observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.margin.trade.m4
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarginConfigManager.m39863z0(function3, obj);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: u1 */
    public final Observable<Object> m39894u1(int i11, @NotNull String leverage, @NotNull String code) {
        Observable<BaseEntity<Object>> observableM102107s;
        Intrinsics.checkNotNullParameter(leverage, "leverage");
        Intrinsics.checkNotNullParameter(code, "code");
        if (i11 == 1) {
            f33688h.setUserLeverage(new BigDecimal(leverage));
            observableM102107s = m39876V0().m102104p(leverage);
        } else {
            MarginPosition marginPositionM39874T0 = m39874T0(code);
            if (marginPositionM39874T0 != null) {
                marginPositionM39874T0.setUserLeverage(new BigDecimal(leverage));
            }
            observableM102107s = m39876V0().m102107s(leverage, code);
        }
        Observable<Object> observableObserveOn = observableM102107s.compose(C24217a1.m58390n()).observeOn(AndroidSchedulers.mainThread());
        Intrinsics.checkNotNullExpressionValue(observableObserveOn, "observeOn(...)");
        return observableObserveOn;
    }

    /* JADX INFO: renamed from: v1 */
    public final void m39895v1(@NotNull BaseFragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.gains_rate).m54156M4(fragment.getString(R$string.margin_profit_error_tips1) + '\n' + fragment.getString(R$string.margin_profit_error_tips2)).m54163T4(fragment.getString(R$string.i_know), null).m54172c5(fragment.getChildFragmentManager());
    }

    /* JADX INFO: renamed from: F0 */
    public static final Unit m39778F0(Action action, LeverBalance leverBalance) throws Exception {
        Intrinsics.checkNotNull(leverBalance);
        f33688h = leverBalance;
        if (action != null) {
            action.run();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G0 */
    public static final void m39780G0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: H0 */
    public static final Unit m39782H0(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I0 */
    public static final void m39784I0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: V */
    public static final Unit m39800V(Function0 function0, Pair pair) {
        LeverConfig leverConfig = (LeverConfig) pair.component1();
        Map<? extends String, ? extends IsolateMarginPositionConfig> map = (Map) pair.component2();
        f33689i = leverConfig;
        HashMap<String, IsolateMarginPositionConfig> map2 = f33686f;
        map2.clear();
        map2.putAll(map);
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: W */
    public static final void m39801W(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: X */
    public static final Unit m39802X(Function0 function0, Throwable th2) {
        C44128b.m97264h(th2);
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Y */
    public static final void m39803Y(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: f1 */
    public static final Unit m39815f1(String str, Consumer consumer, String str2) throws Exception {
        if (!TextUtils.isEmpty(str2)) {
            f33690j.put(str, str2);
        }
        if (consumer != null) {
            consumer.accept(f33690j.get(str));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g1 */
    public static final void m39818g1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: h0 */
    public static final void m39820h0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: i0 */
    public static final Unit m39823i0(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i1 */
    public static final void m39824i1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: j0 */
    public static final void m39826j0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: l1 */
    public static final void m39831l1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: m0 */
    public static final Unit m39833m0(IsolateMarginPosition isolateMarginPosition) {
        List<MarginPosition> positions = isolateMarginPosition.getPositions();
        if (positions != null) {
            for (MarginPosition marginPosition : positions) {
                f33687g.put(C27041f.m66668h(marginPosition.getTag()), marginPosition);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m1 */
    public static final Unit m39834m1(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n0 */
    public static final void m39836n0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: n1 */
    public static final void m39837n1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: q1 */
    public static final void m39844q1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: r0 */
    public static final void m39846r0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: s1 */
    public static final void m39849s1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: t1 */
    public static final InterfaceC46305f m39851t1() {
        return (InterfaceC46305f) C42597a.m93386b().create(InterfaceC46305f.class);
    }

    /* JADX INFO: renamed from: u0 */
    public static final Unit m39853u0(LeverConfig leverConfig) {
        Intrinsics.checkNotNull(leverConfig);
        C46396e.m102357n("common-alpha", "leverConfig", leverConfig);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v0 */
    public static final void m39855v0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: w0 */
    public static final Unit m39857w0(LeverConfig leverConfig) {
        Intrinsics.checkNotNull(leverConfig);
        f33689i = leverConfig;
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x0 */
    public static final void m39859x0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: y0 */
    public static final Unit m39861y0(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z0 */
    public static final void m39863z0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    @SuppressLint({"CheckResult"})
    /* JADX INFO: renamed from: o1 */
    public final void m39891o1() {
        m39893t0();
        m39886d0();
        m39776E0(this, null, 1, null);
        Observable observableM39830l0 = m39830l0(this, 0L, null, 3, null);
        if (observableM39830l0 != null) {
            FlowableCompatKt.m66389c(observableM39830l0);
        }
        f33684d.m100098g(m39876V0());
        Observable observableJ = UserInfo.a.j();
        final Function1 function1 = new Function1() { // from class: com.kubi.margin.trade.s3
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginConfigManager.m39841p1((LoginUserEntity) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.margin.trade.t3
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarginConfigManager.m39844q1(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.margin.trade.u3
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginConfigManager.m39847r1((Throwable) obj);
            }
        };
        observableJ.subscribe(consumer, new Consumer() { // from class: com.kubi.margin.trade.v3
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarginConfigManager.m39849s1(function2, obj);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: s0 */
    public final Observable<ArrayList<FundsInfo>> m39892s0() {
        Observable<ArrayList<FundsInfo>> observableObserveOn = m39876V0().m102067A().compose(C24217a1.m58390n()).observeOn(AndroidSchedulers.mainThread());
        Intrinsics.checkNotNullExpressionValue(observableObserveOn, "observeOn(...)");
        return observableObserveOn;
    }
}
