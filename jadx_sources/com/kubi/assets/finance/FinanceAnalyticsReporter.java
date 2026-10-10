package com.kubi.assets.finance;

import com.facebook.react.uimanager.ViewProps;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.assets.finance.b, reason: from Kotlin metadata */
/* JADX INFO: compiled from: FinanceAnalyticsReporter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005J\u0016\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005J\u001e\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005J\u001e\u0010\u0010\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/assets/finance/FinanceAnalyticsReporter;", "", "<init>", "()V", "pageId", "", "reportHistoryEvent", "", "reportAnalyticsEvent", "reportFunctionalZoneEvent", ViewProps.POSITION, "reportCoinEvent", "coin", "reportCoinProductEvent", "type", "name", "reportProductCoinEvent", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FinanceAnalyticsReporter {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final FinanceAnalyticsReporter f17418a = new FinanceAnalyticsReporter();

    /* JADX INFO: renamed from: a */
    public final void m16755a() {
        C43852m.m96591c("B9earnaccount", "anylsis", null, null, 12, null);
    }

    /* JADX INFO: renamed from: b */
    public final void m16756b(@NotNull String position, @NotNull String coin) {
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(coin, "coin");
        C43852m.m96590b("B9earnaccount", "holdcoinlist", position, TuplesKt.m90091to("coin", coin));
    }

    /* JADX INFO: renamed from: c */
    public final void m16757c(@NotNull String position, @NotNull String coin, @NotNull String type) throws JSONException {
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(coin, "coin");
        Intrinsics.checkNotNullParameter(type, "type");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("coin", coin);
        jSONObject.put("type", type);
        Unit unit = Unit.INSTANCE;
        C43852m.m96589a("B9earnaccount", "holdcoindetials", position, jSONObject);
    }

    /* JADX INFO: renamed from: d */
    public final void m16758d(@NotNull String position) {
        Intrinsics.checkNotNullParameter(position, "position");
        C43852m.m96591c("B9earnaccount", "qucikentrance", position, null, 8, null);
    }

    /* JADX INFO: renamed from: e */
    public final void m16759e() {
        C43852m.m96591c("B9earnaccount", "detials", null, null, 12, null);
    }

    /* JADX INFO: renamed from: f */
    public final void m16760f(@NotNull String position) {
        Intrinsics.checkNotNullParameter(position, "position");
        C43852m.m96591c("B9earnaccount", "select", position, null, 8, null);
    }

    /* JADX INFO: renamed from: g */
    public final void m16761g(@NotNull String position, @NotNull String name) {
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(name, "name");
        C43852m.m96590b("B9earnaccount", "holdproductlist", position, TuplesKt.m90091to("producttype", name));
    }

    /* JADX INFO: renamed from: h */
    public final void m16762h(@NotNull String position, @NotNull String coin, @NotNull String type) throws JSONException {
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(coin, "coin");
        Intrinsics.checkNotNullParameter(type, "type");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("coin", coin);
        jSONObject.put("type", type);
        Unit unit = Unit.INSTANCE;
        C43852m.m96589a("B9earnaccount", "holdproductdetials", position, jSONObject);
    }
}
