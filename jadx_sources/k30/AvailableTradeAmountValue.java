package k30;

import com.blankj.utilcode.util.C5303w0;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.tradebase.available.AvailableTradeAmountStatus;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: k30.f, reason: from toString */
/* JADX INFO: compiled from: AvailableTradeAmount.kt */
/* JADX INFO: loaded from: classes48.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0014\u001a\u00020\u0005J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J1\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/tradebase/available/AvailableTradeAmountValue;", "", "value", "Ljava/math/BigDecimal;", FirebaseAnalytics.Param.CURRENCY, "", "precision", "", "status", "Lcom/kubi/tradebase/available/AvailableTradeAmountStatus;", "<init>", "(Ljava/math/BigDecimal;Ljava/lang/String;ILcom/kubi/tradebase/available/AvailableTradeAmountStatus;)V", "getValue", "()Ljava/math/BigDecimal;", "getCurrency", "()Ljava/lang/String;", "getPrecision", "()I", "getStatus", "()Lcom/kubi/tradebase/available/AvailableTradeAmountStatus;", "displayText", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class AvailableTradeAmountValue {

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public final BigDecimal value;

    /* JADX INFO: renamed from: b, reason: from toString */
    @NotNull
    public final String currency;

    /* JADX INFO: renamed from: c, reason: from toString */
    public final int precision;

    /* JADX INFO: renamed from: d, reason: from toString */
    @NotNull
    public final AvailableTradeAmountStatus status;

    public AvailableTradeAmountValue() {
        this(null, null, 0, null, 15, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AvailableTradeAmountValue)) {
            return false;
        }
        AvailableTradeAmountValue availableTradeAmountValue = (AvailableTradeAmountValue) other;
        return Intrinsics.areEqual(this.value, availableTradeAmountValue.value) && Intrinsics.areEqual(this.currency, availableTradeAmountValue.currency) && this.precision == availableTradeAmountValue.precision && this.status == availableTradeAmountValue.status;
    }

    public AvailableTradeAmountValue(@NotNull BigDecimal value, @NotNull String currency, int i11, @NotNull AvailableTradeAmountStatus status) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(status, "status");
        this.value = value;
        this.currency = currency;
        this.precision = i11;
        this.status = status;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m89509a() {
        StringBuilder sb2;
        String strM92640e = this.status == AvailableTradeAmountStatus.VALID ? C42180b.m92640e(this.value, null, this.precision, false, false, false, 0, null, 125, null) : "0";
        if (StringsKt.isBlank(this.currency)) {
            return strM92640e;
        }
        if (C5303w0.m6511a()) {
            sb2 = new StringBuilder();
            sb2.append(this.currency);
            sb2.append(' ');
        } else {
            sb2 = new StringBuilder();
            sb2.append(strM92640e);
            sb2.append(' ');
            strM92640e = this.currency;
        }
        sb2.append(strM92640e);
        return sb2.toString();
    }

    public int hashCode() {
        return (((((this.value.hashCode() * 31) + this.currency.hashCode()) * 31) + Integer.hashCode(this.precision)) * 31) + this.status.hashCode();
    }

    @NotNull
    public String toString() {
        return "AvailableTradeAmountValue(value=" + this.value + ", currency=" + this.currency + ", precision=" + this.precision + ", status=" + this.status + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AvailableTradeAmountValue(BigDecimal ZERO, String str, int i11, AvailableTradeAmountStatus availableTradeAmountStatus, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i12 & 1) != 0) {
            ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        }
        this(ZERO, (i12 & 2) != 0 ? "" : str, (i12 & 4) != 0 ? 0 : i11, (i12 & 8) != 0 ? AvailableTradeAmountStatus.INVALID : availableTradeAmountStatus);
    }
}
