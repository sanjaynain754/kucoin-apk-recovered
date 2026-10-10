package p299h3;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Currency;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: h3.a, reason: from toString */
/* JADX INFO: compiled from: InAppPurchase.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u0016\u0010\u001a¨\u0006\u001b"}, m90084d2 = {"Lh3/a;", "", "", "eventName", "", "amount", "Ljava/util/Currency;", FirebaseAnalytics.Param.CURRENCY, "<init>", "(Ljava/lang/String;DLjava/util/Currency;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/String;", "c", "b", "D", "()D", "Ljava/util/Currency;", "()Ljava/util/Currency;", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class InAppPurchase {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final String eventName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final double amount;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    public final Currency currency;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InAppPurchase)) {
            return false;
        }
        InAppPurchase inAppPurchase = (InAppPurchase) other;
        return Intrinsics.areEqual(this.eventName, inAppPurchase.eventName) && Double.compare(this.amount, inAppPurchase.amount) == 0 && Intrinsics.areEqual(this.currency, inAppPurchase.currency);
    }

    public InAppPurchase(@NotNull String eventName, double d11, @NotNull Currency currency) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.eventName = eventName;
        this.amount = d11;
        this.currency = currency;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final double getAmount() {
        return this.amount;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Currency getCurrency() {
        return this.currency;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getEventName() {
        return this.eventName;
    }

    public int hashCode() {
        return (((this.eventName.hashCode() * 31) + Double.hashCode(this.amount)) * 31) + this.currency.hashCode();
    }

    @NotNull
    public String toString() {
        return "InAppPurchase(eventName=" + this.eventName + ", amount=" + this.amount + ", currency=" + this.currency + ')';
    }
}
