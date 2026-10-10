package com.kubi.spot.business.businessTrack;

import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.kucoin.token.ITokenLifecycleRefreshSPI;
import com.kubi.margin.api.IMarginService;
import com.kubi.margin.api.entity.FeeEntity;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.spot.business.businessTrack.TradeResultTracker;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.DowngradeExKt;
import com.tencent.bugly.proguard.C33820nf;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43846g;
import p569qq.C43852m;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.spot.business.businessTrack.b, reason: from Kotlin metadata */
/* JADX INFO: compiled from: TradeResultTracker.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010&\u001a\u00020'2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u00102\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u000fJ\u0016\u0010)\u001a\u00020'2\u0006\u0010*\u001a\u00020\u00102\u0006\u0010+\u001a\u00020,J\u001e\u0010-\u001a\u00020'2\u0006\u0010*\u001a\u00020\u00102\u0006\u0010.\u001a\u00020\u00102\u0006\u0010/\u001a\u00020\u0010J\b\u00100\u001a\u00020\u001aH\u0002J\u0006\u00101\u001a\u00020'J\u0010\u00102\u001a\u0002032\u0006\u0010*\u001a\u00020\u0010H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0013\"\u0004\b \u0010\u0015R&\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u00064"}, m90084d2 = {"Lcom/kubi/spot/business/businessTrack/TradeResultTracker;", "", "<init>", "()V", "INTERVAL_DEFAULT", "", "reportParams", "Lcom/kubi/spot/business/businessTrack/ReportParamsEntity;", "getReportParams", "()Lcom/kubi/spot/business/businessTrack/ReportParamsEntity;", "reportParams$delegate", "Lkotlin/Lazy;", "previewTime", "", "previewRequestOrderParams", "", "", "tradePair", "getTradePair", "()Ljava/lang/String;", "setTradePair", "(Ljava/lang/String;)V", "tradeCurrency", "getTradeCurrency", "setTradeCurrency", "isBuyHolder", "", "()Z", "setBuyHolder", "(Z)V", "pricingType", "getPricingType", "setPricingType", "requestOrderParams", "getRequestOrderParams", "()Ljava/util/Map;", "setRequestOrderParams", "(Ljava/util/Map;)V", "updateOrderInfo", "", ReportDataTable.COLUMN_PARAMS, "trackTradeException", "spotCategory", "ex", "", "trackOrderFail", "spotFailReasonCode", "spotFailReason", "reportFlag", "trackTradeOrderSuccess", "commonAttr", "Lorg/json/JSONObject;", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTradeResultTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeResultTracker.kt\ncom/kubi/spot/business/businessTrack/TradeResultTracker\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,175:1\n35#2,4:176\n39#2:182\n44#3,2:180\n*S KotlinDebug\n*F\n+ 1 TradeResultTracker.kt\ncom/kubi/spot/business/businessTrack/TradeResultTracker\n*L\n25#1:176,4\n25#1:182\n25#1:180,2\n*E\n"})
public final class TradeResultTracker {

    /* JADX INFO: renamed from: c */
    public static long f49787c;

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final TradeResultTracker f49785a = new TradeResultTracker();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f49786b = LazyKt.lazy(new Function0() { // from class: g20.c
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TradeResultTracker.m60351f();
        }
    });

    /* JADX INFO: renamed from: d */
    @NotNull
    public static Map<String, String> f49788d = new HashMap();

    /* JADX INFO: renamed from: e */
    @NotNull
    public static String f49789e = "";

    /* JADX INFO: renamed from: f */
    @NotNull
    public static String f49790f = "";

    /* JADX INFO: renamed from: g */
    public static boolean f49791g = true;

    /* JADX INFO: renamed from: h */
    @NotNull
    public static String f49792h = "";

    /* JADX INFO: renamed from: i */
    @NotNull
    public static Map<String, String> f49793i = new HashMap();

    /* JADX INFO: renamed from: com.kubi.spot.business.businessTrack.b$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class a extends TypeToken<ReportParamsEntity> {
    }

    /* JADX INFO: renamed from: f */
    public static final ReportParamsEntity m60351f() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("kc_spot_report_interval", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        ReportParamsEntity reportParamsEntity = (ReportParamsEntity) objM20457a;
        return reportParamsEntity == null ? new ReportParamsEntity(0, 1000) : reportParamsEntity;
    }

    /* JADX INFO: renamed from: b */
    public final JSONObject m60352b(String str) throws JSONException {
        IMarginService iMarginService = IMarginService.f32724a.get();
        SymbolInfoEntity symbolInfoEntity = new SymbolInfoEntity();
        symbolInfoEntity.setCode(SpotBusinessTracker.f49771a.getTradePair());
        FeeEntity feeEntityMo37947m0 = iMarginService.mo37947m0(symbolInfoEntity);
        boolean z11 = DowngradeExKt.m66538h(feeEntityMo37947m0 != null ? feeEntityMo37947m0.getSellTaxRate() : null, 0.0d, 1, null) > 0.0d;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("category", str);
        jSONObject.put("trade_pair", f49789e);
        jSONObject.put("trade_currency", f49790f);
        jSONObject.put("trade_service_type", f49793i.get("tradeType"));
        jSONObject.put("trade_type", f49791g ? "buy" : "sell");
        jSONObject.put("pricing_type", f49792h);
        jSONObject.put("is_remark", z11);
        String str2 = "autoBorrow";
        boolean zM66673m = C27041f.m66673m(f49793i.get("autoBorrow"), false, 1, null);
        boolean zM66673m2 = C27041f.m66673m(f49793i.get("autoRepay"), false, 1, null);
        if (zM66673m && zM66673m2) {
            str2 = "autoBorrowRepay";
        } else if (!zM66673m) {
            str2 = zM66673m2 ? "autoRepay" : ITokenLifecycleRefreshSPI.Companion.SOURCE_MANUAL;
        }
        jSONObject.put(C33820nf.f71150f, str2);
        if (f49793i.containsKey("stage")) {
            jSONObject.put("stage", f49793i.get("stage"));
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: c */
    public final ReportParamsEntity m60353c() {
        return (ReportParamsEntity) f49786b.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final Map<String, String> m60354d() {
        return f49793i;
    }

    /* JADX INFO: renamed from: g */
    public final void m60356g(@NotNull String spotCategory, @NotNull String spotFailReasonCode, @NotNull String spotFailReason) throws JSONException {
        Intrinsics.checkNotNullParameter(spotCategory, "spotCategory");
        Intrinsics.checkNotNullParameter(spotFailReasonCode, "spotFailReasonCode");
        Intrinsics.checkNotNullParameter(spotFailReason, "spotFailReason");
        JSONObject jSONObjectM60352b = m60352b(spotCategory);
        jSONObjectM60352b.put("is_success", false);
        jSONObjectM60352b.put("fail_reason", spotFailReason);
        jSONObjectM60352b.put("fail_reason_code", spotFailReasonCode);
        if (m60355e()) {
            return;
        }
        C43852m.m96605q("app_trade_result", jSONObjectM60352b);
    }

    /* JADX INFO: renamed from: h */
    public final void m60357h(@NotNull String spotCategory, @NotNull Throwable ex2) throws JSONException {
        Intrinsics.checkNotNullParameter(spotCategory, "spotCategory");
        Intrinsics.checkNotNullParameter(ex2, "ex");
        JSONObject jSONObjectM60352b = m60352b(spotCategory);
        jSONObjectM60352b.put("is_success", false);
        if (ex2 instanceof ApiException) {
            ApiException apiException = (ApiException) ex2;
            jSONObjectM60352b.put("fail_reason", apiException.code + ':' + apiException.getMessage());
            jSONObjectM60352b.put("fail_reason_code", apiException.code);
        } else {
            SpotBusinessTracker.SpotFailReason spotFailReason = SpotBusinessTracker.SpotFailReason.UNKNOWN_ERROR;
            jSONObjectM60352b.put("fail_reason_code", spotFailReason.getErrorCode());
            jSONObjectM60352b.put("fail_reason", spotFailReason.getErrorCode() + ':' + ex2.getMessage());
        }
        C43852m.m96605q("app_trade_result", jSONObjectM60352b);
    }

    /* JADX INFO: renamed from: i */
    public final void m60358i() throws JSONException {
        JSONObject jSONObjectM60352b = m60352b("PLACE_ORDER");
        jSONObjectM60352b.put("is_success", true);
        C43852m.m96605q("app_trade_result", jSONObjectM60352b);
    }

    /* JADX INFO: renamed from: j */
    public final void m60359j(@NotNull String tradePair, @NotNull String tradeCurrency, boolean z11, @NotNull String pricingType, @NotNull Map<String, String> params) {
        Intrinsics.checkNotNullParameter(tradePair, "tradePair");
        Intrinsics.checkNotNullParameter(tradeCurrency, "tradeCurrency");
        Intrinsics.checkNotNullParameter(pricingType, "pricingType");
        Intrinsics.checkNotNullParameter(params, "params");
        f49789e = tradePair;
        f49790f = tradeCurrency;
        f49791g = z11;
        f49792h = pricingType;
        f49793i = params;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m60355e() {
        int iAbs;
        long jCurrentTimeMillis = System.currentTimeMillis() - f49787c;
        Integer enable = m60353c().getEnable();
        if (enable == null || enable.intValue() != 1) {
            return false;
        }
        Integer interval = m60353c().getInterval();
        if (interval != null) {
            iAbs = Math.abs(interval.intValue());
        } else {
            iAbs = 1000;
        }
        if (jCurrentTimeMillis > iAbs || !Intrinsics.areEqual(f49793i, f49788d)) {
            return false;
        }
        f49788d = f49793i;
        f49787c = System.currentTimeMillis();
        return true;
    }
}
