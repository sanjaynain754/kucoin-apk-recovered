package com.kubi.tradingbotkit.business.coreBusinessTrack;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CoreBusinessTrack.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/tradingbotkit/business/coreBusinessTrack/CoreBusinessTrack;", "", "<init>", "()V", "Companion", "FailedReason", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class CoreBusinessTrack {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f52283a = new Companion(null);

    /* JADX INFO: compiled from: CoreBusinessTrack.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005J\"\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\u0005J\u001a\u0010\u000e\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005J\u0016\u0010\u000f\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005J\u0016\u0010\u0011\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005J\u0016\u0010\u0012\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005J\u0016\u0010\u0013\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005J\u0016\u0010\u0014\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005J\u0016\u0010\u0015\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005J\u0016\u0010\u0016\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005J\u0016\u0010\u0017\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005J\u0016\u0010\u0018\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005J\u000e\u0010\u0019\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/tradingbotkit/business/coreBusinessTrack/CoreBusinessTrack$Companion;", "", "<init>", "()V", "UNKNOWN_ERROR", "", "tradeResultsTrackEventFailed", "", "failReason", "createWay", "gridType", "gridCloseRobotTrackEvent", "isSuccess", "", "botAssetsShowTrackEvent", "totalInvestInvalid", "spotType", "priceScopeStartInvalid", "priceScopeEndInvalid", "gridNumberInvalid", "triggerOrderPriceInvalid", "stopLosePriceInvalid", "stopProfitPriceInvalid", "cancelOrder", "totalInvestLimitByCoupons", "cancelCloseRobot", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public static /* synthetic */ void botAssetsShowTrackEvent$default(Companion companion, boolean z11, String str, int i11, Object obj) throws JSONException {
            if ((i11 & 2) != 0) {
                str = null;
            }
            companion.botAssetsShowTrackEvent(z11, str);
        }

        public static /* synthetic */ void gridCloseRobotTrackEvent$default(Companion companion, boolean z11, String str, String str2, int i11, Object obj) throws JSONException {
            if ((i11 & 2) != 0) {
                str = null;
            }
            companion.gridCloseRobotTrackEvent(z11, str, str2);
        }

        public static /* synthetic */ void tradeResultsTrackEventFailed$default(Companion companion, String str, String str2, String str3, int i11, Object obj) throws JSONException {
            if ((i11 & 1) != 0) {
                str = null;
            }
            companion.tradeResultsTrackEventFailed(str, str2, str3);
        }

        public final void botAssetsShowTrackEvent(boolean isSuccess, @Nullable String failReason) throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("is_success", isSuccess);
            if (failReason == null) {
                failReason = "none";
            }
            jSONObject.put("fail_reason", failReason);
            C43852m.m96605q("bot_assets_show", jSONObject);
        }

        public final void cancelCloseRobot(@NotNull String gridType) throws JSONException {
            Intrinsics.checkNotNullParameter(gridType, "gridType");
            StringBuilder sb2 = new StringBuilder();
            FailedReason failedReason = FailedReason.CANCEL_CLOSE_ROBOT;
            sb2.append(failedReason.getErrorCode());
            sb2.append(':');
            sb2.append(failedReason.getErrorReason());
            gridCloseRobotTrackEvent(false, sb2.toString(), gridType);
        }

        public final void cancelOrder(@NotNull String createWay, @NotNull String spotType) throws JSONException {
            Intrinsics.checkNotNullParameter(createWay, "createWay");
            Intrinsics.checkNotNullParameter(spotType, "spotType");
            StringBuilder sb2 = new StringBuilder();
            FailedReason failedReason = FailedReason.CANCEL_ORDER;
            sb2.append(failedReason.getErrorCode());
            sb2.append(':');
            sb2.append(failedReason.getErrorReason());
            tradeResultsTrackEventFailed(sb2.toString(), createWay, spotType);
        }

        public final void gridCloseRobotTrackEvent(boolean isSuccess, @Nullable String failReason, @NotNull String gridType) throws JSONException {
            Intrinsics.checkNotNullParameter(gridType, "gridType");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("is_success", isSuccess);
            if (failReason == null) {
                failReason = "none";
            }
            jSONObject.put("fail_reason", failReason);
            jSONObject.put("grid_type", gridType);
            C43852m.m96605q("grid_close_robot", jSONObject);
        }

        public final void gridNumberInvalid(@NotNull String createWay, @NotNull String spotType) throws JSONException {
            Intrinsics.checkNotNullParameter(createWay, "createWay");
            Intrinsics.checkNotNullParameter(spotType, "spotType");
            StringBuilder sb2 = new StringBuilder();
            FailedReason failedReason = FailedReason.GRID_NUMBER_INVALID;
            sb2.append(failedReason.getErrorCode());
            sb2.append(':');
            sb2.append(failedReason.getErrorReason());
            tradeResultsTrackEventFailed(sb2.toString(), createWay, spotType);
        }

        public final void priceScopeEndInvalid(@NotNull String createWay, @NotNull String spotType) throws JSONException {
            Intrinsics.checkNotNullParameter(createWay, "createWay");
            Intrinsics.checkNotNullParameter(spotType, "spotType");
            StringBuilder sb2 = new StringBuilder();
            FailedReason failedReason = FailedReason.PRICE_SCOPE_END_INVALID;
            sb2.append(failedReason.getErrorCode());
            sb2.append(':');
            sb2.append(failedReason.getErrorReason());
            tradeResultsTrackEventFailed(sb2.toString(), createWay, spotType);
        }

        public final void priceScopeStartInvalid(@NotNull String createWay, @NotNull String spotType) throws JSONException {
            Intrinsics.checkNotNullParameter(createWay, "createWay");
            Intrinsics.checkNotNullParameter(spotType, "spotType");
            StringBuilder sb2 = new StringBuilder();
            FailedReason failedReason = FailedReason.PRICE_SCOPE_START_INVALID;
            sb2.append(failedReason.getErrorCode());
            sb2.append(':');
            sb2.append(failedReason.getErrorReason());
            tradeResultsTrackEventFailed(sb2.toString(), createWay, spotType);
        }

        public final void stopLosePriceInvalid(@NotNull String createWay, @NotNull String spotType) throws JSONException {
            Intrinsics.checkNotNullParameter(createWay, "createWay");
            Intrinsics.checkNotNullParameter(spotType, "spotType");
            StringBuilder sb2 = new StringBuilder();
            FailedReason failedReason = FailedReason.STOP_LOSE_PRICE_INVALID;
            sb2.append(failedReason.getErrorCode());
            sb2.append(':');
            sb2.append(failedReason.getErrorReason());
            tradeResultsTrackEventFailed(sb2.toString(), createWay, spotType);
        }

        public final void stopProfitPriceInvalid(@NotNull String createWay, @NotNull String spotType) throws JSONException {
            Intrinsics.checkNotNullParameter(createWay, "createWay");
            Intrinsics.checkNotNullParameter(spotType, "spotType");
            StringBuilder sb2 = new StringBuilder();
            FailedReason failedReason = FailedReason.STOP_PROFIT_PRICE_INVALID;
            sb2.append(failedReason.getErrorCode());
            sb2.append(':');
            sb2.append(failedReason.getErrorReason());
            tradeResultsTrackEventFailed(sb2.toString(), createWay, spotType);
        }

        public final void totalInvestInvalid(@NotNull String createWay, @NotNull String spotType) throws JSONException {
            Intrinsics.checkNotNullParameter(createWay, "createWay");
            Intrinsics.checkNotNullParameter(spotType, "spotType");
            StringBuilder sb2 = new StringBuilder();
            FailedReason failedReason = FailedReason.TOTAL_INVEST_INVALID;
            sb2.append(failedReason.getErrorCode());
            sb2.append(':');
            sb2.append(failedReason.getErrorReason());
            tradeResultsTrackEventFailed(sb2.toString(), createWay, spotType);
        }

        public final void totalInvestLimitByCoupons(@NotNull String createWay, @NotNull String spotType) throws JSONException {
            Intrinsics.checkNotNullParameter(createWay, "createWay");
            Intrinsics.checkNotNullParameter(spotType, "spotType");
            StringBuilder sb2 = new StringBuilder();
            FailedReason failedReason = FailedReason.TOTAL_INVEST_LIMIT_BY_COUPONS;
            sb2.append(failedReason.getErrorCode());
            sb2.append(':');
            sb2.append(failedReason.getErrorReason());
            tradeResultsTrackEventFailed(sb2.toString(), createWay, spotType);
        }

        public final void tradeResultsTrackEventFailed(@Nullable String failReason, @NotNull String createWay, @NotNull String gridType) throws JSONException {
            Intrinsics.checkNotNullParameter(createWay, "createWay");
            Intrinsics.checkNotNullParameter(gridType, "gridType");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("is_success", false);
            if (failReason == null) {
                failReason = "none";
            }
            jSONObject.put("fail_reason", failReason);
            jSONObject.put("create_way", createWay);
            jSONObject.put("grid_type", gridType);
            C43852m.m96605q("trade_results", jSONObject);
        }

        public final void triggerOrderPriceInvalid(@NotNull String createWay, @NotNull String spotType) throws JSONException {
            Intrinsics.checkNotNullParameter(createWay, "createWay");
            Intrinsics.checkNotNullParameter(spotType, "spotType");
            StringBuilder sb2 = new StringBuilder();
            FailedReason failedReason = FailedReason.TRIGGER_ORDER_PRICE_INVALID;
            sb2.append(failedReason.getErrorCode());
            sb2.append(':');
            sb2.append(failedReason.getErrorReason());
            tradeResultsTrackEventFailed(sb2.toString(), createWay, spotType);
        }
    }

    /* JADX INFO: compiled from: CoreBusinessTrack.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/tradingbotkit/business/coreBusinessTrack/CoreBusinessTrack$FailedReason;", "", "errorCode", "", "errorReason", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getErrorCode", "()Ljava/lang/String;", "getErrorReason", "PRICE_SCOPE_START_INVALID", "PRICE_SCOPE_END_INVALID", "GRID_NUMBER_INVALID", "TOTAL_INVEST_INVALID", "TRIGGER_ORDER_PRICE_INVALID", "STOP_LOSE_PRICE_INVALID", "STOP_PROFIT_PRICE_INVALID", "CANCEL_ORDER", "CANCEL_CLOSE_ROBOT", "TOTAL_INVEST_LIMIT_BY_COUPONS", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public enum FailedReason {
        PRICE_SCOPE_START_INVALID("00030002", "价格区间上限校验失败"),
        PRICE_SCOPE_END_INVALID("00030003", "价格区间下限校验失败"),
        GRID_NUMBER_INVALID("00030004", "网格数量校验失败"),
        TOTAL_INVEST_INVALID("00030005", "投资额校验失败"),
        TRIGGER_ORDER_PRICE_INVALID("00030006", "触发开单价校验失败"),
        STOP_LOSE_PRICE_INVALID("00030007", "止损价校验失败"),
        STOP_PROFIT_PRICE_INVALID("00030008", "止盈价校验失败"),
        CANCEL_ORDER("00030009", "取消下单"),
        CANCEL_CLOSE_ROBOT("00030010", "取消关闭机器人"),
        TOTAL_INVEST_LIMIT_BY_COUPONS("00030011", "投资额小于卡券最小投资额");


        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ EnumEntries f52285c = EnumEntriesKt.enumEntries(m63855a());

        @NotNull
        private final String errorCode;

        @NotNull
        private final String errorReason;

        @NotNull
        public static EnumEntries<FailedReason> getEntries() {
            return f52285c;
        }

        @NotNull
        public final String getErrorCode() {
            return this.errorCode;
        }

        @NotNull
        public final String getErrorReason() {
            return this.errorReason;
        }

        FailedReason(String str, String str2) {
            this.errorCode = str;
            this.errorReason = str2;
        }
    }
}
