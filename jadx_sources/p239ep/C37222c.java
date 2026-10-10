package p239ep;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.margin.api.entity.LeverBalance;
import com.kubi.tradebase.entity.CurrencyBalance;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ep.c */
/* JADX INFO: compiled from: CrossPosition.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/margin/entity/MarginCrossPositionOfCurrent;", "Lcom/kubi/margin/entity/MarginCrossPosition;", TtmlNode.RUBY_BASE, "Lcom/kubi/tradebase/entity/CurrencyBalance;", "quote", "balance", "Lcom/kubi/margin/api/entity/LeverBalance;", "<init>", "(Lcom/kubi/tradebase/entity/CurrencyBalance;Lcom/kubi/tradebase/entity/CurrencyBalance;Lcom/kubi/margin/api/entity/LeverBalance;)V", "getBase", "()Lcom/kubi/tradebase/entity/CurrencyBalance;", "getQuote", "getBalance", "()Lcom/kubi/margin/api/entity/LeverBalance;", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C37222c implements InterfaceC37221b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final CurrencyBalance f82540a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final CurrencyBalance f82541b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final LeverBalance f82542c;

    public C37222c(@NotNull CurrencyBalance base, @NotNull CurrencyBalance quote, @NotNull LeverBalance balance) {
        Intrinsics.checkNotNullParameter(base, "base");
        Intrinsics.checkNotNullParameter(quote, "quote");
        Intrinsics.checkNotNullParameter(balance, "balance");
        this.f82540a = base;
        this.f82541b = quote;
        this.f82542c = balance;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final LeverBalance getF82542c() {
        return this.f82542c;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final CurrencyBalance getF82540a() {
        return this.f82540a;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final CurrencyBalance getF82541b() {
        return this.f82541b;
    }
}
