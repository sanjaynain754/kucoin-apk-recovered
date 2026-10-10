package bi;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: bi.g */
/* JADX INFO: compiled from: FuturesTrialTradeNowEvent.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m90084d2 = {"Lcom/kubi/futures/event/FuturesTrialTradeNowEvent;", "", "symbol", "", "openTrialSwitch", "", "<init>", "(Ljava/lang/String;Z)V", "getSymbol", "()Ljava/lang/String;", "getOpenTrialSwitch", "()Z", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C4615g {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final String f4144a;

    /* JADX INFO: renamed from: b */
    public final boolean f4145b;

    public C4615g(@NotNull String symbol, boolean z11) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        this.f4144a = symbol;
        this.f4145b = z11;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getF4145b() {
        return this.f4145b;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF4144a() {
        return this.f4144a;
    }
}
