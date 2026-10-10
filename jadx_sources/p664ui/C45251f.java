package p664ui;

import com.kubi.kumex.utils.C17060n0;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ui.f */
/* JADX INFO: compiled from: FuturesTradeTrack.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a.\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00012\b\b\u0002\u0010\u0011\u001a\u00020\u00012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u001a.\u0010\u0014\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00012\b\b\u0002\u0010\u0011\u001a\u00020\u00012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m90084d2 = {"FUTURES_TRADE_PRICE_BLOCK_ID", "", "FUTURES_TRADE_QTY_BLOCK_ID", "FUTURES_TRADE_SENIOR_BLOCK_ID", "FUTURES_TRADE_STOPLOSS_BLOCK_ID", "FUTURES_TRADE_ADVANCE_BLOCK_ID", "FUTURES_TRADE_TRANSFER_BLOCK_ID", "FUTURES_TRADE_EXPOSE_NAME", "FUTURES_TRADE_PAIR_NAME", "FUTURES_TRADE_LEVERAGE_NAME", "FUTURES_TRADE_STOPLOSSSET_BLOCK_ID", "FUTURES_TRADE_ORDER_INPUT_KEY", "FUTURES_TRADE_ORDER_INPUT_VALUE", "tradeTrackClick", "", "pageId", "blockId", "locationId", ReportDataTable.COLUMN_PARAMS, "Lorg/json/JSONObject;", "tradeTrackExpose", "KumexLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C45251f {
    /* JADX INFO: renamed from: a */
    public static final void m100017a(@NotNull String pageId, @NotNull String blockId, @NotNull String locationId, @Nullable JSONObject jSONObject) throws JSONException {
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(locationId, "locationId");
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        jSONObject.put("front_trade_type", "new");
        C43852m.m96589a(pageId, blockId, locationId, jSONObject);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m100018b(String str, String str2, String str3, JSONObject jSONObject, int i11, Object obj) throws JSONException {
        if ((i11 & 1) != 0) {
            str = C17060n0.m36552b();
        }
        if ((i11 & 4) != 0) {
            str3 = "1";
        }
        if ((i11 & 8) != 0) {
            jSONObject = null;
        }
        m100017a(str, str2, str3, jSONObject);
    }

    /* JADX INFO: renamed from: c */
    public static final void m100019c(@NotNull String pageId, @NotNull String blockId, @NotNull String locationId, @Nullable JSONObject jSONObject) throws JSONException {
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(locationId, "locationId");
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        jSONObject.put("front_trade_type", "new");
        C43852m.m96593e(pageId, blockId, locationId, jSONObject);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m100020d(String str, String str2, String str3, JSONObject jSONObject, int i11, Object obj) throws JSONException {
        if ((i11 & 1) != 0) {
            str = "futures_expose";
        }
        if ((i11 & 4) != 0) {
            str3 = "1";
        }
        if ((i11 & 8) != 0) {
            jSONObject = null;
        }
        m100019c(str, str2, str3, jSONObject);
    }
}
