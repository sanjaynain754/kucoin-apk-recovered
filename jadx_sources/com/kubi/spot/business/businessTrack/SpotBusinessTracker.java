package com.kubi.spot.business.businessTrack;

import com.google.gson.reflect.TypeToken;
import com.kubi.BusinessType;
import com.kubi.C11375c;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.margin.api.IMarginService;
import com.kubi.margin.api.entity.FeeEntity;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.spot.business.businessTrack.SpotBusinessTracker;
import com.kubi.utils.extensions.DowngradeExKt;
import com.tencent.imsdk.BaseConstants;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43841b;
import p569qq.C43846g;
import p569qq.C43852m;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: SpotBusinessTracker.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u0000 \u00042\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/spot/business/businessTrack/SpotBusinessTracker;", "", "<init>", "()V", "Companion", "SpotCategory", "SpotFailReason", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSpotBusinessTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpotBusinessTracker.kt\ncom/kubi/spot/business/businessTrack/SpotBusinessTracker\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,308:1\n35#2,4:309\n39#2:315\n44#3,2:313\n*S KotlinDebug\n*F\n+ 1 SpotBusinessTracker.kt\ncom/kubi/spot/business/businessTrack/SpotBusinessTracker\n*L\n32#1:309,4\n32#1:315\n32#1:313,2\n*E\n"})
public final class SpotBusinessTracker {

    /* JADX INFO: renamed from: c */
    public static long f49773c;

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f49771a = new Companion(null);

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy<ReportParamsEntity> f49772b = LazyKt.lazy(new Function0() { // from class: g20.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SpotBusinessTracker.m60342q();
        }
    });

    /* JADX INFO: renamed from: d */
    @NotNull
    public static Map<String, String> f49774d = new HashMap();

    /* JADX INFO: renamed from: e */
    @NotNull
    public static String f49775e = "";

    /* JADX INFO: renamed from: f */
    @NotNull
    public static String f49776f = "";

    /* JADX INFO: renamed from: g */
    public static boolean f49777g = true;

    /* JADX INFO: renamed from: h */
    @NotNull
    public static String f49778h = "";

    /* JADX INFO: renamed from: i */
    @NotNull
    public static Map<String, String> f49779i = new HashMap();

    /* JADX INFO: compiled from: SpotBusinessTracker.kt */
    @Metadata(m90083d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010&\u001a\u00020'2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u00102\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u000fJ\u0016\u0010)\u001a\u00020'2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-J\u0016\u0010.\u001a\u00020'2\u0006\u0010*\u001a\u00020+2\u0006\u0010/\u001a\u000200J\b\u00101\u001a\u00020\u001aH\u0002J\u0006\u00102\u001a\u00020'J\u0010\u00103\u001a\u0002042\u0006\u0010*\u001a\u00020+H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0013\"\u0004\b \u0010\u0015R&\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u00065"}, m90084d2 = {"Lcom/kubi/spot/business/businessTrack/SpotBusinessTracker$Companion;", "", "<init>", "()V", "INTERVAL_DEFAULT", "", "reportParams", "Lcom/kubi/spot/business/businessTrack/ReportParamsEntity;", "getReportParams", "()Lcom/kubi/spot/business/businessTrack/ReportParamsEntity;", "reportParams$delegate", "Lkotlin/Lazy;", "previewTime", "", "previewRequestOrderParams", "", "", "tradePair", "getTradePair", "()Ljava/lang/String;", "setTradePair", "(Ljava/lang/String;)V", "tradeCurrency", "getTradeCurrency", "setTradeCurrency", "isBuyHolder", "", "()Z", "setBuyHolder", "(Z)V", "pricingType", "getPricingType", "setPricingType", "requestOrderParams", "getRequestOrderParams", "()Ljava/util/Map;", "setRequestOrderParams", "(Ljava/util/Map;)V", "updateOrderInfo", "", ReportDataTable.COLUMN_PARAMS, "trackSpotTradeException", "spotCategory", "Lcom/kubi/spot/business/businessTrack/SpotBusinessTracker$SpotCategory;", "ex", "", "trackSpotOrderFail", "spotFailReason", "Lcom/kubi/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;", "reportFlag", "trackSpotOrderSuccess", "commonAttr", "Lorg/json/JSONObject;", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: a */
        public final JSONObject m60343a(SpotCategory spotCategory) throws JSONException {
            IMarginService iMarginService = IMarginService.f32724a.get();
            SymbolInfoEntity symbolInfoEntity = new SymbolInfoEntity();
            Companion companion = SpotBusinessTracker.f49771a;
            symbolInfoEntity.setCode(companion.getTradePair());
            FeeEntity feeEntityMo37947m0 = iMarginService.mo37947m0(symbolInfoEntity);
            boolean z11 = DowngradeExKt.m66538h(feeEntityMo37947m0 != null ? feeEntityMo37947m0.getSellTaxRate() : null, 0.0d, 1, null) > 0.0d;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("category", spotCategory.name());
            jSONObject.put("trade_pair", companion.getTradePair());
            jSONObject.put("trade_currency", companion.getTradeCurrency());
            jSONObject.put("trade_type", companion.isBuyHolder() ? "buy" : "sell");
            jSONObject.put("pricing_type", companion.getPricingType());
            jSONObject.put("is_remark", z11);
            return jSONObject;
        }

        public final void setPricingType(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            SpotBusinessTracker.f49778h = str;
        }

        public final void setRequestOrderParams(@NotNull Map<String, String> map) {
            Intrinsics.checkNotNullParameter(map, "<set-?>");
            SpotBusinessTracker.f49779i = map;
        }

        public final void setTradeCurrency(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            SpotBusinessTracker.f49776f = str;
        }

        public final void setTradePair(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            SpotBusinessTracker.f49775e = str;
        }

        public final void trackSpotOrderFail(@NotNull SpotCategory spotCategory, @NotNull SpotFailReason spotFailReason) throws JSONException {
            Intrinsics.checkNotNullParameter(spotCategory, "spotCategory");
            Intrinsics.checkNotNullParameter(spotFailReason, "spotFailReason");
            JSONObject jSONObjectM60343a = m60343a(spotCategory);
            jSONObjectM60343a.put("is_success", false);
            jSONObjectM60343a.put("fail_reason", spotFailReason.getErrorCode() + ':' + spotFailReason.name());
            jSONObjectM60343a.put("fail_reason_code", spotFailReason.getErrorCode());
            if (m60345c()) {
                return;
            }
            C43852m.m96605q("spot_trade_result", jSONObjectM60343a);
            DurationTrackManager.Companion companion = DurationTrackManager.f49767c;
            C43841b.m96554a("click_submit_spot_order", companion.getInstance().getF49770b());
            C43841b.m96554a("click_submit_spot_order_without_pass", companion.getInstance().getF49770b());
            companion.getInstance().m60319d();
            TradeResultTracker.f49785a.m60356g(spotCategory.name(), String.valueOf(spotFailReason.getErrorCode()), spotFailReason.getErrorCode() + ':' + spotFailReason.name());
            C11375c.m20294a(BusinessType.SpotTradeResult, spotFailReason.getErrorCode());
        }

        public final void trackSpotOrderSuccess() throws JSONException {
            JSONObject jSONObjectM60343a = m60343a(SpotCategory.PLACE_ORDER);
            jSONObjectM60343a.put("is_success", true);
            C43852m.m96605q("spot_trade_result", jSONObjectM60343a);
            TradeResultTracker.f49785a.m60358i();
        }

        public final void trackSpotTradeException(@NotNull SpotCategory spotCategory, @NotNull Throwable ex2) throws JSONException {
            Intrinsics.checkNotNullParameter(spotCategory, "spotCategory");
            Intrinsics.checkNotNullParameter(ex2, "ex");
            JSONObject jSONObjectM60343a = m60343a(spotCategory);
            jSONObjectM60343a.put("is_success", false);
            if (ex2 instanceof ApiException) {
                ApiException apiException = (ApiException) ex2;
                jSONObjectM60343a.put("fail_reason", apiException.code + ':' + apiException.getMessage());
                jSONObjectM60343a.put("fail_reason_code", apiException.code);
            } else {
                SpotFailReason spotFailReason = SpotFailReason.UNKNOWN_ERROR;
                jSONObjectM60343a.put("fail_reason_code", spotFailReason.getErrorCode());
                jSONObjectM60343a.put("fail_reason", spotFailReason.getErrorCode() + ':' + ex2.getMessage());
            }
            C43852m.m96605q("spot_trade_result", jSONObjectM60343a);
            DurationTrackManager.Companion companion = DurationTrackManager.f49767c;
            C43841b.m96554a("click_submit_spot_order", companion.getInstance().getF49770b());
            C43841b.m96554a("click_submit_spot_order_without_pass", companion.getInstance().getF49770b());
            companion.getInstance().m60319d();
            TradeResultTracker.f49785a.m60357h(spotCategory.name(), ex2);
        }

        public final void updateOrderInfo(@NotNull String tradePair, @NotNull String tradeCurrency, boolean isBuyHolder, @NotNull String pricingType, @NotNull Map<String, String> params) {
            Intrinsics.checkNotNullParameter(tradePair, "tradePair");
            Intrinsics.checkNotNullParameter(tradeCurrency, "tradeCurrency");
            Intrinsics.checkNotNullParameter(pricingType, "pricingType");
            Intrinsics.checkNotNullParameter(params, "params");
            Companion companion = SpotBusinessTracker.f49771a;
            companion.setTradePair(tradePair);
            companion.setTradeCurrency(tradeCurrency);
            companion.setBuyHolder(isBuyHolder);
            companion.setPricingType(pricingType);
            companion.setRequestOrderParams(params);
        }

        /* JADX INFO: renamed from: b */
        public final ReportParamsEntity m60344b() {
            return (ReportParamsEntity) SpotBusinessTracker.f49772b.getValue();
        }

        /* JADX INFO: renamed from: c */
        public final boolean m60345c() {
            int iAbs;
            long jCurrentTimeMillis = System.currentTimeMillis() - SpotBusinessTracker.f49773c;
            Integer enable = m60344b().getEnable();
            if (enable == null || enable.intValue() != 1) {
                return false;
            }
            Integer interval = m60344b().getInterval();
            if (interval != null) {
                iAbs = Math.abs(interval.intValue());
            } else {
                iAbs = 1000;
            }
            if (jCurrentTimeMillis <= iAbs && Intrinsics.areEqual(getRequestOrderParams(), SpotBusinessTracker.f49774d)) {
                SpotBusinessTracker.f49774d = getRequestOrderParams();
                SpotBusinessTracker.f49773c = System.currentTimeMillis();
                return true;
            }
            return false;
        }

        @NotNull
        public final String getPricingType() {
            return SpotBusinessTracker.f49778h;
        }

        @NotNull
        public final Map<String, String> getRequestOrderParams() {
            return SpotBusinessTracker.f49779i;
        }

        @NotNull
        public final String getTradeCurrency() {
            return SpotBusinessTracker.f49776f;
        }

        @NotNull
        public final String getTradePair() {
            return SpotBusinessTracker.f49775e;
        }

        public final boolean isBuyHolder() {
            return SpotBusinessTracker.f49777g;
        }

        public final void setBuyHolder(boolean z11) {
            SpotBusinessTracker.f49777g = z11;
        }
    }

    /* JADX INFO: compiled from: SpotBusinessTracker.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0014\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/spot/business/businessTrack/SpotBusinessTracker$SpotCategory;", "", "<init>", "(Ljava/lang/String;I)V", "CHECK_DOWNTIME", "CHECK_LOGIN", "CHECK_LEVEL", "CHECK_USE_PASSWORD", "CHECK_STOP", "CHECK_NUM_RANGE", "CHECK_LIMIT_PRICE", "CHECK_BALANCE", "CHECK_INPUT_PRICE", "CHECK_TURNOVER", "APP_IS_BACKGROUND", "FAILED_LOADING_VIEW", "PASS_CHECK_FAILED", "PLACE_ORDER", "CHECK_PRICE_RANGE", "CHECK_TRADINGSTOP_PRICE_RANGE", "CHECK_TRADINGSTOP_PERCENT_RANGE", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public enum SpotCategory {
        CHECK_DOWNTIME,
        CHECK_LOGIN,
        CHECK_LEVEL,
        CHECK_USE_PASSWORD,
        CHECK_STOP,
        CHECK_NUM_RANGE,
        CHECK_LIMIT_PRICE,
        CHECK_BALANCE,
        CHECK_INPUT_PRICE,
        CHECK_TURNOVER,
        APP_IS_BACKGROUND,
        FAILED_LOADING_VIEW,
        PASS_CHECK_FAILED,
        PLACE_ORDER,
        CHECK_PRICE_RANGE,
        CHECK_TRADINGSTOP_PRICE_RANGE,
        CHECK_TRADINGSTOP_PERCENT_RANGE;


        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ EnumEntries f49781c = EnumEntriesKt.enumEntries(m60346a());

        @NotNull
        public static EnumEntries<SpotCategory> getEntries() {
            return f49781c;
        }
    }

    /* JADX INFO: compiled from: SpotBusinessTracker.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;", "", "errorCode", "", "<init>", "(Ljava/lang/String;II)V", "getErrorCode", "()I", "DOWNTIME", "NOT_LOGIN", "LEVEL_NOT_OPEN", "CURRENCY_STOP", "TRANSACTION_PASS_NOT_SET", "NUM_RANGE_ILLEGAL", "LIMIT_PRICE_ILLEGAL", "BALANCE_INSUFFICIENT", "INPUT_PRICE_ILLEGAL", "TURNOVER_ILLEGAL", "APP_IS_BACKGROUND", "LOADING_VIEW_FAILED", "PASSWORD_FAILED", "UNKNOWN_ERROR", "PRICE_RANGE_ILLEGAL", "TRADINGSTOP_PRICE_RANGE_ILLEGAL", "TRADINGSTOP_PERCENT_RANGE_ILLEGAL", "PRICE_PROTECT_CANCEL", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public enum SpotFailReason {
        DOWNTIME(BaseConstants.ERR_SVR_SSO_VCODE),
        NOT_LOGIN(BaseConstants.ERR_SVR_SSO_D2_EXPIRED),
        LEVEL_NOT_OPEN(-10002),
        CURRENCY_STOP(BaseConstants.ERR_SVR_SSO_A2_UP_INVALID),
        TRANSACTION_PASS_NOT_SET(-10013),
        NUM_RANGE_ILLEGAL(BaseConstants.ERR_SVR_SSO_A2_DOWN_INVALID),
        LIMIT_PRICE_ILLEGAL(BaseConstants.ERR_SVR_SSO_EMPTY_KEY),
        BALANCE_INSUFFICIENT(BaseConstants.ERR_SVR_SSO_UIN_INVALID),
        INPUT_PRICE_ILLEGAL(BaseConstants.ERR_SVR_SSO_VCODE_TIMEOUT),
        TURNOVER_ILLEGAL(BaseConstants.ERR_SVR_SSO_NO_IMEI_AND_A2),
        APP_IS_BACKGROUND(BaseConstants.ERR_SVR_SSO_COOKIE_INVALID),
        LOADING_VIEW_FAILED(-10010),
        PASSWORD_FAILED(-10011),
        UNKNOWN_ERROR(-10012),
        PRICE_RANGE_ILLEGAL(-10014),
        TRADINGSTOP_PRICE_RANGE_ILLEGAL(-10015),
        TRADINGSTOP_PERCENT_RANGE_ILLEGAL(-10016),
        PRICE_PROTECT_CANCEL(-10017);


        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ EnumEntries f49783c = EnumEntriesKt.enumEntries(m60347a());
        private final int errorCode;

        @NotNull
        public static EnumEntries<SpotFailReason> getEntries() {
            return f49783c;
        }

        public final int getErrorCode() {
            return this.errorCode;
        }

        SpotFailReason(int i11) {
            this.errorCode = i11;
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.business.businessTrack.SpotBusinessTracker$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C24685a extends TypeToken<ReportParamsEntity> {
    }

    /* JADX INFO: renamed from: q */
    public static final ReportParamsEntity m60342q() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new C24685a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("kc_spot_report_interval", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        ReportParamsEntity reportParamsEntity = (ReportParamsEntity) objM20457a;
        return reportParamsEntity == null ? new ReportParamsEntity(0, 1000) : reportParamsEntity;
    }
}
