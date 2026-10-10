package com.kubi.core.spot.business.businessTrack;

import com.kubi.core.base.TradeAccountType;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.sdk.constant.monitor.KunlunBusinessEventEnum;
import com.tencent.imsdk.BaseConstants;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import p569qq.C43847h;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: SpotBusinessTracker.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u0000 \u00042\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker;", "", "<init>", "()V", "Companion", "SpotCategory", "SpotFailReason", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SpotBusinessTracker {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f21010a = new Companion(null);

    /* JADX INFO: renamed from: b */
    @NotNull
    public static TradeAccountType f21011b = TradeAccountType.ClassicSpot.INSTANCE;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static String f21012c = "";

    /* JADX INFO: renamed from: d */
    public static boolean f21013d = true;

    /* JADX INFO: compiled from: SpotBusinessTracker.kt */
    @Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JB\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u000b2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u001cJ\u0016\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!J\u0016\u0010\"\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020$J\u0006\u0010%\u001a\u00020\u0018R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\r¨\u0006&"}, m90084d2 = {"Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$Companion;", "", "<init>", "()V", "tradeBiz", "Lcom/kubi/core/base/TradeAccountType;", "getTradeBiz", "()Lcom/kubi/core/base/TradeAccountType;", "setTradeBiz", "(Lcom/kubi/core/base/TradeAccountType;)V", "tradePair", "", "getTradePair", "()Ljava/lang/String;", "setTradePair", "(Ljava/lang/String;)V", "isBuyHolder", "", "()Z", "setBuyHolder", "(Z)V", "tradeServiceType", "getTradeServiceType", "updateOrderInfo", "", "tradeCurrency", "pricingType", ReportDataTable.COLUMN_PARAMS, "", "trackSpotTradeException", "spotCategory", "Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotCategory;", "ex", "", "trackSpotOrderFail", "spotFailReason", "Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;", "trackSpotOrderSuccess", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void setTradeBiz(@NotNull TradeAccountType tradeAccountType) {
            Intrinsics.checkNotNullParameter(tradeAccountType, "<set-?>");
            SpotBusinessTracker.f21011b = tradeAccountType;
        }

        public final void setTradePair(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            SpotBusinessTracker.f21012c = str;
        }

        public final void trackSpotOrderFail(@NotNull SpotCategory spotCategory, @NotNull SpotFailReason spotFailReason) throws JSONException {
            Intrinsics.checkNotNullParameter(spotCategory, "spotCategory");
            Intrinsics.checkNotNullParameter(spotFailReason, "spotFailReason");
            TradeResultTracker.f21019a.m22875f(spotCategory.name(), String.valueOf(spotFailReason.getErrorCode()), spotFailReason.getErrorCode() + ':' + spotFailReason.name(), getTradeBiz());
            if (Intrinsics.areEqual(getTradeBiz(), TradeAccountType.Unified.INSTANCE)) {
                C43847h.m96572a(KunlunBusinessEventEnum.UNIFY_TRADE_PRECHECK_RESULT, spotFailReason.getErrorCode());
            }
        }

        public final void trackSpotOrderSuccess() {
            TradeResultTracker.f21019a.m22877h(getTradeBiz());
        }

        public final void trackSpotTradeException(@NotNull SpotCategory spotCategory, @NotNull Throwable ex2) throws JSONException {
            String str;
            Integer intOrNull;
            Intrinsics.checkNotNullParameter(spotCategory, "spotCategory");
            Intrinsics.checkNotNullParameter(ex2, "ex");
            TradeResultTracker.f21019a.m22876g(spotCategory.name(), getTradeBiz(), ex2);
            if (Intrinsics.areEqual(getTradeBiz(), TradeAccountType.Unified.INSTANCE)) {
                ApiException apiException = ex2 instanceof ApiException ? (ApiException) ex2 : null;
                C43847h.m96572a(KunlunBusinessEventEnum.UNIFY_TRADE_API_RESULT, (apiException == null || (str = apiException.code) == null || (intOrNull = StringsKt.toIntOrNull(str)) == null) ? SpotFailReason.UNKNOWN_ERROR.getErrorCode() : intOrNull.intValue());
            }
        }

        public final void updateOrderInfo(@NotNull TradeAccountType tradeBiz, @NotNull String tradePair, @NotNull String tradeCurrency, boolean isBuyHolder, @NotNull String pricingType, @NotNull Map<String, String> params) {
            Intrinsics.checkNotNullParameter(tradeBiz, "tradeBiz");
            Intrinsics.checkNotNullParameter(tradePair, "tradePair");
            Intrinsics.checkNotNullParameter(tradeCurrency, "tradeCurrency");
            Intrinsics.checkNotNullParameter(pricingType, "pricingType");
            Intrinsics.checkNotNullParameter(params, "params");
            Companion companion = SpotBusinessTracker.f21010a;
            companion.setTradeBiz(tradeBiz);
            companion.setTradePair(tradePair);
            companion.setBuyHolder(isBuyHolder);
            TradeResultTracker.f21019a.m22878i(tradePair, tradeCurrency, isBuyHolder, pricingType, params);
        }

        @NotNull
        public final TradeAccountType getTradeBiz() {
            return SpotBusinessTracker.f21011b;
        }

        @NotNull
        public final String getTradePair() {
            return SpotBusinessTracker.f21012c;
        }

        @NotNull
        public final String getTradeServiceType() {
            return getTradeBiz().getType();
        }

        public final boolean isBuyHolder() {
            return SpotBusinessTracker.f21013d;
        }

        public final void setBuyHolder(boolean z11) {
            SpotBusinessTracker.f21013d = z11;
        }
    }

    /* JADX INFO: compiled from: SpotBusinessTracker.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0014\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotCategory;", "", "<init>", "(Ljava/lang/String;I)V", "CHECK_DOWNTIME", "CHECK_LOGIN", "CHECK_LEVEL", "CHECK_USE_PASSWORD", "CHECK_STOP", "CHECK_NUM_RANGE", "CHECK_LIMIT_PRICE", "CHECK_BALANCE", "CHECK_INPUT_PRICE", "CHECK_TURNOVER", "APP_IS_BACKGROUND", "FAILED_LOADING_VIEW", "PASS_CHECK_FAILED", "PLACE_ORDER", "CHECK_PRICE_RANGE", "CHECK_TRADINGSTOP_PRICE_RANGE", "CHECK_TRADINGSTOP_PERCENT_RANGE", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
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
        public static final /* synthetic */ EnumEntries f21015c = EnumEntriesKt.enumEntries(m22866a());

        @NotNull
        public static EnumEntries<SpotCategory> getEntries() {
            return f21015c;
        }
    }

    /* JADX INFO: compiled from: SpotBusinessTracker.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/core/spot/business/businessTrack/SpotBusinessTracker$SpotFailReason;", "", "errorCode", "", "<init>", "(Ljava/lang/String;II)V", "getErrorCode", "()I", "DOWNTIME", "NOT_LOGIN", "LEVEL_NOT_OPEN", "CURRENCY_STOP", "TRANSACTION_PASS_NOT_SET", "NUM_RANGE_ILLEGAL", "LIMIT_PRICE_ILLEGAL", "BALANCE_INSUFFICIENT", "INPUT_PRICE_ILLEGAL", "TURNOVER_ILLEGAL", "APP_IS_BACKGROUND", "LOADING_VIEW_FAILED", "PASSWORD_FAILED", "UNKNOWN_ERROR", "PRICE_RANGE_ILLEGAL", "TRADINGSTOP_PRICE_RANGE_ILLEGAL", "TRADINGSTOP_PERCENT_RANGE_ILLEGAL", "PRICE_PROTECT_CANCEL", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
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
        public static final /* synthetic */ EnumEntries f21017c = EnumEntriesKt.enumEntries(m22867a());
        private final int errorCode;

        @NotNull
        public static EnumEntries<SpotFailReason> getEntries() {
            return f21017c;
        }

        public final int getErrorCode() {
            return this.errorCode;
        }

        SpotFailReason(int i11) {
            this.errorCode = i11;
        }
    }
}
