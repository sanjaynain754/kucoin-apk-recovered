package p641tp;

import com.kubi.margin.entity.CurrencyEntity;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p239ep.C37220a;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: tp.a */
/* JADX INFO: compiled from: CrossClosePositionTraceEvent.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, m90084d2 = {"Lcom/kubi/margin/trade/report/CrossClosePositionTraceEvent;", "", "<init>", "()V", "PAGE_ID", "", "reportCloseMargin", "", "reportCancelCloseMargin", "reportConfirmCloseMargin", "coin", "Lcom/kubi/margin/entity/CurrencyEntity;", "reportConfirmCancelCloseMargin", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C45057a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C45057a f101456a = new C45057a();

    /* JADX INFO: renamed from: a */
    public final void m99654a() {
        C43852m.m96591c("B4tradingCross", "cancelClosePosition", "1", null, 8, null);
    }

    /* JADX INFO: renamed from: b */
    public final void m99655b() {
        C43852m.m96591c("B4tradingCross", "marginClosePosition", "1", null, 8, null);
    }

    /* JADX INFO: renamed from: c */
    public final void m99656c() {
        C43852m.m96591c("B4tradingCross", "cancelClosePositionConfirm", "1", null, 8, null);
    }

    /* JADX INFO: renamed from: d */
    public final void m99657d(@NotNull CurrencyEntity coin) throws JSONException {
        String str;
        Intrinsics.checkNotNullParameter(coin, "coin");
        if (C37220a.m83268b(coin)) {
            str = "onlyRepayDebt";
        } else {
            str = "hold{" + coin.getCode() + '}';
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("coin", str);
        Unit unit = Unit.INSTANCE;
        C43852m.m96589a("B4tradingCross", "closePositionConfirm", "1", jSONObject);
    }
}
