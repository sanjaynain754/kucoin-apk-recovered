package com.kubi.kumex.utils;

import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Triple;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.kumex.utils.o0 */
/* JADX INFO: compiled from: TrackOrder.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u00006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u001a2\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00012\"\u0010\u001e\u001a\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020 0\u001fj\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020 `!\u001a\u001c\u0010\"\u001a\u00020#2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020 0%H\u0002\u001a$\u0010&\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020(\u0018\u00010'2\u0006\u0010\u001d\u001a\u00020\u0001H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0017\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0018\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0019\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001a\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006)"}, m90084d2 = {"CHECK_USER_PASSWORD", "", "CHECK_PRICE_EMPTY", "CHECK_PRICE_RANGE", "CHECK_AMOUNT_MIN", "CHECK_AMOUNT_MAX", "CHECK_MARKET_QTY_OF_USDT", "CHECK_MARKET_PRICE_CHANGE_QUICK", "CHECK_PROFIT_RANGE", "CHECK_TSO_RANGE", "CHECK_TSO_RANGE_EMPTY", "CHECK_TSO_ACTIVE_PRICE", "CHECK_PROFIT_VALIDE", "CHECK_LOSS_RANGE", "CHECK_LOSS_VALIDE", "CHECK_LOSS_INVALIDE_CURRENT", "CHECK_LOSS_RATE", "CHECK_BALANCE", "CHECK_PRICE_MISTAKE", "CHECK_HIDE_ORDER_RANGE", "CHECK_HIDE_ORDER_MIN", "CHECK_HIDE_ORDER_MAX", "CHECK_TRIGGER_PRICE_EMPTY", "CHECK_TRIGGER_PRICE_RANGE", "CHECK_TRIGGER_TYPE_ZERO", "CHECK_PASSWORD_VALIDE", "PLACE_ORDER", "trackOrderProcess", "", "category", ReportDataTable.COLUMN_PARAMS, "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "mapToJsonObject", "Lorg/json/JSONObject;", "map", "", "getTrackParams", "Lkotlin/Triple;", "", "KumexLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTrackOrder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrackOrder.kt\ncom/kubi/kumex/utils/TrackOrderKt\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,190:1\n216#2,2:191\n*S KotlinDebug\n*F\n+ 1 TrackOrder.kt\ncom/kubi/kumex/utils/TrackOrderKt\n*L\n154#1:191,2\n*E\n"})
public final class C17062o0 {
    /* JADX INFO: renamed from: b */
    public static final JSONObject m36559b(Map<String, Object> map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue());
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: c */
    public static final void m36560c(@NotNull String category, @NotNull HashMap<String, Object> params) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(params, "params");
        Triple<String, String, Boolean> tripleM36558a = m36558a(category);
        if (tripleM36558a == null) {
            return;
        }
        params.put("category", tripleM36558a.getFirst());
        params.put("is_success", tripleM36558a.getThird());
        params.put("fail_reason", tripleM36558a.getSecond());
        C43852m.m96605q(C17060n0.m36553c(), m36559b(params));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: a */
    public static final Triple<String, String, Boolean> m36558a(String str) {
        switch (str.hashCode()) {
            case -1981155175:
                if (!str.equals("CHECK_TRIGGER_PRICE_EMPTY")) {
                    return null;
                }
                return new Triple<>(str, "-10017:triggerPriceEmpty", Boolean.FALSE);
            case -1969509239:
                if (str.equals("CHECK_TRIGGER_PRICE_RANGE")) {
                    return new Triple<>(str, "-10018:triggerPriceNoRange", Boolean.FALSE);
                }
                return null;
            case -1778117256:
                if (str.equals("CHECK_USER_PASSWORD")) {
                    return new Triple<>(str, "-10000:noTradingPassword", Boolean.FALSE);
                }
                return null;
            case -1169283483:
                if (str.equals("CHECK_BALANCE")) {
                    return new Triple<>(str, "-10010:noEnoughBalance", Boolean.FALSE);
                }
                return null;
            case -997878336:
                if (str.equals("CHECK_PRICE_EMPTY")) {
                    return new Triple<>(str, "-10001:delegationPriceEmpty", Boolean.FALSE);
                }
                return null;
            case -986232400:
                if (str.equals("CHECK_PRICE_RANGE")) {
                    return new Triple<>(str, "-10002:delegationPriceNoRange", Boolean.FALSE);
                }
                return null;
            case -923743911:
                if (str.equals("CHECK_PROFIT_RANGE")) {
                    return new Triple<>(str, "-10005:stopProfitPriceNoRange", Boolean.FALSE);
                }
                return null;
            case -850278641:
                if (str.equals("CHECK_TRIGGER_TYPE_ZERO")) {
                    return new Triple<>(str, "-10019:triggerTypeOfPriceZero", Boolean.FALSE);
                }
                return null;
            case -533723976:
                if (str.equals("CHECK_LOSS_RANGE")) {
                    return new Triple<>(str, "-10007:stopLossPriceNoRange", Boolean.FALSE);
                }
                return null;
            case -437356396:
                if (str.equals("CHECK_AMOUNT_MAX")) {
                    return new Triple<>(str, "-10004:delegationNumGreatMaxSize", Boolean.FALSE);
                }
                return null;
            case -437356158:
                if (str.equals("CHECK_AMOUNT_MIN")) {
                    return new Triple<>(str, "-10003:delegationNumLessTickerSize", Boolean.FALSE);
                }
                return null;
            case -399123514:
                if (str.equals("CHECK_HIDE_ORDER_RANGE")) {
                    return new Triple<>(str, "-10014:visibleNumLessTickerSize", Boolean.FALSE);
                }
                return null;
            case -371369427:
                if (str.equals("CHECK_HIDE_ORDER_MAX")) {
                    return new Triple<>(str, "-10016:visibleNumLessDelegationNum", Boolean.FALSE);
                }
                return null;
            case -371369189:
                if (str.equals("CHECK_HIDE_ORDER_MIN")) {
                    return new Triple<>(str, "-10015:visibleNumLessDelegationNumFivePercent", Boolean.FALSE);
                }
                return null;
            case -333526217:
                if (str.equals("CHECK_TSO_RANGE")) {
                    return new Triple<>(str, "-10022:tso_call_range", Boolean.FALSE);
                }
                return null;
            case 159481069:
                if (str.equals("CHECK_LOSS_INVALIDE_CURRENT")) {
                    return new Triple<>(str, "-10021:lossInvalideCurrent", Boolean.FALSE);
                }
                return null;
            case 235042646:
                if (str.equals("CHECK_TSO_ACTIVE_PRICE")) {
                    return new Triple<>(str, "-10023:tso_active_price", Boolean.FALSE);
                }
                return null;
            case 748884910:
                if (str.equals("CHECK_LOSS_VALIDE")) {
                    return new Triple<>(str, "-10008:stopLossPriceGreatDelegationPrice", Boolean.FALSE);
                }
                return null;
            case 1172218302:
                if (str.equals("CHECK_MARKET_QTY_OF_VALUE")) {
                    return new Triple<>(str, "-10020:latestPriceEmpty", Boolean.FALSE);
                }
                return null;
            case 1543168813:
                if (str.equals("CHECK_PROFIT_VALIDE")) {
                    return new Triple<>(str, "-10006:stopProfitPriceLessDelegationPrice", Boolean.FALSE);
                }
                return null;
            case 1783898597:
                if (str.equals("CHECK_LOSS_RATE")) {
                    return new Triple<>(str, "-10009:lossRateGreatHundred", Boolean.FALSE);
                }
                return null;
            case 1914582565:
                if (str.equals("CHECK_TSO_RANGE_EMPTY")) {
                    return new Triple<>(str, "-10024:tso_call_range_empty", Boolean.FALSE);
                }
                return null;
            default:
                return null;
        }
    }
}
