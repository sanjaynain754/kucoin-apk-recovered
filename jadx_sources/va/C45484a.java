package va;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Unit;

/* JADX INFO: renamed from: va.a */
/* JADX INFO: compiled from: ConvertTracker.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0006\u0010\u000b\u001a\u00020\u0005J\u0018\u0010\f\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0006\u0010\r\u001a\u00020\u0005J\u0018\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/assets/exchange/ConvertTracker;", "", "<init>", "()V", "exposeConvertPage", "", "tradeAccountSuccessRate", "isSuccess", "", "msg", "", "exposeMarginConvertPage", "marginAccountSuccessRate", "exposeMainConvertPage", "mainAccountSuccessRate", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C45484a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C45484a f102511a = new C45484a();

    /* JADX INFO: renamed from: a */
    public final void m100440a() {
        C43852m.m96595g("B5TradeAccount", "small_exchange", null, null, 12, null);
    }

    /* JADX INFO: renamed from: b */
    public final void m100441b() {
        C43852m.m96595g("B1mainAccount", "small_exchange", null, null, 12, null);
    }

    /* JADX INFO: renamed from: c */
    public final void m100442c() {
        C43852m.m96595g("B4crossMarginAccount", "small_exchange", null, null, 12, null);
    }

    /* JADX INFO: renamed from: d */
    public final void m100443d(boolean z11, @Nullable String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isSuccess", z11);
        jSONObject.put("error_msg", str);
        Unit unit = Unit.INSTANCE;
        C43852m.m96593e("B1mainAccount", "small_exchange_completed", "1", jSONObject);
    }

    /* JADX INFO: renamed from: e */
    public final void m100444e(boolean z11, @Nullable String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isSuccess", z11);
        jSONObject.put("error_msg", str);
        Unit unit = Unit.INSTANCE;
        C43852m.m96593e("B4crossMarginAccount", "small_exchange_completed", "1", jSONObject);
    }

    /* JADX INFO: renamed from: f */
    public final void m100445f(boolean z11, @Nullable String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isSuccess", z11);
        jSONObject.put("error_msg", str);
        Unit unit = Unit.INSTANCE;
        C43852m.m96593e("B5TradeAccount", "small_exchange_completed", "1", jSONObject);
    }
}
