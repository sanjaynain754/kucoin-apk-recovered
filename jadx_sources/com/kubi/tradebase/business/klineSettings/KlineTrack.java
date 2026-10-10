package com.kubi.tradebase.business.klineSettings;

import com.kubi.search.searchresult.SearchCategory$Companion;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.tradebase.business.klineSettings.p, reason: from Kotlin metadata */
/* JADX INFO: compiled from: KlineTrack.kt */
/* JADX INFO: loaded from: classes48.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u0005J\f\u0010\u000f\u001a\u00020\u0005*\u00020\rH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/tradebase/business/klineSettings/KlineTrack;", "", "<init>", "()V", "PAGE_ID", "", "KLINE_SPOT", "KLINE_CONTRACT", "KLINE_LEVER", "KLINE_ROBOT", "trackTimeSelection", "", "tag", "", "type", "toLocationId", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KlineTrack {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final KlineTrack f51542a = new KlineTrack();

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m63174c(KlineTrack klineTrack, int i11, String str, int i12, Object obj) throws JSONException {
        if ((i12 & 2) != 0) {
            str = SearchCategory$Companion.SPOT;
        }
        klineTrack.m63176b(i11, str);
    }

    /* JADX INFO: renamed from: b */
    public final void m63176b(int i11, @NotNull String type) throws JSONException {
        Intrinsics.checkNotNullParameter(type, "type");
        String strM63175a = m63175a(i11);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", type);
        Unit unit = Unit.INSTANCE;
        C43852m.m96589a("b5markets", "TimeSelection", strM63175a, jSONObject);
    }

    /* JADX INFO: renamed from: a */
    public final String m63175a(int i11) {
        switch (i11) {
            case 0:
            case 1:
                return "1min";
            case 2:
                return "5min";
            case 3:
                return "15min";
            case 4:
                return "30min";
            case 5:
                return "60min";
            case 6:
                return "2hr";
            case 7:
                return "4hr";
            case 8:
                return "8hr";
            case 9:
            default:
                return "1day";
            case 10:
                return "1week";
            case 11:
                return "1month";
        }
    }
}
