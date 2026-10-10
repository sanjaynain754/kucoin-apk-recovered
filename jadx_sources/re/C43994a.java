package re;

import com.kubi.core.utils.C12462a;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Unit;

/* JADX INFO: renamed from: re.a */
/* JADX INFO: compiled from: LimitPriceProtectVerifyReport.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\b\u001a\u00020\u0005J\u0006\u0010\t\u001a\u00020\u0005J\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/core/spot/business/holder/intercept/track/LimitPriceProtectVerifyReport;", "", "<init>", "()V", "exposeOrderTipDialog", "", "isBuy", "", "click24hCheckbox", "clickConfirmBtn", "clickCancelBtn", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C43994a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C43994a f97233a = new C43994a();

    /* JADX INFO: renamed from: d */
    public final void m96959d(boolean z11) throws JSONException {
        String str = z11 ? "buy" : "sell";
        String strM23402a = C12462a.m23402a();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("taskType", str);
        Unit unit = Unit.INSTANCE;
        C43852m.m96593e(strM23402a, "priceReminderPopup", "1", jSONObject);
    }

    /* JADX INFO: renamed from: a */
    public final void m96956a() {
        C43852m.m96591c(C12462a.m23402a(), "optionButton", "1", null, 8, null);
    }

    /* JADX INFO: renamed from: b */
    public final void m96957b() {
        C43852m.m96591c(C12462a.m23402a(), "cancelButton", "1", null, 8, null);
    }

    /* JADX INFO: renamed from: c */
    public final void m96958c() {
        C43852m.m96591c(C12462a.m23402a(), "confirmButton", "1", null, 8, null);
    }
}
