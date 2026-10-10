package p567qo;

import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: qo.v */
/* JADX INFO: compiled from: LeverInputViewNew.kt */
/* JADX INFO: loaded from: classes26.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0005R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\t¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/loan/view/Range;", "", "<init>", "()V", "min", "Ljava/math/BigDecimal;", "getMin", "()Ljava/math/BigDecimal;", "setMin", "(Ljava/math/BigDecimal;)V", "max", "getMax", "setMax", "avail", "getAvail", "setAvail", "containsRange", "", "value", "LoanLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C43816v {

    /* JADX INFO: renamed from: a */
    @NotNull
    public BigDecimal f96883a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public BigDecimal f96884b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public BigDecimal f96885c;

    /* JADX INFO: renamed from: a */
    public final boolean m96488a(@NotNull BigDecimal value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return value.compareTo(this.f96884b) <= 0 && value.compareTo(this.f96883a) >= 0;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final BigDecimal getF96885c() {
        return this.f96885c;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final BigDecimal getF96884b() {
        return this.f96884b;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final BigDecimal getF96883a() {
        return this.f96883a;
    }

    /* JADX INFO: renamed from: e */
    public final void m96492e(@NotNull BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<set-?>");
        this.f96885c = bigDecimal;
    }

    /* JADX INFO: renamed from: f */
    public final void m96493f(@NotNull BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<set-?>");
        this.f96884b = bigDecimal;
    }

    /* JADX INFO: renamed from: g */
    public final void m96494g(@NotNull BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<set-?>");
        this.f96883a = bigDecimal;
    }

    public C43816v() {
        BigDecimal ONE = BigDecimal.ONE;
        Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
        BigDecimal bigDecimalNegate = ONE.negate();
        Intrinsics.checkNotNullExpressionValue(bigDecimalNegate, "negate(...)");
        this.f96883a = bigDecimalNegate;
        Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
        BigDecimal bigDecimalNegate2 = ONE.negate();
        Intrinsics.checkNotNullExpressionValue(bigDecimalNegate2, "negate(...)");
        this.f96884b = bigDecimalNegate2;
        Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
        BigDecimal bigDecimalNegate3 = ONE.negate();
        Intrinsics.checkNotNullExpressionValue(bigDecimalNegate3, "negate(...)");
        this.f96885c = bigDecimalNegate3;
    }
}
