package com.kubi.assets;

import androidx.core.app.FrameMetricsAggregator;
import com.kubi.assets.entity.AssetData;
import com.kubi.assets.entity.AssetTrendInfo;
import com.kubi.assets.entity.HomeAssetInfo;
import com.kubi.assets.entity.TotalBalanceInfo;
import com.kubi.assets.overview.AssetOverviewFragment;
import com.kubi.assets.service.AssetsDepend;
import com.kubi.assets.view.C11273q;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.DowngradeExKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import gf.C37885i;
import java.math.BigDecimal;
import kotlinx.coroutines.C41777y;
import kotlinx.coroutines.InterfaceC41769w;
import kotlinx.coroutines.flow.InterfaceC41634e;
import lb.C42152g;
import lb.C42153h;
import mr.C42597a;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p311hf.C38184b;
import p402kf.C41014a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;

/* JADX INFO: compiled from: AssetSyncManager.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u000fJ\u001a\u0010\u0011\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0086@¢\u0006\u0002\u0010\u0014J\u001a\u0010\u0015\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u000fH\u0002J\u0006\u0010\u0019\u001a\u00020\u001aJ\u001a\u0010\u001b\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u000fH\u0002R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/assets/AssetSyncManager;", "", "<init>", "()V", "api", "Lcom/kubi/assets/AssetV2Api;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/assets/AssetV2Api;", "api$delegate", "Lkotlin/Lazy;", "syncLock", "saveAssetInfo", "", "assetInfo", "Lcom/kubi/assets/entity/HomeAssetInfo;", "getCachedAssetInfo", "fetchLatestData", "cacheTime", "", "(Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleData", "it", "Lcom/kubi/assets/entity/AssetData;", "homeAssetInfo", "getPnlTitle", "", "handlePnl", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssetSyncManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetSyncManager.kt\ncom/kubi/assets/AssetSyncManager\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 3 KVStore.kt\ncom/kubi/utils/storage/KVStore\n+ 4 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,168:1\n144#2,2:169\n153#2,2:171\n144#2,2:177\n32#2:179\n178#3:173\n25#4:174\n26#4:176\n1#5:175\n*S KotlinDebug\n*F\n+ 1 AssetSyncManager.kt\ncom/kubi/assets/AssetSyncManager\n*L\n46#1:169,2\n56#1:171,2\n102#1:177,2\n113#1:179\n56#1:173\n77#1:174\n77#1:176\n77#1:175\n*E\n"})
public final class AssetSyncManager {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final AssetSyncManager f16327a = new AssetSyncManager();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f16328b = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.b0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AssetSyncManager.m15154c();
        }
    });

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Object f16329c = new Object();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: d */
    public final Object m15155d(@Nullable Long l11, @NotNull Continuation<? super HomeAssetInfo> continuation) {
        AssetSyncManager$fetchLatestData$1 assetSyncManager$fetchLatestData$1;
        InterfaceC41769w interfaceC41769wM91388c;
        Long l12;
        HomeAssetInfo homeAssetInfo;
        if (continuation instanceof AssetSyncManager$fetchLatestData$1) {
            assetSyncManager$fetchLatestData$1 = (AssetSyncManager$fetchLatestData$1) continuation;
            int i11 = assetSyncManager$fetchLatestData$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                assetSyncManager$fetchLatestData$1.label = i11 - Integer.MIN_VALUE;
            } else {
                assetSyncManager$fetchLatestData$1 = new AssetSyncManager$fetchLatestData$1(this, continuation);
            }
        } else {
            assetSyncManager$fetchLatestData$1 = new AssetSyncManager$fetchLatestData$1(this, continuation);
        }
        Object objM42825f = assetSyncManager$fetchLatestData$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = assetSyncManager$fetchLatestData$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM42825f);
            interfaceC41769wM91388c = C41777y.m91388c(null, 1, null);
            HomeAssetInfo homeAssetInfoM15157f = m15157f();
            AssetV2Api assetV2ApiM15156e = m15156e();
            String balanceCurrency = AssetsDepend.f18689a.m19189j().d0().getBalanceCurrency();
            String lineChartRange = AssetOverviewFragment.f18179i0.getLineChartRange();
            if (lineChartRange == null) {
                lineChartRange = "LAST_1_DAY";
            }
            InterfaceC41634e<AssetData> interfaceC41634eM17179z = assetV2ApiM15156e.m17179z(balanceCurrency, lineChartRange, l11);
            AssetSyncManager$fetchLatestData$2 assetSyncManager$fetchLatestData$2 = new AssetSyncManager$fetchLatestData$2(homeAssetInfoM15157f, interfaceC41769wM91388c, null);
            assetSyncManager$fetchLatestData$1.L$0 = SpillingKt.nullOutSpilledVariable(l11);
            assetSyncManager$fetchLatestData$1.L$1 = interfaceC41769wM91388c;
            assetSyncManager$fetchLatestData$1.L$2 = homeAssetInfoM15157f;
            assetSyncManager$fetchLatestData$1.label = 1;
            objM42825f = RetrofitFlowExKt.m42825f(interfaceC41634eM17179z, false, assetSyncManager$fetchLatestData$2, assetSyncManager$fetchLatestData$1);
            if (objM42825f != coroutine_suspended) {
                l12 = l11;
                homeAssetInfo = homeAssetInfoM15157f;
            }
        }
        if (i12 != 1) {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM42825f);
            return objM42825f;
        }
        homeAssetInfo = (HomeAssetInfo) assetSyncManager$fetchLatestData$1.L$2;
        interfaceC41769wM91388c = (InterfaceC41769w) assetSyncManager$fetchLatestData$1.L$1;
        l12 = (Long) assetSyncManager$fetchLatestData$1.L$0;
        ResultKt.throwOnFailure(objM42825f);
        if (((C19334f) objM42825f).getThrowable() != null) {
            interfaceC41769wM91388c.mo91370n(homeAssetInfo);
        }
        assetSyncManager$fetchLatestData$1.L$0 = SpillingKt.nullOutSpilledVariable(l12);
        assetSyncManager$fetchLatestData$1.L$1 = SpillingKt.nullOutSpilledVariable(interfaceC41769wM91388c);
        assetSyncManager$fetchLatestData$1.L$2 = SpillingKt.nullOutSpilledVariable(homeAssetInfo);
        assetSyncManager$fetchLatestData$1.label = 2;
        Object objMo91198h = interfaceC41769wM91388c.mo91198h(assetSyncManager$fetchLatestData$1);
        return objMo91198h == coroutine_suspended ? coroutine_suspended : objMo91198h;
    }

    /* JADX INFO: renamed from: e */
    public final AssetV2Api m15156e() {
        return (AssetV2Api) f16328b.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final HomeAssetInfo m15157f() {
        HomeAssetInfo homeAssetInfo;
        synchronized (f16329c) {
            homeAssetInfo = (HomeAssetInfo) C46392a.f104043a.m102336j(C42153h.f93593a.m92524n(), HomeAssetInfo.class, null);
            if (homeAssetInfo == null) {
                homeAssetInfo = new HomeAssetInfo(null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
            }
        }
        return homeAssetInfo;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:30:0x0062  */
    @NotNull
    /* JADX INFO: renamed from: g */
    public final String m15158g() {
        String str;
        String strM66516f;
        if (!AssetRemoteConfig.f18903a.m19571n()) {
            return "PNL";
        }
        switch (C46392a.m102326h(C42153h.f93593a.m92529s(), "LAST_1_DAY")) {
            case "LAST_90_DAYS":
                str = "90";
                break;
            case "LAST_1_DAY":
                str = "1";
                break;
            case "LAST_180_DAYS":
                str = "180";
                break;
            case "LAST_30_DAYS":
                str = "30";
                break;
            case "LAST_7_DAYS":
                str = TUIConstants.TUICustomerServicePlugin.BUSINESS_ID_SRC_CUSTOMER_SERVICE_SAY_HELLO;
                break;
            case "LAST_360_DAYS":
                str = "360";
                break;
            default:
                str = null;
                break;
        }
        if (Intrinsics.areEqual(str, "1")) {
            return C27017c.f54310a.m66516f(R$string.analysis_todays_pnl, str);
        }
        return (str == null || (strM66516f = C27017c.f54310a.m66516f(R$string.asset_pnl_detail_day_pl, str)) == null) ? "PNL" : strM66516f;
    }

    /* JADX INFO: renamed from: h */
    public final void m15159h(AssetData assetData, HomeAssetInfo homeAssetInfo) {
        BigDecimal bigDecimalM66536f;
        TotalBalanceInfo totalBalanceInfo = assetData != null ? assetData.getTotalBalanceInfo() : null;
        String balanceCurrency = totalBalanceInfo != null ? totalBalanceInfo.getBalanceCurrency() : null;
        String totalBalance = totalBalanceInfo != null ? totalBalanceInfo.getTotalBalance() : null;
        m15160i(assetData, homeAssetInfo);
        homeAssetInfo.setOriginalTotalAsset(totalBalance);
        BigDecimal bigDecimalM66536f2 = DowngradeExKt.m66536f(totalBalance);
        homeAssetInfo.setTotalAsset(C27041f.m66669i(bigDecimalM66536f2 != null ? C37885i.m85562a(bigDecimalM66536f2, balanceCurrency, C11273q.m20046b(balanceCurrency)) : null, "--"));
        homeAssetInfo.setFiatValue(AssetExKt.m15117e(C27041f.m66668h((totalBalance == null || (bigDecimalM66536f = DowngradeExKt.m66536f(totalBalance)) == null) ? null : C41014a.m89950x(C41014a.m89940n(bigDecimalM66536f, balanceCurrency), null, null, 0, false, true, false, false, 111, null))));
        homeAssetInfo.setBalanceCurrency(balanceCurrency);
        homeAssetInfo.setTimestamp(Long.valueOf(C27039d.m66652l(assetData != null ? assetData.getTimestamp() : null)));
        C46392a.m102331n(C42153h.f93593a.m92524n(), homeAssetInfo);
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00e2  */
    /* JADX INFO: renamed from: i */
    public final void m15160i(AssetData assetData, HomeAssetInfo homeAssetInfo) {
        Double dValueOf;
        String strM93905f;
        String strM92496b;
        AssetTrendInfo assetTrendInfo;
        TotalBalanceInfo totalBalanceInfo;
        Boolean boolValueOf = Boolean.TRUE;
        String preTotal = null;
        String strM66516f = "--";
        if (((assetData == null || (totalBalanceInfo = assetData.getTotalBalanceInfo()) == null) ? null : totalBalanceInfo.getTotalBalance()) == null) {
            homeAssetInfo.setPnl("--");
        } else {
            AssetTrendInfo assetTrendInfo2 = assetData.getAssetTrendInfo();
            if (assetTrendInfo2 != null ? Intrinsics.areEqual(assetTrendInfo2.getHasGetPreTotalAsset(), boolValueOf) : false) {
                TotalBalanceInfo totalBalanceInfo2 = assetData.getTotalBalanceInfo();
                BigDecimal bigDecimalM66536f = DowngradeExKt.m66536f(totalBalanceInfo2 != null ? totalBalanceInfo2.getTotalBalance() : null);
                if (bigDecimalM66536f != null) {
                    TotalBalanceInfo totalBalanceInfo3 = assetData.getTotalBalanceInfo();
                    double dM89940n = C41014a.m89940n(bigDecimalM66536f, totalBalanceInfo3 != null ? totalBalanceInfo3.getBalanceCurrency() : null);
                    AssetTrendInfo assetTrendInfo3 = assetData.getAssetTrendInfo();
                    BigDecimal bigDecimalM66536f2 = DowngradeExKt.m66536f(assetTrendInfo3 != null ? assetTrendInfo3.getPreTotal() : null);
                    dValueOf = Double.valueOf(dM89940n - C27039d.m66646f(bigDecimalM66536f2 != null ? Double.valueOf(C41014a.m89940n(bigDecimalM66536f2, C38184b.f85884a.m86146a())) : null));
                } else {
                    dValueOf = null;
                }
                if (AssetRemoteConfig.f18903a.m19571n()) {
                    if (dValueOf != null && (strM93905f = C42152g.m92496b(new BigDecimal(String.valueOf(dValueOf.doubleValue())))) != null) {
                    }
                    boolValueOf = Boolean.valueOf(C27039d.m66646f(dValueOf) >= 0.0d);
                } else {
                    if (dValueOf != null && (strM92496b = C42152g.m92496b(new BigDecimal(String.valueOf(dValueOf.doubleValue())))) != null) {
                        strM66516f = strM92496b;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append('(');
                    AssetTrendInfo assetTrendInfo4 = assetData.getAssetTrendInfo();
                    sb2.append(assetTrendInfo4 != null ? assetTrendInfo4.getRangeName() : null);
                    sb2.append(')');
                    strM93905f = C42828b.m93905f(strM66516f, sb2.toString(), true, false);
                }
                strM66516f = strM93905f;
                boolValueOf = Boolean.valueOf(C27039d.m66646f(dValueOf) >= 0.0d);
            } else {
                strM66516f = C27017c.f54310a.m66516f(R$string.kc_assets_pnl_updating, new Object[0]);
                boolValueOf = null;
            }
        }
        if (assetData != null && (assetTrendInfo = assetData.getAssetTrendInfo()) != null) {
            preTotal = assetTrendInfo.getPreTotal();
        }
        homeAssetInfo.setPreTotal(preTotal);
        homeAssetInfo.setPnl(strM66516f);
        homeAssetInfo.setUp(boolValueOf);
        homeAssetInfo.setPnlTitle(m15158g());
    }

    /* JADX INFO: renamed from: j */
    public final void m15161j(@NotNull HomeAssetInfo assetInfo) {
        Intrinsics.checkNotNullParameter(assetInfo, "assetInfo");
        synchronized (f16329c) {
            C46392a.m102331n(C42153h.f93593a.m92524n(), assetInfo);
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final AssetV2Api m15154c() {
        return (AssetV2Api) C42597a.m93388d().create(AssetV2Api.class);
    }
}
